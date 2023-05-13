package CLASES;
public class CCirculo {
    //Propiedades
    private float mapache,perro,caguama;
    //Constructores
    public CCirculo(){ }
    public CCirculo(float x){asignarRadio(x);}
    //Comportamientos que ASIGNAN VALORES
    public void asignarRadio(float x){mapache=x;}
    //Comportamientos que calculan otros valores
    public void calcularArea(){perro=(float)(Math.PI*mapache*mapache);}
    public void calcularPerimetro(){caguama=(float)(Math.PI*2*mapache);}
    //Comportamientos que DEVUELVEN VALORES a la pantalla
    public float mostrarRadio(){return mapache;}
    public float mostrarArea(){return perro;}
    public float mostrarPerimetro(){return caguama;}
    @Override
    public String toString()
    {return "radio= "+mapache+"\nArea= "+perro+"\nPerimetro= "+caguama;}
}
