package ProyectoTriangulo2;
//@Author Luis Ricardo Reyes Villar
public class AplicacionTriangulo {
    //Aqui se describe el comportamiento de los objetos involucrados
    public static void main(String[] args) {
        CTEquilatero A = new CTEquilatero(20);
        A.Area();
        A.Perimetro();
        System.out.println("Triangulo Equilatero");
        System.out.println(A);
        System.out.println("");
        CTIsosceles B=new CTIsosceles(30,40);
        B.Area();
        B.Perimetro();
        System.out.println("Triangulo Isosceles");
        System.out.println(B);
        System.out.println("");
        CTEscaleno C=new CTEscaleno(30,40,50);
        C.Area();
        C.Perimetro();
        System.out.println("Triangulo Escaleno");
        System.out.println(C);
    }
    
}
