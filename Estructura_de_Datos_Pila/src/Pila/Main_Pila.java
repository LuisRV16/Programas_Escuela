package Pila;
//@author Luis Ricardo Reyes Villar
import java.util.Scanner;
public class Main_Pila {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int opc = 0, n;
        String x="";
        System.out.println("Tamano de la pila: ");
        n = Leer.nextInt();
        Pila A = new Pila(n);
        System.out.println("Menu Clase Pila\n");
        System.out.println("0.- Cerrar Menu");
        System.out.println("1.- Pila Vacia");
        System.out.println("2.- Pila Llena");
        System.out.println("3.- Apilar Dato");
        System.out.println("4.- Desapilar");
        System.out.println("5.- Imprimir Pila");
        System.out.println("6.- Vaciar Pila");
        System.out.println("7.- Regresar tope");
        System.out.println("8.- Mostrar Ultimo Elemento");
        System.out.println("9.- Invertir Pila");
        System.out.println("10.- Total");
        System.out.println("11.- Buscar Dato");
        do{
            System.out.println("¿Que opcion necesita?\nOpciones elegibles de 0-11");
            opc = Leer.nextInt();
            switch(opc){
                case 0:
                    System.out.println("Proceso finalizado");
                    System.out.println("Luis Ricardo Reyes Villar");
                    break;
                case 1:
                    System.out.println(A.PilaVacia());
                    System.out.println("");
                    break;
                case 2:
                    System.out.println(A.PilaLlena());
                    System.out.println("");
                case 3:
                    System.out.println("Dato que desea apilar: ");
                    Leer.nextLine();
                    x=Leer.nextLine();
                    A.Apilar(x);
                    System.out.println("");
                    break;
                case 4:
                    A.Desapilar();
                    System.out.println("");
                    break;
                case 5:
                    A.Imprimir();
                    System.out.println("");
                    break;
                case 6:
                    A.Vaciar();
                    System.out.println("La pila ha sido vaciada\n");
                    break;
                case 7:
                    System.out.println(A.Top());
                    System.out.println("");
                    break;
                case 8:
                    A.Info();
                    System.out.println("");
                    break;
                case 9:
                    A.Invertir();
                    System.out.println("");
                    break;
                case 10:
                    System.out.println(A.Top());
                    System.out.println("");
                    break;
                case 11:
                    System.out.println("Dato que desea encontrar: ");
                    Leer.nextLine();
                    x=Leer.nextLine();
                    System.out.println(A.Buscar(x));
                    System.out.println("");
                    break;
                default:
                    System.out.println("Opcion invalida\nSelecciona una opcion valida\n");
                    break;
            }
        }while(opc > 0 && opc <= 11);
    }
    
}
