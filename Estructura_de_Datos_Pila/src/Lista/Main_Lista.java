package Lista;
//@author Luis Ricardo Reyes Villar

import java.util.Scanner;

public class Main_Lista {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int x, ref, opc = 0;
        CLista A = new CLista();
        do {
            System.out.println("---------------------------------------------------------");
            System.out.println("Menu Lista Simple\nOpciones elegibles de 0-13");
            System.out.println("0.- Cerrar Menu");
            System.out.println("1.- La lista esta vacia?");
            System.out.println("2.- Inserta elemento en el inicio");
            System.out.println("3.- Inserta elemento en el final");
            System.out.println("4.- Inserta elemento antes de un nodo determinado");
            System.out.println("5.- Inserta elemento despues de un nodo determinado");
            System.out.println("6.- Elimina el primer elemento de la lista");
            System.out.println("7.- Elimina el ultimo elemento de la lista");
            System.out.println("8.- Elimina el elemento X");
            System.out.println("9.- Elimina el elemento antes de un nodo determinado");
            System.out.println("10.- Elimina el elemento despues de un nodo determinado");
            System.out.println("11.- Imprime lista");
            System.out.println("12.- Buscar elemento en la lista");
            System.out.println("13.- Numero de elementos en la lista");
            System.out.println("14.- Copiar lista");
            System.out.println("---------------------------------------------------------");
            System.out.print("Introduzca la opcion a elegir: ");
            opc = Leer.nextInt();
            switch (opc) {
                case 0:
                    System.out.println("Proceso Terminado...");
                    System.out.println("Luis Ricardo Reyes Villar");
                    break;
                case 1:
                    System.out.println("La lista esta vacia? ");
                    System.out.println(A.listaVacia());
                    break;
                case 2:
                    System.out.println("Introduzca el elemento que desee insertar: ");
                    x = Leer.nextInt();
                    A.insertaInicio(x);
                    break;
                case 3:
                    System.out.println("Introduzca el elemento que desee insertar: ");
                    x = Leer.nextInt();
                    A.insertaFinal(x);
                    break;
                case 4:
                    System.out.println("Introduzca el elemento que desee insertar: ");
                    x = Leer.nextInt();
                    System.out.println("Introduzca la referencia para el nodo: ");
                    ref = Leer.nextInt();
                    A.insertAntes(x, ref);
                    break;
                case 5:
                    System.out.println("Introduzca el elemento que desee insertar: ");
                    x = Leer.nextInt();
                    System.out.println("Introduzca la referencia para el nodo: ");
                    ref = Leer.nextInt();
                    A.insertaDespues(x, ref);
                    break;
                case 6:
                    A.eliminarPrimero();
                    break;
                case 7:
                    A.eliminaUltimo();
                    break;
                case 8:
                    System.out.println("Introduzca el elemento que desee eliminar: ");
                    x = Leer.nextInt();
                    A.eliminarNodoX(x);
                    break;
                case 9:
                    System.out.println("Introduzca el elemento de referencia: ");
                    ref = Leer.nextInt();
                    A.eliminarAntes(ref);
                    break;
                case 10:
                    System.out.println("Introduzca el elemento de referencia: ");
                    ref = Leer.nextInt();
                    A.eliminarPosterior(ref);
                    break;
                case 11:
                    System.out.println(A);
                    break;
                case 12:
                    System.out.println("Introduzca el elemento que desea buscar: ");
                    x = Leer.nextInt();
                    System.out.println("El elemento se encuentra en la lista? ");
                    System.out.println(A.buscar(x));
                    break;
                case 13:
                    System.out.println("Total de elementos: " + A.total());
                    break;
                case 14:
                    A.copiar();
                    break;
            }
        } while (opc > 0 && opc <= 14);
    }

}
