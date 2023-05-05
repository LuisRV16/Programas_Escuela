package APLICACIONES;

import GUI.PanelPoligono;
import javax.swing.JFrame;

public class ApPoligonos {
    public static void main(String[] args) {
        JFrame X = new JFrame();
        PanelPoligono p = new PanelPoligono();
        X.setSize(400, 400);
        X.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        X.setVisible(true);
        X.add(p);
    }
    
}
