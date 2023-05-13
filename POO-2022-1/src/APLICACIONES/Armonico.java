package APLICACIONES;
public class Armonico {
    public static void main(String[] args) {
        int n;
        n=20;
        double a=0;
        for(int i=1;i<=n;i++)
            a=a+((double)1/i);
        System.out.println("Armonico: "+a);
    }
}

