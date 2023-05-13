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
public class IFrameTrapRect extends javax.swing.JInternalFrame implements ActionListener {
    CTrapecioRec A = new CTrapecioRec();
    private JLabel baseMay,baseMen,altura;
    private JTextField txtBaseMay,txtBaseMen,txtAltura;
    private JTextArea resultados;
    private JButton calcular;
    public IFrameTrapRect() {
        initComponents();
        setLayout(null);
        baseMay = new JLabel("Base mayor: ");
        baseMay.setBounds(10,10,200,30);
        baseMay.setFont(new Font("Andale Mono",2,18));
        add(baseMay);
        baseMen = new JLabel("Base menor: ");
        baseMen.setBounds(10,50,200,30);
        baseMen.setFont(new Font("Andale Mono",2,18));
        add(baseMen);
        altura = new JLabel("Altura: ");
        altura.setBounds(10,90,200,30);
        altura.setFont(new Font("Andale Mono",2,18));
        add(altura);
        txtBaseMay = new JTextField();
        txtBaseMay.setBounds(150,10,100,30);
        txtBaseMay.setFont(new Font("Andale Mono",0,18));
        add(txtBaseMay);
        txtBaseMen = new JTextField();
        txtBaseMen.setBounds(150,50,100,30);
        txtBaseMen.setFont(new Font("Andale Mono",0,18));
        add(txtBaseMen);
        txtAltura = new JTextField();
        txtAltura.setBounds(150,90,100,30);
        txtAltura.setFont(new Font("Andale Mono",0,18));
        add(txtAltura);
        resultados = new JTextArea();
        resultados.setBounds(25,120,400,100);
        resultados.setFont(new Font("Andale Mono",2,18));
        resultados.setEditable(false);
        resultados.setForeground(Color.black);
        add(resultados);
        calcular = new JButton("Calcular");
        calcular.setBounds(100,225,130,40);
        calcular.setFont(new Font("Andale Mono",1,18));
        calcular.addActionListener(this);
        add(calcular);
    }
    public void actionPerformed(ActionEvent e){
        int l1,l2,l3;
        String area="",perimetro="";
        try{
            if (e.getSource()==calcular) {
                l1=Integer.parseInt(txtBaseMay.getText());
                l2=Integer.parseInt(txtBaseMen.getText());
                l3=Integer.parseInt(txtAltura.getText());
                if (l1<=l2) {
                    JOptionPane.showMessageDialog(this, "La base mayor debe ser el mayor valor en relacion a las bases"
                            + "\npara cumplir con las caracteristicas del trapecio.\nIngrese valores validos");
                    txtBaseMay.setText("");
                    txtBaseMen.setText("");
                    txtAltura.setText("");
                    resultados.setText("");
                }
                else if (l1==0||l2==0||l3==0) {
                    JOptionPane.showMessageDialog(this, "Ingrese valores diferentes a 0");
                    txtBaseMay.setText("");
                    txtBaseMen.setText("");
                    txtAltura.setText(""); 
                    resultados.setText("");
                }
                else{
                    A.setLado1(l1);
                    A.setLado2(l2);
                    A.setLado3(l3);
                    A.Area();
                    A.Perimetro();
                    area="Área= "+A.getArea()+"u²";
                    perimetro="Perímetro= "+A.getPerimetro()+"u";
                    resultados.setText(area+"\n"+perimetro);
                }
            }
        }catch(NumberFormatException f){
            JOptionPane.showMessageDialog(this, "Ingresar solo valores numericos");
            txtBaseMay.setText("");
            txtBaseMen.setText("");
            txtAltura.setText("");
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
