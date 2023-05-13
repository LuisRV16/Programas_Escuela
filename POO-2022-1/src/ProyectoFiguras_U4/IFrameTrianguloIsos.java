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
public class IFrameTrianguloIsos extends javax.swing.JInternalFrame implements ActionListener{
    CTrianguloIsos A = new CTrianguloIsos();
    private JLabel lado1,lado2;
    private JTextField txtLado1,txtLado2;
    private JTextArea resultados;
    private JButton calcular;
    public IFrameTrianguloIsos() {
        initComponents();
        setLayout(null);
        lado1 = new JLabel("Lado 1:");
        lado1.setBounds(10,10,200,30);
        lado1.setFont(new Font("Andale Mono",2,18));
        add(lado1);
        lado2 = new JLabel("Lado 2:");
        lado2.setBounds(10,50,200,30);
        lado2.setFont(new Font("Andale Mono",2,18));
        add(lado2);
        txtLado1 = new JTextField();
        txtLado1.setBounds(80,10,100,30);
        txtLado1.setFont(new Font("Andale Mono",0,18));
        add(txtLado1);
        txtLado2 = new JTextField();
        txtLado2.setBounds(80,50,100,30);
        txtLado2.setFont(new Font("Andale Mono",0,18));
        add(txtLado2);
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
    public void actionPerformed(ActionEvent e){
        int l1,l2;
        String area="",perimetro="";
        try{
            if (e.getSource()==calcular) {
                l1=Integer.parseInt(txtLado1.getText());
                l2=Integer.parseInt(txtLado2.getText());
                if (l1+l2<=l2||l2*2<=l1) {
                    JOptionPane.showMessageDialog(this, "La suma de las longitudes de dos lados del\ntriangulo debe ser mayor "
                               + "que el tercer lado.\nPor favor ingrese valores válidos.");
                    txtLado1.setText("");
                    txtLado2.setText("");
                    resultados.setText("");
                }
                else if (l1==l2) {
                    JOptionPane.showMessageDialog(this, "Ingrese valores que caracterizan al triángulo isósceles");
                    txtLado1.setText("");
                    txtLado2.setText("");
                    resultados.setText("");
                }
                else if (l1==0||l2==0) {
                    JOptionPane.showMessageDialog(this, "Ingrese valores diferentes de 0");
                    txtLado1.setText("");
                    txtLado2.setText("");
                    resultados.setText("");  
                }
                else{
                    A.setLado1(l1);
                    A.setLado2(l2);
                    A.Perimetro();
                    A.Area();
                    area="Área= "+A.getArea()+"u²";
                    perimetro="Perímetro= "+A.getPerimetro()+"u";
                    resultados.setText(area+"\n"+perimetro);
                }
            }
        }catch(NumberFormatException f){
            JOptionPane.showMessageDialog(this, "Ingresar solo valores numericos");
            txtLado1.setText("");
            txtLado2.setText("");
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
