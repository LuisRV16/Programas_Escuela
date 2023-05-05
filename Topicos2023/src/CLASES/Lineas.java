package CLASES;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
public class Lineas extends JPanel{
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
//        Plano cartesiano fijo
        g.setColor(Color.red);
        for (int i = 1; i < this.getHeight(); i+=15) {
            g.drawLine(0,0,this.getWidth(),i);
        }
        g.setColor(Color.magenta);
        for (int i = 1; i < this.getHeight(); i+=15) {
            g.drawLine(this.getWidth(),0,0,i);
            
        }
        g.setColor(Color.green);
        for (int i = 1; i < this.getWidth(); i+=15) {
            g.drawLine(0,i ,this.getWidth() ,this.getHeight() );
        }
//        g.drawLine(200,0,200,400);
//        g.drawLine(0, 200, 400, 200);
//        //Plano cartesiano Pro
//        g.setColor(Color.BLUE);
//        g.drawLine(this.getWidth()/2,0,this.getWidth()/2,this.getHeight());
//        g.drawLine(0,this.getHeight()/2,this.getWidth(),this.getHeight()/2);
    }
}
