package CLASES;
public class Calculadora {
    //SECCION 1: PROPIEDADES (variables)
       //Acceso: publico (public),privado(private),protegido(protected)
    //SECCION 2: CONSTRUCTORES
    
    //SECCION 3: COMPORTAMIENTOS (metodos)
    private float sumar(float v1,float v2){return (v1+v2);}
    public float restar(float v1,float v2){return (v1-v2);}
    public float multiplicar(float v1, float v2){return (v1*v2);}
    public float dividir(float v1,float v2){return (v1/v2);}
    public float elevar(float v1,float v2){ return ((float) Math.pow(v1,v2));}
    
    public float hadaMadrina(float v1,float v2)
    {return  sumar(v1,v2); }
}
