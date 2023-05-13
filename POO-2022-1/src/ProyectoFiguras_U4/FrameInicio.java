package ProyectoFiguras_U4;
//@author Luis Ricardo Reyes Villar
import ProyectoFiguras.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
public class FrameInicio extends JFrame implements ActionListener {
    private JLabel bienvenida;
    private JMenuBar figuras;
    private JMenu figuras2D;
    private JMenuItem cuadrado, circulo, rombo, rectangulo, trapecioRect, trapecioIsos, trianguloEq, trianguloIsos, trianguloEsc;
    private JDesktopPane principal;
    public FrameInicio() {
        initComponents();
        setLayout(null);
        setTitle("Cálcula tu figura");
        principal = new JDesktopPane();
        setContentPane(principal);
        bienvenida = new JLabel("¡Hola! ¿Qué figura deseas calcular?");
        bienvenida.setBounds(10, 10, 400, 25);
        bienvenida.setFont(new Font("Andale Mono",2,18));
        bienvenida.setForeground(Color.black);
        principal.add(bienvenida);
        figuras = new JMenuBar();
        setJMenuBar(figuras);
        figuras2D = new JMenu("Figuras 2D");
        figuras.add(figuras2D);
        cuadrado = new JMenuItem("Cuadrado");
        figuras2D.add(cuadrado);
        cuadrado.addActionListener(this);
        circulo = new JMenuItem("Círculo");
        figuras2D.add(circulo);
        circulo.addActionListener(this);
        rombo = new JMenuItem("Rombo");
        figuras2D.add(rombo);
        rombo.addActionListener(this);
        rectangulo = new JMenuItem("Rectángulo");
        figuras2D.add(rectangulo);
        rectangulo.addActionListener(this);
        trapecioRect = new JMenuItem("Trapecio Rectángulo");
        figuras2D.add(trapecioRect);
        trapecioRect.addActionListener(this);
        trapecioIsos = new JMenuItem("Trapecio Isósceles");
        figuras2D.add(trapecioIsos);
        trapecioIsos.addActionListener(this);
        trianguloEq = new JMenuItem("Triángulo Equilatero");
        figuras2D.add(trianguloEq);
        trianguloEq.addActionListener(this);
        trianguloIsos = new JMenuItem("Triángulo Isósceles");
        figuras2D.add(trianguloIsos);
        trianguloIsos.addActionListener(this);
        trianguloEsc = new JMenuItem("Triángulo Escaleno");
        figuras2D.add(trianguloEsc);
        trianguloEsc.addActionListener(this);
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
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==cuadrado) {
            IFrameCuadrado cuad = new IFrameCuadrado();
            principal.add(cuad);
            cuad.show();
        }
        else if (e.getSource()==circulo) {
            IFrameCirculo cir = new IFrameCirculo();
            principal.add(cir);
            cir.show();
        }
        else if (e.getSource()==rombo) {
            IFrameRombo rombo = new IFrameRombo();
            principal.add(rombo);
            rombo.show();
        }
        else if (e.getSource()==rectangulo) {
            IFrameRectangulo rect = new IFrameRectangulo();
            principal.add(rect);
            rect.show();
        }
        else if (e.getSource()==trapecioRect) {
            IFrameTrapRect TrapR = new IFrameTrapRect();
            principal.add(TrapR);
            TrapR.show();
        }
        else if (e.getSource()==trapecioIsos) {
            IFrameTrapIsos TrapI = new IFrameTrapIsos();
            principal.add(TrapI);
            TrapI.show();
        }
        else if (e.getSource()==trianguloEq) {
            IFrameTrianguloEq Eq = new IFrameTrianguloEq();
            principal.add(Eq);
            Eq.show();
        }
        else if (e.getSource()==trianguloIsos) {
            IFrameTrianguloIsos TrIsos = new IFrameTrianguloIsos();
            principal.add(TrIsos);
            TrIsos.show();
        }
        else if (e.getSource()==trianguloEsc) {
            IFrameTrianguloEsc TriEsc = new IFrameTrianguloEsc();
            principal.add(TriEsc);
            TriEsc.show();
        }
    }
    public static void main(String args[]) {
        FrameInicio A = new FrameInicio();
        A.setBounds(0,0,800,600);
        A.setResizable(true);
        A.setVisible(true);
        A.setLocationRelativeTo(null);
    }
    private void setJDesktopPane(JDesktopPane principal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
