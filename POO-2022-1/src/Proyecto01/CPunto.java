package Proyecto01;
public class CPunto {
    private int x,y;
    
    public CPunto(){ }
    public CPunto(int x,int y){setX(x);setY(y);}
    
    public void setX(int x){this.x=x;}
    public void setY(int y){this.y=y;}
    public int getX(){return x;}
    public int getY(){return y;}
    @Override
    public String toString(){return "("+x+","+y+")";}
    
}
