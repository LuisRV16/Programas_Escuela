package ProyectoTriangulo2;
public class CTEquilatero extends CTriangulo{
    //Constructores
    public CTEquilatero(){}
    public CTEquilatero(double l1){super(l1);}
    
    public void Area(){
        double altura= Math.sqrt(Math.pow(l1, 2)-Math.pow(l1/2, 2));
        area=l1*altura/2;
    }
    public void Perimetro(){
        perimetro = l1*3;
    }
    public String toString(){
        return super.toString()+"\nL1= "+l1;
    }
}
