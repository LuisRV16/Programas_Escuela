package ProyectoFiguras_U4;

import ProyectoFiguras.*;

public abstract class CTriangulo extends CFiguras2D{
    public CTriangulo(){}
    public CTriangulo(double l1){
        super(l1);
    }
    public CTriangulo(double l1, double l2){
        super(l1,l2);
    }
    public CTriangulo(double l1, double l2, double l3){
        super(l1,l2,l3);
    }
}
