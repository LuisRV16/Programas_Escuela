package APLICACIONES;
import CLASES.CCirculo;
public class ApliacionCirculo {
    public static void main(String[] args) {
        CCirculo C=new CCirculo();// C es el objeto
        int x=(int)(Math.random()*10+1);
        //Darle los valores necesarios al objeto
        C.asignarRadio(x);
        //Hacer que el objeto calcule el resto de las propiedades
        C.calcularArea();
        C.calcularPerimetro();
        //Hacer que el objeto devuelva todos los valores a la pantalla
        System.out.println("El circulo");
        System.out.println("radio= "+C.mostrarRadio());
        System.out.println("Area= "+C.mostrarArea());
        System.out.println("Perimetro= "+C.mostrarPerimetro());  
    }
}
