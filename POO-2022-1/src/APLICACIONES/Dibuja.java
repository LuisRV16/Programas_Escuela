package APLICACIONES;

import java.util.Scanner;

public class Dibuja {
    public static void main(String[] args) {
         Scanner X=new Scanner(System.in);
        int n;
        System.out.print("Ingrese un valor: ");
        n=X.nextInt();
        
        for(int i=1;i<=n;++i)
        {    
            for(int j=1;j<=n-i;++j)
                System.out.print(" ");
            for(int j=1;j<=2*i-1;++j)
                System.out.print("*");
            System.out.println("");
        }
        
        for(int i=n-1;i>=1;i--)//for externo
        {    
            for(int j=1;j<=n-i;++j)
                System.out.print(" ");
            for(int j=1;j<=2*i-1;++j)
                System.out.print("*");
            System.out.println("");
        }    
            
    }
}
