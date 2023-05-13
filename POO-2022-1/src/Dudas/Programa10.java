package Dudas;
public class Programa10 {
    public static void main(String[] args) {
       int a=2000;
       int b=500;
        System.out.println("a+b= "+(a+b));
        String s1=String.valueOf(a);
        String s2=String.valueOf(b);
        System.out.println("s1+s2="+(s1+s2));
        int resta=Integer.parseInt(s1)-Integer.parseInt(s2);
        System.out.println("s1-s2: "+resta);
        float v1=Float.parseFloat(s1);
        double v2=Double.parseDouble(s2);
        System.out.println("s1= "+v1);
        System.out.println("s2= "+v2);
        
        
    }
}
