package ProyectoFiguras;
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
public class IFrameRectangulo extends javax.swing.JInternalFrame implements ActionListener{
    CRectangulo A = new CRectangulo();
    private JLabel base,altura;
    private JTextField txtBase,txtAltura;
    private JTextArea resultados;
    private JButton calcular;
    public IFrameRectangulo() {
        initComponents();
        base = new JLabel("Base:");
        base.setBounds(10,10,200,30);
        base.setFont(new Font("Andale Mono",2,18));
        add(base);
        altura = new JLabel("Altura:");
        altura.setBounds(10,50,200,30);
        altura.setFont(new Font("Andale Mono",2,18));
        add(altura);
        txtBase = new JTextField();
        txtBase.setBounds(70,10,100,30);
        txtBase.setFont(new Font("Andale Mono",0,18));
        add(txtBase);
        txtAltura = new JTextField();
        txtAltura.setBounds(70,50,100,30);
        txtAltura.setFont(new Font("Andale Mono",0,18));
        add(txtAltura);
        resultados = new JTextArea();
        resultados.setBounds(25,120,400,100);
        resultados.setEditable(false);
        resultados.setFont(new Font("Andale Mono",2,18));
        resultados.setForeground(Color.black);
        add(resultados);
        calcular =  new JButton("Calcular");
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
                l1=Integer.parseInt(txtBase.getText());
                l2=Integer.parseInt(txtAltura.getText());
                if (l1==l2) {
                    JOptionPane.showMessageDialog(this, "La base y la altura deben ser valores diferentes\nentre sí "
                            + "para cumplir con la caracteristica del rectángulo.\nIngrese valores validos.");
                    txtBase.setText("");
                    txtAltura.setText("");
                    resultados.setText("");
                }
                else if (l1==0||l2==0) {
                    JOptionPane.showMessageDialog(this, "Ingrese valores diferentes de 0");
                    txtBase.setText("");
                    txtAltura.setText("");
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
            txtBase.setText("");
            txtAltura.setText("");
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
