package UNIDAD_3_APLICACIONES;
import UNIDAD_3_CLASES.CCuadrado;
public class AplicacionCuadrado {
    public static void main(String[] args) {
        //Aqui es donde se crea el Objeto
        //(Clase)        (Constructor)
        CCuadrado A=new CCuadrado();
        int valor=(int)(Math.random()*10+1);
        A.setLado(valor);
        A.Area();
        A.Perimetro();
        System.out.println("CUADRADO");
        System.out.println("Lado= "+A.getLado());
        System.out.println("Area= "+A.getArea());
        System.out.println("Perimetro= "+A.getPerimetro());
        System.out.println("");
        System.out.println("CUADRADO");
        valor=(int)(Math.random()*10+1);
        
        CCuadrado B=new CCuadrado(valor);
        B.Area();
        B.Perimetro();
        System.out.println(B);
    }
}
