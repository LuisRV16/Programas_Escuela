//@author Luis Ricardo Reyes Villar
public class CTrianguloEsc extends CTrianguloIsos{
    private int l3;
    public CTrianguloEsc(){}
    public CTrianguloEsc(int l1, int l2, int l3){
        super(l1,l2);
        setL3(l3);
    }
    public void setL3(int l3){
        this.l3=l3;
    }
    public int getL3(){
        return l3;
    }
    @Override
    public void Perimetro(){
        perimetro = l1+l2+l3;
    }
    @Override
    public void Area(){
        area = (float)(Math.sqrt(perimetro/2*(perimetro/2-l1)*(perimetro/2-l2)*(perimetro/2-l3)));
    }
}
