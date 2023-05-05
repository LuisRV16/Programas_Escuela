import java.util.Scanner;
//@author Luis Ricardo Reyes Villar
public class ApTrianguloIsos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lado1, lado2;
        System.out.println("---Triangulo Isosceles---\n");
        CTrianguloIsos B = new CTrianguloIsos();
        do{
            System.out.print("Introduzca la medida del lado 1: ");
            lado1=sc.nextInt();
            System.out.print("Introduzca la medida del lado 2: ");
            lado2=sc.nextInt();
            if (lado1+lado2<=lado1||lado1*2<=lado2) {
                System.out.println("Medidas introducidas invalidas\nLa suma de dos de los lados de "
                + "un triangulo debe ser mayor a la longitud del 3er lado\nIntroduzca valores validos\n");
            }else if(lado1==lado2){
                System.out.println("Medidas introducidas invalidas\nIntroduzca valores acorde a un "
                        + "triangulo isosceles\nLa longitud de 2 de los lados del triangulo isosceles son "
                        + "iguales y la 3er longitud desigual");
            }
        }while(lado1+lado2<=lado1||lado1*2<=lado2);
        B.setL1(lado1);
        B.setL2(lado2);
        B.Perimetro();
        B.Area();
        System.out.println(B);
    }
    
}
