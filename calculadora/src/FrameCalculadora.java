public class FrameCalculadora extends javax.swing.JFrame {

    double v1;
    double v2;
    String resultado;
    String op;
    Calculadora c = new Calculadora();

    public FrameCalculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jBT1 = new javax.swing.JButton();
        jBT2 = new javax.swing.JButton();
        jBT3 = new javax.swing.JButton();
        jBT4 = new javax.swing.JButton();
        jBT5 = new javax.swing.JButton();
        jBT6 = new javax.swing.JButton();
        jBT7 = new javax.swing.JButton();
        jBT8 = new javax.swing.JButton();
        jBT9 = new javax.swing.JButton();
        jBT0 = new javax.swing.JButton();
        jTFCampo = new javax.swing.JTextField();
        jBTCe = new javax.swing.JButton();
        jBTDiv = new javax.swing.JButton();
        jBTMult = new javax.swing.JButton();
        jBTSub = new javax.swing.JButton();
        jBTSoma = new javax.swing.JButton();
        jBTBackspace = new javax.swing.JButton();
        jBTEqual = new javax.swing.JButton();
        jBTResult = new javax.swing.JButton();
        jTFResult = new javax.swing.JTextField();
        jBTDot = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Calculadora");
        jLabel1.setToolTipText("");

        jBT1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBT1.setText("1");
        jBT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBT1ActionPerformed(evt);
            }
        });

        jBT2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBT2.setText("2");
        jBT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBT2ActionPerformed(evt);
            }
        });

        jBT3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBT3.setText("3");
        jBT3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBT3ActionPerformed(evt);
            }
        });

        jBT4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBT4.setText("4");
        jBT4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBT4ActionPerformed(evt);
            }
        });

        jBT5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBT5.setText("5");
        jBT5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBT5ActionPerformed(evt);
            }
        });

        jBT6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBT6.setText("6");
        jBT6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBT6ActionPerformed(evt);
            }
        });

        jBT7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBT7.setText("7");
        jBT7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBT7ActionPerformed(evt);
            }
        });

        jBT8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBT8.setText("8");
        jBT8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBT8ActionPerformed(evt);
            }
        });

        jBT9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBT9.setText("9");
        jBT9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBT9ActionPerformed(evt);
            }
        });

        jBT0.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBT0.setText("0");
        jBT0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBT0ActionPerformed(evt);
            }
        });

        jBTCe.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBTCe.setText("CE");
        jBTCe.setMaximumSize(new java.awt.Dimension(45, 37));
        jBTCe.setMinimumSize(new java.awt.Dimension(45, 37));
        jBTCe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTCeActionPerformed(evt);
            }
        });

        jBTDiv.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBTDiv.setText("/");
        jBTDiv.setMaximumSize(new java.awt.Dimension(45, 37));
        jBTDiv.setMinimumSize(new java.awt.Dimension(45, 37));
        jBTDiv.setPreferredSize(new java.awt.Dimension(45, 37));
        jBTDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTDivActionPerformed(evt);
            }
        });

        jBTMult.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBTMult.setText("*");
        jBTMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTMultActionPerformed(evt);
            }
        });

        jBTSub.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBTSub.setText("-");
        jBTSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTSubActionPerformed(evt);
            }
        });

        jBTSoma.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBTSoma.setText("+");
        jBTSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTSomaActionPerformed(evt);
            }
        });

        jBTBackspace.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBTBackspace.setText("<-");
        jBTBackspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTBackspaceActionPerformed(evt);
            }
        });

        jBTEqual.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBTEqual.setText("=");
        jBTEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTEqualActionPerformed(evt);
            }
        });

        jBTResult.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBTResult.setText("Resultado");
        jBTResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTResultActionPerformed(evt);
            }
        });

        jBTDot.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBTDot.setText(".");
        jBTDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTDotActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jBT0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBTResult, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(jBT4, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(jBT1, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(jBT7, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jBT2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBT5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBT8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFResult, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jBT6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jBT3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jBTSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jBTMult, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBT9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBTDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBTCe, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBTBackspace, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBTDot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBTEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBTSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jTFCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jBTBackspace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBTCe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jBTResult, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(jTFResult))
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBT7)
                    .addComponent(jBT8)
                    .addComponent(jBT9)
                    .addComponent(jBTDiv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBT4)
                    .addComponent(jBT5)
                    .addComponent(jBT6)
                    .addComponent(jBTMult))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBT2)
                    .addComponent(jBT1)
                    .addComponent(jBTSub)
                    .addComponent(jBT3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                        .addComponent(jBTSoma)
                        .addComponent(jBT0)
                        .addComponent(jBTEqual))
                    .addComponent(jBTDot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBT9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBT9ActionPerformed
        jTFCampo.setText(jTFCampo.getText() + "9");
    }//GEN-LAST:event_jBT9ActionPerformed

    private void jBT0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBT0ActionPerformed
        jTFCampo.setText(jTFCampo.getText() + "0");
    }//GEN-LAST:event_jBT0ActionPerformed

    private void jBT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBT1ActionPerformed
        jTFCampo.setText(jTFCampo.getText() + "1");
    }//GEN-LAST:event_jBT1ActionPerformed

    private void jBT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBT2ActionPerformed
        jTFCampo.setText(jTFCampo.getText() + "2");
    }//GEN-LAST:event_jBT2ActionPerformed

    private void jBT3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBT3ActionPerformed
        jTFCampo.setText(jTFCampo.getText() + "3");
    }//GEN-LAST:event_jBT3ActionPerformed

    private void jBT4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBT4ActionPerformed
        jTFCampo.setText(jTFCampo.getText() + "4");
    }//GEN-LAST:event_jBT4ActionPerformed

    private void jBT5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBT5ActionPerformed
        jTFCampo.setText(jTFCampo.getText() + "5");
    }//GEN-LAST:event_jBT5ActionPerformed

    private void jBT6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBT6ActionPerformed
        jTFCampo.setText(jTFCampo.getText() + "6");
    }//GEN-LAST:event_jBT6ActionPerformed

    private void jBT7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBT7ActionPerformed
        jTFCampo.setText(jTFCampo.getText() + "7");
    }//GEN-LAST:event_jBT7ActionPerformed

    private void jBT8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBT8ActionPerformed
        jTFCampo.setText(jTFCampo.getText() + "8");
    }//GEN-LAST:event_jBT8ActionPerformed

    private void jBTCeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTCeActionPerformed
        jTFCampo.setText("");
        jTFResult.setText("");
    }//GEN-LAST:event_jBTCeActionPerformed

    private void jBTSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTSomaActionPerformed
        jTFCampo.setText(jTFCampo.getText() + "+");
        op = "[+]";
    }//GEN-LAST:event_jBTSomaActionPerformed

    private void jBTSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTSubActionPerformed
        jTFCampo.setText(jTFCampo.getText() + "-");
        op = "[-]";
    }//GEN-LAST:event_jBTSubActionPerformed

    private void jBTMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTMultActionPerformed
        jTFCampo.setText(jTFCampo.getText() + "*");
        op = "[*]";
    }//GEN-LAST:event_jBTMultActionPerformed

    private void jBTDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTDivActionPerformed
        jTFCampo.setText(jTFCampo.getText() + "/");
        op = "[/]";
    }//GEN-LAST:event_jBTDivActionPerformed

    private void jBTEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTEqualActionPerformed
        String field = jTFCampo.getText();
        String[] valores = field.split(op);
        String valor1 = valores[0];
        String valor2 = valores[1];
        v1 = Double.parseDouble(valor1);
        v2 = Double.parseDouble(valor2);
        resultado = c.calcular(v1, v2, op) + "";
        jTFResult.setText(resultado);
        jTFCampo.setText("");
    }//GEN-LAST:event_jBTEqualActionPerformed

    private void jBTBackspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTBackspaceActionPerformed
        String str = jTFCampo.getText();
        str = str.substring(0, str.length() - 1);
        jTFCampo.setText(str);
    }//GEN-LAST:event_jBTBackspaceActionPerformed

    private void jBTResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTResultActionPerformed
        jTFCampo.setText(jTFResult.getText() + "");
    }//GEN-LAST:event_jBTResultActionPerformed

    private void jBTDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTDotActionPerformed
        String dot = ".";
        dot = dot.substring(0, 1);
        jTFCampo.setText(jTFCampo.getText() + dot);
    }//GEN-LAST:event_jBTDotActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Calculadora calculadora = new Calculadora();
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
            java.util.logging.Logger.getLogger(FrameCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FrameCalculadora().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBT0;
    private javax.swing.JButton jBT1;
    private javax.swing.JButton jBT2;
    private javax.swing.JButton jBT3;
    private javax.swing.JButton jBT4;
    private javax.swing.JButton jBT5;
    private javax.swing.JButton jBT6;
    private javax.swing.JButton jBT7;
    private javax.swing.JButton jBT8;
    private javax.swing.JButton jBT9;
    private javax.swing.JButton jBTBackspace;
    private javax.swing.JButton jBTCe;
    private javax.swing.JButton jBTDiv;
    private javax.swing.JButton jBTDot;
    private javax.swing.JButton jBTEqual;
    private javax.swing.JButton jBTMult;
    private javax.swing.JButton jBTResult;
    private javax.swing.JButton jBTSoma;
    private javax.swing.JButton jBTSub;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTFCampo;
    private javax.swing.JTextField jTFResult;
    // End of variables declaration//GEN-END:variables
}
