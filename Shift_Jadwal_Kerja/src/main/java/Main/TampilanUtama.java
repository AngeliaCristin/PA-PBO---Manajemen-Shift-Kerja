/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

/**
 *
 * @author adham
 */
public class TampilanUtama extends javax.swing.JFrame {
    int xx, xy;
    
    public TampilanUtama() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        KeluarButton = new javax.swing.JButton();
        JadwalShiftButton = new javax.swing.JButton();
        LKehadiranButton = new javax.swing.JButton();
        HomeButton = new javax.swing.JButton();
        Manajer = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        KeluarButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        KeluarButton.setText("Keluar");
        KeluarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(KeluarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 150, 30));

        JadwalShiftButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        JadwalShiftButton.setText("Jadwal Shift");
        JadwalShiftButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JadwalShiftButtonActionPerformed(evt);
            }
        });
        getContentPane().add(JadwalShiftButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 150, 30));

        LKehadiranButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LKehadiranButton.setText("L. Kehadiran");
        LKehadiranButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LKehadiranButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LKehadiranButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 150, 30));

        HomeButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        HomeButton.setText("Home");
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(HomeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 150, 30));

        Manajer.setFont(new java.awt.Font("Montserrat", 0, 36)); // NOI18N
        Manajer.setText("Manajer");
        getContentPane().add(Manajer, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 165, 150, 40));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/TampilanUtama.png"))); // NOI18N
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
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackgroundMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackgroundMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_BackgroundMousePressed

    private void BackgroundMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackgroundMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_BackgroundMouseDragged

    private void KeluarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarButtonActionPerformed
        Login tampilanutama = new Login();
        tampilanutama.setVisible(true);
        tampilanutama.pack();
        tampilanutama.setLocationRelativeTo(null);
        tampilanutama.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_KeluarButtonActionPerformed

    private void JadwalShiftButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JadwalShiftButtonActionPerformed
        JadwalShift tampilanutama = new JadwalShift();
        tampilanutama.setVisible(true);
        tampilanutama.pack();
        tampilanutama.setLocationRelativeTo(null);
        tampilanutama.setDefaultCloseOperation(JadwalShift.EXIT_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_JadwalShiftButtonActionPerformed

    private void LKehadiranButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LKehadiranButtonActionPerformed
        LaporanKehadiran tampilanutama = new LaporanKehadiran();
        tampilanutama.setVisible(true);
        tampilanutama.pack();
        tampilanutama.setLocationRelativeTo(null);
        tampilanutama.setDefaultCloseOperation(LaporanKehadiran.EXIT_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_LKehadiranButtonActionPerformed

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        TampilanUtama tampilanutama = new TampilanUtama();
        tampilanutama.setVisible(true);
        tampilanutama.pack();
        tampilanutama.setLocationRelativeTo(null);
        tampilanutama.setDefaultCloseOperation(TampilanUtama.EXIT_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_HomeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TampilanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TampilanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TampilanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TampilanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TampilanUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton HomeButton;
    private javax.swing.JButton JadwalShiftButton;
    private javax.swing.JButton KeluarButton;
    private javax.swing.JButton LKehadiranButton;
    private javax.swing.JLabel Manajer;
    // End of variables declaration//GEN-END:variables
}
