package UNIDAD_2_CLASES;
public class CMascota {
    //Propiedades
    private String nombre,tipo,color;
    private int edad;
    //Constructores sobrecargados
    public CMascota(){ }
    public CMascota(String n,String t,String c,int e)
    {setNombre(n);setTipo(t);setColor(c);setEdad(e); }
    //Comportamientos
    public String getNombre() {return nombre;}
    public String getTipo() {return tipo;}
    public String getColor() {return color;}
    public int getEdad() {return edad;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setTipo(String tipo) {this.tipo = tipo;}
    public void setColor(String color) {this.color = color;}
    public void setEdad(int edad) {this.edad = edad;}
}
