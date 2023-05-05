package APLICACIONES;
import CLASES.CTriangulo;
public class ApTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CTriangulo T = new CTriangulo(-3,-4,10,2,3,7);
        T.dAB();
        T.dBC();
        T.dAC();
        T.Perimetro();
        T.Area();
        System.out.println("Distancia de A a B: "+T.getAB());
        System.out.println("Distancia de B a C: "+T.getBC());
        System.out.println("Distancia de A a C: "+T.getAC());
        System.out.println("Perimetro: "+T.getPerimetro());
        System.out.println("Area: "+T.getArea());
    }
    
}
