package ProyectoTriangulo;
//@author Luis Ricardo Reyes Villar
public class CTrianguloEsc extends CTrianguloIso {
    protected double lado3;
    public CTrianguloEsc(){}
    public CTrianguloEsc(double L1,double L2,double L3){
        setLado(L1,L2,L3);
    }
    public void setLado(double lado1, double lado2,double lado3){
        this.lado1=lado1;
        this.lado2=lado2;
        this.lado3=lado3;
    }
    @Override
    public void Perimetro(){
        perimetro = lado1+lado2+lado3;
    }
    @Override
    public void Area(){
        area=Math.sqrt(((perimetro/2)*((perimetro/2)-lado1)*((perimetro/2)-lado2)*((perimetro/2)-lado3)));
    }
    @Override
    public double getLado(){
        return lado1;
    }
    @Override
    public double getLado2(){
        return lado2;
    }
    public double getLado3(){
        return lado3;
    }
    @Override
    public double getAltura(){
        return altura;
    }
    @Override
    public double getPerimetro(){
        return perimetro;
    }
    @Override
    public double getArea(){
        return area;
    }
}
