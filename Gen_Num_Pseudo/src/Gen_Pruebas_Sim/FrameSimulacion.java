package Gen_Pruebas_Sim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FrameSimulacion extends javax.swing.JFrame {

    private int dia;
    private int camion_x;
    private int azucar_x;
    private int cliente_x;
    private int camion_y;
    private int azucar_y;
    private int cliente_y;
    private float costoProm, ventasProm;
    private int perdidasT;
    private double[] variables_A = new double[60];
    private int resultados[][] = new int[60][6];
    

    /**
     * Creates new form Simulacion
     */
    public FrameSimulacion() {
        initComponents();
        setTitle("Simulación");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        planta = new javax.swing.JLabel();
        tienda = new javax.swing.JLabel();
        cliente = new javax.swing.JLabel();
        azucar = new javax.swing.JLabel();
        lblFaltante = new javax.swing.JLabel();
        lblInventario = new javax.swing.JLabel();
        lblDemanda = new javax.swing.JLabel();
        lblDia = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        camion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        planta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gen_Pruebas_Sim/img/fabrica_1.png"))); // NOI18N

        tienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gen_Pruebas_Sim/img/tiendita_1.png"))); // NOI18N

        cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gen_Pruebas_Sim/img/cliente_1.png"))); // NOI18N

        azucar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gen_Pruebas_Sim/img/azucar_copia_1.png"))); // NOI18N

        lblFaltante.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lblFaltante.setText("Faltante");

        lblInventario.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lblInventario.setText("Inventario");

        lblDemanda.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lblDemanda.setText("Demanda");

        lblDia.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblDia.setText("Día 0");

        btnIniciar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnIniciar.setText("Iniciar Simulación");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        camion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gen_Pruebas_Sim/img/camion_3.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIniciar)
                        .addGap(462, 462, 462))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(planta)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(lblFaltante, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(173, 173, 173)
                                .addComponent(lblInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblDemanda, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(camion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                                .addComponent(tienda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(azucar)
                                .addGap(143, 143, 143)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(lblDia))
                                    .addComponent(cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(planta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(btnIniciar)
                .addGap(69, 69, 69))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(lblDia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFaltante)
                    .addComponent(lblInventario)
                    .addComponent(lblDemanda))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(azucar)
                    .addComponent(tienda)
                    .addComponent(cliente)
                    .addComponent(camion))
                .addGap(242, 242, 242))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed

        No_Congruenciales A = new No_Congruenciales();
        Lectura_Escritura_Doc C = new Lectura_Escritura_Doc();
        FrameSimulacion D = new FrameSimulacion();
        Object[] proms;
        int x = 60;//Cantidad de numeros pseudoaleatorios a generar
        int cont_semillas = 0, cont_variables = 0;
        double mayor = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;
        ArrayList<Double> promedios = new ArrayList<>();
        for (int j = 10000; j <= 99999; j++) {//Semillas desde el numero 10,000 hasta el 99,999

            Pruebas_Estadisticas B = new Pruebas_Estadisticas();

            double suma = 0, promedio;//Variables necesarias para obtener la demanda de azúcar promedio
            String s = "";
            String v = "";
            String[] array = new String[x];
            double[] arrayN = new double[x];
            double[] variables = new double[x];

            B.setSignV(0.05);
            B.setZ(1.96);
            A.setX1(j);
            A.setX2(j);

            try {
                A.examina_semillas();
            } catch (No_Congruenciales.longitud_semillas | No_Congruenciales.semilla_negativa | No_Congruenciales.valor_invalido ex) {
                Logger.getLogger(Simulaciones.class.getName()).log(Level.SEVERE, null, ex);
            }

            A.n_dig();
            A.largo();

            for (int k = 0; k < x; k++) {
                A.producto();
                A.cadena_f();
                A.xi();
                A.setX1(Integer.parseInt(A.getXi()));
                A.setX2(Integer.parseInt(A.getXi()));
                A.ri();
                s += A.getRi() + "\n";
                array[k] = A.getRi();
                arrayN[k] = Double.parseDouble(A.getRi());
                variables[k] = (-100) * Math.log(1 - arrayN[k]);
                v += variables[k] + "\n";
                suma += variables[k];
            }

            promedio = suma / variables.length;

            B.setArr(arrayN);
            B.setArrT(array);
            B.media();
            B.varianza();

            if (B.isMedia() || B.isVarianza()) {
                B.uniformidad();

                if (B.isUniformidad()) {
                    B.setNum_d(5);
                    B.poker();

                    if (B.isPoker()) {
                        B.aleatoriedad();

                        if (B.isAleatoriedad()) {
                            System.out.println("\nLa semilla " + j + " pasa todas las pruebas estadisticas");
                            cont_semillas++;

                            B.chiSquare(variables);
                            System.out.println("Prueba de bondad de las variables: ");
                            System.out.print("Estadistico: " + B.getEstadistico());
                            System.out.println(" | Chi cuadrada teorica: " + B.getChi());

                            if (B.isChiSquare()) {
                                cont_variables++;
//                                C.escribir_num(s);
//                                C.escribir_val(v);
                                promedios.add(promedio);
                                System.out.println("Las variables aleatorias de la semilla " + j + " pasaron el ajuste de bondad\n");

                            } else {
                                System.out.println("Las variables aleatorias de la semilla " + j + " no pasaron el ajuste de bondad\n");
                            }

                        } else {
                            System.out.println("La semilla " + j + " no pasa la prueba de aleatoriedad");
                        }

                    } else {
                        System.out.println("Semilla " + j + " no pasa la prueba de poker");
                    }

                } else {
                    System.out.println("Semilla " + j + " no pasa la prueba de Uniformidad");
                }

            } else {
                System.out.println("Semilla " + j + " no pasa las pruebas de Media y Varianza");
            }

        }
        System.out.println("\n---------------------------------------------------------\n");
        proms = promedios.toArray();
//        for (int i = 0; i < proms.length; i++) {
//            System.out.println("Promedio en la posición "+i+": "+proms[i]);
//        }
        Arrays.sort(proms);
//        for (int i = 0; i < proms.length; i++) {
//            System.out.println("Promedio en la posición "+i+": "+proms[i]);
//        }
        menor = (double) proms[0];
        mayor = (double) proms[proms.length - 1];
        int numIntv = (int) mayor - (int) menor + 1;
        System.out.println("\n" + cont_semillas + " semillas pasan las pruebas estadísticas");
        System.out.println("\n" + cont_variables + " distintos conjuntos de variables aleatorias pasan la prueba de bondad");
        System.out.println("\nPromedio mayor y menor de las " + cont_variables + " simulaciones");
        System.out.println("El mayor promedio fue: " + mayor);
        System.out.println("El menor promedio fue: " + menor);
        System.out.println("Cantidad de intervalos para el metodo de MonteCarlo: " + numIntv);

        double[][] montecarlo = new double[numIntv][7];
        for (int i = 0; i < montecarlo.length; i++) {
            montecarlo[i][0] = (int) menor + i;
        }

        for (int i = 0; i < montecarlo.length; i++) {
            for (int j = 0; j < proms.length; j++) {
                if (Double.parseDouble(String.valueOf(proms[j])) > montecarlo[i][0] && Double.parseDouble(String.valueOf(proms[j])) <= montecarlo[i][0] + 1) {
                    montecarlo[i][1]++;
                }
            }
        }
        double suma = 0;
        for (int i = 0; i < montecarlo.length; i++) {
            montecarlo[i][1] /= proms.length;
            suma += montecarlo[i][1];
            montecarlo[i][2] = suma;
            montecarlo[i][3] = suma - montecarlo[i][1];
            montecarlo[i][4] = montecarlo[i][2];
            montecarlo[i][5] = montecarlo[i][3] * 1000;
            montecarlo[i][6] = montecarlo[i][4] * 1000;
        }

        String s = C.leer_val();
        String v = "";
        int cont = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != 10) {

                v += s.charAt(i);

            } else {

                variables_A[cont] = Double.parseDouble(v);
                cont++;
                v = "";

            }

        }

        btnIniciar.setEnabled(false);

        camion_x = camion.getLocation().x;
        camion_y = camion.getLocation().y;

        azucar_x = azucar.getLocation().x;
        azucar_y = azucar.getLocation().y;

        cliente_x = cliente.getLocation().x;
        cliente_y = cliente.getLocation().y;

        ////////////////////////////////////////////
        Thread animationThread = new Thread(() -> {

            btnIniciar.setEnabled(false);

            int milis = 1;
            int inv_ini = 700;
            int demanda = 0, faltante = 0, inv_rest = 0, costo_orden, perdidas = 0, costoT = 0, ventasT = 0;

            for (dia = 1; dia <= 60; dia++) {

                resultados[dia-1][0] = dia;
                for (int i = 0; i < montecarlo.length; i++) {
                    if (variables_A[dia - 1] > montecarlo[i][5] && variables_A[dia - 1] <= montecarlo[i][6]) {
                        demanda = (int) montecarlo[i][0];
                    }
                }
                resultados[dia-1][2] = demanda;
                lblDia.setText("Día: " + dia);

                try {
                    Thread.sleep(milis);
                } catch (InterruptedException ex) {
                    Logger.getLogger(FrameSimulacion.class.getName()).log(Level.SEVERE, null, ex);
                }

                if (dia % 7 == 0) {
                    inv_ini = inv_rest + faltante;
                    costo_orden = 1000 + 6 * faltante + faltante;
                    costoT += costo_orden;
                    faltante = 0;

                    resultados[dia-1][4] = costo_orden;
                    while (camion.getLocation().x < tienda.getLocation().x - 95) {

                        camion.setLocation(camion.getLocation().x + 1, camion.getLocation().y);
                        repaint();

                        try {
                            Thread.sleep(milis);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(FrameSimulacion.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }
                    camion.setLocation(camion_x, camion_y);
                    repaint();
                    lblFaltante.setText("Faltante: " + faltante);
                    lblInventario.setText("Inventario: " + inv_ini);

                }
                resultados[dia-1][1] = inv_ini;
                ventasT += demanda;
                lblDemanda.setText("Demanda: " + demanda);
                while (cliente.getLocation().x > azucar.getLocation().x) {

                    cliente.setLocation(cliente.getLocation().x - 1, cliente_y);
                    repaint();

                    try {
                        Thread.sleep(milis);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(FrameSimulacion.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
                inv_rest = inv_ini - demanda;
                resultados[dia-1][3] = inv_rest;
                if (inv_rest <= 0) {
                    perdidas = inv_rest;
                    resultados[dia-1][5] = perdidas;
                    perdidasT += perdidas;
                    inv_rest = 0;
                }
                faltante = 700 - inv_rest;

                lblInventario.setText("Inventario: " + inv_rest);
                lblFaltante.setText("Faltante: " + faltante);

                while (cliente.getLocation().x < cliente_x) {

                    cliente.setLocation(cliente.getLocation().x + 1, cliente_y);
                    azucar.setLocation(azucar.getLocation().x + 1, azucar_y);
                    repaint();

                    try {
                        Thread.sleep(milis);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(FrameSimulacion.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

                azucar.setLocation(azucar_x, azucar_y);
                repaint();
                inv_ini = inv_rest;

                costoProm = (float) costoT / dia;
                ventasProm = (float) ventasT / dia;
            }

            btnIniciar.setEnabled(true);
            System.out.println("");
            System.out.println("Método de Montecarlo");
            for (int i = 0; i < montecarlo.length; i++) {
                for (int j = 0; j < 7 ; j++) {
                    System.out.print(montecarlo[i][j]+"\t");
                }
                System.out.println("");
            }
            System.out.println("\n");
            System.out.println("Resultados de la Simulación");
            for (int i = 0; i < resultados.length; i++) {
                for (int j = 0; j < 6 ; j++) {
                    System.out.print(resultados[i][j]+"\t");
                }
                System.out.println("");
            }
            System.out.println("\n");
            System.out.println("Ventas promedio/Día: "+ventasProm);
            System.out.println("Costo promedio/Día: "+costoProm);
            System.out.println("Perdidas Totales: "+perdidasT);
            
        });

        animationThread.start();

    }//GEN-LAST:event_btnIniciarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameSimulacion.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameSimulacion.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameSimulacion.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameSimulacion.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameSimulacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel azucar;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JLabel camion;
    private javax.swing.JLabel cliente;
    private javax.swing.JLabel lblDemanda;
    private javax.swing.JLabel lblDia;
    private javax.swing.JLabel lblFaltante;
    private javax.swing.JLabel lblInventario;
    private javax.swing.JLabel planta;
    private javax.swing.JLabel tienda;
    // End of variables declaration//GEN-END:variables
}
