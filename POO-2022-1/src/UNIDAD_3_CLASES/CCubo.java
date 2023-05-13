package UNIDAD_3_CLASES;
public class CCubo extends CCuadrado{
    //Propiedades
    private double volumen;
    //Constructores
    public CCubo(){ }
    public CCubo(double lado){ super(lado); }
    //Comportamientos
    public void Volumen(){volumen=Math.pow(lado,3);}
    public double getVolumen(){return volumen;}
}
