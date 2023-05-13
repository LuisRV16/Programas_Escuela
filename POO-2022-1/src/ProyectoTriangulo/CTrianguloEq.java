package ProyectoTriangulo;
//@author Luis Ricardo Reyes Villar
public class CTrianguloEq {
    protected double lado1, altura, perimetro, area;
    public CTrianguloEq(){
    }
    public CTrianguloEq(double L1){
       setLado(L1); 
    }
    public void setLado(double lado1){
        this.lado1=lado1;
    }
    public void Altura(){
        altura = Math.sqrt((Math.pow(lado1, 2))-Math.pow(lado1/2, 2));
    }
    public void Perimetro(){
        perimetro = lado1*3;
    }
    public void Area(){
        area=(lado1*altura)/2;
    }
    public double getLado(){
        return lado1;
    }
    public double getAltura(){
        return altura;
    }
    public double getPerimetro(){
        return perimetro;
    }
    public double getArea(){
        return area;
    }
}
