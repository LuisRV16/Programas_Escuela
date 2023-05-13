package Dudas;
import java.util.Scanner;
public class Programa01 {
    public static void main(String[] args) {
        //Preparar el objeto que se va a leer de teclado
        Scanner Leer=new Scanner(System.in);
        System.out.println("Programa que lee 2 valores enteros y muestra la suma");
        System.out.print("Ingrese valor 1: ");
        int v1=Leer.nextInt();
        System.out.print("Ingresar valor 2: ");
        int v2=Leer.nextInt();
        int suma=v1+v2;
        System.out.println("La suma es: "+suma);
    }
}
