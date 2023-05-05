package GUI;

import CLASES.TextPrompt;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class FrameSuma extends JFrame{
    private JLabel lblN1,lblN2;
    private JTextField txtN1, txtN2, txtR;
    private JButton btnSumar;
    
    public FrameSuma(){
        super("Suma 2 números");
        setLayout(null);
        lblN1 = new JLabel("Valor 1");
        lblN1.setBounds(30, 10, 50,15);
        add(lblN1);
        lblN2 = new JLabel("Valor 2");
        lblN2.setBounds(30,50,50,15);
        add(lblN2);
        txtN1 = new JTextField();
        txtN1.setBounds(100,10,50,20);
        add(txtN1);
        txtN2 = new JTextField();
        txtN2.setBounds(100, 50, 50, 20);
        add(txtN2);
        btnSumar = new JButton("Sumar");
        btnSumar.setBounds(90,120,100,50);
        add(btnSumar);
        txtR = new JTextField();
        txtR.setBounds(30,80,150,40);
        add(txtR);
        TextPrompt A = new TextPrompt("Valor 1",txtN1);
        ME manejador = new ME();
        btnSumar.addActionListener(manejador);
    }
//    public FrameSuma(){
//        super("Suma 2 números");
//        setLayout(new FlowLayout());
//        lblN1 = new JLabel("Valor 1");
//        lblN2 = new JLabel("Valor 2");
//        txtN1 = new JTextField(10);
//        txtN2 = new JTextField(10);
//        txtR = new JTextField(20);
//        btnSumar = new JButton("Sumar");
//        add(lblN1);
//        add(txtN1);
//        add(lblN2);
//        add(txtN2);
//        add(btnSumar);
//        add(txtR);
//        
//        ME manejador = new ME();
//        btnSumar.addActionListener(manejador);
//    }//Fin del constructor
    
    private class ME implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource()==btnSumar) {
                int n1 = Integer.parseInt(txtN1.getText());
                int n2 = Integer.parseInt(txtN2.getText());
                int suma = n1+n2;
                String s = "La suma es: "+String.valueOf(suma);
                txtR.setText(s);
            }
        }
        
    }
    
    public static void main(String[] args) {
        FrameSuma X = new FrameSuma();
        X.setSize(300,300);
        X.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        X.setVisible(true);
    }
}
