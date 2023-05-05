package APLICACIONES;
//@author Luis Ricardo Reyes Villar
import GUI.FrameTrianguloCoo;
import javax.swing.JFrame;
public class ApFrameTriangulo {
    public static void main(String[] args) {
        FrameTrianguloCoo F = new FrameTrianguloCoo();
        F.setSize(800, 510);
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        F.setVisible(true);
        F.setResizable(false);
        F.setLocationRelativeTo(null);
    }
    
}
