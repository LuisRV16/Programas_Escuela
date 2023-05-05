package APLICACIONES;

import GUI.PanelPoligono02;
import javax.swing.JFrame;

public class AplicacionPoligono02 {
    public static void main(String[] args) {
        JFrame X = new JFrame();
        X.setVisible(true);
        X.setSize(400,400);
        X.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PanelPoligono02 A = new PanelPoligono02();
        X.add(A);
    }
    
}
