
import javax.swing.table.DefaultTableModel;

public class Interface extends javax.swing.JFrame {

    DefaultTableModel model;

    public Interface() {
        initComponents();
        model = (DefaultTableModel) jTableAgendamentos.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitle = new javax.swing.JLabel();
        jLabelNomePaciente = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        jLabelHora = new javax.swing.JLabel();
        jTFNomePaciente = new javax.swing.JTextField();
        jTFData = new javax.swing.JTextField();
        jTFHora = new javax.swing.JTextField();
        jLabelNomeMedico = new javax.swing.JLabel();
        jComboMedicos = new javax.swing.JComboBox<>();
        jCheckConvenio = new javax.swing.JCheckBox();
        jBtnAgendas = new javax.swing.JButton();
        jScrollPaneRegistros = new javax.swing.JScrollPane();
        jTableAgendamentos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTitle.setText("Agendamento de Consultas Médicas");

        jLabelNomePaciente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelNomePaciente.setText("Nome do Paciente:");

        jLabelData.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelData.setText("Data:");

        jLabelHora.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelHora.setText("Hora:");

        jTFNomePaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomePacienteActionPerformed(evt);
            }
        });

        jLabelNomeMedico.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelNomeMedico.setText("Nome do Médico:");

        jComboMedicos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------------- SELECIONE --------------", "Dr.  Gabriel Lovatto", "Dr.  Reiner Perozzo", "Dr.  Espumante Rosa" }));
        jComboMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboMedicosActionPerformed(evt);
            }
        });

        jCheckConvenio.setText("Convênio");

        jBtnAgendas.setText("Agendar");
        jBtnAgendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAgendasActionPerformed(evt);
            }
        });

        jTableAgendamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Hora", "Médico", "Paciente", "Convênio"
            }
        ));
        jScrollPaneRegistros.setViewportView(jTableAgendamentos);
        if (jTableAgendamentos.getColumnModel().getColumnCount() > 0) {
            jTableAgendamentos.getColumnModel().getColumn(0).setResizable(false);
            jTableAgendamentos.getColumnModel().getColumn(0).setPreferredWidth(90);
            jTableAgendamentos.getColumnModel().getColumn(1).setResizable(false);
            jTableAgendamentos.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTableAgendamentos.getColumnModel().getColumn(2).setResizable(false);
            jTableAgendamentos.getColumnModel().getColumn(2).setPreferredWidth(180);
            jTableAgendamentos.getColumnModel().getColumn(3).setResizable(false);
            jTableAgendamentos.getColumnModel().getColumn(3).setPreferredWidth(220);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPaneRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNomePaciente)
                                    .addComponent(jLabelNomeMedico)
                                    .addComponent(jTFNomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboMedicos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFData, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelData)
                                    .addComponent(jCheckConvenio, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBtnAgendas, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFHora, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelHora)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabelTitle)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomePaciente)
                    .addComponent(jLabelData)
                    .addComponent(jLabelHora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jLabelNomeMedico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckConvenio)
                    .addComponent(jBtnAgendas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneRegistros, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFNomePacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomePacienteActionPerformed

    }//GEN-LAST:event_jTFNomePacienteActionPerformed

    private void jBtnAgendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAgendasActionPerformed
        String selected;

        if (jCheckConvenio.isSelected()) {
            selected = "Sim";
        } else {
            selected = "Não";
        }

        model.addRow(new String[]{jTFData.getText(), jTFHora.getText(), jComboMedicos.getSelectedItem() + "", jTFNomePaciente.getText(), selected});

        jComboMedicos.setSelectedIndex(0);
        jCheckConvenio.setSelected(false);
        jTFNomePaciente.setText("");
        jTFData.setText("");
        jTFHora.setText("");
    }//GEN-LAST:event_jBtnAgendasActionPerformed

    private void jComboMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboMedicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboMedicosActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAgendas;
    private javax.swing.JCheckBox jCheckConvenio;
    private javax.swing.JComboBox<String> jComboMedicos;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JLabel jLabelNomeMedico;
    private javax.swing.JLabel jLabelNomePaciente;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JScrollPane jScrollPaneRegistros;
    private javax.swing.JTextField jTFData;
    private javax.swing.JTextField jTFHora;
    private javax.swing.JTextField jTFNomePaciente;
    private javax.swing.JTable jTableAgendamentos;
    // End of variables declaration//GEN-END:variables
}
