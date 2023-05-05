package APLICACIONES;

import GUI.Figuras2D;
import javax.swing.JFrame;

public class AplicacionFiguras2D {
    public static void main(String[] args) {
        JFrame X = new JFrame();
        X.setSize(500,500);
        X.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        X.setVisible(true);
        Figuras2D A = new Figuras2D();
        X.add(A);
    }
    
}
