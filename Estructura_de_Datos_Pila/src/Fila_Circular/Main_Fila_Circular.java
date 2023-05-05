package Fila_Circular;
//@author Luis Ricardo Reyes Villar

import java.util.Scanner;

public class Main_Fila_Circular {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int n, x, opc = 0;
        System.out.print("Introduzca el tamano de la Fila: ");
        n = Leer.nextInt();
        Fila_Circular A = new Fila_Circular(n);
        do {
            System.out.println("-----------------------------------------------");
            System.out.println("Menu Fila Circular:\nOpciones elegibles de 0-10");
            System.out.println("0.- Cerrar Menu");
            System.out.println("1.- La Fila esta Llena?");
            System.out.println("2.- La Fila esta Vacia?");
            System.out.println("3.- Inserta elemento");
            System.out.println("4.- Total de elementos");
            System.out.println("5.- Primer elemento de la Fila");
            System.out.println("6.- Imprime los elementos de la Fila");
            System.out.println("7.- Elimina elemento de la Fila");
            System.out.println("8.- Vaciar la Fila");
            System.out.println("9.- Buscar elemento en la Fila");
            System.out.println("10.- Copiar Fila en una Fila auxiliar");
            System.out.println("11.- Invertir Fila");
            System.out.println("-----------------------------------------------");
            System.out.print("Introduzca la opcion a elegir: ");
            opc = Leer.nextInt();
            switch (opc) {
                case 0:
                    System.out.println("Proceso Finalizado...");
                    System.out.println("Luis Ricardo Reyes Villar");
                    break;
                case 1:
                    System.out.println("La Fila esta llena? ");
                    System.out.println(A.filaLlena());
                    break;
                case 2:
                    System.out.println("La Fila esta vacia? ");
                    System.out.println(A.filaVacia());
                    break;
                case 3:
                    System.out.print("Introduzca el elemento que desea insertar (solo numeros): ");
                    x = Leer.nextInt();
                    A.insertaCircular(x);
                    break;
                case 4:
                    System.out.println("Total de elementos en la Fila: " + A.totalCircular());
                    break;
                case 5:
                    System.out.println("Primer elemento de la Fila: " + A.info());
                    break;
                case 6:
                    System.out.println("Elementos de la fila: ");
                    A.imprimeFila();
                    break;
                case 7:
                    A.eliminarCircular();
                    break;
                case 8:
                    A.vaciarFila();
                    break;
                case 9:
                    System.out.print("Introduzca el elemento que desea buscar (solo numeros): ");
                    x = Leer.nextInt();
                    System.out.println(A.buscar(x));
                    break;
                case 10:
                    A.copiar();
                case 11:
                    A.invertir();
                default:
                    System.out.println("Escoga una opcion valida");
                    break;
            }
        } while (opc > 0 && opc <= 11);
    }

}
