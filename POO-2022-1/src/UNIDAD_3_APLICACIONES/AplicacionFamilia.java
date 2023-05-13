package UNIDAD_3_APLICACIONES;
import UNIDAD_3_CLASES.CAbuelo;
import UNIDAD_3_CLASES.CHijo;
import UNIDAD_3_CLASES.CPadre;
public class AplicacionFamilia {
    public static void main(String[] args) {
        CAbuelo Miyagui=new CAbuelo();
        System.out.println("Abuelo");
        Miyagui.saludos();
        Miyagui.despedida();
        Miyagui.salud();
        CPadre Homero=new CPadre();
        System.out.println("Padre");
        Homero.saludos();
        Homero.despedida();
        Homero.salud();
        CHijo Bart=new CHijo();
        System.out.println("Hijo");
        Bart.saludos();
        Bart.despedida();
        Bart.salud();
    }  
}
