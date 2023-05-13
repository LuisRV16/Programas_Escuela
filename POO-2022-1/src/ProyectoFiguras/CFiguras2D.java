package ProyectoFiguras;
public abstract class CFiguras2D {
    protected double l1,l2,l3,perimetro,area;
    
    public CFiguras2D(){}
    public CFiguras2D(double l1){setLado1(l1);}
    public CFiguras2D(double l1, double l2){
        setLado1(l1);
        setLado2(l2);
    }
    public CFiguras2D(double l1, double l2, double l3){
        setLado1(l1);
        setLado2(l2);
        setLado3(l3);
    } 
    public void setLado1(double l1){this.l1=l1;}
    public void setLado2(double l2){this.l2=l2;}
    public void setLado3(double l3){this.l3=l3;}
    public double getArea(){return area;}
    public double getPerimetro(){return perimetro;}
    public abstract void Area();
    public abstract void Perimetro();
    @Override
    public String toString(){
        return "\nÁrea= "+area+"u²\nPerimetro= "+perimetro+"u";
    }
}
