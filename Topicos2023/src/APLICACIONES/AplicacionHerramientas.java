/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package APLICACIONES;

import CLASES.PanelHerramientas;
import javax.swing.JFrame;

/**
 *
 * @author manue
 */
public class AplicacionHerramientas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame X = new JFrame();
        X.setSize(500,500);
        X.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        X.setVisible(true);
        PanelHerramientas A = new PanelHerramientas();
        X.add(A);
    }
    
}
