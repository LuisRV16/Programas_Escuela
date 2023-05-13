package Proyecto01;
public class CTriangulo{
    //Propiedades
    private double dAB,dBC,dAC;
    private double area,perimetro;
    private CPunto A,B,C;
    //Constructores
    public CTriangulo()
    {A=new CPunto();B=new CPunto();C=new CPunto();}
    
    /*public CTriangulo(int x1,int y1,int x2,int y2,int x3,int y3)
    {setVertices(x1,y1,x2,y2,x3,y3); }
    
    public CTriangulo(CPunto A,CPunto B,CPunto C)
    {this.A=A;this.B=B;this.C=C;}*/
    
    //Hacer un constructor que reciba un arreglo entero y crear
    //las coordenadas A, B y C

    public CTriangulo(int[] c) {
        setVertices(c[0],c[1],c[2],c[3],c[4],c[5]);
    }
    /*public CTriangulo(int[] c){
        int x1=0,y1=0,x2=0,y2=0,x3=0,y3=0;
        x1=c[0];
        y1=c[1];
        x2=c[2];
        y2=c[3];
        x3=c[4];
        y3=c[5];
        setVertices(x1, y1, x2, y2, x3, y3);
        A=new CPunto(x1,y1);B=new CPunto(x2,y2);C=new CPunto(x3,y3);
    }*/
    
    //Comportamientos de asignacion
    public void setVertices(int x1,int y1,int x2,int y2,int x3,int y3)
    {A=new CPunto(x1,y1);B=new CPunto(x2,y2);C=new CPunto(x3,y3);  }        
    //Comportamientos de CALCULO
    public void cAB()
    {  int a=B.getX()-A.getX();
       int b=B.getY()-A.getY();
       dAB=Math.sqrt(a*a + b*b);
    }
    public void cBC()
    {  int a=B.getX()-C.getX();
       int b=B.getY()-C.getY();
       dBC=Math.sqrt(a*a + b*b);
    }
    public void cAC()
    {dAC=Math.sqrt(Math.pow(A.getX()-C.getX(),2) + Math.pow(A.getY()-C.getY(),2));}
   
    public void Perimetro(){perimetro=dAB+dAC+dBC;}
    public void Area()
    {
        double S=perimetro/2;
        area=Math.sqrt(S*(S-dAB)*(S-dBC)*(S-dAC));
    }
    
    //Comportamientos que DEVUELVEN VALOR
    public double getAB(){return dAB;}
    public double getBC(){return dBC;}
    public double getAC(){return dAC;}
    public double getPerimetro(){return perimetro;}
    public double getArea(){return area;}
    public String getA(){return A.toString();}
    public String getB(){return B.toString();}
    public String getC(){return C.toString();}
}
