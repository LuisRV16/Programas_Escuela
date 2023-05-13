package UNIDAD_2_APLICACIONES;
import UNIDAD_2_CLASES.CAlumno;
public class AplicacionAlumno {
//En la aplicacion (main) es donde se construyen los objetos
    public static void main(String[] args) 
    {   CAlumno A=new CAlumno();
        System.out.println("DATOS DEL OBJETO A");
        A.setNombre("Agustin");
        A.setApellidos("Lara Hernandez");
        A.setEdad(17);
        A.setDireccion("Ave. Las Torres #1234 Nte.");
        System.out.println("Nombre: "+A.getNombre());
        System.out.println("Apellidos: "+A.getApellidos());
        System.out.println("Edad: "+A.getEdad());
        System.out.println("Dirección: "+A.getDireccion());
        
        System.out.println("");
        System.out.println("DATOS DEL OBJETO B");
        CAlumno B=new CAlumno("Pedro","Hernandez Vazquez",30,"Ave. Las Americas # 123");
        System.out.println("Nombre: "+B.getNombre());
        System.out.println("Apellidos: "+B.getApellidos());
        System.out.println("Edad: "+B.getEdad());
        System.out.println("Dirección: "+B.getDireccion());
    }
}
