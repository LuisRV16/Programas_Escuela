package ProyectoFiguras_U4;

import ProyectoFiguras.*;

public class CRombo extends CFiguras2D {
    public CRombo(){}
    public CRombo(double l1,double l2){
        super(l1,l2);
    }
    @Override
    public void Area(){
        area= (l1*l2)/2;
    }
    @Override
    public void Perimetro(){
        perimetro= Math.sqrt(Math.pow(l1/2, 2)+Math.pow(l2/2, 2))*4;
    }
    @Override
    public String toString(){
        return "Diagonal mayor= "+l1+"\nDiagonal menor= "+l2+super.toString();
    }
}
