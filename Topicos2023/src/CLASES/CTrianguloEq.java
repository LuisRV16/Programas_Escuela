package CLASES;
public class CTrianguloEq extends CTrianguloP{
    public CTrianguloEq(){}
    public CTrianguloEq(int l1){
        super(l1);
    }
    @Override
    public void Area(){
        double altura = Math.sqrt(Math.pow(l1, 2)-Math.pow(l1/2, 2));
        area = l1*altura/2;
    }

    @Override
    public void Perimetro() {
        perimetro = l1*3;
    }
}
