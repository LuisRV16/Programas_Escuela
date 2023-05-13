package ProyectoFiguras;
public class CTrianguloIsos extends CTriangulo{
    public CTrianguloIsos(){}
    public CTrianguloIsos(double l1, double l2){
        super(l1,l2);
    }
    @Override
    public void Area(){
        area=l1*Math.sqrt(Math.pow(l2, 2)-Math.pow(l1/2, 2))/2;
    }
    @Override
    public void Perimetro(){
        perimetro=l1+l2*2;
    }
    @Override
    public String toString(){
        return "Lado 1= "+l1+"\nLado 2= "+l2+super.toString();
    }
}
