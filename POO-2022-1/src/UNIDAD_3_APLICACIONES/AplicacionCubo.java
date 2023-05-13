package UNIDAD_3_APLICACIONES;
import UNIDAD_3_CLASES.CCubo;
public class AplicacionCubo {
    public static void main(String[] args) {
        int valor=(int)(Math.random()*10+1);
        CCubo X=new CCubo(valor);
        X.Area();
        X.Perimetro();
        X.Volumen();
        double AT=X.getArea()*6;
        System.out.println("Arista: "+X.getLado());
        System.out.println("Area de una cara: "+X.getArea());
        System.out.println("Perimetro de una cara: "+X.getPerimetro());
        System.out.println("Volumen del Cubo: "+X.getVolumen());
        System.out.println("Area total del cubo: "+AT);
    }
}
