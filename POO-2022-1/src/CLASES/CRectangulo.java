package CLASES;
public class CRectangulo {
    //Propiedades con acceso privado activan el encapsulamiento
    private double base,altura,area,perimetro;
    //Constructores sobrecargados
    public CRectangulo(){ }
    public CRectangulo(double base,double altura)
    { setBase(base);setAltura(altura);}
    //Comportamientos que ASIGNAN VALORES
    public void setBase(double base){this.base=base;}
    public void setAltura(double altura){this.altura=altura;}
    //Comportamientos que CALCULAN O PROCESAN VALORES
    public void Area(){area=base*altura;}
    public void Perimetro(){perimetro=2*base+2*altura;}
    //Comportamientos que DEVUELVEN UN VALOR
    public double getBase(){return base;}
    public double getAltura(){return altura;}
    public double getArea(){return area;}
    public double getPerimetro(){return perimetro;}
    
    //El método toString() regresa una cadena con informacion acerca
    //del objeto
    @Override
    public String toString()
    {return "Base: "+base+"\nAltura: "+altura+
            "\nArea: "+area+"\nPerimetro: "+perimetro;}
    
}
