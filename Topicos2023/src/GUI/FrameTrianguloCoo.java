package GUI;
import CLASES.CTriangulo;
import CLASES.TextPrompt;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class FrameTrianguloCoo extends JFrame{
    private CTriangulo X;
    private JLabel lblX1,lblY1,lblX2,lblY2,lblX3,lblY3,lblA,lblB,lblC,lblRes,lblCal;
    private JTextField txtX1,txtY1,txtX2,txtY2,txtX3,txtY3;
    private JButton btnAB,btnBC,btnAC,btnArea,btnPerimetro,btnAsignar,btnCal,btnClean;
    private JTextArea resultado;
    public FrameTrianguloCoo(){
        super("Calcular Triángulo Coordenado");
        setLayout(null);
        lblX1 = new JLabel("x");
        lblX1.setBounds(70, 20, 50, 30);
        lblX1.setFont(new Font("Arial",3,18));
        add(lblX1);
        lblY1 = new JLabel("y");
        lblY1.setBounds(120,20,50,30);
        lblY1.setFont(new Font("Arial",3,18));
        add(lblY1);
        lblX2 = new JLabel("x");
        lblX2.setBounds(370,20,50,30);
        lblX2.setFont(new Font("Arial",3,18));
        add(lblX2);
        lblY2 = new JLabel("y");
        lblY2.setBounds(420,20,50,30);
        lblY2.setFont(new Font("Arial",3,18));
        add(lblY2);
        lblX3 = new JLabel("x");
        lblX3.setBounds(670,20,50,30);
        lblX3.setFont(new Font("Arial",3,18));
        add(lblX3);
        lblY3 = new JLabel("y");
        lblY3.setBounds(720,20,50,30);
        lblY3.setFont(new Font("Arial",3,18));
        add(lblY3);
        lblA = new JLabel("A");
        lblA.setBounds(30,50,50,30);
        lblA.setFont(new Font("Arial",3,18));
        add(lblA);
        lblB = new JLabel("B");
        lblB.setBounds(330,50,50,30);
        lblB.setFont(new Font("Arial",3,18));
        add(lblB);
        lblC = new JLabel("C");
        lblC.setBounds(630,50,50,30);
        lblC.setFont(new Font("Arial",3,18));
        add(lblC);
        lblRes = new JLabel("Resultados:");
        lblRes.setBounds(50,125,150,30);
        lblRes.setFont(new Font("Arial",3,18));
        add(lblRes);
        lblCal = new JLabel("Calcular");
        lblCal.setBounds(625,125,100,30);
        lblCal.setFont(new Font("Arial",3,18));
        add(lblCal);
        txtX1 = new JTextField();
        txtX1.setBounds(50,50,50,30);
        txtX1.setFont(new Font("Arial",2,18));
        TextPrompt tp1 = new TextPrompt("<html><p>x<sub>1</sub></p></html>",txtX1);
        tp1.changeStyle(Font.ITALIC);
        add(txtX1);
        txtY1 = new JTextField();
        txtY1.setBounds(105,50,50,30);
        txtY1.setFont(new Font("Arial",2,18));
        TextPrompt tp2 = new TextPrompt("<html><p>y<sub>1</sub></p></html>",txtY1);
        tp2.changeStyle(Font.ITALIC);
        add(txtY1);
        txtX2 = new JTextField();
        txtX2.setBounds(350,50,50,30);
        txtX2.setFont(new Font("Arial",2,18));
        TextPrompt tp3 = new TextPrompt("<html><p>x<sub>2</sub></p></html>",txtX2);
        tp3.changeStyle(Font.ITALIC);
        add(txtX2);
        txtY2 = new JTextField();
        txtY2.setBounds(405,50,50,30);
        txtY2.setFont(new Font("Arial",2,18));
        TextPrompt tp4 = new TextPrompt("<html><p>y<sub>2</sub></p></html>",txtY2);
        tp4.changeStyle(Font.ITALIC);
        add(txtY2);
        txtX3 = new JTextField();
        txtX3.setBounds(650,50,50,30);
        txtX3.setFont(new Font("Arial",2,18));
        TextPrompt tp5 = new TextPrompt("<html><p>x<sub>3</sub></p></html>",txtX3);
        tp5.changeStyle(Font.ITALIC);
        add(txtX3);
        txtY3 = new JTextField();
        txtY3.setBounds(705,50,50,30);
        txtY3.setFont(new Font("Arial",2,18));
        TextPrompt tp6 = new TextPrompt("<html><p>y<sub>3</sub></p></html>",txtY3);
        tp6.changeStyle(Font.ITALIC);
        add(txtY3);
        btnAB = new JButton("AB");
        btnAB.setBounds(550,225,100,50);
        btnAB.setFont(new Font("Arial",1,24));
        btnAB.setToolTipText("Calcula la medida del punto A al C");
        btnAB.setEnabled(false);
        add(btnAB);
        btnBC = new JButton("BC");
        btnBC.setBounds(660,225,100,50);
        btnBC.setFont(new Font("Arial",1,24));
        btnBC.setToolTipText("Calcula la medida del punto B al C");
        btnBC.setEnabled(false);
        add(btnBC);
        btnAC = new JButton("AC");
        btnAC.setBounds(550,285,100,50);
        btnAC.setFont(new Font("Arial",1,24));
        btnAC.setToolTipText("Calcula la medida del punto A al C");
        btnAC.setEnabled(false);
        add(btnAC);
        btnArea = new JButton("Área");
        btnArea.setBounds(660,285,100,50);
        btnArea.setFont(new Font("Arial",1,24));
        btnArea.setToolTipText("Calcula el Área del triángulo");
        btnArea.setEnabled(false);
        add(btnArea);
        btnPerimetro = new JButton("Perímetro");
        btnPerimetro.setBounds(550,345,100,50);
        btnPerimetro.setFont(new Font("Arial",1,13));
        btnPerimetro.setToolTipText("Calcula el Perimetro del triángulo");
        btnPerimetro.setEnabled(false);
        add(btnPerimetro);
        btnAsignar = new JButton("Asignar Vértices");
        btnAsignar.setBounds(550,165,210,50);
        btnAsignar.setFont(new Font("Arial",1,18));
        btnAsignar.setToolTipText("Asigna la posición de los puntos");
        add(btnAsignar);
        btnCal = new JButton("Todo");
        btnCal.setBounds(660,345,100,50);
        btnCal.setFont(new Font("Arial",1,24));
        btnCal.setToolTipText("Calcula Todo lo anterior");
        btnCal.setEnabled(false);
        add(btnCal);
        btnClean = new JButton("Limpiar");
        btnClean.setBounds(605,405,100,50);
        btnClean.setFont(new Font("Arial",1,18));
        btnClean.setToolTipText("Limpia los campos de texto");
        btnClean.setEnabled(false);
        add(btnClean);
        resultado = new JTextArea();
        resultado.setBounds(50,165,480,245);
        resultado.setFont(new Font("Arial",2,18));
        resultado.setEditable(false);
        add(resultado);
        ME manejador = new ME();
        btnAB.addActionListener(manejador);
        btnBC.addActionListener(manejador);
        btnAC.addActionListener(manejador);
        btnArea.addActionListener(manejador);
        btnPerimetro.addActionListener(manejador);
        btnAsignar.addActionListener(manejador);
        btnCal.addActionListener(manejador);
        btnClean.addActionListener(manejador);
    }
    private void Clean() {
        txtX1.setText("");
        txtY1.setText("");
        txtX2.setText("");
        txtY2.setText("");
        txtX3.setText("");
        txtY3.setText("");
        resultado.setText("");
        btnAB.setEnabled(false);
        btnBC.setEnabled(false);
        btnAC.setEnabled(false);
        btnArea.setEnabled(false);
        btnPerimetro.setEnabled(false);
        btnCal.setEnabled(false);
        btnClean.setEnabled(false);
    }
    private class ME implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if (e.getSource()==btnAsignar) {
                try{
                    int x1 = Integer.parseInt(txtX1.getText());
                    int y1 = Integer.parseInt(txtY1.getText());
                    int x2 = Integer.parseInt(txtX2.getText());
                    int y2 = Integer.parseInt(txtY2.getText());
                    int x3 = Integer.parseInt(txtX3.getText());
                    int y3 = Integer.parseInt(txtY3.getText());
                    X = new CTriangulo(x1,y1,x2,y2,x3,y3);
                    X.dAB();
                    X.dAC();
                    X.dBC();
                    if (X.getAB()+X.getBC()<=X.getAC()||X.getBC()+X.getAC()<=X.getAB()||X.getAB()+X.getAC()<=X.getAC()) {
                        JOptionPane.showMessageDialog(null, "Medidas introducidas invalidas\nLa suma de dos de "
                                + "los lados de un triangulo debe ser mayor a la longitud del 3er lado"
                                + "\nIntroduzca valores validos\n");
                        Clean();
                    }else{
                       btnAB.setEnabled(true);
                       btnBC.setEnabled(true);
                       btnAC.setEnabled(true);
                       btnArea.setEnabled(true);
                       btnPerimetro.setEnabled(true);
                       btnCal.setEnabled(true);
                       btnClean.setEnabled(true);
                    }
                    resultado.setText("");
                }catch(NumberFormatException f){
                    JOptionPane.showMessageDialog(null,"Ingrese sólo valores numéricos");
                    Clean();
                }
            }
            if (e.getSource()==btnAB) {
                X.dAB();
                resultado.setText("Distancia del punto A al punto B: "+X.getAB()+"u");
            }
            if(e.getSource()==btnBC){
                X.dBC();
                resultado.setText("Distancia del punto B al punto C: "+X.getBC()+"u");
            }
            if(e.getSource()==btnAC){
                X.dAC();
                resultado.setText("Distancia del punto A al punto C: "+X.getAC()+"u");
            }
            if (e.getSource()==btnArea) {
                X.Perimetro();
                X.Area();
                resultado.setText("El Área del Triángulo es: "+X.getArea()+"u²");
            }
            if (e.getSource()==btnPerimetro) {
                X.Perimetro();
                resultado.setText("El Perímetro del Triángulo es: "+X.getPerimetro()+"u");
            }
            if (e.getSource()==btnCal) {
                X.dAB();
                X.dAC();
                X.dBC();
                X.Perimetro();
                X.Area();
                resultado.setText("Distancia del punto A al punto B: "+X.getAB()+"u\n\n"
                        + "Distancia del punto B al punto C: "+X.getBC()+"u\n\n"
                                + "Distancia del punto A al punto C: "+X.getAC()+"u\n\n"
                                        + "El Área del Triángulo es: "+X.getArea()+"u²\n\n"
                                                + "El Perímetro del Triángulo es: "+X.getPerimetro()+"u");
            }
            if (e.getSource()==btnClean) {
                Clean();
            }
        }
    }
}
