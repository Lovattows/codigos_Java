import java.awt.event.KeyEvent;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class jogoFrutinha extends javax.swing.JFrame {

    public Set<Integer> pressed = new HashSet<>();

    JFrame frame;

    public jogoFrutinha() {
        initComponents();
        frame = this;
        new Thread() {
            public void run() {
                randomPositions();
            }
        }.start();

        new Thread() {
            public void run() {
                while (true) {
                    try {
                        check();
                        try {
                            sleep(10);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(jogoFrutinha.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } catch (Exception e) {
                        System.out.println("ERRO");
                    }
                }

            }
        }.start();
    }

    private void randomPositions() {
        Random random = new Random();
        jButton_fruta.setBounds(random.nextInt(this.getWidth() - 80), random.nextInt(this.getHeight() - 80), jButton_fruta.getWidth(), jButton_fruta.getHeight());
        jButton_player1.setBounds(random.nextInt(this.getWidth() - 80), random.nextInt(this.getHeight() - 80),
                jButton_player1.getWidth(), jButton_player1.getHeight());
        jButton_player2.setBounds(random.nextInt(this.getWidth() - 80), random.nextInt(this.getHeight() - 80),
                jButton_player2.getWidth(), jButton_player2.getHeight());
        JOptionPane.showMessageDialog(this, "PRONTO?");
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jButton_player1 = new javax.swing.JButton();
        jButton_player2 = new javax.swing.JButton();
        jButton_fruta = new javax.swing.JButton();
        jTextField_player1 = new javax.swing.JTextField();
        jTextField_player2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JOGO DA FRUTINHA");

        jButton_player1.setText("PLAYER1");
        jButton_player1.setFocusable(false);
        jButton_player2.setText("PLAYER2");
        jButton_player2.setFocusable(false);
        jButton_fruta.setBackground(new java.awt.Color(255, 204, 0));
        jButton_fruta.setText("@");
        jButton_fruta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton_frutaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jButton_frutaKeyReleased(evt);
            }
        });

        jTextField_player1.setEditable(false);
        jTextField_player1.setFocusable(false);

        jTextField_player2.setEditable(false);
        jTextField_player2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_player2.setFocusable(false);

        jLabel1.setText("← PLAYER 1");
        jLabel2.setText("PLAYER 2 →");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_player1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 404, Short.MAX_VALUE)
                        .addComponent(jTextField_player2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_player1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_player2)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(jButton_fruta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_player2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_player1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jButton_player2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButton_player1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                .addComponent(jButton_fruta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        jButton_player1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>                        

    public void check() {
        for (Integer c : pressed) {
            switch (c) {
                case KeyEvent.VK_UP:
                    new Thread() {
                        @Override
                        public void run() {
                            comandos.top(jButton_player2);
                        }
                    }.start();
                    break;
                case KeyEvent.VK_DOWN:
                    new Thread() {
                        @Override
                        public void run() {
                            comandos.down(jButton_player2, new_height);
                        }
                    }.start();
                    break;
                case KeyEvent.VK_LEFT:
                    new Thread() {
                        @Override
                        public void run() {
                            comandos.left(jButton_player2);
                        }
                    }.start();
                    break;
                case KeyEvent.VK_RIGHT:
                    new Thread() {
                        @Override
                        public void run() {
                            comandos.right(jButton_player2, new_width);
                        }
                    }.start();
                    break;
                case KeyEvent.VK_W:
                    new Thread() {
                        @Override
                        public void run() {
                            comandos.top(jButton_player1);
                        }
                    }.start();
                    break;
                case KeyEvent.VK_S:
                    new Thread() {
                        @Override
                        public void run() {
                            comandos.down(jButton_player1, new_height);
                        }
                    }.start();
                    break;
                case KeyEvent.VK_A:
                    new Thread() {
                        @Override
                        public void run() {
                            comandos.left(jButton_player1);
                        }
                    }.start();
                    break;
                case KeyEvent.VK_D:
                    new Thread() {
                        @Override
                        public void run() {
                            comandos.right(jButton_player1, new_width);
                        }
                    }.start();
                    break;
            }
        }
        if (comandos.done(jButton_fruta, jButton_player1)) {
            comandos.random(jButton_fruta, frame);
            pointsPlayer1++;
            jTextField_player1.setText("" + pointsPlayer1);
        }
        if (comandos.done(jButton_fruta, jButton_player2)) {
            comandos.random(jButton_fruta, frame);
            pointsPlayer2++;
            jTextField_player2.setText("" + pointsPlayer2);
        }
    }
    private void jButton_frutaKeyPressed(java.awt.event.KeyEvent evt) {                                         
        new_width = this.getWidth();
        new_height = this.getHeight();
        System.out.println(evt.getKeyCode() + ", " + evt.getKeyChar());
        synchronized (frame) {
            pressed.add(evt.getKeyCode());
        }
    }                                        

    private void jButton_frutaKeyReleased(java.awt.event.KeyEvent evt) {                                          
        synchronized (frame) {
            pressed.remove(evt.getKeyCode());
        }
    }                                         

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
            java.util.logging.Logger.getLogger(jogoFrutinha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jogoFrutinha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jogoFrutinha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jogoFrutinha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new jogoFrutinha().setVisible(true);
            }
        });
    }
    int new_width;
    int new_height;
    int pointsPlayer1 = 0;
    int pointsPlayer2 = 0;

    // Variables declaration - do not modify                     
    public javax.swing.JButton jButton_fruta;
    public javax.swing.JButton jButton_player1;
    public javax.swing.JButton jButton_player2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField_player1;
    private javax.swing.JTextField jTextField_player2;
    // End of variables declaration                   
}
