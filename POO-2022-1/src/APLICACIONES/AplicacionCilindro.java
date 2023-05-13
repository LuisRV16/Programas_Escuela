package APLICACIONES;
import CLASES.Cilindro;
public class AplicacionCilindro {
    public static void main(String[] args) {
        Cilindro X=new Cilindro();
        float num=(int)(Math.random()*10+1);
        float alt=(int)(Math.random()*10+1);
        X.setRadio(num);//prestado
        X.setAltura(alt);//propio
        X.Area();//prestado
        X.Perimetro();//prestado
        X.Volumen();//propio
        System.out.println("Cilindro");
        System.out.println("radio= "+X.getRadio());//prestado
        System.out.println("Area base del cilindro= "+X.getArea());//prestado
        System.out.println("Perimetro base del cilindro= "+X.getPerimetro());//prestado
        System.out.println("Altura delcilindro= "+X.getAltura());//propio
        System.out.println("Volumen del cilindro= "+X.getVolumen());//propio
    }
}
