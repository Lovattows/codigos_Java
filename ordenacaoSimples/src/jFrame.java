
public class jFrame extends javax.swing.JFrame {

    Ordenacao ord = new Ordenacao();

    public jFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelQtde = new javax.swing.JLabel();
        jTFQtde = new javax.swing.JTextField();
        jBtnGerar = new javax.swing.JButton();
        jBtnFile = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAGerar = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTABolha = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTASelecao = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTAInsercao = new javax.swing.JTextArea();
        jLabelTimer = new javax.swing.JLabel();
        jTFTimerB = new javax.swing.JTextField();
        jTFTimerS = new javax.swing.JTextField();
        jTFTimerI = new javax.swing.JTextField();
        jBtnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelQtde.setText("Quantidade:");

        jTFQtde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFQtdeActionPerformed(evt);
            }
        });

        jBtnGerar.setText("Gerar Números");
        jBtnGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGerarActionPerformed(evt);
            }
        });

        jBtnFile.setText("Selecionar Arquivo");
        jBtnFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnFileActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleção");

        jLabel2.setText("Bolha");

        jLabel3.setText("Inserção");

        jTAGerar.setColumns(20);
        jTAGerar.setRows(5);
        jScrollPane1.setViewportView(jTAGerar);

        jTABolha.setColumns(20);
        jTABolha.setRows(5);
        jScrollPane2.setViewportView(jTABolha);

        jTASelecao.setColumns(20);
        jTASelecao.setRows(5);
        jScrollPane3.setViewportView(jTASelecao);

        jTAInsercao.setColumns(20);
        jTAInsercao.setRows(5);
        jScrollPane4.setViewportView(jTAInsercao);

        jLabelTimer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTimer.setText("Tempo:");

        jBtnLimpar.setText("Limpar");
        jBtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabelQtde)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFQtde, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBtnGerar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnFile, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabelTimer))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnLimpar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTFTimerB, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFTimerS, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFTimerI, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(54, 54, 54)
                            .addComponent(jLabel1)
                            .addGap(37, 37, 37)
                            .addComponent(jLabel3)
                            .addGap(38, 38, 38))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(22, 22, 22)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelQtde)
                            .addComponent(jTFQtde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnLimpar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(1, 1, 1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTimer)
                            .addComponent(jTFTimerB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFTimerS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFTimerI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnGerar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnFile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnFileActionPerformed

    }//GEN-LAST:event_jBtnFileActionPerformed

    private void jBtnGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGerarActionPerformed
        int i;
        String numeros = jTFQtde.getText();
        int n = Integer.parseInt(numeros);
        int[] valores = new int[n];
        int[] valores_bolha;
        int[] valores_insercao;
        int[] valores_selecao;
        for (i = 0; i < n; i++) {
            valores[i] = (int) (Math.random() * 100000);
            jTAGerar.setText(jTAGerar.getText() + valores[i] + "\n");
        }

        /* ORDENAÇÃO METODO BOLHA */
        long tempoInicialBolha = System.nanoTime();
        valores_bolha = ord.bolha(valores, n);
        long tempoFinalBolha = System.nanoTime();
        for (i = 0; i < n; i++) {
            jTABolha.setText(jTABolha.getText() + valores_bolha[i] + "\n");
        }
        long resultadoBolha = (tempoFinalBolha - tempoInicialBolha) / 1000000;
        jTFTimerB.setText(resultadoBolha + " ms");

        /* ORDENAÇÃO METODO INSERÇÃO */
        long tempoInicialInsercao = System.nanoTime();
        valores_insercao = ord.insercao(valores, n);
        long tempoFinalInsercao = System.nanoTime();
        for (i = 0; i < n; i++) {
            jTAInsercao.setText(jTAInsercao.getText() + valores_insercao[i] + "\n");
        }
        long resultadoInsercao = (tempoFinalInsercao - tempoInicialInsercao) / 1000000;
        jTFTimerI.setText(resultadoInsercao + " ms");

        /* ORDENAÇÃO METODO SELEÇÃO */
        long tempoInicialSelecao = System.nanoTime();
        valores_selecao = ord.selecao(valores, n);
        long tempoFinalSelecao = System.nanoTime();
        for (i = 0; i < n; i++) {
            jTASelecao.setText(jTASelecao.getText() + valores_selecao[i] + "\n");
        }
        long resultadoSelecao = (tempoFinalSelecao - tempoInicialSelecao) / 1000000;
        jTFTimerS.setText(resultadoSelecao + " ms");
    }//GEN-LAST:event_jBtnGerarActionPerformed

    private void jTFQtdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFQtdeActionPerformed

    }//GEN-LAST:event_jTFQtdeActionPerformed

    private void jBtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimparActionPerformed
        jTFQtde.setText("");
        jTAGerar.setText("");
        jTABolha.setText("");
        jTAInsercao.setText("");
        jTASelecao.setText("");
    }//GEN-LAST:event_jBtnLimparActionPerformed

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
            java.util.logging.Logger.getLogger(jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new jFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnFile;
    private javax.swing.JButton jBtnGerar;
    private javax.swing.JButton jBtnLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelQtde;
    private javax.swing.JLabel jLabelTimer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTABolha;
    private javax.swing.JTextArea jTAGerar;
    private javax.swing.JTextArea jTAInsercao;
    private javax.swing.JTextArea jTASelecao;
    private javax.swing.JTextField jTFQtde;
    private javax.swing.JTextField jTFTimerB;
    private javax.swing.JTextField jTFTimerI;
    private javax.swing.JTextField jTFTimerS;
    // End of variables declaration//GEN-END:variables
}
