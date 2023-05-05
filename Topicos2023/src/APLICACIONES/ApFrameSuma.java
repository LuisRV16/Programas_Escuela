package APLICACIONES;

import GUI.FrameSuma_2_num;
import javax.swing.JFrame;

public class ApFrameSuma {
    public static void main(String[] args) {
        FrameSuma_2_num A = new FrameSuma_2_num();
        A.setSize(500, 500);
        A.setLocationRelativeTo(null);
        A.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        A.setVisible(true);
        A.setResizable(false);
    }
    
}
