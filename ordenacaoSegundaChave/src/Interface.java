
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class Interface extends javax.swing.JFrame {

    public Interface() {
        initComponents();
        jTFTitleNOrdenados.setText("Matricula \t Nome \t Ano\n");
        jTFTitleBolha.setText("Matricula \t Nome \t Ano\n");
        jTFTitleSelecao.setText("Matricula \t Nome \t Ano\n");
        jTFTitleInsercao.setText("Matricula \t Nome \t Ano\n");
        if (lista.isEmpty()) {
            jBtnOrdenarAll.setEnabled(false);
            jBtnOrdenarBolha.setEnabled(false);
            jBtnOrdenarInsercao.setEnabled(false);
            jBtnOrdenarSelecao.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitle = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelAnoNasc = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jBtnCadastrar = new javax.swing.JButton();
        jBtnOrdenarAll = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTANOrdenados = new javax.swing.JTextArea();
        jLabelNOrdenados = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTAOrdenadosBolha = new javax.swing.JTextArea();
        jLabelOrdenadosBolha = new javax.swing.JLabel();
        jTFAno = new javax.swing.JTextField();
        jLabelOrdenadosSelecao = new javax.swing.JLabel();
        jLabelOrdenadosInsercao = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTAOrdenadosInsercao = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTAOrdenadosSelecao = new javax.swing.JTextArea();
        jBtnOrdenarBolha = new javax.swing.JButton();
        jBtnOrdenarSelecao = new javax.swing.JButton();
        jBtnOrdenarInsercao = new javax.swing.JButton();
        jBtnLimparAll = new javax.swing.JButton();
        jBtnLimparBolha = new javax.swing.JButton();
        jBtnLimparSelecao = new javax.swing.JButton();
        jBtnLimparInsercao = new javax.swing.JButton();
        jBtnLimparNOrdenados = new javax.swing.JButton();
        jTFTitleNOrdenados = new javax.swing.JTextField();
        jTFTitleBolha = new javax.swing.JTextField();
        jTFTitleSelecao = new javax.swing.JTextField();
        jTFTitleInsercao = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelTitle.setText("Cadastro de Alunos UFN");
        jLabelTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabelNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelNome.setText("Nome:");

        jLabelAnoNasc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelAnoNasc.setText("Ano de Nascimento:");

        jBtnCadastrar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBtnCadastrar.setText("Cadastrar");
        jBtnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCadastrarActionPerformed(evt);
            }
        });

        jBtnOrdenarAll.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBtnOrdenarAll.setText("Ordenar Todos");
        jBtnOrdenarAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOrdenarAllActionPerformed(evt);
            }
        });

        jTANOrdenados.setColumns(20);
        jTANOrdenados.setRows(5);
        jTANOrdenados.setEditable(false);
        jScrollPane1.setViewportView(jTANOrdenados);

        jLabelNOrdenados.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelNOrdenados.setText("Não Ordenados");

        jTAOrdenadosBolha.setColumns(20);
        jTAOrdenadosBolha.setRows(5);
        jTAOrdenadosBolha.setEditable(false);
        jScrollPane2.setViewportView(jTAOrdenadosBolha);

        jLabelOrdenadosBolha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelOrdenadosBolha.setText("Ordenados Bolha");

        jLabelOrdenadosSelecao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelOrdenadosSelecao.setText("Ordenados Seleção");

        jLabelOrdenadosInsercao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelOrdenadosInsercao.setText("Ordenados Inserção");

        jTAOrdenadosInsercao.setColumns(20);
        jTAOrdenadosInsercao.setRows(5);
        jTAOrdenadosInsercao.setEditable(false);
        jScrollPane3.setViewportView(jTAOrdenadosInsercao);

        jTAOrdenadosSelecao.setColumns(20);
        jTAOrdenadosSelecao.setRows(5);
        jTAOrdenadosSelecao.setEditable(false);
        jScrollPane4.setViewportView(jTAOrdenadosSelecao);

        jBtnOrdenarBolha.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBtnOrdenarBolha.setText("Ordenar Bolha");
        jBtnOrdenarBolha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOrdenarBolhaActionPerformed(evt);
            }
        });

        jBtnOrdenarSelecao.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBtnOrdenarSelecao.setText("Ordenar Seleção");
        jBtnOrdenarSelecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOrdenarSelecaoActionPerformed(evt);
            }
        });

        jBtnOrdenarInsercao.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBtnOrdenarInsercao.setText("Ordenar Inserção");
        jBtnOrdenarInsercao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOrdenarInsercaoActionPerformed(evt);
            }
        });

        jBtnLimparAll.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBtnLimparAll.setText("Limpar Todos");
        jBtnLimparAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimparAllActionPerformed(evt);
            }
        });

        jBtnLimparBolha.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBtnLimparBolha.setText("Limpar Bolha");
        jBtnLimparBolha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimparBolhaActionPerformed(evt);
            }
        });

        jBtnLimparSelecao.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBtnLimparSelecao.setText("Limpar Seleção");
        jBtnLimparSelecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimparSelecaoActionPerformed(evt);
            }
        });

        jBtnLimparInsercao.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBtnLimparInsercao.setText("Limpar Inserção");
        jBtnLimparInsercao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimparInsercaoActionPerformed(evt);
            }
        });

        jBtnLimparNOrdenados.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBtnLimparNOrdenados.setText("Limpar Não Ordenados");
        jBtnLimparNOrdenados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimparNOrdenadosActionPerformed(evt);
            }
        });

        jTFTitleNOrdenados.setEditable(false);

        jTFTitleBolha.setEditable(false);

        jTFTitleSelecao.setEditable(false);

        jTFTitleInsercao.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAnoNasc)
                    .addComponent(jLabelNome)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFAno, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jBtnLimparNOrdenados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnCadastrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnLimparInsercao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnLimparSelecao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnLimparBolha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnLimparAll, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnOrdenarInsercao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnOrdenarSelecao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnOrdenarBolha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnOrdenarAll, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTFTitleNOrdenados, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                            .addComponent(jLabelNOrdenados, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelOrdenadosSelecao, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jTFTitleSelecao)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFTitleBolha, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelOrdenadosBolha, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTFTitleInsercao, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelOrdenadosInsercao, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jLabelTitle)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabelNome))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabelTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNOrdenados)
                            .addComponent(jLabelOrdenadosBolha))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelOrdenadosSelecao)
                            .addComponent(jLabelOrdenadosInsercao, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFTitleSelecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFTitleInsercao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(jScrollPane4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFTitleNOrdenados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFTitleBolha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelAnoNasc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnCadastrar)
                        .addGap(27, 27, 27)
                        .addComponent(jBtnOrdenarAll)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnOrdenarBolha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnOrdenarSelecao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnOrdenarInsercao)
                        .addGap(27, 27, 27)
                        .addComponent(jBtnLimparNOrdenados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnLimparAll)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnLimparBolha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnLimparSelecao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnLimparInsercao)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCadastrarActionPerformed
        jBtnOrdenarAll.setEnabled(true);
        jBtnOrdenarBolha.setEnabled(true);
        jBtnOrdenarInsercao.setEnabled(true);
        jBtnOrdenarSelecao.setEnabled(true);
        if (inicia == 1) {
            jTANOrdenados.setText("");
            inicia = 0;
        }
        String nome = jTFNome.getText();
        String ano_nasc = jTFAno.getText();

        if (nome.isEmpty() && ano_nasc.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nome e Data de Nascimento não digitados.");
            return;
        } else if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nome não digitado. ");
            return;
        } else if (ano_nasc.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ano de Nascimento não digitado. ");
            return;
        }

        Random gerador = new Random();
        int matricula = 1000 + gerador.nextInt(50);
        int ano = Integer.parseInt(ano_nasc);

        Aluno a = new Aluno(matricula, nome, ano);
        jTANOrdenados.append(a.matricula + "\t" + a.nome + "\t" + a.ano + "\n");
        jTFNome.setText("");
        jTFAno.setText("");
        lista.add(a);
    }//GEN-LAST:event_jBtnCadastrarActionPerformed


    private void jBtnOrdenarAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOrdenarAllActionPerformed
        inicia = 1;
        Ordenacao.bolha(lista);
        for (int i = 0; i < lista.size(); i++) {
            jTAOrdenadosBolha.append(lista.get(i).matricula + "\t" + lista.get(i).nome + "\t" + lista.get(i).ano + "\n");;
        }
        Ordenacao.selecao(lista);
        for (int i = 0; i < lista.size(); i++) {
            jTAOrdenadosSelecao.append(lista.get(i).matricula + "\t" + lista.get(i).nome + "\t" + lista.get(i).ano + "\n");;
        }
        Ordenacao.insercao(lista);
        for (int i = 0; i < lista.size(); i++) {
            jTAOrdenadosInsercao.append(lista.get(i).matricula + "\t" + lista.get(i).nome + "\t" + lista.get(i).ano + "\n");;
        }
        jBtnOrdenarAll.setEnabled(false);
        jBtnOrdenarBolha.setEnabled(false);
        jBtnOrdenarInsercao.setEnabled(false);
        jBtnOrdenarSelecao.setEnabled(false);

    }//GEN-LAST:event_jBtnOrdenarAllActionPerformed

    private void jBtnOrdenarBolhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOrdenarBolhaActionPerformed
        inicia = 1;
        Ordenacao.bolha(lista);
        for (int i = 0; i < lista.size(); i++) {
            jTAOrdenadosBolha.append(lista.get(i).matricula + "\t" + lista.get(i).nome + "\t" + lista.get(i).ano + "\n");
        }
        jBtnOrdenarBolha.setEnabled(false);
        jBtnOrdenarAll.setEnabled(false);
    }//GEN-LAST:event_jBtnOrdenarBolhaActionPerformed

    private void jBtnOrdenarSelecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOrdenarSelecaoActionPerformed
        inicia = 1;
        Ordenacao.selecao(lista);
        for (int i = 0; i < lista.size(); i++) {
            jTAOrdenadosSelecao.append(lista.get(i).matricula + "\t" + lista.get(i).nome + "\t" + lista.get(i).ano + "\n");
        }
        jBtnOrdenarSelecao.setEnabled(false);
        jBtnOrdenarAll.setEnabled(false);
    }//GEN-LAST:event_jBtnOrdenarSelecaoActionPerformed

    private void jBtnOrdenarInsercaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOrdenarInsercaoActionPerformed
        inicia = 1;
        Ordenacao.insercao(lista);
        for (int i = 0; i < lista.size(); i++) {
            jTAOrdenadosInsercao.append(lista.get(i).matricula + "\t" + lista.get(i).nome + "\t" + lista.get(i).ano + "\n");
        }
        jBtnOrdenarInsercao.setEnabled(false);
        jBtnOrdenarAll.setEnabled(false);
    }//GEN-LAST:event_jBtnOrdenarInsercaoActionPerformed

    private void jBtnLimparAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimparAllActionPerformed
        lista.clear();
        jTANOrdenados.setText("");
        jTAOrdenadosBolha.setText("");
        jTAOrdenadosInsercao.setText("");
        jTAOrdenadosSelecao.setText("");
        jBtnOrdenarAll.setEnabled(false);
        jBtnOrdenarBolha.setEnabled(false);
        jBtnOrdenarInsercao.setEnabled(false);
        jBtnOrdenarSelecao.setEnabled(false);
    }//GEN-LAST:event_jBtnLimparAllActionPerformed

    private void jBtnLimparBolhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimparBolhaActionPerformed
        lista.clear();
        jTAOrdenadosBolha.setText("");
    }//GEN-LAST:event_jBtnLimparBolhaActionPerformed

    private void jBtnLimparSelecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimparSelecaoActionPerformed
        lista.clear();
        jTAOrdenadosSelecao.setText("");
    }//GEN-LAST:event_jBtnLimparSelecaoActionPerformed

    private void jBtnLimparInsercaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimparInsercaoActionPerformed
        lista.clear();
        jTAOrdenadosInsercao.setText("");
    }//GEN-LAST:event_jBtnLimparInsercaoActionPerformed

    private void jBtnLimparNOrdenadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimparNOrdenadosActionPerformed
        lista.clear();
        jTANOrdenados.setText("");
        jBtnOrdenarAll.setEnabled(true);
        jBtnOrdenarBolha.setEnabled(true);
        jBtnOrdenarInsercao.setEnabled(true);
        jBtnOrdenarSelecao.setEnabled(true);
        jBtnOrdenarAll.setEnabled(false);
        jBtnOrdenarBolha.setEnabled(false);
        jBtnOrdenarInsercao.setEnabled(false);
        jBtnOrdenarSelecao.setEnabled(false);
    }//GEN-LAST:event_jBtnLimparNOrdenadosActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    ArrayList<Aluno> lista = new ArrayList<>();
    int inicia = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCadastrar;
    private javax.swing.JButton jBtnLimparAll;
    private javax.swing.JButton jBtnLimparBolha;
    private javax.swing.JButton jBtnLimparInsercao;
    private javax.swing.JButton jBtnLimparNOrdenados;
    private javax.swing.JButton jBtnLimparSelecao;
    private javax.swing.JButton jBtnOrdenarAll;
    private javax.swing.JButton jBtnOrdenarBolha;
    private javax.swing.JButton jBtnOrdenarInsercao;
    private javax.swing.JButton jBtnOrdenarSelecao;
    private javax.swing.JLabel jLabelAnoNasc;
    private javax.swing.JLabel jLabelNOrdenados;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelOrdenadosBolha;
    private javax.swing.JLabel jLabelOrdenadosInsercao;
    private javax.swing.JLabel jLabelOrdenadosSelecao;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTANOrdenados;
    private javax.swing.JTextArea jTAOrdenadosBolha;
    private javax.swing.JTextArea jTAOrdenadosInsercao;
    private javax.swing.JTextArea jTAOrdenadosSelecao;
    private javax.swing.JTextField jTFAno;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFTitleBolha;
    private javax.swing.JTextField jTFTitleInsercao;
    private javax.swing.JTextField jTFTitleNOrdenados;
    private javax.swing.JTextField jTFTitleSelecao;
    // End of variables declaration//GEN-END:variables
}
