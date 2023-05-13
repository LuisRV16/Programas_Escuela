package ProyectoTriangulo;
//@author Luis Ricardo Reyes Villar
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
public class FrameTriangulo extends JFrame implements ActionListener {
    private JMenuBar figuras;
    private JMenu triangulos;
    private JMenuItem equilatero,isosceles,escaleno;
    private JDesktopPane principal;
    public FrameTriangulo() {
        initComponents();
        setLayout(null);
        setTitle("Calcula Tu Triángulo");
        principal = new JDesktopPane();
        setContentPane(principal);
        figuras = new JMenuBar();
        setJMenuBar(figuras);
        triangulos = new JMenu("Triángulo");
        figuras.add(triangulos);
        equilatero = new JMenuItem("Equilátero");
        isosceles = new JMenuItem("Isósceles");
        escaleno = new JMenuItem("Escaleno");
        triangulos.add(equilatero);
        equilatero.addActionListener(this);
        triangulos.add(isosceles);
        isosceles.addActionListener(this);
        triangulos.add(escaleno);
        escaleno.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==equilatero){
        IFramEquilatero TEquilatero = new IFramEquilatero();
        principal.add(TEquilatero);
        TEquilatero.show();
        }
        else if (e.getSource()==isosceles) {
            IFrameIsosceles TIsosceles = new IFrameIsosceles();
            principal.add(TIsosceles);
            TIsosceles.show();
        }
        else{
            IFramEscaleno TEscaleno = new IFramEscaleno();
            principal.add(TEscaleno);
            TEscaleno.show();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        FrameTriangulo T = new FrameTriangulo();
        T.setBounds(0,0,800,600);
        T.setResizable(true);
        T.setLocationRelativeTo(null);
        T.setVisible(true);

    }
    private void setJDesktopPane(JDesktopPane principal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
