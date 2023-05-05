package GUI;
//@RC
import Clases.Lectura_Escritura_Doc;
import Clases.Lineal;
import Clases.Multiplicativo;
import Clases.No_Congruenciales;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FrameGenNum_2 extends JFrame implements ActionListener{

    private JLabel lbl1, lbl2, lbl3, lbl4, lbl5, lbl6;
    private JTextField txt1, txt2, txt3, txt4;
    private JTextArea datosC, resultados;
    private JScrollPane scroll;
    private ButtonGroup algoritmos;
    private JRadioButton cuadM, prodM, multiC, lineal, multiplicativo;
    private JButton btnCalcular, btnPE;

    public FrameGenNum_2() {
        super("Algoritmos Generadores de Numeros Pseudoaleatorios");
        setLayout(null);
        lbl1 = new JLabel("Algoritmos:");
        lbl1.setBounds(600, 10, 120, 30);
        lbl1.setFont(new Font("Andale Mono", 3, 18));
        add(lbl1);
        lbl2 = new JLabel();
        lbl2.setBounds(20, 10, 350, 30);
        lbl2.setFont(new Font("Andale Mono", 3, 18));
        add(lbl2);
        lbl3 = new JLabel();
        lbl3.setBounds(20, 50, 100, 30);
        lbl3.setFont(new Font("Andale Mono", 3, 18));
        add(lbl3);
        lbl4 = new JLabel();
        lbl4.setBounds(20, 85, 200, 30);
        lbl4.setFont(new Font("Andale Mono", 3, 18));
        add(lbl4);
        lbl5 = new JLabel();
        lbl5.setBounds(20, 120, 200, 30);
        lbl5.setFont(new Font("Andale Mono", 3, 18));
        add(lbl5);
        lbl6 = new JLabel();
        lbl6.setBounds(305, 50, 100, 30);
        lbl6.setFont(new Font("Andale Mono", 3, 18));
        add(lbl6);
        txt1 = new JTextField();
        txt1.setBounds(200, 50, 100, 30);
        txt1.setFont(new Font("Andale Mono", 2, 18));
        txt1.setVisible(false);
        add(txt1);
        txt2 = new JTextField();
        txt2.setBounds(200, 85, 100, 30);
        txt2.setFont(new Font("Andale Mono", 2, 18));
        txt2.setVisible(false);
        add(txt2);
        txt3 = new JTextField();
        txt3.setBounds(200, 120, 100, 30);
        txt3.setFont(new Font("Andale Mono", 2, 18));
        txt3.setVisible(false);
        add(txt3);
        txt4 = new JTextField();
        txt4.setBounds(405, 50, 100, 30);
        txt4.setFont(new Font("Andale Mono", 2, 18));
        txt4.setVisible(false);
        add(txt4);
        datosC = new JTextArea();
        datosC.setEditable(false);
        datosC.setBounds(20, 155, 580, 30);
        datosC.setFont(new Font("Andale Mono", 3, 18));
        datosC.setVisible(true);
        datosC.setBackground(Color.red);
        datosC.setBackground(this.getBackground());
        add(datosC);
        resultados = new JTextArea();
        resultados.setEditable(false);
        resultados.setFont(new Font("Andale Mono", 3, 18));
        scroll = new JScrollPane(resultados);
        scroll.setBounds(20, 190, 640, 200);
        scroll.setVisible(false);
        add(scroll);
        algoritmos = new ButtonGroup();
        cuadM = new JRadioButton("Cuadrados Medios", false);
        cuadM.setToolTipText("Algoritmo de los cuadrados medios");
        prodM = new JRadioButton("Productos Medios", false);
        prodM.setToolTipText("Algoritmo de los productos medios");
        multiC = new JRadioButton("Multiplicador Constante", false);
        multiC.setToolTipText("Algoritmo de multiplicador constante");
        lineal = new JRadioButton("Lineal", false);
        lineal.setToolTipText("Algoritmo Congruencial Lineal");
        multiplicativo = new JRadioButton("Multiplicativo", false);
        multiplicativo.setToolTipText("Algoritmo Congruencial Multiplicativo");
        cuadM.setBounds(600, 40, 200, 20);
        prodM.setBounds(600, 60, 200, 20);
        multiC.setBounds(600, 80, 200, 20);
        lineal.setBounds(600, 100, 200, 20);
        multiplicativo.setBounds(600, 120, 200, 20);
        algoritmos.add(cuadM);
        algoritmos.add(prodM);
        algoritmos.add(multiC);
        algoritmos.add(lineal);
        algoritmos.add(multiplicativo);
        add(cuadM);
        add(prodM);
        add(multiC);
        add(lineal);
        add(multiplicativo);
        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(325, 400, 150, 50);
        btnCalcular.setFont(new Font("Andale Mono", 1, 18));
        btnCalcular.setVisible(false);
        add(btnCalcular);
        btnPE = new JButton("Ir a Pruebas");
        btnPE.setBounds(600, 400, 150, 50);
        btnPE.setFont(new Font("Andale Mono", 1, 18));
        btnPE.setVisible(false);
        add(btnPE);
        btnCalcular.addActionListener(this);
        btnPE.addActionListener(this);
        cuadM.addActionListener(this);
        prodM.addActionListener(this);
        multiC.addActionListener(this);
        lineal.addActionListener(this);
        multiplicativo.addActionListener(this);
    }

    private void Clean() {
        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        txt4.setText("");
        datosC.setText("");
        resultados.setText("");
    }

        @Override
        public void actionPerformed(ActionEvent evt) {
            if (evt.getSource() == cuadM) {
                lbl2.setText("Algoritmo de Cuadrados Medios");
                lbl3.setText("Semilla:");
                lbl4.setText("Numeros a generar:");
                lbl5.setVisible(false);
                lbl6.setVisible(false);
                txt1.setVisible(true);
                txt2.setVisible(true);
                txt3.setVisible(false);
                txt4.setVisible(false);
                btnCalcular.setVisible(true);
                btnPE.setVisible(false);
                scroll.setVisible(true);
                Clean();
            }
            if (evt.getSource() == prodM) {
                lbl2.setText("Algoritmo de Productos Medios");
                lbl3.setText("Semilla 1:");
                lbl4.setText("Numeros a generar:");
                lbl6.setText("Semilla 2:");
                lbl5.setVisible(false);
                lbl6.setVisible(true);
                txt1.setVisible(true);
                txt4.setVisible(true);
                txt2.setVisible(true);
                txt3.setVisible(false);
                btnCalcular.setVisible(true);
                btnPE.setVisible(false);
                scroll.setVisible(true);
                Clean();
            }
            if (evt.getSource() == multiC) {
                lbl2.setText("Algoritmo de Multiplicador Constante");
                lbl3.setText("Semilla:");
                lbl4.setText("Numeros a generar:");
                lbl6.setText("Constante:");
                lbl5.setVisible(false);
                lbl6.setVisible(true);
                txt1.setVisible(true);
                txt4.setVisible(true);
                txt2.setVisible(true);
                txt3.setVisible(false);
                btnCalcular.setVisible(true);
                btnPE.setVisible(false);
                scroll.setVisible(true);
                Clean();
            }
            if (evt.getSource() == lineal) {
                lbl2.setText("Algoritmo Lineal");
                lbl3.setText("Semilla:");
                lbl4.setText("Valor de g:");
                lbl5.setText("Valor de k:");
                lbl6.setText("Valor de c:");
                lbl5.setVisible(true);
                lbl6.setVisible(true);
                txt1.setVisible(true);
                txt4.setVisible(true);
                txt2.setVisible(true);
                txt3.setVisible(true);
                btnCalcular.setVisible(true);
                btnPE.setVisible(false);
                scroll.setVisible(true);
                Clean();
            }
            if (evt.getSource() == multiplicativo) {
                lbl2.setText("Algoritmo Congruencial Multiplicativo");
                lbl3.setText("Semilla:");
                lbl4.setText("Valor de g:");
                lbl5.setText("Valor de k:");
                lbl6.setVisible(false);
                txt1.setVisible(true);
                txt2.setVisible(true);
                txt3.setVisible(true);
                txt4.setVisible(false);
                btnCalcular.setVisible(true);
                btnPE.setVisible(false);
                scroll.setVisible(true);
                Clean();
            }
            if (evt.getSource() == btnPE) {
                Frame_Pruebas_Est A = new Frame_Pruebas_Est();
                A.setSize(800, 500);
                A.setVisible(true);
                A.setLocationRelativeTo(null);
                A.setResizable(false);
                this.setVisible(false);
                A.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
            if (evt.getSource() == btnCalcular && cuadM.isSelected()) {
                No_Congruenciales A = new No_Congruenciales();
                int iteraciones = 0;
                String t = "";
                try {
                    int x1 = Integer.parseInt(txt1.getText());
                    iteraciones = Integer.parseInt(txt2.getText());
                    String[] arr = new String[iteraciones];
                    String s = "";
                    boolean band = true;
                    if (iteraciones <= 1) {
                        JOptionPane.showMessageDialog(null, "Introduzca una mayor cantidad de\n"
                                + "numeros pseudoaleatorios a generar");
                    } else {
                        A.setX1(x1);
                        A.setX2(x1);
                        A.examina_semillas();
                        A.n_dig();
                        A.largo();
                        for (int i = 0; i < iteraciones; i++) {
                            t += i + ".- " + A.getX1() + "    ";
                            A.producto();
                            A.cadena_f();
                            t += A.getN_string_f();
                            A.xi();
                            arr[i] = A.getXi();
                            t += "\t" + arr[i];
                            A.ri();
                            s += A.getRi();
                            t += "\t" + A.getRi();
                            A.setX1(Integer.parseInt(A.getXi()));
                            A.setX2(Integer.parseInt(A.getXi()));
                            if (i < iteraciones - 1) {
                                t += "\n";
                                s += "\n";
                            }
                        }
                        datosC.setText("Semilla: " + x1 + " | Largo: " + A.getLargo());
                        resultados.setText(t);
                        for (int i = 0; i < arr.length; i++) {
                            for (int j = 0; j < arr.length; j++) {
                                if (arr[i].equals(arr[j]) && i != j) {
                                    band = false;
                                    break;
                                }
                            }
                            if (!band) {
                                break;
                            }
                        }
                        if (band) {
                            Lectura_Escritura_Doc esc = new Lectura_Escritura_Doc();
                            esc.escribir(s);
                            JOptionPane.showMessageDialog(null, "Los numeros han sido guardados");
                            btnPE.setVisible(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "Los numeros generados "
                                    + "con\nel periodo de vida requerido se "
                                    + "repiten.\nGenere otros numeros con una semilla diferente.");
                            Clean();
                        }
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Ingrese sólo valores numéricos");
                    Clean();
                } catch (No_Congruenciales.longitud_semillas f) {
                    JOptionPane.showMessageDialog(null, "La longitud de las semillas es diferente\n"
                            + "La longitud de las semillas debe ser la misma");
                    Clean();
                } catch (No_Congruenciales.semilla_negativa g) {
                    JOptionPane.showMessageDialog(null, "La semilla no puede tener un valor negativo");
                    Clean();
                } catch (No_Congruenciales.valor_invalido h) {
                    JOptionPane.showMessageDialog(null, "La semilla debe tener un valor mayor a 10");
                    Clean();
                }
            }
            if (evt.getSource() == btnCalcular && prodM.isSelected()) {
                No_Congruenciales A = new No_Congruenciales();
                int iteraciones = 0;
                String t = "";
                String s = "";
                try {
                    int x1 = Integer.parseInt(txt1.getText());
                    int x2 = Integer.parseInt(txt4.getText());
                    iteraciones = Integer.parseInt(txt2.getText());
                    boolean band = true;
                    String[] arr = new String[iteraciones];

                    if (iteraciones <= 1) {
                        JOptionPane.showMessageDialog(null, "Introduzca una mayor cantidad de\n"
                                + "numeros pseudoaleatorios a generar");
                    } else {
                        A.setX1(x1);
                        A.setX2(x2);
                        A.examina_semillas();
                        A.n_dig();
                        A.largo();
                        for (int i = 0; i < iteraciones; i++) {
                            t += i + ".- " + A.getX1() + "\t" + A.getX2() + "\t";
                            A.producto();
                            A.cadena_f();
                            t += A.getN_string_f();
                            A.xi();
                            arr[i] = A.getXi();
                            t += "\t" + arr[i];
                            A.ri();
                            s += A.getRi();
                            t += "\t" + A.getRi();
                            A.setX1(A.getX2());
                            A.setX2(Integer.parseInt(A.getXi()));
                            if (i < iteraciones - 1) {
                                t += "\n";
                                s += "\n";
                            }
                        }
                        datosC.setText("Semilla 1: " + x1 + " | Semilla 2: " + x2 + " | Largo: " + A.getLargo());
                        resultados.setText(t);
                        for (int i = 0; i < arr.length; i++) {
                            for (int j = 0; j < arr.length; j++) {
                                if (arr[i].equals(arr[j]) && i != j) {
                                    band = false;
                                    break;
                                }
                            }
                            if (!band) {
                                break;
                            }
                        }
                        if (band) {
                            Lectura_Escritura_Doc esc = new Lectura_Escritura_Doc();
                            esc.escribir(s);
                            JOptionPane.showMessageDialog(null, "Los numeros han sido guardados");
                            btnPE.setVisible(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "Los numeros generados "
                                    + "con\nel periodo de vida requerido se "
                                    + "repiten.\nGenere otros numeros con semillas diferente.");
                            Clean();
                        }
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Ingrese sólo valores numéricos");
                    Clean();
                } catch (No_Congruenciales.longitud_semillas f) {
                    JOptionPane.showMessageDialog(null, "La longitud de las semillas es diferente\n"
                            + "La longitud de las semillas debe ser la misma");
                    Clean();
                } catch (No_Congruenciales.semilla_negativa g) {
                    JOptionPane.showMessageDialog(null, "La semilla no puede tener un valor negativo");
                    Clean();
                } catch (No_Congruenciales.valor_invalido h) {
                    JOptionPane.showMessageDialog(null, "La semilla debe tener un valor mayor a 10");
                    Clean();
                }
            }
            if (evt.getSource() == btnCalcular && multiC.isSelected()) {
                No_Congruenciales A = new No_Congruenciales();
                int iteraciones = 0;
                String t = "";
                String s = "";
                try {
                    int x1 = Integer.parseInt(txt1.getText());
                    int x2 = Integer.parseInt(txt4.getText());
                    iteraciones = Integer.parseInt(txt2.getText());
                    String[] arr = new String[iteraciones];
                    boolean band = true;
                    if (iteraciones <= 1) {
                        JOptionPane.showMessageDialog(null, "Introduzca una mayor cantidad de\n"
                                + "numeros pseudoaleatorios a generar");
                    } else {
                        A.setX1(x1);
                        A.setX2(x2);
                        A.examina_semillas();
                        A.n_dig();
                        A.largo();
                        for (int i = 0; i < iteraciones; i++) {
                            t += i + ".- " + A.getX1() + "\t";
                            A.producto();
                            A.cadena_f();
                            t += A.getN_string_f();
                            A.xi();
                            arr[i] = A.getXi();
                            t += "\t" + arr[i];
                            A.ri();
                            s += A.getRi();
                            t += "\t" + A.getRi();
                            A.setX1(Integer.parseInt(A.getXi()));
                            if (i < iteraciones - 1) {
                                t += "\n";
                                s += "\n";
                            }
                        }
                        datosC.setText("Semilla: " + x1 + " | Constante: " + x2 + " | Largo: " + A.getLargo());
                        resultados.setText(t);
                        for (int i = 0; i < arr.length; i++) {
                            for (int j = 0; j < arr.length; j++) {
                                if (arr[i].equals(arr[j]) && i != j) {
                                    band = false;
                                    break;
                                }
                            }
                            if (!band) {
                                break;
                            }
                        }
                        if (band) {
                            Lectura_Escritura_Doc esc = new Lectura_Escritura_Doc();
                            esc.escribir(s);
                            JOptionPane.showMessageDialog(null, "Los numeros han sido guardados");
                            btnPE.setVisible(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "Los numeros generados "
                                    + "con\nel periodo de vida requerido se "
                                    + "repiten.\nGenere otros numeros con una semilla diferente.");
                            Clean();
                        }
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Ingrese sólo valores numéricos");
                    Clean();
                } catch (No_Congruenciales.longitud_semillas f) {
                    JOptionPane.showMessageDialog(null, "La longitud de las semillas es diferente\n"
                            + "La longitud de las semillas debe ser la misma");
                    Clean();
                } catch (No_Congruenciales.semilla_negativa g) {
                    JOptionPane.showMessageDialog(null, "La semilla no puede tener un valor negativo");
                    Clean();
                } catch (No_Congruenciales.valor_invalido h) {
                    JOptionPane.showMessageDialog(null, "La semilla debe tener un valor mayor a 10");
                    Clean();
                }
            }
            if (evt.getSource() == btnCalcular && lineal.isSelected()) {
                Lineal A = new Lineal();
                DecimalFormat fmt = new DecimalFormat("#.######");
                fmt.setRoundingMode(RoundingMode.DOWN);
                String s = "",sc = "", res = "";
                try {
                    int x = Integer.parseInt(txt1.getText());
                    int g = Integer.parseInt(txt2.getText());
                    int k = Integer.parseInt(txt3.getText());
                    int c = Integer.parseInt(txt4.getText());
                    A.setX(x);
                    A.setG(g);
                    A.examina_g();
                    A.mod();
                    A.setK(k);
                    A.a();
                    A.setC(c);
                    A.examina_variables();
                    A.rel_primo();
                    A.periodoV();
                    datosC.setText("Semilla: " + x + " | m: " + A.getM() + " | a: " + A.getA() + " | Periodo de vida: " + A.getP());
                    for (int i = 0; i < A.getP(); i++) {
                        A.xi();
                        A.ri();
                        A.examina_ri();
                        s = fmt.format(A.getRi());
                        sc += s;
                        res += i + ".-  " + A.getX() + "\t" + A.getXi() + "\t" + s;
                        if (i < A.getP() - 1) {
                            res += "\n";
                            sc += "\n";
                        }
                        A.setX(A.getXi());
                    }
                    resultados.setText(res);
                    Lectura_Escritura_Doc esc = new Lectura_Escritura_Doc();
                    esc.escribir(s);
                    JOptionPane.showMessageDialog(null, "Los numeros han sido guardados");
                    btnPE.setVisible(true);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Ingrese sólo valores numéricos");
                    Clean();
                } catch (Lineal.no_negativos ex) {
                    JOptionPane.showMessageDialog(null, "Todos los valores numericos a ingresar\n"
                            + " deben ser positivos mayores a 0");
                    Clean();
                } catch (Lineal.r_primo ex) {
                    JOptionPane.showMessageDialog(null, "C debe ser relativamente primo a M\n"
                            + "Ingrese un valor distinto");
                    txt4.setText("");
                } catch (Lineal.limite_g ex) {
                    JOptionPane.showMessageDialog(null, "g no puede tener un valor mayor a 31\n"
                            + "Ingrese un valor distinto");
                    txt2.setText("");
                } catch (Lineal.limite_ri ex) {
                    JOptionPane.showMessageDialog(null, "Los numeros ri no cumplieron con la longitud requerida.");
                    Clean();
                }
            }
            if (evt.getSource() == btnCalcular && multiplicativo.isSelected()) {
                Multiplicativo A = new Multiplicativo();
                DecimalFormat fmt = new DecimalFormat("#.######");
                fmt.setRoundingMode(RoundingMode.DOWN);
                String s = "",sc = "", res = "";
                try {
                    int x = Integer.parseInt(txt1.getText());
                    int g = Integer.parseInt(txt2.getText());
                    int k = Integer.parseInt(txt3.getText());
                    A.setX(x);
                    A.setG(g);
                    A.examina_g();
                    A.mod();
                    A.setK(k);
                    A.a();
                    A.examina_variables();
                    A.periodoV();
                    datosC.setText("Semilla: " + x + " | m: " + A.getM() + " | a: " + A.getA() + " | Periodo de vida: " + A.getP());
                    for (int i = 0; i < A.getP(); i++) {
                        A.xi();
                        A.ri();
                        A.examina_ri();
                        s = fmt.format(A.getRi());
                        sc += s;
                        res += i + ".-  " + A.getX() + "\t" + A.getXi() + "\t" + s;
                        if (i < A.getP() - 1) {
                            res += "\n";
                            sc += "\n";
                        }
                        A.setX(A.getXi());
                    }
                    resultados.setText(res);
                    Lectura_Escritura_Doc esc = new Lectura_Escritura_Doc();
                    esc.escribir(s);
                    JOptionPane.showMessageDialog(null, "Los numeros han sido guardados");
                    btnPE.setVisible(true);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Ingrese sólo valores numéricos");
                    Clean();
                } catch (Lineal.no_negativos ex) {
                    JOptionPane.showMessageDialog(null, "Todos los valores numericos a ingresar\n"
                            + " deben ser positivos mayores a 0");
                    Clean();
                } catch (Lineal.limite_g ex) {
                    JOptionPane.showMessageDialog(null, "g no puede tener un valor mayor a 31\n"
                            + "Ingrese un valor distinto");
                    txt2.setText("");
                } catch (Lineal.limite_ri ex) {
                    JOptionPane.showMessageDialog(null, "Los numeros ri no cumplieron con la longitud requerida.");
                    Clean();
                }
            }
        }
}
