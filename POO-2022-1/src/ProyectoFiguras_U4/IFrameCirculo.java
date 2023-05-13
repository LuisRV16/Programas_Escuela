package ProyectoFiguras_U4;
import ProyectoFiguras.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
//@author Luis Ricardo Reyes Villar
public class IFrameCirculo extends javax.swing.JInternalFrame implements ActionListener {
    CCirculo A = new CCirculo();
    private JLabel radio;
    private JTextField txtRadio;
    private JTextArea resultados;
    private JButton calcular;
    public IFrameCirculo() {
        initComponents();
        setLayout(null);
        radio = new JLabel("Radio:");
        radio.setBounds(10,10,100,30);
        radio.setFont(new Font("Andale Mono",2,18));
        add(radio);
        txtRadio = new JTextField();
        txtRadio.setBounds(70,10,100,30);
        txtRadio.setFont(new Font("Andale Mono",0,18));
        add(txtRadio);
        resultados = new JTextArea();
        resultados.setBounds(25,120,400,100);
        resultados.setFont(new Font("Andale Mono",2,18));
        resultados.setForeground(Color.black);
        resultados.setEditable(false);
        add(resultados);
        calcular = new JButton("Calcular");
        calcular.setBounds(100,225,130,40);
        calcular.setFont(new Font("Andale Mono",1,18));
        calcular.addActionListener(this);
        add(calcular);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        int l1;
        String area="",perimetro="";
        try{
            if (e.getSource()==calcular) {
                l1=Integer.parseInt(txtRadio.getText());
                if (l1==0) {
                    JOptionPane.showMessageDialog(this, "Ingrese valor diferente de 0");
                    txtRadio.setText("");
                    resultados.setText("");
                }
                else{
                A.setLado1(l1);
                A.Perimetro();
                A.Area();
                area="Área= "+String.valueOf(A.getArea())+"u²";
                perimetro="Perímetro= "+String.valueOf(A.getPerimetro())+"u";
                resultados.setText(area+"\n"+perimetro);                    
                }
            }
        }catch(NumberFormatException f){
            JOptionPane.showMessageDialog(this, "Ingresar solo valores numericos");
            txtRadio.setText("");
            resultados.setText("");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
