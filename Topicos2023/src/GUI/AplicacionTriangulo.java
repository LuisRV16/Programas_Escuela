/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GUI;

import GUI.CTriangulo;

/**
 *
 * @author manue
 */
public class AplicacionTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CTriangulo T=new CTriangulo();
        T.setVertices(0,0,30,0,0,40);
        T.cAB();
        T.cBC();
        T.cAC();
        T.Perimetro();
        T.Area();
        System.out.println(T);
    }
    
}
