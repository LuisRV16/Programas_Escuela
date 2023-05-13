package UNIDAD_3_CLASES;
public class CCuadrado {
    //Definir las propiedades y su acceso
    protected double lado,area,perimetro;
    //Constructores sobrecargados
    public CCuadrado(){ }
    public CCuadrado(double lado){setLado(lado);}
    //Comportamientos que ASIGNAN VALOR
    public void setLado(double lado){this.lado=lado;}
    //Comportamientos que DEVUELVEN VALOR
    public double getLado(){return lado;}
    public double getArea(){return area;}
    public double getPerimetro(){return perimetro;}
    @Override
    public String toString()
    {return "Area: "+area+"\nPerimetro: "+perimetro+
            "\nLado: "+lado;}
    //Comportamientos que CALCULAN VALORES
    public void Area(){area=lado*lado;}
    public void Perimetro(){perimetro=lado*4;}
}
