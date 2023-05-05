package APLICACIONES;
import GUI.FrameTriangulos;
import javax.swing.JFrame;
public class ApFrameTrianguloP {
    public static void main(String[] args) {
        FrameTriangulos T = new FrameTriangulos();
        T.setSize(830, 560);
        T.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        T.setVisible(true);
        T.setResizable(false);
        T.setLocationRelativeTo(null);
    }
    
}
