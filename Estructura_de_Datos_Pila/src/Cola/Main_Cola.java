package Cola;
import java.util.Scanner;
public class Main_Cola {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int opc,n,x=0;
        System.out.print("Tamano de la Cola: ");
        n = Leer.nextInt();
        Cola A = new Cola(n);
        do{
            System.out.println("------------------------------------------------------");
            System.out.println("0. Cerrar Menú");
            System.out.println("1. ¿La Pila está vacía?");
            System.out.println("2. ¿La Pila está llena?");
            System.out.println("3. Inserta elemento");
            System.out.println("4. Elimina primer elemento");
            System.out.println("5. Muestra primer elemento");
            System.out.println("6. Vaciar Fila");
            System.out.println("7. Imprime Fila");
            System.out.println("8. Numero de elementos en la Fila");
            System.out.println("9. Buscar elemento en la Fila");
            System.out.println("10. Invertir Cola\n");
            System.out.println("Eliga la opción deseada (Opciones elegibles de 0-10): ");
            opc = Leer.nextInt();
            switch(opc){
                case 0:
                    System.out.println("...Proceso Finalizado");
                    System.out.println("Abigail Moreno Jimenez");
                    break;
                case 1:
                    System.out.print("La pila esta vacia? ");
                    System.out.println(A.filaVacia());
                    System.out.println("");
                    break;
                case 2:
                    System.out.print("La pila esta llena? ");
                    System.out.println(A.filaLlena());
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Que elemento desea insertar? ");
                    x=Leer.nextInt();
                    A.inserta(x);
                    System.out.println("");
                    break;
                case 4:
                    System.out.println(A.elimina());
                    System.out.println("");
                    break;
                case 5:
                    System.out.println(A.info());
                    System.out.println("");
                    break;
                case 6:
                    A.vaciarFila();
                    break;
                case 7:
                    A.imprimeFila();
                    System.out.println("");
                    break;
                case 8:
                    System.out.println(A.contar());
                    break;
                case 9:
                    System.out.println("¿Que elemento desea buscar? ");
                    x=Leer.nextInt();
                    System.out.println("¿Se encuentra el elemento ''"+x+"''?");
                    System.out.println(A.buscar(x));
                    break;
                case 10:
                    A.invertir();
                    break;
                default:
                    System.out.println("Opcion invalida\nEliga una opcion valida(0-10)");
                    break;
            }
            
        }while(opc > 0 && opc <= 10);
    }
    
}
