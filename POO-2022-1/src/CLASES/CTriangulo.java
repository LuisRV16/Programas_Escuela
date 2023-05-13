package CLASES;
public class CTriangulo 
{//SECCION 1: PROPIEDADES DEL OBJETO
    public float base,altura,area;
 //SECCION 2: CONSTRUCTORES SOBRECARGADOS
    public CTriangulo(){ }
    public CTriangulo(float b,float a){asignarBase(b);asignarAltura(a);}
 //SECCION 3: COMPORTAMIENTOS
    public void asignarBase(float x){base=x;}
    public void asignarAltura(float x){altura=x;}
    public void calcularArea(){area=(base*altura)/2;}
    public float mostrarBase(){return base;}
    public float mostrarAltura(){return altura;}
    public float mostrarArea(){return area;}
    
    @Override
    public String toString()
    {return "Base: "+base+"\nAltura: "+altura+"\nArea: "+area;}
}
