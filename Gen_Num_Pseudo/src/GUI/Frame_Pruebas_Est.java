package GUI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import Clases.Lectura_Escritura_Doc;
import Clases.Pruebas_Estadisticas;

public class Frame_Pruebas_Est extends JFrame implements ActionListener, ItemListener {

    private JLabel lblPE;
    private JButton btnEval, btnGen;
    private JTextArea resultados;
    private JScrollPane scroll;
    private JComboBox significancia, decimales;
    public Frame_Pruebas_Est() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Pruebas Estadísticas");
        setLayout(null);
        lblPE = new JLabel("Pruebas Estadísticas");
        lblPE.setBounds(20, 20, 350, 50);
        lblPE.setFont(new Font("Andale Mono", 3, 32));
        add(lblPE);
        significancia = new JComboBox();
        significancia.setFont(new Font("Andale Mono", 3, 16));
        significancia.setBounds(350, 30, 80, 20);
        add(significancia);
        significancia.addItem("α");
        for (int i = 10; i > 0; i--) {
            significancia.addItem(i + "%");
        }
        significancia.addItemListener(this);
        decimales = new JComboBox();
        decimales.setFont(new Font("Andale Mono", 3, 16));
        decimales.setBounds(440, 30, 40, 20);
        add(decimales);
        decimales.addItem("");
        decimales.addItem("5");
        decimales.addItem("4");
        decimales.addItem("3");
        decimales.addItemListener(this);
        decimales.setVisible(false);
        btnEval = new JButton("Iniciar");
        btnEval.setBounds(510, 20, 120, 50);
        btnEval.setFont(new Font("Andale Mono", 1, 24));
        btnEval.setVisible(false);
        add(btnEval);
        btnGen = new JButton("Regresar");
        btnGen.setBounds(640, 20, 120, 50);
        btnGen.setFont(new Font("Andale Mono", 1, 18));
        add(btnGen);
        resultados = new JTextArea();
        resultados.setEditable(false);
        resultados.setFont(new Font("Andale Mono", 3, 16));
        scroll = new JScrollPane(resultados);
        scroll.setBounds(20, 80, 740, 360);
        scroll.setFont(new Font("Andale Mono", 2, 18));
        add(scroll);
        btnEval.addActionListener(this);
        btnGen.addActionListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == significancia) {
            decimales.setVisible(true);
        }
        if (e.getSource() == decimales) {
            btnEval.setVisible(true);
        }
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        String text = "";
        if (evt.getSource() == btnEval) {
            double[] z = {2.575, 2.101, 2.08, 2.06, 1.96, 1.71, 1.699, 1.681, 1.663, 1.645};
            double sigV = 0;
            double[] arr;
            String[] arrT;
            String t, d;
            int sign = 0, num_d = 0;
            try {
                t = significancia.getSelectedItem().toString();
                t = t.substring(0, t.length() - 1);
                sign = Integer.parseInt(t);
                sigV = ((double) sign) / 100;
            } catch (NumberFormatException e) {
                btnEval.setEnabled(false);
            }
            int cont = 0, j = 0, last_n = 0;
            String s, n;
            Lectura_Escritura_Doc file = new Lectura_Escritura_Doc();
            s = file.leer();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 10 || s.charAt(i) == 65535) {
                    cont++;
                }
            }
            arr = new double[cont];
            arrT = new String[cont];
            n = "";
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) != 10) {
                    n += s.charAt(i);
                } else {
                    arr[j] = Double.parseDouble(n);
                    arrT[j] = n;
                    j++;
                    last_n = i;
                    n = "";
                }
            }
            n = s.substring(last_n + 1, s.length() - 1);
            arr[j] = Double.parseDouble(n);
            arrT[j] = n;
            Pruebas_Estadisticas A = new Pruebas_Estadisticas();
            A.setArr(arr);
            A.setArrT(arrT);
            A.setSignV(sigV);
            text += "Nivel de signifiación: " + sigV;
            A.setZ(z[sign - 1]);
            text += " | Valor de Z: " + z[sign - 1] + "\nPrueba de Media:\n";
            A.media();
            text += "Límite Superior: " + A.getlS() + "\nValor de la media: " + A.getR() + "\nLímite Inferior: " + A.getlI();
            if (A.isMedia()) {
                text += "\n\nCómo el valor del promedio r: " + A.getR() + " se encuentra entre los límites de\n"
                        + "aceptación, se concluye que el conjunto de " + arr.length + " números ri tiene un valor\n"
                        + "esperado de 0.5, con un nivel de aceptación de " + (100 - sign) + "%\n\n";
            } else {
                text += "\n\nCómo el valor del promedio r: " + A.getR() + " se encuentra fuera de los límites de\n"
                        + "aceptación, se concluye que el conjunto de " + arr.length + " números ri tiene un valor\n"
                        + "diferente de 0.5\n";
            }
            A.varianza();
            text += "Prueba de Varianza:\n";
            text += "Límite Superior: " + A.getlS() + "\nValor de la varianza: " + A.getVr() + "\nLímite Inferior: " + A.getlI();
            if (A.isVarianza()) {
                text += "\n\nDado que el valor de la Varianza: V(r)= " + A.getVr() + "está entre los límites de aceptación,\n"
                        + "se puede decir que no se puede rechazar el conjunto de " + arr.length + " números de ri tiene una\n"
                        + "varianza de 1/12 = " + (float) 1 / 12;
            } else {
                text += "\n\nDado que el valor de la Varianza: V(r)= " + A.getVr() + "está fuera de los límites de aceptación,\n"
                        + "se rechaza el conjunto de " + arr.length + " números de ri que tiene una "
                        + "varianza diferente de 1/12 = " + (float) 1 / 12;
            }
            if (A.isMedia() || A.isVarianza()) {
                A.uniformidad();
                if (A.isUniformidad()) {
                    text += "\n\nEl estadístico con valor: X² = " + A.getEstadistico() + " es menor al estadístico correspondiente\n"
                            + "de la Chi cuadrada: X² = " + A.getChi() + ". En consecuencia, no se puede rechazar\n"
                            + "que los numeros ri siguen una distribución uniforme\n\n";
                    try {
                        d = decimales.getSelectedItem().toString();
                        num_d = Integer.parseInt(d);
                    } catch (NumberFormatException f) {
                    }
                    if (arrT[0].length() - 2 >= num_d) {
                        A.setNum_d(num_d);
                        A.poker();
                        text += "Cantidad de decimales a tomar en cuenta: " + num_d + "\n";
                        if (A.isPoker()) {
                            text += "El estadistico con valor: X² = " + A.getEstadistico() + " es menor que\n"
                                    + "el estadistico correspondiente de la Chi cuadrada: X² = " + A.getChi() + ".\n"
                                    + "En consecuencia, no se puede rechazar que los números del conjunto ri son indepentedientes.\n\n";
                            A.aleatoriedad();
                            if (A.isAleatoriedad()) {
                                text += "Cómo el estadístico Z con valor: Z = " + A.getEstadistico() + " es menor que el\n"
                                        + "valor de la tabla de la normal estándar para Z = " + z[sign - 1] + ", se concluye que\n"
                                        + "no se puede rechazar que los números del conjunto ri son independientes. Es decir,\n"
                                        + "de acuerdo con esta prueba, los numeros son aptos para usarse.";
                            } else {
                                text += "Cómo el estadístico Z con valor: Z = " + A.getEstadistico() + " es mayor que el\n"
                                        + "valor de la tabla de la normal estándar para Z = " + z[sign - 1] + ", se concluye que\n"
                                        + "se rechaza que los números del conjunto ri son independientes. Es decir,\n"
                                        + "de acuerdo con esta prueba, los numeros no son aptos para usarse.\n"
                                        + "Intentelo de nuevo...";
                            }
                        } else {
                            text += "El estadistico con valor: X² = " + A.getEstadistico() + " es mayor que\n"
                                    + "el estadistico correspondiente de la Chi cuadrada: X² = " + A.getChi() + ".\n"
                                    + "En consecuencia, se rechaza que los números del conjunto ri son indepentedientes.\n"
                                    + "La Prueba de Independencia (Poker) ha rechazado al conjunto de números ri, por favor, intentelo otra vez";
                        }
                    } else {
                        text += "El conjunto de numeros pseudoaleatorios tiene una cantidad de decimales menor\n"
                                + "a la introducida, seleccione una cantidad menor de decimales";
                    }
                } else {
                    text += "\n\nEl estadístico con valor: X² = " + A.getEstadistico() + "es mayor al estadístico correspondiente\n"
                            + "de la Chi cuadrada: X² = " + A.getChi() + ". En consecuencia, se rechaza\n"
                            + "que los numeros ri siguen una distribución uniforme.\n"
                            + "La Prueba de Uniformidad ha rechazado al conjunto de números ri, por favor, intentelo otra vez";
                }
            } else {
                text += "\nLas Pruebas de Media y Varianza rechazaron al conjunto de números ri, por favor, intente otra vez";
            }
            resultados.setText(text);
        }
        if (evt.getSource() == btnGen) {
            FrameGenNum_2 A = new FrameGenNum_2();
            A.setSize(800, 500);
            A.setLocationRelativeTo(null);
            A.setVisible(true);
            this.setVisible(false);
            A.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
}
