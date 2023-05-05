package APLICACIONES;
import CLASES.Lineas;
import javax.swing.JFrame;
public class AplicacionLineas {
    public static void main(String[] args) {
        JFrame X = new JFrame();
        X.setSize(500, 500);
        X.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        X.setVisible(true);
        //Crear el objeto Panel -> A
        Lineas A = new Lineas();
        X.add(A);
    }
    
}
