package GUI;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelPoligono extends JPanel {
    public PanelPoligono(){
        
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int mundoX[] = {100,300,100};
        int mundoY[] = {100,100,400};
        this.setBackground(Color.black);
        //plano cartesiano
        g.setColor(Color.red);
        g.drawLine(this.getWidth()/2,0,this.getWidth()/2,this.getHeight());
        g.drawLine(0,this.getHeight()/2,this.getWidth(),this.getHeight()/2);
        //Dibujar Poligono
        int cx = this.getWidth()/2;
        int cy = this.getHeight()/2;
        int[] pantallaX={mundoX[0]+cx,mundoX[1]+cx,mundoX[2]+cx};
        int[] pantallaY={cy-mundoY[0],cy-mundoY[1],mundoY[2]-cy};
        g.setColor(Color.yellow);
        g.drawPolygon(pantallaX,pantallaY,3);
        traslacion(pantallaX,pantallaY,50,20);
        g.setColor(Color.cyan);
        g.drawPolygon(pantallaX,pantallaY,3);
    }
    
    public void traslacion(int pantallaX[], int pantallaY[],int tx, int ty){
        for (int i = 0; i < 3; i++) {
            pantallaX[i]+=tx;
            pantallaY[i]-=ty;
        }
    }
}
