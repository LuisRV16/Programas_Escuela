package Clases;
//@RC
public class Multiplicativo extends Lineal{
    public Multiplicativo(){
        c=0;
    }
    @Override
    public void a(){
        a = 3+8*getK();
    }
    @Override
    public void periodoV(){
        p = (int) Math.pow(2, g-2);
    }
}
