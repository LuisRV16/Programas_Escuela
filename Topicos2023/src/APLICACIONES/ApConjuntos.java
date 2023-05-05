package APLICACIONES;

import CLASES.CConjunto;
import java.util.Scanner;

/**
 *
 * @author manue
 */
public class ApConjuntos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CConjunto A = new CConjunto();
        int x;
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce el valor numerico: ");
            x = sc.nextInt();
            A.insertar(x);
        }
        System.out.println(A.toString()); 
    }
    
}
