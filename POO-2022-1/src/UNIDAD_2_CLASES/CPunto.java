package UNIDAD_2_CLASES;
public class CPunto {
    //Propiedades con acceso privado
    private int x,y;
    //Constructores
    public CPunto(){ }
    public CPunto(int x,int y){setX(x);setY(y); }
    //Comportamientos que ASIGNAN VALOR
    public void setX(int x){this.x=x;}
    public void setY(int y){this.y=y;}
    //Comportamientos que DEVULVEN VALOR
    public int getX(){return x;}
    public int getY(){return y;}
    @Override
    public String toString(){return "("+x+","+y+")";}
    
}
