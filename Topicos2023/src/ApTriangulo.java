import java.util.Scanner;
//@author Luis Ricardo Reyes Villar
public class ApTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lado1, lado2, lado3;
        System.out.println("---Triangulo Equilatero---\n");
        CTrianguloEq A = new CTrianguloEq();
        System.out.print("Introduzca la medida de la base: ");
        lado1=sc.nextInt();
        A.setL1(lado1);
        A.Perimetro();
        A.Area();
        System.out.println(A);
        System.out.println("");
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
                        + "triangulo isosceles\nLa longitud de 2 de los lados del triangulo isosceles son"
                        + " iguales y la 3er longitud desigual");
            }
        }while(lado1+lado2<=lado1||lado1*2<=lado2);
        B.setL1(lado1);
        B.setL2(lado2);
        B.Perimetro();
        B.Area();
        System.out.println(B);
        System.out.println("");
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
        }while(lado1+lado2<=lado3||lado1+lado3<=lado2||lado2+lado3<=lado1||lado1==lado2||lado1==lado3
                ||lado2==lado3);
        C.setL1(lado1);
        C.setL2(lado2);
        C.setL3(lado3);
        C.Perimetro();
        C.Area();
        System.out.println(C);
    }
}