package TDA_Aplicaciones;
import TDA.CPila;
public class Aplicacion04 {
    public static void main(String[] args) {
        CPila Sueldos=new CPila();
        for(int i=1;i<=10;i++)
            Sueldos.insertar((int)(Math.random()*5000+4000));
        System.out.println(Sueldos);
        Sueldos.bono(10000);
        System.out.println(Sueldos);
    }
    
}
