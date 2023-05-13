package ProyectoFiguras_U4;

import ProyectoFiguras.*;

public class CTrianguloEq extends CTriangulo{
    public CTrianguloEq(){}
    public CTrianguloEq(double l1){
        super(l1);
    }
    @Override
    public void Area(){
        area= l1*Math.sqrt(Math.pow(l1, 2)-Math.pow(l1/2, 2))/2;
    }
    @Override
    public void Perimetro(){
        perimetro=l1*3;
    }
    @Override
    public String toString(){
        return "Lado= "+l1+super.toString();
    }
}
