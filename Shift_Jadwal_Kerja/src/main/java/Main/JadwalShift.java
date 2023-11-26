/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import Database.*;
import static Database.Database.connection;
import Database.Jadwal;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adham
 */
public class JadwalShift extends javax.swing.JFrame {

    /**
     * Creates new form JadwalShift
     */
    public JadwalShift() {
        initComponents();
        Database.connect();
        table();
    }

    public void table(){
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("ID Jadwal");
        table.addColumn("Nama Karyawan");
        table.addColumn("Tanggal");
        table.addColumn("Jam Masuk");
        table.addColumn("Jam Keluar");
        
        try {
            Statement statement = connection.createStatement();;
            ResultSet resulset = statement.executeQuery("SELECT * FROM jadwal_shift");
            
            while(resulset.next()){
                table.addRow(new Object[] {
                    resulset.getString("id_jadwal"),
                    resulset.getString("nama_karyawan"),
                    resulset.getString("tanggal"),
                    resulset.getString("jam_masuk"),
                    resulset.getString("jam_keluar")
                });
                TabelJadwal.setModel(table);
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Koneksi gagal! " + e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        KeluarButton = new javax.swing.JButton();
        JadwalShiftButton = new javax.swing.JButton();
        LKehadiranButton = new javax.swing.JButton();
        Tabel = new javax.swing.JScrollPane();
        TabelJadwal = new javax.swing.JTable();
        JamKeluar = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        Nama = new javax.swing.JLabel();
        Tanggal = new javax.swing.JLabel();
        JamKeluarBox = new javax.swing.JTextField();
        UsernameBox = new javax.swing.JTextField();
        IDJadwalBox = new javax.swing.JTextField();
        NamaBox = new javax.swing.JTextField();
        JamMasuk = new javax.swing.JLabel();
        TanggalBox = new javax.swing.JTextField();
        CreateButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        HomeButton = new javax.swing.JButton();
        IDJadwal = new javax.swing.JLabel();
        JamMasukBox = new javax.swing.JTextField();
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

        Tabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        TabelJadwal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TabelJadwal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Jadwal", "Nama Karyawan", "Tanggal", "Jam Masuk", "Jam Keluar"
            }
        ));
        Tabel.setViewportView(TabelJadwal);

