package GUI;
import CLASES.CConjunto;
public class FrameConjunto extends javax.swing.JFrame {
    //Propiedades
    CConjunto L1 = new CConjunto();
    CConjunto L2 = new CConjunto();
    CConjunto L3 = new CConjunto();
    CConjunto L4 = new CConjunto();
    public FrameConjunto() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblElm1 = new javax.swing.JLabel();
        txtL1 = new javax.swing.JTextField();
        btnAgregarL1 = new javax.swing.JButton();
        btnMostrarL1 = new javax.swing.JButton();
        lblElem2 = new javax.swing.JLabel();
        txtL2 = new javax.swing.JTextField();
        btnAgregarL2 = new javax.swing.JButton();
        btnMostrarL2 = new javax.swing.JButton();
        btnUnion = new javax.swing.JButton();
        btnInterseccion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaUniverso = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblElm1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblElm1.setText("Elemento");

        txtL1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtL1ActionPerformed(evt);
            }
        });

        btnAgregarL1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAgregarL1.setText("Agregar");
        btnAgregarL1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarL1ActionPerformed(evt);
            }
        });

        btnMostrarL1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnMostrarL1.setText("Mostrar");
        btnMostrarL1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarL1ActionPerformed(evt);
            }
        });

        lblElem2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblElem2.setText("Elemento");

        txtL2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtL2ActionPerformed(evt);
            }
        });

        btnAgregarL2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAgregarL2.setText("Agregar");
        btnAgregarL2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarL2ActionPerformed(evt);
            }
        });

        btnMostrarL2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnMostrarL2.setText("Mostrar");
        btnMostrarL2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarL2ActionPerformed(evt);
            }
        });

        btnUnion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUnion.setText("Unión");
        btnUnion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnionActionPerformed(evt);
            }
        });

        btnInterseccion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnInterseccion.setText("Intersección");
        btnInterseccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInterseccionActionPerformed(evt);
            }
        });

        areaUniverso.setColumns(20);
        areaUniverso.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        areaUniverso.setRows(5);
        jScrollPane1.setViewportView(areaUniverso);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUnion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                        .addComponent(btnInterseccion)
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgregarL2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMostrarL2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgregarL1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMostrarL1)))))
                .addGap(85, 85, 85))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblElem2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtL2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblElm1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtL1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblElm1)
                    .addComponent(txtL1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarL1)
                    .addComponent(btnMostrarL1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblElem2)
                    .addComponent(txtL2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarL2)
                    .addComponent(btnMostrarL2))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUnion)
                    .addComponent(btnInterseccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarL1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarL1ActionPerformed
        int e=Integer.parseInt(txtL1.getText());
        L1.insertar(e);
        txtL1.setText("");
    }//GEN-LAST:event_btnAgregarL1ActionPerformed

    private void btnMostrarL1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarL1ActionPerformed
        areaUniverso.setText(L1.toString());
    }//GEN-LAST:event_btnMostrarL1ActionPerformed

    private void btnAgregarL2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarL2ActionPerformed
        int e=Integer.parseInt(txtL2.getText());
        L2.insertar(e);
        txtL2.setText("");
    }//GEN-LAST:event_btnAgregarL2ActionPerformed

    private void btnMostrarL2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarL2ActionPerformed
        areaUniverso.setText(L2.toString());
    }//GEN-LAST:event_btnMostrarL2ActionPerformed

    private void btnUnionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnionActionPerformed
        // TODO add your handling code here:
        L3.union(L1, L2);
        areaUniverso.setText(L3.toString());
        
    }//GEN-LAST:event_btnUnionActionPerformed

    private void btnInterseccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInterseccionActionPerformed
        // TODO add your handling code here:
        L4.interseccion(L1,L2);
        areaUniverso.setText(L4.toString());
    }//GEN-LAST:event_btnInterseccionActionPerformed

    private void txtL1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtL1ActionPerformed
        // TODO add your handling code here:
        try{
            btnAgregarL1ActionPerformed(evt);
        }catch(NumberFormatException e){
        }
        
    }//GEN-LAST:event_txtL1ActionPerformed

    private void txtL2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtL2ActionPerformed
        // TODO add your handling code here:
        try{
            btnAgregarL2ActionPerformed(evt);
        }catch(NumberFormatException e){
        }
    }//GEN-LAST:event_txtL2ActionPerformed

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
            java.util.logging.Logger.getLogger(FrameConjunto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameConjunto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameConjunto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameConjunto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameConjunto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaUniverso;
    private javax.swing.JButton btnAgregarL1;
    private javax.swing.JButton btnAgregarL2;
    private javax.swing.JButton btnInterseccion;
    private javax.swing.JButton btnMostrarL1;
    private javax.swing.JButton btnMostrarL2;
    private javax.swing.JButton btnUnion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblElem2;
    private javax.swing.JLabel lblElm1;
    private javax.swing.JTextField txtL1;
    private javax.swing.JTextField txtL2;
    // End of variables declaration//GEN-END:variables
}
