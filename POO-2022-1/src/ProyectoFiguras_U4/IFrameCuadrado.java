package ProyectoFiguras_U4;
//@author Luis Ricardo Reyes Villar
import ProyectoFiguras.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class IFrameCuadrado extends JInternalFrame implements ActionListener {
    CCuadrado A = new CCuadrado();
    private JLabel lado;
    private JTextField txtLado;
    private JTextArea resultados;
    private JButton calcular;
    public IFrameCuadrado() {
        initComponents();
        setLayout(null);
        lado = new JLabel("Lado:");
        lado.setBounds(10,10,100,40);
        lado.setFont(new Font("Andale Mono",2,18));
        add(lado);
        txtLado = new JTextField();
        txtLado.setBounds(70,10,100,40);
        txtLado.setFont(new Font("Andale Mono",0,18));
        add(txtLado);
        resultados = new JTextArea();
        resultados.setBounds(25,120,400,100);
        resultados.setFont(new Font("Andale Mono",2,20));
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
                l1=Integer.parseInt(txtLado.getText());
                if (l1==0) {
                    JOptionPane.showMessageDialog(this, "Ingresar valor diferente de 0");
                    txtLado.setText("");
                    resultados.setText("");
                }
                A.setLado1(l1);
                A.Perimetro();
                A.Area();
                area="Área= "+String.valueOf(A.getArea())+"u²";
                perimetro="Perímetro= "+String.valueOf(A.getPerimetro())+"u";
                resultados.setText(area+"\n"+perimetro);
            }
        }catch(NumberFormatException f){
            JOptionPane.showMessageDialog(this, "Ingresar solo valores numericos");
            txtLado.setText("");
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
