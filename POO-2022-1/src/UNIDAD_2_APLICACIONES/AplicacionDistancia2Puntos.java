package UNIDAD_2_APLICACIONES;
import UNIDAD_2_CLASES.CPunto;
public class AplicacionDistancia2Puntos {
    public static void main(String[] args) {
        System.out.println("Programa que calcula la distancia entre 2 puntos");
        CPunto A=new CPunto(0,4);
        CPunto B=new CPunto(3,0);
        System.out.println("A"+A);
        System.out.println("B"+B);
        int cA=B.getX()-A.getX();
        int cB=B.getY()-A.getY();
        double d=Math.sqrt(Math.pow(cA, 2)+Math.pow(cB,2));
        System.out.println("Distancia= "+d);
    }
}
