package ProyectoFiguras_U4;

import ProyectoFiguras.*;

public class CCuadrado extends CFiguras2D {
    public CCuadrado(){}
    public CCuadrado(double l1){super(l1);}
    @Override
    public void Area(){
        area=Math.pow(l1, 2);
    }
    @Override
    public void Perimetro(){
        perimetro=l1*4;
    }
    @Override
    public String toString(){
        return "Lado= "+l1+super.toString();
    }
}
