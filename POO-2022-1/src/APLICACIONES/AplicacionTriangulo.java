package APLICACIONES;
import CLASES.CTriangulo;
public class AplicacionTriangulo {
    public static void main(String[] args) {
        //Crear un objeto de la clase CTriangulo
        CTriangulo T = new CTriangulo();
        //Crear dos valores aleatorios para la base y altura
        float x=(int)(Math.random()*100+1);
        float y=(int)(Math.random()*100+1);
        //El objeto empieza a hacer su trabajo
        T.asignarBase(x);   //El objeto T llama a los comportamiento para asignar 
        T.asignarAltura(y); //un valor a la base y a la altura
        T.calcularArea();
        System.out.println("Programa que calcula el area de un Triangulo");
        System.out.println("\nMostrando los datos del Objeto");
        System.out.println("Base: "+T.mostrarBase());
        System.out.println("Altura: "+T.mostrarAltura());
        System.out.println("Area: "+T.mostrarArea());
    }
}
