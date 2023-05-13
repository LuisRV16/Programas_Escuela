package ProyectoTriangulo2;
public class CTIsosceles extends CTriangulo{
    //Constructores
    public CTIsosceles(){}
    public CTIsosceles(double l1,double l2){super(l1,l2);}
    //Comportamientos
    public void Area(){
        double altura=Math.sqrt(Math.pow(l2, 2)-Math.pow(l1/2, 2));
        area=l1*altura/2;
    }
    public void Perimetro(){
        perimetro=l1+l2*2;
    }
    public String toString(){
        return super.toString()+"\nL1= "+l1+"\nL2= "+l2;
    }
    
}
