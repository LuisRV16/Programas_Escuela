/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pilas;

import java.util.Scanner;

/**
 *
 * @author Emmanuel Aran Hernandez
 */
public class Main_Pila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        
        int opc, size;
        String texto, tM;
        char ch;
        System.out.print("Escribe la palabra (sin espacios): ");
        texto = Leer.nextLine();
        tM = texto.replaceAll(" ", "");
        size = tM.length();
        
        Pila X = new Pila(size);
        
        System.out.println("Especifique la Aplicacion que desea manejar sobre '"+texto+
                "'\n1. Palíndromos\n"
                + "2. Validar Paréntesis\n"
                + "3. Conversión de notación infija a posfija");
        
        opc = Leer.nextInt();
        System.out.println("");
        
        switch (opc) {
            case 1:
                for (int i = 0; i < tM.length(); i++) {
                    ch = (tM.toLowerCase()).charAt(i);
                    X.Apilar(ch);
                }
                X.Invertir();
                if (X.ValidarPalindromo()) {
                    System.out.println("Sí es palíndroma.");
                } else {
                    System.out.println("No es palíndroma.");
                }
                break;
            case 2:
                if (X.ValidarParentesis(tM)) {
                    System.out.println(tM + " está balanceado.");
                } else {
                    System.out.println(tM + " no está balanceado.");
                }
                break;   
            case 3:
                System.out.println("Notación Infija: " + tM);
                System.out.print("Notación Postfija: ");
                System.out.println(X.infijaPostfija(tM));
                break;
            default:
                System.out.println("No existe la opción seleccionada.");
        
        }
        
        System.out.println("");
    }
    
}
