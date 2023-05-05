package CLASES;

public class CTriangulo {

    private double area, perimetro, dAB, dBC, dAC;
    CPunto A, B, C;

    public CTriangulo() {
        A = new CPunto();
        B = new CPunto();
        C = new CPunto();
    }

    public CTriangulo(int x1, int y1, int x2, int y2, int x3, int y3) {
        setVertices(x1, y1, x2, y2, x3, y3);
    }

    public void setVertices(int x1, int y1, int x2, int y2, int x3, int y3) {
        A = new CPunto(x1, y1);
        B = new CPunto(x2, y2);
        C = new CPunto(x3, y3);
    }

    public void dAB() {
        dAB = Math.sqrt(Math.pow(B.getX() - A.getX(), 2) + Math.pow(B.getY() - A.getY(), 2));
    }

    public void dBC() {
        dBC = Math.sqrt(Math.pow(C.getX() - B.getX(), 2) + Math.pow(C.getY() - B.getY(), 2));
    }

    public void dAC() {
        dAC = Math.sqrt(Math.pow(C.getX() - A.getX(), 2) + Math.pow(C.getY() - A.getY(), 2));
    }

    public void Perimetro() {
        perimetro = dAB + dBC + dAC;
    }

    public void Area() {
        double S = perimetro / 2;
        area = Math.sqrt(S * (S - dAB) * (S - dBC) * (S - dAC));
    }

    public double getAB() {
        return dAB;
    }

    public double getBC() {
        return dBC;
    }

    public double getAC() {
        return dAC;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }
}
