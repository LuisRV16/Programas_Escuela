package Aplicaciones;

import GUI.FrameGenNum_2;
import javax.swing.JFrame;

public class Aplicacion_Generador {
    public static void main(String[] args) {
        FrameGenNum_2 A = new FrameGenNum_2();
        A.setSize(800, 500);
        A.setLocationRelativeTo(null);
        A.setVisible(true);
        A.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