        getContentPane().add(Tabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 440, 130));

        JamKeluar.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        JamKeluar.setText("Jam Keluar");
        getContentPane().add(JamKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, -1, -1));

        Username.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        Username.setText("Username");
        getContentPane().add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));

        Nama.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        Nama.setText("Nama");
        getContentPane().add(Nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));

        Tanggal.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        Tanggal.setText("Tanggal");
        getContentPane().add(Tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, -1, -1));

        JamKeluarBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(JamKeluarBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 200, 20));

        UsernameBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        UsernameBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameBoxActionPerformed(evt);
            }
        });
        getContentPane().add(UsernameBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 200, 20));

        IDJadwalBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(IDJadwalBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 200, 20));

        NamaBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(NamaBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 200, 20));

        JamMasuk.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        JamMasuk.setText("Jam Masuk");
        getContentPane().add(JamMasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, -1));

        TanggalBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(TanggalBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 200, 20));

        CreateButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CreateButton.setText("Create");
        CreateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreateButtonMouseClicked(evt);
            }
        });
        CreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CreateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, 70, -1));

        DeleteButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, 70, -1));

        UpdateButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(UpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, 70, -1));

        HomeButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        HomeButton.setText("Home");
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(HomeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 150, 30));

        IDJadwal.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        IDJadwal.setText("ID Jadwal");
        getContentPane().add(IDJadwal, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        JamMasukBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(JamMasukBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 200, 20));

        Manajer.setFont(new java.awt.Font("Montserrat", 0, 36)); // NOI18N
        Manajer.setText("Manajer");
        getContentPane().add(Manajer, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 165, 150, 40));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/TampilanLain.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void UsernameBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameBoxActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        String akun_username = UsernameBox.getText();
        String id_jadwal = IDJadwalBox.getText();
        String nama_karyawan = NamaBox.getText();
        String tanggal = TanggalBox.getText();
        String jam_masuk = JamMasukBox.getText();
        String jam_keluar = JamKeluarBox.getText();
        
        if (id_jadwal.equals("")){
            JOptionPane.showMessageDialog(null, "Data kosong");
        } else {
            Jadwal jadwal = new Jadwal(akun_username, id_jadwal, nama_karyawan, tanggal, jam_masuk, jam_keluar);
            jadwal.deleteJadwal();
            table();

            JadwalShift tampilanutama = new JadwalShift();
            tampilanutama.setVisible(true);
            tampilanutama.pack();
            tampilanutama.setLocationRelativeTo(null);
            tampilanutama.setDefaultCloseOperation(JadwalShift.EXIT_ON_CLOSE);
            dispose();
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        TampilanUtama tampilanutama = new TampilanUtama();
        tampilanutama.setVisible(true);
        tampilanutama.pack();
        tampilanutama.setLocationRelativeTo(null);
        tampilanutama.setDefaultCloseOperation(TampilanUtama.EXIT_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_HomeButtonActionPerformed

    private void CreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateButtonActionPerformed
        String akun_username = UsernameBox.getText();
        String id_jadwal = IDJadwalBox.getText();
        String nama_karyawan = NamaBox.getText();
        String tanggal = TanggalBox.getText();
        String jam_masuk = JamMasukBox.getText();
        String jam_keluar = JamKeluarBox.getText();
        
        if (akun_username.equals("") || id_jadwal.equals("") || nama_karyawan.equals("") || tanggal.equals("") || jam_masuk.equals("") || jam_keluar.equals("")){
            JOptionPane.showMessageDialog(null, "Data kosong");
        } else {
            Jadwal jadwal = new Jadwal(akun_username, id_jadwal, nama_karyawan, tanggal, jam_masuk, jam_keluar);
            jadwal.createJadwal();
            table();
            
            JadwalShift tampilanutama = new JadwalShift();
            tampilanutama.setVisible(true);
            tampilanutama.pack();
            tampilanutama.setLocationRelativeTo(null);
            tampilanutama.setDefaultCloseOperation(JadwalShift.EXIT_ON_CLOSE);
            dispose();
        }
    }//GEN-LAST:event_CreateButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        String akun_username = UsernameBox.getText();
        String id_jadwal = IDJadwalBox.getText();
        String nama_karyawan = NamaBox.getText();
        String tanggal = TanggalBox.getText();
        String jam_masuk = JamMasukBox.getText();
        String jam_keluar = JamKeluarBox.getText();
        
        if (id_jadwal.equals("") || nama_karyawan.equals("") || tanggal.equals("") || jam_masuk.equals("") || jam_keluar.equals("")){
            JOptionPane.showMessageDialog(null, "Data kosong");
        } else {
            Jadwal jadwal = new Jadwal(akun_username, id_jadwal, nama_karyawan, tanggal, jam_masuk, jam_keluar);
            jadwal.updateJadwal();
            table();
            
            JadwalShift tampilanutama = new JadwalShift();
            tampilanutama.setVisible(true);
            tampilanutama.pack();
            tampilanutama.setLocationRelativeTo(null);
            tampilanutama.setDefaultCloseOperation(JadwalShift.EXIT_ON_CLOSE);
            dispose();
        }
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void CreateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateButtonMouseClicked

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
            java.util.logging.Logger.getLogger(JadwalShift.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JadwalShift.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JadwalShift.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JadwalShift.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JadwalShift().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton CreateButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton HomeButton;
    private javax.swing.JLabel IDJadwal;
    private javax.swing.JTextField IDJadwalBox;
    private javax.swing.JButton JadwalShiftButton;
    private javax.swing.JLabel JamKeluar;
    private javax.swing.JTextField JamKeluarBox;
    private javax.swing.JLabel JamMasuk;
    private javax.swing.JTextField JamMasukBox;
    private javax.swing.JButton KeluarButton;
    private javax.swing.JButton LKehadiranButton;
    private javax.swing.JLabel Manajer;
    private javax.swing.JLabel Nama;
    private javax.swing.JTextField NamaBox;
    private javax.swing.JScrollPane Tabel;
    private javax.swing.JTable TabelJadwal;
    private javax.swing.JLabel Tanggal;
    private javax.swing.JTextField TanggalBox;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel Username;
    private javax.swing.JTextField UsernameBox;
    // End of variables declaration//GEN-END:variables
}
