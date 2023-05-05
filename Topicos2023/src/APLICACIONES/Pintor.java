package APLICACIONES;
// Fig. 11.35: Pintor.java
// Prueba de PanelDibujo.
import CLASES.PanelDibujo;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Pintor {
    public static void main(String args[]) {
// crea objeto JFrame
        JFrame aplicacion = new JFrame("Un programa simple de dibujo");

        PanelDibujo panelDibujo = new PanelDibujo(); // crea panel de dibujo
        aplicacion.add(panelDibujo, BorderLayout.CENTER); // en el centro

// crea una etiqueta y la coloca en la región SOUTH de BorderLayout
        aplicacion.add(new JLabel("Arrastre el raton para dibujar"),
                BorderLayout.SOUTH);

        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.setSize(800, 700); // establece el tamaño del marco
        aplicacion.setVisible(true); // muestra el marco
    } // fin de main
} // fin de la clase Pintor
