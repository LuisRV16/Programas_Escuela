package ProyectoTriangulo;
//@author Luis Ricardo Reyes Villar
public class CTrianguloIso extends CTrianguloEq {
    protected double lado2;
    public CTrianguloIso(){
    }
    public CTrianguloIso(double L1, double L2){
        setLado(L1,L2);
    }
    public void setLado(double lado1, double lado2){
        this.lado1=lado1;
        this.lado2=lado2;
    }
    @Override
    public void Altura(){
        altura = Math.sqrt((Math.pow(lado2, 2))-Math.pow(lado1/2, 2));
    }
    @Override
    public void Perimetro(){
        perimetro = lado1+lado2*2;
    }
    @Override
    public double getLado(){
        return lado1;
    }
    public double getLado2(){
        return lado2;
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
