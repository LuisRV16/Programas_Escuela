package CLASES;
public class Cilindro extends Circulo{
    //propiedades
    float altura,volumen;
    //constructores
    public Cilindro(){}
    public Cilindro(float r,float a){   }
    //comportamientos
    public float getAltura(){return altura;}
    public float getVolumen(){return volumen;}
    public void setAltura(float a){altura=a;}
    public void Volumen(){volumen=getArea()*altura;}
    @Override
    public String toString()
    {return super.toString()+"\nAltura= "+altura+"\nVolumen= "+volumen;}   
    
}
