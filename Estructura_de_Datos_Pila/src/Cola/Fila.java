package Cola;

import java.util.Scanner;
public class Fila {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, d, b;
        System.out.println("De que tamaño sera la fila");
        n = sc.nextInt();
        Clasefila f = new Clasefila(n);

        for (int i = 0; i < n; i++) {
            System.out.println("Ingresa el dato número " + (i+1) + " : ");
            d = sc.nextInt();
            f.insertar(d);
        }
        
        System.out.println("----------------------------------------------------------");

        f.imprimirFila();
        
        System.out.println("----------------------------------------------------------");
        System.out.println("Fila invertida: ");
        f.invertir();
        System.out.println("----------------------------------------------------------");
        System.out.println("El total de elementos en la pila es: " + f.contar());
        System.out.println("----------------------------------------------------------");
        System.out.println("Que elemento desea buscar?: ");
        b = sc.nextInt();
        System.out.println(f.buscar(b));
    }
    
}
