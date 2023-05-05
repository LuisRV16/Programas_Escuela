package TDA_Aplicaciones;
import TDA.CPila;
public class AplicacionPila02 {
    public static void main(String[] args) {
        CPila A=new CPila();
        CPila B=new CPila();
        for(int i=1;i<=20;i++)
            A.insertar((int)(Math.random()*100+1));
        System.out.println("Mostrando elementos de la Pila A");
        System.out.println(A);
        while(!A.vacia())
            B.insertar(A.eliminar());
        System.out.println("Mostrando elementos de la Pila A");
        System.out.println(A);
        System.out.println("\nMostrando elementos de la Pilka B");
        System.out.println(B);
        
    }
    
}
