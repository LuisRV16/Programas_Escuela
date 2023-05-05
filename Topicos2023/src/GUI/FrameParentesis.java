package GUI;

import CLASES.CPila;

public class FrameParentesis extends javax.swing.JFrame {

    public FrameParentesis() {
        initComponents();
        areaRes.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblString = new javax.swing.JLabel();
        txtString = new javax.swing.JTextField();
        btnEvaluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaRes = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblString.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblString.setText("Expresión:");

        txtString.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtString.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStringActionPerformed(evt);
            }
        });

        btnEvaluar.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        btnEvaluar.setText("Evaluar");
        btnEvaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvaluarActionPerformed(evt);
            }
        });

        areaRes.setColumns(20);
        areaRes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        areaRes.setRows(5);
        jScrollPane1.setViewportView(areaRes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblString)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtString, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(btnEvaluar)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblString)
                    .addComponent(txtString, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btnEvaluar)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void evaluar() {
        String res="";
        String exp = txtString.getText();
        int n = 0;
        for (int i = 0; i < exp.length(); i++) {
            switch (exp.charAt(i)) {
                case '{':
                case '[':
                case '(':
                    n++;
                    break;
            }
            CPila P = new CPila(n);
            for (int j = 0; j < exp.length(); j++) {
                res = "La expresión sí está balanceada";
                switch (exp.charAt(j)) {
                    case '{','[','(':
                        P.insertar(exp.charAt(j));
                        break;
                    case '}':
                        if ((char)P.eliminiar() != '{') {
                            res = "La expresión no está balanceada";
                            break;
                        }
                        break;
                    case ']':
                        if ((char)P.eliminiar() != '[') {
                            res = "La expresión no está balanceada";
                            break;
                        }
                        break;
                    case ')':
                        if ((char) P.eliminiar() != '(') {
                            res = "La expresión no está balanceada";
                            break;
                        }
                        break;
                }
            }
            if (!P.vacia()) {
                res = "La expresión no está balanceada";
            }
            areaRes.setText("Expresión evaluada: "+exp+"\n"+res);
        }
    }
    private void btnEvaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvaluarActionPerformed
        evaluar();
        txtString.setText("");
    }//GEN-LAST:event_btnEvaluarActionPerformed

    private void txtStringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStringActionPerformed
        evaluar();
        txtString.setText("");
    }//GEN-LAST:event_txtStringActionPerformed
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
            java.util.logging.Logger.getLogger(FrameParentesis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameParentesis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameParentesis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameParentesis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameParentesis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaRes;
    private javax.swing.JButton btnEvaluar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblString;
    private javax.swing.JTextField txtString;
    // End of variables declaration//GEN-END:variables
}
