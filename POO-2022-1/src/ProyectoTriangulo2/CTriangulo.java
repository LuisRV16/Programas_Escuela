package ProyectoTriangulo2;
public abstract class CTriangulo {//Clase Base
    //Propiedades
    protected double l1,l2,l3,area,perimetro,altura;
    //Constructores
    public CTriangulo(){}
    public CTriangulo(double l1){setL1(l1);}
    public CTriangulo(double l1, double l2){
        setL1(l1);
        setL2(l2);
    }
    public CTriangulo (double l1, double l2, double l3){
        setL1(l1);
        setL2(l2);
        setL3(l3);
    }
    //Comportamientos
    public void setL1(double l1){this.l1=l1;}
    public void setL2(double l2){this.l2=l2;}
    public void setL3(double l3){this.l3=l3;}
    public double getL1(){return l1;}
    public double getL2(){return l2;}
    public double getL3(){return l3;}
    public double getArea(){return area;}
    public double getPerimetro(){return perimetro;}
    @Override
    public String toString(){
        return "Area= "+area+"\nPerimetro= "+perimetro;
    }
}
