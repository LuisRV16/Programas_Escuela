package UNIDAD_2_APLICACIONES;

import UNIDAD_2_CLASES.CPunto;

public class AplicacionDistancia2Puntos02 {
    public static void main(String[] args) {
        //signo1 ->x
        //signo2 ->y
        int x,y,signo1,signo2;
        x=(int)(Math.random()*10+1);
        y=(int)(Math.random()*10+1);
        CPunto A=new CPunto();
        CPunto B=new CPunto();
        signo1=(int)(Math.random()*2);//0(positivo),1(negativo)
        signo2=(int)(Math.random()*2);
        if(signo1==1)
            A.setX(x*-1);
        else
            A.setX(x);
        if(signo2==1)
            A.setY(y*-1);
        else
            A.setY(y);
        System.out.println("A"+A);
        signo1=(int)(Math.random()*2);
        signo2=(int)(Math.random()*2);
        if(signo1==1)
            B.setX(x*-1);
        else
            B.setX(x);
        if(signo2==1)
            B.setY(y*-1);
        else
            B.setY(y);
        System.out.println("B"+B);
        
        //Calcular la distancia entre 2 puntos
        int cA=B.getX()-A.getX();
        int cB=B.getY()-A.getY();
        double d=Math.sqrt(cA*cA+cB*cB);
        System.out.println("Distancia: "+d);
            
            
    }
}
