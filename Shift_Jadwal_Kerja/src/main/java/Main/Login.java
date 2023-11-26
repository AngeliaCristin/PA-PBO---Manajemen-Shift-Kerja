/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import Database.*;

import javax.swing.*;

/**
 *
 * @author adham
 */
public class Login extends javax.swing.JFrame {
    int xx, xy;
    
    public Login() {
        initComponents();
        Database.connect();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UsernameBox = new javax.swing.JTextField();
        PasswordBox = new javax.swing.JPasswordField();
        JabatanBox = new javax.swing.JComboBox<>();
        RegisterButton = new javax.swing.JButton();
        LoginButton = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UsernameBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        UsernameBox.setBorder(null);
        UsernameBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameBoxActionPerformed(evt);
            }
        });
        getContentPane().add(UsernameBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 185, 189, 20));

        PasswordBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        PasswordBox.setBorder(null);
        getContentPane().add(PasswordBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 189, 20));

        JabatanBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JabatanBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manajer", "Karyawan" }));
        JabatanBox.setToolTipText("");
        JabatanBox.setBorder(null);
        JabatanBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JabatanBoxActionPerformed(evt);
            }
        });
        getContentPane().add(JabatanBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 314, 189, 20));

        RegisterButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        RegisterButton.setText("Register");
        RegisterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterButtonMouseClicked(evt);
            }
        });
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });
        getContentPane().add(RegisterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, 90, 20));

        LoginButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LoginButton.setText("Login");
        LoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginButtonMouseClicked(evt);
            }
        });
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 150, 30));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login.png"))); // NOI18N
        Background.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BackgroundMouseDragged(evt);
            }
        });
        Background.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BackgroundMousePressed(evt);
            }
        });
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
        Register login = new Register();
        login.setVisible(true);
        login.pack();
        login.setLocationRelativeTo(null);
        login.setDefaultCloseOperation(Register.EXIT_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void BackgroundMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackgroundMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_BackgroundMousePressed

    private void BackgroundMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackgroundMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_BackgroundMouseDragged

    private void RegisterButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterButtonMouseClicked
        
    }//GEN-LAST:event_RegisterButtonMouseClicked

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        String username = UsernameBox.getText();
        String password = PasswordBox.getText();
        String jabatan = JabatanBox.getSelectedItem().toString();

        if (username.equals("") || password.equals("")){
            JOptionPane.showMessageDialog(null, "Username atau password kosong");
        } else {
            Akun akun = new Akun(username, password, "", "", jabatan);
            akun.checkAkun();
            if (akun.getNama() != null){
                if (akun.getJabatan().equals("Manajer")){
                    dispose();
                    
                } else {
                    TampilanUtamaKaryawan manajer = new TampilanUtamaKaryawan();
                    manajer.setVisible(true);
                    manajer.pack();
                    manajer.setLocationRelativeTo(null);
                    manajer.setDefaultCloseOperation(TampilanUtamaKaryawan.EXIT_ON_CLOSE);
                    dispose();
                }
            }
        }
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void LoginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseClicked
        
    }//GEN-LAST:event_LoginButtonMouseClicked

    private void JabatanBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JabatanBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JabatanBoxActionPerformed

    private void UsernameBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameBoxActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login login = new Login();
                login.setVisible(true);
                login.pack();
                login.setLocationRelativeTo(null);
                login.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JComboBox<String> JabatanBox;
    private javax.swing.JButton LoginButton;
    private javax.swing.JPasswordField PasswordBox;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JTextField UsernameBox;
    // End of variables declaration//GEN-END:variables
}
