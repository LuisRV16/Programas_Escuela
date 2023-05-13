package ProyectoFiguras;
public class CCirculo extends CFiguras2D {
    public CCirculo(){}
    public CCirculo(double l1){super(l1);}
    @Override
    public void Area(){
        area= Math.PI*Math.pow(l1, 2);
    }
    @Override
    public void Perimetro(){
        perimetro = Math.PI*2*l1;
    }
    @Override
    public String toString(){
        return "Radio= "+l1+super.toString();
    }
}
