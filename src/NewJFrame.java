
import static java.lang.System.exit;
import java.security.MessageDigest;
import static java.util.Objects.hash;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ALE
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();

        BotonLogin.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DialogoLogin = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        Password3 = new javax.swing.JPasswordField();
        BotonLoginAceptar = new javax.swing.JButton();
        BotonLoginCancelar = new javax.swing.JButton();
        DialogoRegister = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Password1 = new javax.swing.JPasswordField();
        Password2 = new javax.swing.JPasswordField();
        BotonRegisterAceptar = new javax.swing.JButton();
        BotonRegisterCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        LabelRegistrado = new javax.swing.JLabel();
        LabelLogin = new javax.swing.JLabel();
        EstadoRegistrado = new javax.swing.JTextField();
        EstadoLogin = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        BotonLogin = new javax.swing.JButton();
        BotonRegister = new javax.swing.JButton();
        BotonExit = new javax.swing.JButton();

        DialogoLogin.setMinimumSize(new java.awt.Dimension(290, 190));

        jLabel4.setText("Password:");

        BotonLoginAceptar.setText("Aceptar");
        BotonLoginAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLoginAceptarActionPerformed(evt);
            }
        });

        BotonLoginCancelar.setText("Cancelar");
        BotonLoginCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLoginCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DialogoLoginLayout = new javax.swing.GroupLayout(DialogoLogin.getContentPane());
        DialogoLogin.getContentPane().setLayout(DialogoLoginLayout);
        DialogoLoginLayout.setHorizontalGroup(
            DialogoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogoLoginLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(DialogoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DialogoLoginLayout.createSequentialGroup()
                        .addComponent(BotonLoginAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonLoginCancelar))
                    .addGroup(DialogoLoginLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(Password3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        DialogoLoginLayout.setVerticalGroup(
            DialogoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogoLoginLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(DialogoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Password3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(DialogoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonLoginAceptar)
                    .addComponent(BotonLoginCancelar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        DialogoRegister.setMinimumSize(new java.awt.Dimension(290, 190));

        jLabel5.setText("Set Password:");

        jLabel6.setText("Repeat Password");

        Password2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Password2ActionPerformed(evt);
            }
        });

        BotonRegisterAceptar.setText("Aceptar");
        BotonRegisterAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegisterAceptarActionPerformed(evt);
            }
        });

        BotonRegisterCancelar.setText("Cancelar");
        BotonRegisterCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegisterCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DialogoRegisterLayout = new javax.swing.GroupLayout(DialogoRegister.getContentPane());
        DialogoRegister.getContentPane().setLayout(DialogoRegisterLayout);
        DialogoRegisterLayout.setHorizontalGroup(
            DialogoRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogoRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DialogoRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(DialogoRegisterLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(BotonRegisterAceptar)
                        .addGap(28, 28, 28)
                        .addComponent(BotonRegisterCancelar))
                    .addGroup(DialogoRegisterLayout.createSequentialGroup()
                        .addGroup(DialogoRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(24, 24, 24)
                        .addGroup(DialogoRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Password1)
                            .addComponent(Password2))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        DialogoRegisterLayout.setVerticalGroup(
            DialogoRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogoRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DialogoRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Password1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DialogoRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Password2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(DialogoRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonRegisterAceptar)
                    .addComponent(BotonRegisterCancelar))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Hecho por:");

        jLabel2.setText("Bisila Evelin Rodríguez Sosa");

        jLabel3.setText("Alejandro Suárez Ocampo");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado"));

        LabelRegistrado.setText("Registrado:");

        LabelLogin.setText("Login");

        EstadoRegistrado.setText("NO");

        EstadoLogin.setText("NO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelRegistrado)
                    .addComponent(LabelLogin))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EstadoRegistrado, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(EstadoLogin))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelRegistrado)
                    .addComponent(EstadoRegistrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelLogin)
                    .addComponent(EstadoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));

        BotonLogin.setText("Login");
        BotonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLoginActionPerformed(evt);
            }
        });

        BotonRegister.setText("Register");
        BotonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegisterActionPerformed(evt);
            }
        });

        BotonExit.setText("Exit");
        BotonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BotonLogin)
                        .addGap(18, 18, 18)
                        .addComponent(BotonRegister))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(BotonExit)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonLogin)
                    .addComponent(BotonRegister))
                .addGap(18, 18, 18)
                .addComponent(BotonExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))))
                .addGap(37, 37, 37)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLoginActionPerformed

        if (isLogin) {
            int retorno = JOptionPane.showConfirmDialog(null,
                    "¿Realmente desea hacer LogOut?",
                    "LogOut",
                    JOptionPane.YES_NO_OPTION);
            if (retorno == 0) {
                isLogin = false;
                BotonLogin.setText("LogIn");
                EstadoLogin.setText("NO");
            }
        } else {
            DialogoLogin.setVisible(true);
        }
    }//GEN-LAST:event_BotonLoginActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        int retorno = JOptionPane.showConfirmDialog(null,
                "¿Realmente desea salir?",
                "Salir",
                JOptionPane.YES_NO_OPTION);
        if (retorno == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void BotonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonExitActionPerformed

        int retorno = JOptionPane.showConfirmDialog(null,
                "¿Realmente desea salir?",
                "Salir",
                JOptionPane.YES_NO_OPTION);
        if (retorno == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_BotonExitActionPerformed

    private void BotonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegisterActionPerformed
        // TODO add your handling code here:
        DialogoRegister.setVisible(true);
    }//GEN-LAST:event_BotonRegisterActionPerformed

    private void BotonRegisterCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegisterCancelarActionPerformed
        // TODO add your handling code here:
        DialogoRegister.setVisible(false);
    }//GEN-LAST:event_BotonRegisterCancelarActionPerformed

    private void BotonRegisterAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegisterAceptarActionPerformed

        pass1 = encriptarMD5(String.valueOf(Password1.getPassword()));
        String pass2 = encriptarMD5(String.valueOf(Password2.getPassword()));
        Password1.setText(null);
        Password2.setText(null);
        if (!pass1.equals(pass2)) {
            JOptionPane.showMessageDialog(null, "Las Password son diferentes \nInténtelo de nuevo",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            System.out.println("Mostrando traza de encriptación: " + pass1);
            EstadoRegistrado.setText("SI");
            DialogoRegister.setVisible(false);
            BotonLogin.setEnabled(true);
        }
    }//GEN-LAST:event_BotonRegisterAceptarActionPerformed
    
    public String encriptarMD5(String password){
        String encryptedPass="";
        try {
            encryptedPass = String.valueOf(hash(password));
        }catch (Exception e) {
            throw new Error("Error: Al encriptar la password");
        }
        return encryptedPass;
    }

    private String hash(String clear) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] b = md.digest(clear.getBytes());
        int size = b.length;
        StringBuffer h = new StringBuffer(size);
        for (int i = 0; i < size; i++) {
            int u = b[i]&255;
            if (u<16) h.append("0"+Integer.toHexString(u));
            else h.append(Integer.toHexString(u));
        }
        return h.toString();
    } 
       
    private void Password2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Password2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Password2ActionPerformed

    private void BotonLoginCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLoginCancelarActionPerformed

        DialogoLogin.setVisible(false);
    }//GEN-LAST:event_BotonLoginCancelarActionPerformed

    private void BotonLoginAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLoginAceptarActionPerformed

        String pass3 = String.valueOf(Password3.getPassword());
        Password3.setText(null);
        if (pass3.equals(pass1)) {
            EstadoLogin.setText("SI");
            isLogin = true;
            DialogoLogin.setVisible(false);
            BotonLogin.setText("LogOut");
            BotonRegister.setEnabled(false);
        } else {
            aux--;
            if (aux == 0) {
                JOptionPane.showMessageDialog(null,
                    "Ha agotado el número máximo de intentos fallidos",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
                exit(0);
            }
            JOptionPane.showMessageDialog(null,
                    "La Password es incorrecta, inténtelo de nuevo\nLe quedan " + aux + " intentos",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            
        }
    }//GEN-LAST:event_BotonLoginAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonExit;
    private javax.swing.JButton BotonLogin;
    private javax.swing.JButton BotonLoginAceptar;
    private javax.swing.JButton BotonLoginCancelar;
    private javax.swing.JButton BotonRegister;
    private javax.swing.JButton BotonRegisterAceptar;
    private javax.swing.JButton BotonRegisterCancelar;
    private javax.swing.JDialog DialogoLogin;
    private javax.swing.JDialog DialogoRegister;
    private javax.swing.JTextField EstadoLogin;
    private javax.swing.JTextField EstadoRegistrado;
    private javax.swing.JLabel LabelLogin;
    private javax.swing.JLabel LabelRegistrado;
    private javax.swing.JPasswordField Password1;
    private javax.swing.JPasswordField Password2;
    private javax.swing.JPasswordField Password3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    private String pass1;
    private boolean isLogin = false;
    private int aux = 3;
}
