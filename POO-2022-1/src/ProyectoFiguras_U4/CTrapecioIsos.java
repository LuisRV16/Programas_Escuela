package ProyectoFiguras_U4;

import ProyectoFiguras.*;

public class CTrapecioIsos extends CTrapecio {
    public CTrapecioIsos(){}
    public CTrapecioIsos(double l1, double l2, double l3){
        super(l1,l2,l3);
    }
    @Override
    public void Area(){
        area= (l1+l2)*l3/2;
    }
    @Override
    public void Perimetro(){
        perimetro= l1+l2+2*(Math.sqrt(Math.pow((l1-l2)/2, 2)+Math.pow(l3, 2)));
    }
    @Override
    public String toString(){
        return "Base mayor= "+l1+"\nBase menor= "+l2+"\nAltura= "+l3+super.toString();
    }
}
