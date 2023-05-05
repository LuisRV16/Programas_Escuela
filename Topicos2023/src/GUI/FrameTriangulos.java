package GUI;

import CLASES.CTrianguloEq;
import CLASES.CTrianguloEsc;
import CLASES.CTrianguloIsos;
import CLASES.TextPrompt;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class FrameTriangulos extends JFrame{
    private CTrianguloEq T1;
    private CTrianguloIsos T2;
    private CTrianguloEsc T3;
    private JLabel lbl1,lbl2,lbl3,lblr;
    private JTextField txtL1,txtL2,txtL3;
    private JComboBox triangulos;
    private JTextArea resultados;
    private JButton btnAyP1,btnAyP2,btnAyP3,btnClean;
    
    public FrameTriangulos(){
        super("Calculadora de Triángulos");
        setLayout(null);
        lbl1 = new JLabel("Lado 1:");
        lbl1.setBounds(30,50,100,50);
        lbl1.setFont(new Font("Arial",3,20));
        add(lbl1);
        lbl2 = new JLabel("Lado 2:");
        lbl2.setBounds(30,110,100,50);
        lbl2.setFont(new Font("Arial",3,20));
        lbl2.setVisible(false);
        add(lbl2);
        lbl3 = new JLabel("Lado 3");
        lbl3.setBounds(30,170,100,50);
        lbl3.setFont(new Font("Arial",3,20));
        lbl3.setVisible(false);
        add(lbl3);
        lblr = new JLabel("Resultados:");
        lblr.setBounds(30,250,200,50);
        lblr.setFont(new Font("Arial",3,24));
        add(lblr);
        txtL1 = new JTextField();
        TextPrompt tp1 = new TextPrompt("Ingrese medida del lado 1:",txtL1);
        tp1.changeStyle(Font.ITALIC);
        txtL1.setBounds(110,50,200,50);
        txtL1.setFont(new Font("Arial",2,18));
        add(txtL1);
        txtL2 = new JTextField();
        TextPrompt tp2 = new TextPrompt("Ingrese medida del lado 2:",txtL2);
        tp2.changeStyle(Font.ITALIC);
        txtL2.setBounds(110,110,200,50);
        txtL2.setFont(new Font("Arial",2,18));
        txtL2.setVisible(false);
        add(txtL2);
        txtL3 = new JTextField();
        TextPrompt tp3 = new TextPrompt("Ingrese medida del lado 3:",txtL3);
        tp3.changeStyle(Font.ITALIC);
        txtL3.setBounds(110,170,200,50);
        txtL3.setFont(new Font("Arial",2,18));
        txtL3.setVisible(false);
        add(txtL3);
        triangulos = new JComboBox();
        triangulos.setBounds(530,50,200,20);
        add(triangulos);
        triangulos.addItem("");
        triangulos.addItem("Triángulo Equilatero");
        triangulos.addItem("Triángulo Isósceles");
        triangulos.addItem("Triángulo Escaleno");
        resultados = new JTextArea();
        resultados.setBounds(30,310,500,200);
        resultados.setFont(new Font("Arial",2,24));
        resultados.setEditable(false);
        add(resultados);
        btnAyP1 = new JButton("Área y Perímetro");
        btnAyP1.setBounds(580,355,200,50);
        btnAyP1.setFont(new Font("Arial",1,20));
        btnAyP1.setToolTipText("Calcula el Área y Perimetro del triángulo");
        add(btnAyP1);
        btnAyP2 = new JButton("Área y Perímetro");
        btnAyP2.setBounds(580,355,200,50);
        btnAyP2.setFont(new Font("Arial",1,20));
        btnAyP2.setToolTipText("Calcula el Área y Perimetro del triángulo");
        btnAyP2.setVisible(false);
        add(btnAyP2);
        btnAyP3 = new JButton("Área y Perímetro");
        btnAyP3.setBounds(580,355,200,50);
        btnAyP3.setFont(new Font("Arial",1,20));
        btnAyP3.setToolTipText("Calcula el Área y Perimetro del triángulo");
        btnAyP3.setVisible(false);
        add(btnAyP3);
        btnClean = new JButton("Limpiar");
        btnClean.setBounds(580,415,200,50);
        btnClean.setFont(new Font("Arial",1,24));
        btnClean.setToolTipText("Limpia los campos y areas de texto");
        add(btnClean);
        ME manejador = new ME();
        btnAyP1.addActionListener(manejador);
        btnAyP2.addActionListener(manejador);
        btnAyP3.addActionListener(manejador);
        btnClean.addActionListener(manejador);
        MI manejador2 = new MI();
        triangulos.addItemListener(manejador2);
    }
    private void Clean(){
        txtL1.setText("");
        txtL2.setText("");
        txtL3.setText("");
        resultados.setText("");
    }
    private class MI implements ItemListener{
        
        @Override
        public void itemStateChanged(ItemEvent e){
            if (e.getSource()==triangulos) {
                if (triangulos.getSelectedItem().toString()=="Triángulo Equilatero") {
                    btnAyP1.setVisible(true);
                    lbl2.setVisible(false);
                    txtL2.setVisible(false);
                    btnAyP2.setVisible(false);
                    lbl3.setVisible(false);
                    txtL3.setVisible(false);
                    btnAyP3.setVisible(false);
                    Clean();
                }else if (triangulos.getSelectedItem().toString()=="Triángulo Isósceles") {
                    btnAyP1.setVisible(false);
                    lbl2.setVisible(true);
                    txtL2.setVisible(true);
                    btnAyP2.setVisible(true);
                    lbl3.setVisible(false);
                    txtL3.setVisible(false);
                    btnAyP3.setVisible(false);
                    Clean();
                }else if (triangulos.getSelectedItem().toString()=="Triángulo Escaleno") {
                    btnAyP1.setVisible(false);
                    lbl2.setVisible(true);
                    txtL2.setVisible(true);
                    btnAyP2.setVisible(false);
                    lbl3.setVisible(true);
                    txtL3.setVisible(true);
                    btnAyP3.setVisible(true);
                    Clean();
                }
            }
        }

    }
    private class ME implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if (e.getSource()==btnAyP1) {
                try{
                    int l1 = Integer.parseInt(txtL1.getText());
                    T1 = new CTrianguloEq(l1);
                    T1.Area();
                    T1.Perimetro();
                    resultados.setText("Perimetro = "+ T1.getPerimetro()+"u\nÁrea = "+T1.getArea()+"u²");
                }catch(NumberFormatException f){
                    JOptionPane.showMessageDialog(null, "Ingrese sólo valores numéricos");
                    Clean();
                }
            }
            if (e.getSource()==btnAyP2) {
                try{
                    int l1 = Integer.parseInt(txtL1.getText());
                    int l2 = Integer.parseInt(txtL2.getText());
                    if (l1*2<=l2||l1+l2<=l1) {
                        JOptionPane.showMessageDialog(null, "Medidas introducidas invalidas\nLa suma de dos de "
                                + "los lados de un triángulo debe ser mayor a la longitud del 3er lado"
                                + "\nIntroduzca valores validos\n");
                        Clean();
                    }else if(l1==l2){
                        JOptionPane.showMessageDialog(null, "Introduzca valores referentes a\nun Triángulo Isósceles");
                        Clean();
                    }else{
                        T2 = new CTrianguloIsos(l1,l2);
                        T2.Area();
                        T2.Perimetro();
                        resultados.setText("Perimetro = "+ T2.getPerimetro()+"u\nÁrea = "+T2.getArea()+"u²");
                    }
                }catch(NumberFormatException f){
                    JOptionPane.showMessageDialog(null, "Ingrese sólo valores numéricos");
                    Clean();
                }
            }
            if (e.getSource()==btnAyP3) {
                try{
                    int l1 = Integer.parseInt(txtL1.getText());
                    int l2 = Integer.parseInt(txtL2.getText());
                    int l3 = Integer.parseInt(txtL3.getText());
                    if (l1+l2<=l3||l1+l3<=l2||l2+l3<=l1) {
                        JOptionPane.showMessageDialog(null, "Medidas introducidas invalidas\nLa suma de dos de "
                                + "los lados de un triángulo debe ser mayor a la longitud del 3er lado"
                                + "\nIntroduzca valores validos\n");
                        Clean();
                    }else if(l1==l2||l2==l3||l1==l3){
                        JOptionPane.showMessageDialog(null, "Introduzca valores referentes a\nun Triángulo Escaleno");
                        Clean();
                    }else{
                        T3 = new CTrianguloEsc(l1,l2,l3);
                        T3.Perimetro();
                        T3.Area();
                        resultados.setText("Perimetro = "+ T3.getPerimetro()+"u\nÁrea = "+T3.getArea()+"u²");
                    }
                }catch(NumberFormatException f){
                    JOptionPane.showMessageDialog(null, "Ingrese sólo valores numéricos");
                    Clean();
                }
            }
            if (e.getSource()==btnClean) {
                Clean();
            }
        }
    }
}
