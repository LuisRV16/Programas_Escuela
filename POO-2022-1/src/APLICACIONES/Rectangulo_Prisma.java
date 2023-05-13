package APLICACIONES;
import CLASES.CRectangulo;
public class Rectangulo_Prisma {
    public static void main(String[] args) {
         //Crear un objeto de la clase Rectangulo
         CRectangulo A=new CRectangulo();
         //Aqui se muestra la abstraccion
         A.setBase(10);
         A.setAltura(5);
         A.Area();
         A.Perimetro();
         System.out.println("Datos del Rectangulo A");
         System.out.println("Base: "+A.getBase());
         System.out.println("Altura: "+A.getAltura());
         System.out.println("Area: "+A.getArea());
         System.out.println("Perimetro: "+A.getPerimetro());
         
         CRectangulo B=new CRectangulo(40,10);
         B.Area();
         B.Perimetro();
         System.out.println("\nDatos del Rectangulo B");
         System.out.println(B);
         
         
         
         //Crear un objeto de la clase Prisma Rectangular
         //CPrismaRectangular X=new CPrismaRectangular();

    }
    
}
