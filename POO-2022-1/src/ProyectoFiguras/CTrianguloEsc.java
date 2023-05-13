package ProyectoFiguras;
public class CTrianguloEsc extends CTriangulo{
    public CTrianguloEsc(){}
    public CTrianguloEsc(double l1, double l2, double l3){
        super(l1,l2,l3);
    }
    @Override
    public void Perimetro(){
        perimetro=l1+l2+l3;
    }
    @Override
    public void Area(){
        area=Math.sqrt((perimetro/2)*((perimetro/2)-l1)*((perimetro/2)-l2)*((perimetro/2)-l3));
    }
    @Override
    public String toString(){
        return "Lado 1= "+l1+"\nLado 2= "+l2+"\nLado 3= "+l3+super.toString();
    }
}
