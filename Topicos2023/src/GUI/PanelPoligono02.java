package GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JPanel;

public class PanelPoligono02 extends JPanel{
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.black);
        Polygon P = new Polygon();
        P.addPoint(50, 50);
        P.addPoint(100, 50);
        P.addPoint(50, 200);
        g.setColor(Color.red);
        g.drawPolygon(P);
    }
}
