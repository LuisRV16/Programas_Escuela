package Grafo;
import java.util.Scanner;
public class Main_Grafo {
    public static void main(String[] args) {
        Scanner Leer=new Scanner(System.in);
        int arista1, arista2, n, opc = 0;
        boolean d = true;
        System.out.print("Ingrese el tamano de la matriz: ");
        n = Leer.nextInt();
        GrafoMatriz A = new GrafoMatriz(n,d);
        do {
            System.out.println("-------------------------");
            System.out.println("Menu Matriz de Adyacencia\nOpciones Elegibles de 0-4");
            System.out.println("0. Cerrar Menu");
            System.out.println("1. Insertar Arista");
            System.out.println("2. Eliminar Arista");
            System.out.println("3. Mostrar Adyacencia");
            System.out.println("4. Imprimir Matriz de Adyacencia");
            System.out.print("Ingrese la opcion a elegir: ");
            opc = Leer.nextInt();
            switch(opc){
                case 0:
                    System.out.println("Proceso finalizado...");
                    break;
                case 1:
                    System.out.println("Ingrese las aristas a conectar:");
                    arista1 = Leer.nextInt();
                    arista2 = Leer.nextInt();
                    A.InsertaArista(arista1, arista2);
                    break;
                case 2:
                    System.out.println("Ingrese las aristas a desconectar:");
                    arista1 = Leer.nextInt();
                    arista2 = Leer.nextInt();
                    A.EliminaArista(arista1, arista2);
                    break;
                case 3:
                    System.out.println("Ingrese las aristas a mostrar adyacencia:");
                    arista1 = Leer.nextInt();
                    arista2 = Leer.nextInt();
                    A.Adyacencia(arista1, arista2);
                    break;
                case 4:
                    System.out.println("Matriz de adyacencia:");
                    A.MuestraGrafo();
                    break;
            }
        } while (opc >0 && opc<=4);
    }
}