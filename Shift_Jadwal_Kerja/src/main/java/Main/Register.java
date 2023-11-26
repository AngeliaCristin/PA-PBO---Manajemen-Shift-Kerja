/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import Database.*;
import javax.swing.JOptionPane;

/**
 *
 * @author adham
 */
public class Register extends javax.swing.JFrame {
    int xx, xy;
    
    public Register() {
        initComponents();
        Database.connect();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegisterButton = new javax.swing.JButton();
        UsernameBox = new javax.swing.JTextField();
        JabatanBox = new javax.swing.JComboBox<>();
        NamaBox = new javax.swing.JTextField();
        PosisiBox = new javax.swing.JComboBox<>();
        GenderBox = new javax.swing.JComboBox<>();
        PasswordBox = new javax.swing.JPasswordField();
        BackButton = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RegisterButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
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
        getContentPane().add(RegisterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 150, 30));

        UsernameBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        UsernameBox.setBorder(null);
        getContentPane().add(UsernameBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 185, 116, 20));

        JabatanBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JabatanBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Karyawan" }));
        JabatanBox.setToolTipText("");
        JabatanBox.setBorder(null);
        JabatanBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JabatanBoxActionPerformed(evt);
            }
        });
        getContentPane().add(JabatanBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 185, 116, 20));

        NamaBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        NamaBox.setBorder(null);
        getContentPane().add(NamaBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 250, 116, 20));

        PosisiBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        PosisiBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pelayan", "Kasir", "Chef" }));
        PosisiBox.setToolTipText("");
        PosisiBox.setBorder(null);
        PosisiBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PosisiBoxActionPerformed(evt);
            }
        });
        getContentPane().add(PosisiBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 250, 116, 20));

        GenderBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        GenderBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-Laki", "Perempuan" }));
        GenderBox.setToolTipText("");
        GenderBox.setBorder(null);
        GenderBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderBoxActionPerformed(evt);
            }
        });
        getContentPane().add(GenderBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 314, 116, 20));

        PasswordBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        PasswordBox.setBorder(null);
        getContentPane().add(PasswordBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 314, 116, 20));

        BackButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 7, 75, 20));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Register.png"))); // NOI18N
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
        String username = UsernameBox.getText();
        String password = PasswordBox.getText();
        String nama = NamaBox.getText();
        String gender = GenderBox.getSelectedItem().toString();
        String jabatan = JabatanBox.getSelectedItem().toString();
        String posisi = PosisiBox.getSelectedItem().toString();
        
        if (username.equals("") || password.equals("") || nama.equals("")){
            JOptionPane.showMessageDialog(null, "Data kosong");
        } else {
            Akun akun = new Akun(username, password, nama, gender, jabatan);
            akun.createAkun();

            Karyawan karyawan = new Karyawan(username, password, nama, gender, jabatan, posisi);
            karyawan.createAkun();
            dispose();
        }
    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void JabatanBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JabatanBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JabatanBoxActionPerformed

    private void PosisiBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PosisiBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PosisiBoxActionPerformed

    private void GenderBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderBoxActionPerformed

    private void BackgroundMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackgroundMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_BackgroundMousePressed

    private void BackgroundMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackgroundMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_BackgroundMouseDragged

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        Login register = new Login();
        register.setVisible(true);
        register.pack();
        register.setLocationRelativeTo(null);
        register.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void RegisterButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterButtonMouseClicked
//        
    }//GEN-LAST:event_RegisterButtonMouseClicked

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel Background;
    private javax.swing.JComboBox<String> GenderBox;
    private javax.swing.JComboBox<String> JabatanBox;
    private javax.swing.JTextField NamaBox;
    private javax.swing.JPasswordField PasswordBox;
    private javax.swing.JComboBox<String> PosisiBox;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JTextField UsernameBox;
    // End of variables declaration//GEN-END:variables
}
