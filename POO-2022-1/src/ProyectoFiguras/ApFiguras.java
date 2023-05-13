package ProyectoFiguras;
public class ApFiguras {
    public static void main(String[] args) {
        int n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12,n13,n14;
        n1= (int) (Math.random()*20+1);
        n2= (int) (Math.random()*20+1);
        n3= (int) (Math.random()*20+1);
        n4= (int) (Math.random()*20+1);
        n5= (int) (Math.random()*20+1);
        n6= (int) (Math.random()*20+1);
        n7= (int) (Math.random()*20+1);
        n8= (int) (Math.random()*20+1);
        n9= (int) (Math.random()*10+1);
        n10=(int) (Math.random()*20+1);
        n11=(int) (Math.random()*20+1);
        n12=(int) (Math.random()*20+1);
        n13=(int) (Math.random()*20+1);
        n14=(int) (Math.random()*20+1);
        //Objetos de figuras 2D
        CCuadrado A = new CCuadrado();
        CCirculo B = new CCirculo();
        CRombo C = new CRombo();
        CRectangulo D = new CRectangulo();
        CTrapecioRec E = new CTrapecioRec();
        CTrapecioIsos F = new CTrapecioIsos();
        CTrianguloEq H = new CTrianguloEq();
        CTrianguloIsos I = new CTrianguloIsos();
        CTrianguloEsc J = new CTrianguloEsc();
        if (n3<=n4) {
            while(n3>n4){
                n3=(int) (Math.random()*20+1);
            }
        }
        if (n5==n6) {
            while(n5!=n6){
                n5=(int) (Math.random()*20+1);
            }
        }
        if (n7<=n8) {
            while(n7>n8){
                n7=(int) (Math.random()*20+1);
            }
        }
        if (n10>=n11) {
            while(n11>n10){
                n11=(int) (Math.random()*20+1);
            }
        }
        if ((n12+n13)<=n14) {
            while((n12+n13)>n14){
                n12=(int) (Math.random()*20+1);
            }
        }else if ((n13+n14)<=n12) {
            while((n13+n11)>n12){
                n13=(int) (Math.random()*20+1);
            }
        }else if ((n12+n14)<=n13) {
            while((n12+n14)>n13){
                n14=(int) (Math.random()*20+1);
            }
        }
        A.setLado1(n1);
        A.Area();
        A.Perimetro();
        System.out.println("Cuadrado:");
        System.out.println(A);
        B.setLado1(n2);
        B.Area();
        B.Perimetro();
        System.out.println("\nCirculo");
        System.out.println(B);
        C.setLado1(n3);
        C.setLado2(n4);
        C.Area();
        C.Perimetro();
        System.out.println("\nRombo");
        System.out.println(C);
        D.setLado1(n5);
        D.setLado2(n6);
        D.Area();
        D.Perimetro();
        System.out.println("\nRectangulo");
        System.out.println(D);
        E.setLado1(n7);
        E.setLado2(n8);
        E.setLado3(n9);
        E.Area();
        E.Perimetro();
        System.out.println("\nTrapecio Rectangulo");
        System.out.println(E);
        F.setLado1(n7+5);
        F.setLado2(n8+5);
        F.setLado3(n9);
        F.Area();
        F.Perimetro();
        System.out.println("\nTrapecio Isosceles");
        System.out.println(F);
        H.setLado1(n1);
        H.Area();
        H.Perimetro();
        System.out.println("\nTriangulo Equilatero");
        System.out.println(H);
        I.setLado1(n10);
        I.setLado2(n11);
        I.Area();
        I.Perimetro();
        System.out.println("\nTriangulo Isosceles");
        System.out.println(I);
        J.setLado1(n12);
        J.setLado2(n13);
        J.setLado3(n14);
        J.Perimetro();
        J.Area();
        System.out.println("\nTriangulo Escaleno");
        System.out.println(J);
    }
}