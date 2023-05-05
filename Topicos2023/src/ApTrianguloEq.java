import java.util.Scanner;
//@author Luis Ricardo Reyes Villar
public class ApTrianguloEq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lado1;
        System.out.println("---Triangulo Equilatero---\n");
        CTrianguloEq A = new CTrianguloEq();
        System.out.print("Introduzca la medida de la base: ");
        lado1=sc.nextInt();
        A.setL1(lado1);
        A.Perimetro();
        A.Area();
        System.out.println(A);
    }
    
}
