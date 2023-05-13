package UNIDAD_2_APLICACIONES;
import UNIDAD_2_CLASES.CPunto;
public class AplicacionPunto {
    public static void main(String[] args) {
        //Construir un objeto de la clase Punto
        //El objeto hace lo que quiera
        CPunto A=new CPunto(3,3);  //A.x  A.y
        CPunto B=new CPunto(4,4);  //B.x  B.y
        CPunto C=new CPunto(5,5);  //C.x  C.y
        System.out.println("A"+A);
        System.out.println("B"+B);
        System.out.println("C"+C);
        
        CPunto D=new CPunto();
        D.setX(200);
        D.setY(300);
        System.out.println("D"+D);
    }   
}
