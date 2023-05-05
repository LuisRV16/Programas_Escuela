package TDA_Aplicaciones;
import TDA.CPila;
public class AplicacionPila03 {
    public static void main(String[] args) {
        CPila A=new CPila();
        CPila B=new CPila();
        CPila C=new CPila();
        // C=A+B
        for(int i=1;i<=5;i++)
        {
            A.insertar((int)(Math.random()*200+1));
            B.insertar((int)(Math.random()*200+1));
        }
        System.out.println("Lista A: "+A);
        System.out.println("Lista B: "+B);
        C.union(A,B);
        System.out.println("Lista A: "+A);
        System.out.println("Lista B: "+B);
        System.out.println("Lista C: "+C);
    }
}
