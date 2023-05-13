package Dudas;
public class Programa09 {
    public static void main(String[] args) {
        String x="Hola Mundo";
        int datos[]=new int[40];
        //Programa que cifra un mensaje
        for(int i=0;i<x.length();i++)
            datos[i]=(int)x.charAt(i)-3;
        System.out.println("Mandando mensaje");
        for(int i=0;i<x.length();i++)
            System.out.print(datos[i]+" ");
        
        System.out.println("\nDecifrando mensaje");
        for(int i=0;i<=x.length();i++)
            System.out.print((char)datos[i]);
        System.out.println("");
        System.out.println("Aplicando algoritmo de conversion");
        for(int i=0;i<x.length();i++)
            System.out.print((char)(datos[i]+3));
        System.out.println("");
    }
}
