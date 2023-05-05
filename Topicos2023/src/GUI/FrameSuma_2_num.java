package GUI;

import CLASES.TextPrompt;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FrameSuma_2_num extends JFrame {
    private JLabel V1,V2;
    private JTextField txtV1,txtV2,txtR;
    private JButton btnSuma,btnClean;
    public FrameSuma_2_num(){
        super("Suma 2 numeros");
        setLayout(null);
        V1 = new JLabel("Valor 1:");
        V1.setBounds(30,50,100,50);
        V1.setFont(new Font("Arial",3,24));
        add(V1);
        V2 = new JLabel("Valor 2:");
        V2.setBounds(30,110,100,50);
        V2.setFont(new Font("Arial",3,24));
        add(V2);
        txtV1 = new JTextField();
        TextPrompt tp1 = new TextPrompt("Ingrese Valor 1",txtV1);
        tp1.changeStyle(Font.ITALIC);
        txtV1.setBounds(140,50,200,50);
        txtV1.setFont(new Font("Arial",2,24));
        add(txtV1);
        txtV2 = new JTextField();
        TextPrompt tp2 = new TextPrompt("Ingrese Valor 2",txtV2);
        tp2.changeStyle(Font.ITALIC);
        txtV2.setBounds(140,110,200,50);
        txtV2.setFont(new Font("Arial",2,24));
        add(txtV2);
        txtR = new JTextField();
        TextPrompt tpR = new TextPrompt("Resultado:",txtR);
        tpR.changeStyle(Font.ITALIC);
        txtR.setBounds(30,200,420,50);
        txtR.setEditable(false);
        txtR.setFont(new Font("Arial",2,24));
        add(txtR);
        btnSuma = new JButton("Sumar");
        btnSuma.setBounds(190,260,100,50);
        btnSuma.setFont(new Font("Arial",2,18));
        btnSuma.setToolTipText("Realiza la suma de los 2 numeros");
        add(btnSuma);
        btnClean = new JButton("Limpiar");
        btnClean.setBounds(380,400,100,50);
        btnClean.setFont(new Font("Arial",2,18));
        btnClean.setToolTipText("Limpia lo campos de texto");
        add(btnClean);
        ME manejador = new ME();
        btnSuma.addActionListener(manejador);
        btnClean.addActionListener(manejador);
    }
    private void Clean(){
        txtV1.setText("");
        txtV2.setText("");
        txtR.setText("");
    }
    private class ME implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if (e.getSource()==btnSuma) {
                try{
                    int v1 = Integer.parseInt(txtV1.getText());
                    int v2 = Integer.parseInt(txtV2.getText());
                    txtR.setText("Resultado: "+String.valueOf(v1+v2));
                }catch(NumberFormatException f){
                    JOptionPane.showMessageDialog(null, "Ingrese sólo valores numéricos");
                    Clean();
                }
            }
            if (e.getSource()==btnClean) {
                Clean();
            }
        }
    }
}
