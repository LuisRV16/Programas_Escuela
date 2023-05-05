import java.util.Scanner;
//@author Luis Ricardo Reyes Villar
public class ApTrianguloEsc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lado1, lado2, lado3;
        System.out.println("---Triangulo Escaleno---\n");
        CTrianguloEsc C = new CTrianguloEsc();
        do{
            System.out.print("Introduzca la medida del lado 1: ");
            lado1=sc.nextInt();
            System.out.print("Introduzca la medida del lado 2: ");
            lado2=sc.nextInt();
            System.out.print("Introduzca la medida del lado 3: ");
            lado3=sc.nextInt();
            if (lado1+lado2<=lado3||lado1+lado3<=lado2||lado2+lado3<=lado1) {
                System.out.println("Medidas introducidas invalidas\nLa suma de dos de los lados de "
                + "un triangulo debe ser mayor a la longitud del 3er lado\nIntroduzca valores validos\n");
            }else if(lado1==lado2||lado1==lado3||lado2==lado3){
                System.out.println("Medidas introducidas invalidas\nIntroduzca valores acorde a un "
                        + "triangulo escaleno\nLa longitud de los lados del triangulo escaleno son "
                        + "desiguales entre sí");
            }
        }while(lado1+lado2<=lado3||lado1+lado3<=lado2||lado2+lado3<=lado1||lado1==lado2||lado1==lado3||lado2==lado3);
        C.setL1(lado1);
        C.setL2(lado2);
        C.setL3(lado3);
        C.Perimetro();
        C.Area();
        System.out.println(C);
    }
    
}
