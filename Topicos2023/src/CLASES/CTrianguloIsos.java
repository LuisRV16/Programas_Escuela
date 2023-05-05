package CLASES;
public class CTrianguloIsos extends CTrianguloP{
    public CTrianguloIsos(){}
    public CTrianguloIsos(int l1, int l2){
        super(l1,l2);
    }

    @Override
    public void Area() {
        double altura = Math.sqrt(Math.pow(l1, 2)-Math.pow(l2/2, 2));
        area = l2*altura/2;
    }

    @Override
    public void Perimetro() {
        perimetro = l1*2+l2;
    }
}
