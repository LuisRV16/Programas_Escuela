package ProyectoFiguras;
public class CRectangulo extends CFiguras2D{
    public CRectangulo(){}
    public CRectangulo(double l1, double l2){
        super(l1,l2);
    }
    @Override
    public void Area(){
        area= l1*l2;
    }
    @Override
    public void Perimetro(){
        perimetro= 2*(l1+l2);
    }
    @Override
    public String toString(){
        return "Base= "+l1+"\nAltura= "+l2+super.toString();
    }
}
