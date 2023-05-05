package CLASES;
public class CTrianguloEsc extends CTrianguloP {
    public CTrianguloEsc(){}
    public CTrianguloEsc(int l1, int l2, int l3){
        super(l1,l2,l3);
    }

    @Override
    public void Area() {
        double S = perimetro/2;
        area = Math.sqrt(S*(S-l1)*(S-l2)*(S-l2));
    }

    @Override
    public void Perimetro() {
        perimetro=l1+l2+l3;
    }
}
