package ProyectoTriangulo;
//@author Luis Ricardo Reyes Villar
public class PTriangulo {
    public static void main(String[] args) {
        //Triangulo Equilatero
        CTrianguloEq T = new CTrianguloEq();
        int lado1 = 10;
        int lado2 = 15;
        int lado3 = 17;
        T.setLado(lado1);
        T.Altura();
        T.Perimetro();
        T.Area();
        System.out.println(" Triangulo Equilatero");
        System.out.println("El lado mide "+T.getLado()+"u");
        System.out.println("La altura es de "+T.getAltura()+"u");
        System.out.println("El perimetro es de "+T.getPerimetro()+"u");
        System.out.println("El area es de "+T.getArea()+"u²");
        //Triangulo Isosceles
        CTrianguloIso T2 = new CTrianguloIso();
        if (lado1==lado2) {
            System.out.println("\nIngrese valores que representen a un triángulo isósceles");
        }
        else{
            if (lado1>=lado2*2||lado2>=lado1+lado2) {
            System.out.println("\nLa suma de las longitudes de dos lados del triangulo debe ser mayor "
                           + "que el tercer lado.\nPor favor ingrese valores válidos.");
            }
            else{
                T2.setLado(lado1,lado2);
                T2.Altura();
                T2.Perimetro();
                T2.Area();
                System.out.println("\n Triangulo Isosceles");
                System.out.println("El lado 1 mide "+T2.getLado()+"u");
                System.out.println("El lado 2 mide "+T2.getLado2()+"u");
                System.out.println("La altura es de "+T2.getAltura()+"u");
                System.out.println("El perimetro es de "+T2.getPerimetro()+"u");
                System.out.println("El area es de "+T2.getArea()+"u²");
            }
        }
        //Triangulo Escaleno
        CTrianguloEsc T3 = new CTrianguloEsc();
        if (lado1==lado2||lado2==lado3||lado1==lado3) {
            System.out.println("\nIngrese valores que represente a un triángulo escaleno");
        }
        else{
            if (lado1>=lado2+lado3||lado2>=lado1+lado3||lado3>=lado1+lado2) {
            System.out.println("\nLa suma de las longitudes de dos lados del triangulo debe ser mayor "
                           + "que el tercer lado.\nPor favor ingrese valores válidos.");
            }
            else{
                T3.setLado(lado1,lado2,lado3);
                T3.Perimetro();
                T3.Area();
                System.out.println("\n Triangulo Escaleno");
                System.out.println("El lado 1 mide "+T3.getLado()+"u");
                System.out.println("El lado 2 mide "+T3.getLado2()+"u");
                System.out.println("El lado 3 mide "+T3.getLado3()+"u");
                System.out.println("El perimetro es de "+T3.getPerimetro()+"u");
                System.out.println("El area es de "+T3.getArea()+"u²");
            }
        }
    }
}
