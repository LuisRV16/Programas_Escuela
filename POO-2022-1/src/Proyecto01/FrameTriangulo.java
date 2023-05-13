package Proyecto01;

import javax.swing.JOptionPane;

public class FrameTriangulo extends javax.swing.JFrame {
    //Propiedades del FrameTriangulo
    CTriangulo T=new CTriangulo();
    public FrameTriangulo() {
        initComponents();
        btnAB.setEnabled(false);
        btnBC.setEnabled(false);
        btnAC.setEnabled(false);
        btnArea.setEnabled(false);
        btnPerimetro.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAX = new javax.swing.JTextField();
        txtAY = new javax.swing.JTextField();
        txtBX = new javax.swing.JTextField();
        txtBY = new javax.swing.JTextField();
        txtCX = new javax.swing.JTextField();
        txtCY = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAB = new javax.swing.JButton();
        btnBC = new javax.swing.JButton();
        btnAC = new javax.swing.JButton();
        Resultado = new javax.swing.JLabel();
        btnArea = new javax.swing.JButton();
        btnPerimetro = new javax.swing.JButton();
        btnVertices = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TRIANGULO");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("A");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("B");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("C");

        txtAX.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtAX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAXActionPerformed(evt);
            }
        });

        txtAY.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtAY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAYActionPerformed(evt);
            }
        });

        txtBX.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtBX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBXActionPerformed(evt);
            }
        });

        txtBY.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtBY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBYActionPerformed(evt);
            }
        });

        txtCX.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtCX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCXActionPerformed(evt);
            }
        });

        txtCY.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtCY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCYActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("x");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("y");

        btnAB.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAB.setText("Distancia AB");
        btnAB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnABActionPerformed(evt);
            }
        });

        btnBC.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnBC.setText("Distancia BC");
        btnBC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBCActionPerformed(evt);
            }
        });

        btnAC.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAC.setText("Distancia AC");
        btnAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnACActionPerformed(evt);
            }
        });

        Resultado.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        btnArea.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnArea.setText("Area");
        btnArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAreaActionPerformed(evt);
            }
        });

        btnPerimetro.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnPerimetro.setText("Perimetro");
        btnPerimetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerimetroActionPerformed(evt);
            }
        });

        btnVertices.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        btnVertices.setText("Asignar Vertices");
        btnVertices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerticesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtBX, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtBY, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtAX, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtAY, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtCX, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtCY, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel4)
                        .addGap(64, 64, 64)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(Resultado))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btnVertices))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAB))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtAX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnVertices, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAB)
                        .addGap(18, 18, 18)
                        .addComponent(btnBC))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnArea)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPerimetro)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAC)
                .addGap(180, 180, 180)
                .addComponent(Resultado)
                .addGap(69, 69, 69))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAXActionPerformed

    private void txtAYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAYActionPerformed

    private void txtBXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBXActionPerformed

    private void txtBYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBYActionPerformed

    private void txtCXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCXActionPerformed

    private void txtCYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCYActionPerformed

    private void btnACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnACActionPerformed
        T.cAC();
        String s="La distancia es: "+String.valueOf(T.getAC());
        Resultado.setText(s);
    }//GEN-LAST:event_btnACActionPerformed

    private void btnVerticesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerticesActionPerformed
        try
        {
            int x1=Integer.parseInt(txtAX.getText());
            int y1=Integer.parseInt(txtAY.getText());
            int x2=Integer.parseInt(txtBX.getText());
            int y2=Integer.parseInt(txtBY.getText());
            int x3=Integer.parseInt(txtCX.getText());
            int y3=Integer.parseInt(txtCY.getText());
            T.setVertices(x1, y1, x2, y2, x3, y3);
            btnAB.setEnabled(true);
            btnBC.setEnabled(true);
            btnAC.setEnabled(true);
            btnArea.setEnabled(true);
            btnPerimetro.setEnabled(true);
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this, "Ingresar solo valores numericos");
        }
    }//GEN-LAST:event_btnVerticesActionPerformed

    private void btnABActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnABActionPerformed
        T.cAB();
        String s="La distancia es: "+String.valueOf(T.getAB());
        Resultado.setText(s);
    }//GEN-LAST:event_btnABActionPerformed

    private void btnBCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBCActionPerformed
        T.cBC();
        String s="La distancia es: "+String.valueOf(T.getBC());
        Resultado.setText(s);
        
    }//GEN-LAST:event_btnBCActionPerformed

    private void btnAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreaActionPerformed
        T.Perimetro();
        T.Area();
        String s="El area es: "+String.valueOf((float)T.getArea());
        Resultado.setText(s);
    }//GEN-LAST:event_btnAreaActionPerformed

    private void btnPerimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerimetroActionPerformed
        T.Perimetro();
        String s="El perimetro es: "+String.valueOf((float)T.getPerimetro());
        Resultado.setText(s);
    }//GEN-LAST:event_btnPerimetroActionPerformed

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
            java.util.logging.Logger.getLogger(FrameTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameTriangulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Resultado;
    private javax.swing.JButton btnAB;
    private javax.swing.JButton btnAC;
    private javax.swing.JButton btnArea;
    private javax.swing.JButton btnBC;
    private javax.swing.JButton btnPerimetro;
    private javax.swing.JButton btnVertices;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtAX;
    private javax.swing.JTextField txtAY;
    private javax.swing.JTextField txtBX;
    private javax.swing.JTextField txtBY;
    private javax.swing.JTextField txtCX;
    private javax.swing.JTextField txtCY;
    // End of variables declaration//GEN-END:variables
}
