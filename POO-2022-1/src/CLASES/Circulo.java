package CLASES;
public class Circulo {
    //Propiedades
    private float radio,area,perimetro;
    //constructores
    public Circulo(){}
    public Circulo(float radio){setRadio(radio);}
    //comportamientos
    public float getRadio() {return radio;}
    public float getArea() {return area;}
    public float getPerimetro() {return perimetro;}
    public void  setRadio(float radio) {this.radio = radio;}
    
    public void Area(){area=(float)(Math.PI*radio*radio);}
    public void Perimetro(){perimetro=(float)(Math.PI*2*radio);}
    @Override
    public String toString()
    {return "Radio= "+radio+"\nArea= "+area+"\nPerimetro= "+perimetro;}   
}
