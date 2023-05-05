package Lista_doble;
import java.util.Scanner;
//@author Luis Ricardo Reyes Villar
public class Main_ListaD {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int n, ref, opc = 0;
        ListaD A = new ListaD();
        do {
            System.out.println("---------------------------------------------------------");
            System.out.println("Menu Lista de Doble Enlace\nOpciones elegibles de 0-11");
            System.out.println("0.- Cerrar Menu");
            System.out.println("1.- La lista esta vacia?");
            System.out.println("2.- Inserta elemento en el inicio");
            System.out.println("3.- Inserta elemento en el final");
            System.out.println("4.- Inserta elemento antes de un nodo determinado");
            System.out.println("5.- Inserta elemento despues de un nodo determinado");
            System.out.println("6.- Elimina el primer elemento de la lista");
            System.out.println("7.- Elimina el ultimo elemento de la lista");
            System.out.println("8.- Elimina el elemento X");
            System.out.println("9.- Imprime lista de inicio a fin");
            System.out.println("10.- Imprime lista de fin a inicio");
            System.out.println("11.- Buscar elemento en la lista");
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
                    n = Leer.nextInt();
                    A.insertaInicio(n);
                    break;
                case 3:
                    System.out.println("Introduzca el elemento que desee insertar: ");
                    n = Leer.nextInt();
                    A.insertaFinal(n);
                    break;
                case 4:
                    System.out.println("Introduzca el elemento que desee insertar: ");
                    n = Leer.nextInt();
                    System.out.println("Introduzca la referencia para el nodo: ");
                    ref = Leer.nextInt();
                    A.insertaAntes(n, ref);
                    break;
                case 5:
                    System.out.println("Introduzca el elemento que desee insertar: ");
                    n = Leer.nextInt();
                    System.out.println("Introduzca la referencia para el nodo: ");
                    ref = Leer.nextInt();
                    A.insertaDespues(n, ref);
                    break;
                case 6:
                    A.eliminarInicio();
                    break;
                case 7:
                    A.eliminarFinal();
                    break;
                case 8:
                    System.out.println("Introduzca el elemento que desee eliminar: ");
                    n = Leer.nextInt();
                    A.eliminarNodoX(n);
                    break;
                case 9:
                    A.imprimirIn_F();
                    break;
                case 10:
                    A.imprimirF_In();
                    break;
                case 11:
                    System.out.println("Introduzca el elemento que desee buscar: ");
                    n = Leer.nextInt();
                    System.out.println("El elemento "+n+" esta en la lista? ");
                    System.out.println(A.buscar(n));
                    break;
                default:
                    System.out.println("Inserte una opcion valida");
                    break;
            }
        } while (opc > 0 && opc <= 11);
    }
    
}
