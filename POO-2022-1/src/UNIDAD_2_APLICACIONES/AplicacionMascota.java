package UNIDAD_2_APLICACIONES;
import UNIDAD_2_CLASES.CMascota;
public class AplicacionMascota {
    public static void main(String[] args) 
    {   CMascota X=new CMascota();
        X.setNombre("Firulais");
        X.setTipo("Perro");
        X.setColor("Gris");
        X.setEdad(10);
        System.out.println("Mostrado datos de la mascota");
        System.out.println("Nombre: "+X.getNombre());
        System.out.println("Tipo: "+X.getTipo());
        System.out.println("Color: "+X.getColor());
        System.out.println("Edad: "+X.getEdad());
        
        System.out.println("");
        CMascota Y=new CMascota("Solovino","Leon","Miel",15);
        System.out.println("Mostrado datos de la mascota");
        System.out.println("Nombre: "+Y.getNombre());
        System.out.println("Tipo: "+Y.getTipo());
        System.out.println("Color: "+Y.getColor());
        System.out.println("Edad: "+Y.getEdad());
    }
}
