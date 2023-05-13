package Dudas;
public class Programa05 {
    public static void main(String[] args) {
        System.out.println("Elevar un numero a un exponente");
        System.out.println(Math.pow(2,5));
        
        double cubo=Math.pow(10,3);
        System.out.println("El cubo de 10 es: "+cubo);
        
        System.out.println("Generar un numero aleatorio");
        System.out.println(Math.random());
        
        System.out.println("Generar un numero entre 1 y 10");
        System.out.println(Math.random()*9+1);
        
        System.out.println("****Generar un numero entero entre 1 y 10");
        System.out.println( (int)(Math.random()*10+1));
        
        System.out.println("++Lanzar un dado");
        System.out.println((int)(Math.random()*6+1)); 
    }
}
