package CLASES;
public abstract class CTrianguloP {
    protected double l1,l2,l3,area,perimetro;
    public CTrianguloP(){
    }
    public CTrianguloP(int l1){
        setL1(l1);
    }
    public CTrianguloP(int l1,int l2){
        setL1(l1);
        setL2(l2);
    }
    public CTrianguloP(int l1, int l2, int l3){
        setL1(l1);
        setL2(l2);
        setL3(l3);
    }
    public void setL1(double l1) {
        this.l1 = l1;
    }
    public void setL2(double l2) {
        this.l2 = l2;
    }
    public void setL3(double l3) {
        this.l3 = l3;
    }
    public double getL1() {
        return l1;
    }
    public double getL2() {
        return l2;
    }
    public double getL3() {
        return l3;
    }
    public double getArea() {
        return area;
    }
    public double getPerimetro() {
        return perimetro;
    }
    public abstract void Area();
    public abstract void Perimetro();
}
