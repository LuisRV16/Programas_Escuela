package APLICACIONES;
import CLASES.Calculadora;
public class AplicacionOperaciones {
    //En el main es donde CREAMOS NUESTROS OBJETOS
    public static void main(String[] args) {
        // Casio es el objeto de la clase Calculadora
        Calculadora Casio=new Calculadora();
        float a=(float)(Math.random()*100+1);
        float b=(float)(Math.random()*100+1);
        float c=(float)(Math.random()*100+1);
        System.out.println("Valor de a= "+a);
        System.out.println("Valor de b= "+b);
        System.out.println("Valor de c= "+c);
        System.out.println("Suma: "+Casio.hadaMadrina(a,b) );
        System.out.println("Diferencia: "+Casio.restar(a,b));
        System.out.println("Producto: "+Casio.multiplicar(a,b));
        System.out.println("Cociente: "+Casio.dividir(a,b));
        System.out.println("Sumar [a,c]: "+Casio.hadaMadrina(a, c));
        System.out.println("Potencia [a,b]: "+Casio.elevar(a,b));
    } 
}
