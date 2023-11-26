/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import Database.Database;
import static Database.Database.connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adham
 */
public class LaporanKehadiranKaryawan extends javax.swing.JFrame {

    /**
     * Creates new form LaporanKehadiranKaryawan
     */
    public LaporanKehadiranKaryawan() {
        initComponents();
        Database.connect();
        table();
    }
    
    public void table(){
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("ID Laporan");
        table.addColumn("Nama Karyawan");
        table.addColumn("Tanggal");
        table.addColumn("Status Kehadiran");
//        table.addColumn("Jam Keluar");
        
        try {
            Statement statement = connection.createStatement();;
            ResultSet resulset = statement.executeQuery("SELECT * FROM laporan_kehadiran");
            
            while(resulset.next()){
                table.addRow(new Object[] {
                    resulset.getString("id_laporan"),
                    resulset.getString("nama_karyawan"),
                    resulset.getString("tanggal"),
                    resulset.getString("status_kehadiran"),
//                    resulset.getString("jam_keluar")
                });
                TabelKehadiran.setModel(table);
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Koneksi gagal! " + e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JadwalShiftButton = new javax.swing.JButton();
        LKehadiranButton = new javax.swing.JButton();
        KeluarButton = new javax.swing.JButton();
        Tabel = new javax.swing.JScrollPane();
        TabelKehadiran = new javax.swing.JTable();
        HomeButton = new javax.swing.JButton();
        Karyawan = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        KeluarButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        KeluarButton.setText("Keluar");
        KeluarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(KeluarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 150, 30));

        Tabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        TabelKehadiran.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TabelKehadiran.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Laporan", "Nama Karyawan", "Tanggal", "Keterangan"
            }
        ));
        Tabel.setViewportView(TabelKehadiran);

        getContentPane().add(Tabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 440, 310));

        HomeButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        HomeButton.setText("Home");
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(HomeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 150, 30));

        Karyawan.setFont(new java.awt.Font("Montserrat", 0, 36)); // NOI18N
        Karyawan.setText("Karyawan");
        getContentPane().add(Karyawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 165, 160, 40));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/TampilanLain.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JadwalShiftButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JadwalShiftButtonActionPerformed
        JadwalShiftKaryawan tampilanutama = new JadwalShiftKaryawan();
        tampilanutama.setVisible(true);
        tampilanutama.pack();
        tampilanutama.setLocationRelativeTo(null);
        tampilanutama.setDefaultCloseOperation(JadwalShiftKaryawan.EXIT_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_JadwalShiftButtonActionPerformed

    private void LKehadiranButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LKehadiranButtonActionPerformed
        LaporanKehadiranKaryawan tampilanutama = new LaporanKehadiranKaryawan();
        tampilanutama.setVisible(true);
        tampilanutama.pack();
        tampilanutama.setLocationRelativeTo(null);
        tampilanutama.setDefaultCloseOperation(LaporanKehadiranKaryawan.EXIT_ON_CLOSE);
        dispose();
        table();
    }//GEN-LAST:event_LKehadiranButtonActionPerformed

    private void KeluarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarButtonActionPerformed
        Login tampilanutama = new Login();
        tampilanutama.setVisible(true);
        tampilanutama.pack();
        tampilanutama.setLocationRelativeTo(null);
        tampilanutama.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_KeluarButtonActionPerformed

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        TampilanUtamaKaryawan tampilanutama = new TampilanUtamaKaryawan();
        tampilanutama.setVisible(true);
        tampilanutama.pack();
        tampilanutama.setLocationRelativeTo(null);
        tampilanutama.setDefaultCloseOperation(TampilanUtamaKaryawan.EXIT_ON_CLOSE);
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
            java.util.logging.Logger.getLogger(LaporanKehadiranKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LaporanKehadiranKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LaporanKehadiranKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LaporanKehadiranKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LaporanKehadiranKaryawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton HomeButton;
    private javax.swing.JButton JadwalShiftButton;
    private javax.swing.JLabel Karyawan;
    private javax.swing.JButton KeluarButton;
    private javax.swing.JButton LKehadiranButton;
    private javax.swing.JScrollPane Tabel;
    private javax.swing.JTable TabelKehadiran;
    // End of variables declaration//GEN-END:variables
}
