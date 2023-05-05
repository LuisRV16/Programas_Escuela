//@author Luis Ricardo Reyes Villar
public class CTrianguloEq {
    protected int l1,perimetro;
    protected float area;
    public CTrianguloEq(){}
    public CTrianguloEq(int lado1){
        setL1(lado1);
    }
    public void setL1(int l1){
        this.l1=l1;
    }
    public int getL1(){
        return l1;
    }
    public void Perimetro(){
        perimetro=l1*3;
    }
    public void Area(){
        area=(float) (l1*(Math.sqrt(Math.pow(l1, 2)-Math.pow(l1/2, 2)))/2);
    }
    @Override
    public String toString(){
        return "Area = "+area+"u^2\nPerimetro = "+perimetro+"u";
    }
}
