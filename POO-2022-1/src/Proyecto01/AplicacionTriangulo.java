package Proyecto01;
public class AplicacionTriangulo {
    public static void main(String[] args) {
        //Crear un objeto de la clase CTriangulo
        /*CTriangulo T=new CTriangulo(0,0,30,40,0,40);
        T.setVertices(0,0,30,0,0,40);
        CPunto A=new CPunto(-20,-10);
        CPunto B=new CPunto(50,-12);
        CPunto C=new CPunto(20,30);
        CTriangulo T=new CTriangulo(A,B,C);*/
        int c[]=new int[6];
        c[0]=0;c[1]=0;
        c[2]=30;c[3]=0;
        c[4]=0;c[5]=40;
        CTriangulo T=new CTriangulo(c);//Se envia un array como parametro
        T.cAB();//metodo publico, no devuelve nada
        T.cBC();
        T.cAC();
        T.Perimetro();
        T.Area();
        System.out.println("Triangulo");
        System.out.println("Distancia AB= "+T.getAB());
        System.out.println("Distancia BC= "+T.getBC());
        System.out.println("Distancia AC= "+T.getAC());
        System.out.println("Area= "+T.getArea());
        System.out.println("Perimetro= "+T.getPerimetro());
        System.out.println("Vertice A: "+T.getA());
        System.out.println("Vertice B: "+T.getB());
        System.out.println("Vertice C: "+T.getC());
        
    }
}
