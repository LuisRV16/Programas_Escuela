package UNIDAD_2_CLASES;
public class CAlumno 
{   //Propiedades de la clase
    private String nombre,apellidos,direccion;
    private int edad;
    //Constructores
    public CAlumno(){ }
    public CAlumno(String nom,String Ape,int e,String dir)
    { setNombre(nom);setApellidos(Ape);setEdad(e);setDireccion(dir);  }
    //Comportamientos que ASIGNAN VALORES (set)
    public void setNombre(String nombre){this.nombre=nombre;}
    public void setApellidos(String apellidos){this.apellidos=apellidos;}
    public void setEdad(int edad){this.edad=edad;}
    public void setDireccion(String direccion){this.direccion=direccion;}
    //Comportamientos que DEVUELVEN VALORES (get)
    public String getNombre()   {return nombre;}
    public String getApellidos(){return apellidos;}
    public int    getEdad()     {return edad;}
    public String getDireccion(){return direccion;}
    
}
