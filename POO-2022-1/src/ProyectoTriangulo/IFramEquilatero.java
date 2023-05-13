package ProyectoTriangulo;
//@author Luis Ricardo Reyes Villar
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class IFramEquilatero extends JInternalFrame implements ActionListener{
    CTrianguloEq T = new CTrianguloEq();
    private JLabel lado1;
    private JTextField txtLado1;
    private JTextArea resultado;
    private JButton calcular;
    public IFramEquilatero() {
        initComponents();
        lado1 = new JLabel("Lado 1");
        lado1.setBounds(50,10,100,30);
        lado1.setFont(new Font("Andale Mono",2,20));
        add(lado1);
        txtLado1 = new JTextField();
        txtLado1.setBounds(120,10,100,30);
        txtLado1.setFont(new Font("Andale Mono",0,20));
        add(txtLado1);
        resultado = new JTextArea();
        resultado.setBounds(20,170,300,100);
        resultado.setEditable(false);
        resultado.setFont(new Font("Andale Mono",1,22));
        add(resultado);
        calcular = new JButton("Calcular");
        calcular.setBounds(200,130,100,30);
        calcular.setFont(new Font("Andale Mono",1,14));
        add(calcular);
        calcular.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        int L1;
        String area="",perimetro="";
        try{
            if (e.getSource()==calcular) {
            L1=Integer.parseInt(txtLado1.getText());
            T.setLado(L1);
            T.Altura();
            T.Area();
            T.Perimetro();
            perimetro="Perimetro: "+String.valueOf(T.getPerimetro()+"u");
            area="Área: "+String.valueOf(T.getArea()+"u²");
            resultado.setText(area+"\n"+perimetro);
            }
        }catch(NumberFormatException f){
            JOptionPane.showMessageDialog(this, "Ingresar solo valores numericos");
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
