package ProyectoTriangulo2;
public class CTEscaleno extends CTriangulo{
    public CTEscaleno(){}
    public CTEscaleno(double l1,double l2,double l3){super(l1,l2,l3);}
    public void Area(){
        double S =(l1+l2+l3)/2;
        area=Math.sqrt(S*(S-l1)*(S-l1)*(S-l3));
    }
    public void Perimetro(){perimetro=l1+l2+l3;}
    public String toString(){
        return super.toString()+"\nL1= "+l1+"\nL2= "+l2+"\nL3= "+l3;
    }
}
