package GUI;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Figuras2D extends JPanel{
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.black);
        g.setColor(Color.white);
        g.drawRect(100,300,200,150);
        int a = 5;
        for (int i = 1; i <= 100; i++) {
            g.draw3DRect(350+i,300,200-a,150,true);
        }
        g.setColor(Color.GREEN);
        g.fill3DRect(100,200,300,200, true);
    }
}
