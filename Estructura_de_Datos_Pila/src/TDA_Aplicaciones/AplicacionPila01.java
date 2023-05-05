package TDA_Aplicaciones;
import TDA.CPila;
public class AplicacionPila01 {
    public static void main(String[] args) {
        CPila A=new CPila();
        int n;
        for(int i=1;i<=10;i++)
        {
            n=(int)(Math.random()*50+1);
            A.insertar(n);
            System.out.println(A);
        }
        System.out.println(A);
        int elemento;
        while(!A.vacia())
        {
            elemento=A.eliminar();
            System.out.println("Elemento eliminado: "+elemento);
            System.out.println(A);
        }
    }
    
}
