//@author Luis Ricardo Reyes Villar
public class CTrianguloIsos extends CTrianguloEq {
    protected int l2;
    public CTrianguloIsos(){}
    public CTrianguloIsos(int l1, int l2){
        super(l1);
        setL2(l2);
    }
    public void setL2(int l2){
        this.l2=l2;
    }
    public int getL2(){
        return l2;
    }
    @Override
    public void Perimetro(){
        perimetro=l1*2+l2;
    }
    @Override
    public void Area(){
        area=(float) ((l2*(Math.sqrt(Math.pow(l1, 2)-Math.pow(l2/2, 2))))/2);
    }
}
