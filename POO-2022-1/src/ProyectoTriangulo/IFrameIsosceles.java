package ProyectoTriangulo;
//@author Luis Ricardo Reyes Villar
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
public class IFrameIsosceles extends JInternalFrame implements ActionListener {
    CTrianguloIso T = new CTrianguloIso();
    private JLabel lado1,lado2;
    private JTextField txtLado1,txtLado2;
    private JTextArea resultado;
    private JButton calcular;
    public IFrameIsosceles() {
        initComponents();
        setLayout(null);
        lado1 = new JLabel("Lado 1");
        lado1.setBounds(50,10,100,30);
        lado1.setFont(new Font("Andale Mono",2,20));
        add(lado1);
        lado2 = new JLabel("Lado 2");
        lado2.setBounds(50,50,100,30);
        lado2.setFont(new Font("Andale Mono",2,20));
        add(lado2);
        txtLado1 = new JTextField();
        txtLado1.setBounds(120,10,100,30);
        txtLado1.setFont(new Font("Andale Mono",0,20));
        add(txtLado1);
        txtLado2 = new JTextField();
        txtLado2.setBounds(120,50,100,30);
        txtLado2.setFont(new Font("Andale Mono",0,20));
        add(txtLado2);
        calcular = new JButton("Calcular");
        calcular.setBounds(200,130,100,30);
        calcular.setFont(new Font("Andale Mono",1,14));
        add(calcular);
        calcular.addActionListener(this);
        resultado = new JTextArea();
        resultado.setBounds(20,170,300,100);
        resultado.setEditable(false);
        resultado.setFont(new Font("Andale Mono",1,22));
        add(resultado);
    }
@Override
    public void actionPerformed(ActionEvent e) {
        int L1,L2;
        String area="",perimetro="";
       try{
           if (e.getSource()==calcular) {
               L1=Integer.parseInt(txtLado1.getText());
               L2=Integer.parseInt(txtLado2.getText());
               if (L1==L2) {
                   resultado.setForeground(Color.red);
                   resultado.setFont(new Font("Andale Mono",1,13));
                   resultado.setText("Ingrese valores que representen a un triángulo \nisósceles");
                   txtLado1.setText("");
                   txtLado2.setText("");
               }
               else{
                   if (L1>=L2*2||L2>=L1+L2){
                       resultado.setForeground(Color.red);
                       resultado.setFont(new Font("Andale Mono",1,13));
                       resultado.setText("La suma de las longitudes de dos lados del\ntriangulo debe ser mayor "
                               + "que el tercer lado.\n\nPor favor ingrese valores válidos.");
                       txtLado1.setText("");
                       txtLado2.setText("");
                   }
                   else{
                       T.setLado(L1,L2);
                       T.Altura();
                       T.Area();
                       T.Perimetro();
                       area="Área: "+T.getArea()+"u²";
                       perimetro="Perímetro: "+T.getPerimetro()+"u";
                       resultado.setText(area+"\n"+perimetro);
                       resultado.setFont(new Font("Andale Mono",1,22));
                       resultado.setForeground(Color.black);
                   }
               }
           }
       }catch(NumberFormatException f){
           JOptionPane.showMessageDialog(this,"Ingresar solo valores numericos");
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
