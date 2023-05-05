package CLASES;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Animal extends Thread{
    public Animal(String nombre){
        super(nombre);
    }
    @Override
    public void run(){
        for (int i = 1; i <= 10; i++) {
            System.out.println(getName()+" "+i);
            if (i==4) {
                System.out.println(getName()+" *se duerme*");
                try {
                    System.out.println(getName()+" ZZZzzz");
                    Thread.sleep(2000);
                    System.out.println(getName()+" *bosteza*");
                } catch (InterruptedException ex) {
                    Logger.getLogger(Animal.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println(getName()+" ...*despierta*");
            }
        }
    }
}
