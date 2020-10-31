
import com.sun.glass.events.KeyEvent;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class chat extends javax.swing.JFrame {

    public chat() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        label1 = new javax.swing.JLabel();
        text_field_ip = new javax.swing.JTextField();
        label2 = new javax.swing.JLabel();
        text_field_nick = new javax.swing.JTextField();
        conectar = new javax.swing.JButton();
        scroll1 = new javax.swing.JScrollPane();
        text_area_users = new javax.swing.JTextArea();
        text_field_message = new javax.swing.JTextField();
        enviar = new javax.swing.JButton();
        scroll2 = new javax.swing.JScrollPane();
        text_area_chat = new javax.swing.JTextArea();
        label3 = new javax.swing.JLabel();
        text_field_port = new javax.swing.JTextField();
        label4 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        label1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        label1.setText("IP");

        text_field_ip.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        text_field_ip.setText("229.1.2.3");
        text_field_ip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_field_ipActionPerformed(evt);
            }
        });

        label2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        label2.setText("Nick");

        text_field_nick.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        text_field_nick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_field_nickActionPerformed(evt);
            }
        });

        conectar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        conectar.setText("Conectar");
        conectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectarActionPerformed(evt);
            }
        });

        text_area_users.setEditable(false);
        text_area_users.setColumns(20);
        text_area_users.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        text_area_users.setRows(5);
        scroll1.setViewportView(text_area_users);

        text_field_message.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        text_field_message.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text_field_messageKeyPressed(evt);
            }
        });

        enviar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        enviar.setText("Enviar");
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });

        text_area_chat.setEditable(false);
        text_area_chat.setColumns(20);
        text_area_chat.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        text_area_chat.setRows(5);
        scroll2.setViewportView(text_area_chat);

        label3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        label3.setText("Clientes");

        text_field_port.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        text_field_port.setText("1234");
        text_field_port.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_field_portActionPerformed(evt);
            }
        });

        label4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        label4.setText("Porta");

        label5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        label5.setText("Chat");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(text_field_message, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scroll1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(scroll2, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(label5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(label1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text_field_ip)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text_field_port, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text_field_nick, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(conectar)
                        .addGap(12, 12, 12))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1)
                    .addComponent(text_field_ip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2)
                    .addComponent(text_field_nick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conectar)
                    .addComponent(label4)
                    .addComponent(text_field_port, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label3)
                    .addComponent(label5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scroll1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scroll2, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_field_message, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enviar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        label3.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>                        

    MulticastSocket socket = null;
    List<String> client = new ArrayList<String>();

    private void connect(String ip, int port) {
        new Thread() {
            public void run() {
                try {
                    socket = new MulticastSocket(port);
                    socket.joinGroup(InetAddress.getByName(ip));

                    String message = "Conectado:" + text_field_nick.getText();

                    byte bfr[] = message.getBytes();
                    DatagramPacket pac = new DatagramPacket(bfr, bfr.length, InetAddress.getByName(ip), port);
                    socket.send(pac);

                    while (true) {
                        byte[] buffer = new byte[100];
                        DatagramPacket dp_package = new DatagramPacket(buffer, buffer.length);
                        socket.receive(dp_package);
                        buffer = dp_package.getData();
                        String msg = new String(buffer, 0, dp_package.getLength());
                        if (msg.startsWith("Conectado:")) {
                            text_field_message.setText("");

                            String[] split = msg.split("Conectado:");
                            client.remove(split[1]);

                            if (!client.contains(split[1])) {
                                client.add(split[1]);
                            }

                        } else {
                            text_area_chat.append(msg + "\n");
                        }

                    }
                } catch (SocketException ex) {

                } catch (IOException ex) {

                }
            }
        }.start();

    }
    private void conectarActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String ip = text_field_ip.getText();
        String port = text_field_port.getText();

        connect(ip, Integer.parseInt(port));

        String message = "Conectado:" + text_field_nick.getText();
        
        String nome = text_field_nick.getText();

        text_area_users.append(nome + "\n");
                            
        byte bfr[] = message.getBytes();
        DatagramPacket pac;
        try {
            byte buffer[] = message.getBytes();
            DatagramPacket dp_package = new DatagramPacket(buffer, buffer.length, InetAddress.getByName(ip), Integer.parseInt(port));
        } catch (UnknownHostException ex) {
            Logger.getLogger(chat.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(chat.class.getName()).log(Level.SEVERE, null, ex);
        }

    }                                        

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {                                       
        String message = text_field_nick.getText() + ": " + text_field_message.getText();
        String ip = text_field_ip.getText();
        String port = text_field_port.getText();
        text_field_message.setText("");

        try {
            byte buffer[] = message.getBytes();
            DatagramPacket dp_package = new DatagramPacket(buffer, buffer.length, InetAddress.getByName(ip), Integer.parseInt(port));

            socket.send(dp_package);
        } catch (UnknownHostException ex) {
            Logger.getLogger(chat.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(chat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                      

    private void text_field_messageKeyPressed(java.awt.event.KeyEvent evt) {                                              
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            String message = text_field_nick.getText() + ": " + text_field_message.getText();
            String ip = text_field_ip.getText();
            String port = text_field_port.getText();
            text_field_message.setText("");

            try {
                MulticastSocket socket = new MulticastSocket();

                byte buffer[] = message.getBytes();
                DatagramPacket dp_package = new DatagramPacket(buffer, buffer.length, InetAddress.getByName(ip), Integer.parseInt(port));

                socket.send(dp_package);
            } catch (SocketException ex) {

            } catch (UnknownHostException ex) {

            } catch (IOException ex) {

            }
        }
    }                                             

    private void formWindowClosing(java.awt.event.WindowEvent evt) {                                   
        String message = text_field_nick.getText() + " Saiu.";
        String ip = text_field_ip.getText();
        String port = text_field_port.getText();
        text_field_message.setText("");

        try {
            MulticastSocket socket = new MulticastSocket();

            byte buffer[] = message.getBytes();
            DatagramPacket dp_package = new DatagramPacket(buffer, buffer.length, InetAddress.getByName(ip), Integer.parseInt(port));

            socket.send(dp_package);
        } catch (SocketException ex) {

        } catch (UnknownHostException ex) {

        } catch (IOException ex) {

        }
    }                                  

    private void text_field_portActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void text_field_nickActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void text_field_ipActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

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
            java.util.logging.Logger.getLogger(chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new chat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton conectar;
    private javax.swing.JButton enviar;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JScrollPane scroll1;
    private javax.swing.JScrollPane scroll2;
    public javax.swing.JTextArea text_area_chat;
    private javax.swing.JTextArea text_area_users;
    private javax.swing.JTextField text_field_ip;
    private javax.swing.JTextField text_field_message;
    private javax.swing.JTextField text_field_nick;
    private javax.swing.JTextField text_field_port;
    // End of variables declaration                   
}
