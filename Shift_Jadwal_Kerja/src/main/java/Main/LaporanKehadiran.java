/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import Database.Database;
import static Database.Database.connection;
import Database.Hadir;
import Database.Izin;
import Database.Kehadiran;
import Database.TanpaKeterangan;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adham
 */
public class LaporanKehadiran extends javax.swing.JFrame {

    /**
     * Creates new form LaporanKehadiran
     */
    public LaporanKehadiran() {
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
        KeluarButton = new javax.swing.JButton();
        LKehadiranButton = new javax.swing.JButton();
        Tabel = new javax.swing.JScrollPane();
        TabelKehadiran = new javax.swing.JTable();
        DeleteButton = new javax.swing.JButton();
        HomeButton = new javax.swing.JButton();
        Username = new javax.swing.JLabel();
        UsernameBox = new javax.swing.JTextField();
        IDLaporan = new javax.swing.JLabel();
        IDLaporanBox = new javax.swing.JTextField();
        Nama = new javax.swing.JLabel();
        NamaBox = new javax.swing.JTextField();
        StatusKehadiran = new javax.swing.JLabel();
        TanggalBox = new javax.swing.JTextField();
        Tanggal = new javax.swing.JLabel();
        StatusKehadiranBox = new javax.swing.JComboBox<>();
        CreateButton = new javax.swing.JButton();
        Manajer = new javax.swing.JLabel();
        Keterangan = new javax.swing.JLabel();
        KeteranganBox = new javax.swing.JTextField();
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

        KeluarButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        KeluarButton.setText("Keluar");
        KeluarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(KeluarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 150, 30));

        LKehadiranButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LKehadiranButton.setText("L. Kehadiran");
        LKehadiranButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LKehadiranButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LKehadiranButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 150, 30));

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
                "ID Laporan", "Nama Karyawan", "Tanggal", "Status Kehadiran"
            }
        ));
        Tabel.setViewportView(TabelKehadiran);

        getContentPane().add(Tabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 440, 130));

        DeleteButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 195, 70, -1));

        HomeButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        HomeButton.setText("Home");
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(HomeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 150, 30));

        Username.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        Username.setText("Username");
        getContentPane().add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));

        UsernameBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        UsernameBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameBoxActionPerformed(evt);
            }
        });
        getContentPane().add(UsernameBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 200, 20));

        IDLaporan.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        IDLaporan.setText("ID Laporan");
        getContentPane().add(IDLaporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        IDLaporanBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(IDLaporanBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 200, 20));

        Nama.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        Nama.setText("Nama");
        getContentPane().add(Nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));

        NamaBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(NamaBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 200, 20));

        StatusKehadiran.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        StatusKehadiran.setText("Status Kehadiran");
        getContentPane().add(StatusKehadiran, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, -1));

        TanggalBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(TanggalBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 200, 20));

        Tanggal.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        Tanggal.setText("Tanggal");
        getContentPane().add(Tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, -1, -1));

        StatusKehadiranBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        StatusKehadiranBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hadir", "Izin", "Tanpa Keterangan" }));
        StatusKehadiranBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusKehadiranBoxActionPerformed(evt);
            }
        });
        getContentPane().add(StatusKehadiranBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 200, 20));

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
        getContentPane().add(CreateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 245, 70, -1));

        Manajer.setFont(new java.awt.Font("Montserrat", 0, 36)); // NOI18N
        Manajer.setText("Manajer");
        getContentPane().add(Manajer, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 165, 150, 40));

        Keterangan.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        Keterangan.setText("Keterangan");
        getContentPane().add(Keterangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, -1, -1));

        KeteranganBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(KeteranganBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 200, 20));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/TampilanLain.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JadwalShiftButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JadwalShiftButtonActionPerformed
        JadwalShift tampilanutama = new JadwalShift();
        tampilanutama.setVisible(true);
        tampilanutama.pack();
        tampilanutama.setLocationRelativeTo(null);
        tampilanutama.setDefaultCloseOperation(JadwalShift.EXIT_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_JadwalShiftButtonActionPerformed

    private void KeluarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarButtonActionPerformed
        Login tampilanutama = new Login();
        tampilanutama.setVisible(true);
        tampilanutama.pack();
        tampilanutama.setLocationRelativeTo(null);
        tampilanutama.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_KeluarButtonActionPerformed

    private void LKehadiranButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LKehadiranButtonActionPerformed
        LaporanKehadiran tampilanutama = new LaporanKehadiran();
        tampilanutama.setVisible(true);
        tampilanutama.pack();
        tampilanutama.setLocationRelativeTo(null);
        tampilanutama.setDefaultCloseOperation(LaporanKehadiran.EXIT_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_LKehadiranButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        String akun_username = UsernameBox.getText();
        String id_laporan = IDLaporanBox.getText();
        String nama_karyawan = NamaBox.getText();
        String tanggal = TanggalBox.getText();
        String status_kehadiran = StatusKehadiranBox.getSelectedItem().toString();
        String absensi = KeteranganBox.getText();
        String lama_izin = KeteranganBox.getText();
        String pesan_peringatan = KeteranganBox.getText();
        
        if (id_laporan.equals("")){
            JOptionPane.showMessageDialog(null, "Data kosong");
        } else {
            Kehadiran kehadiran = new Kehadiran(akun_username, id_laporan, nama_karyawan, tanggal, status_kehadiran);
            kehadiran.deleteKehadiran();
            table();
            
            LaporanKehadiran tampilanutama = new LaporanKehadiran();
            tampilanutama.setVisible(true);
            tampilanutama.pack();
            tampilanutama.setLocationRelativeTo(null);
            tampilanutama.setDefaultCloseOperation(LaporanKehadiran.EXIT_ON_CLOSE);
            dispose();
            if (kehadiran.getStatusKehadiran().equals("Hadir")){
                Hadir hadir = new Hadir(akun_username, id_laporan, nama_karyawan, tanggal, status_kehadiran, absensi);
                hadir.deleteKehadiran();
            }
            if (kehadiran.getStatusKehadiran().equals("Izin")){
                Izin izin = new Izin(akun_username, id_laporan, nama_karyawan, tanggal, status_kehadiran, lama_izin);
                izin.deleteKehadiran();
            }
            if (kehadiran.getStatusKehadiran().equals("Tanpa Keterangan")){
                TanpaKeterangan tanpaketerangan = new TanpaKeterangan(akun_username, id_laporan, nama_karyawan, tanggal, status_kehadiran, pesan_peringatan);
                tanpaketerangan.deleteKehadiran();
            }
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

    private void UsernameBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameBoxActionPerformed

    private void CreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateButtonActionPerformed
        String akun_username = UsernameBox.getText();
        String id_laporan = IDLaporanBox.getText();
        String nama_karyawan = NamaBox.getText();
        String tanggal = TanggalBox.getText();
        String status_kehadiran = StatusKehadiranBox.getSelectedItem().toString();
        String absensi = KeteranganBox.getText();
        String lama_izin = KeteranganBox.getText();
        String pesan_peringatan = KeteranganBox.getText();
        
        if (akun_username.equals("") || id_laporan.equals("") || nama_karyawan.equals("") || tanggal.equals("")){
            JOptionPane.showMessageDialog(null, "Data kosong");
        } else {
            Kehadiran kehadiran = new Kehadiran(akun_username, id_laporan, nama_karyawan, tanggal, status_kehadiran);
            kehadiran.createKehadiran();
            table();
            
            LaporanKehadiran tampilanutama = new LaporanKehadiran();
            tampilanutama.setVisible(true);
            tampilanutama.pack();
            tampilanutama.setLocationRelativeTo(null);
            tampilanutama.setDefaultCloseOperation(LaporanKehadiran.EXIT_ON_CLOSE);
            dispose();
            if (kehadiran.getStatusKehadiran().equals("Hadir")){
                Hadir hadir = new Hadir(akun_username, id_laporan, nama_karyawan, tanggal, status_kehadiran, absensi);
                hadir.createKehadiran();
            }
            if (kehadiran.getStatusKehadiran().equals("Izin")){
                Izin izin = new Izin(akun_username, id_laporan, nama_karyawan, tanggal, status_kehadiran, lama_izin);
                izin.createKehadiran();
            }
            if (kehadiran.getStatusKehadiran().equals("Tanpa Keterangan")){
                TanpaKeterangan tanpaketerangan = new TanpaKeterangan(akun_username, id_laporan, nama_karyawan, tanggal, status_kehadiran, pesan_peringatan);
                tanpaketerangan.createKehadiran();
            }
    }
    }//GEN-LAST:event_CreateButtonActionPerformed

    private void StatusKehadiranBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusKehadiranBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StatusKehadiranBoxActionPerformed

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
            java.util.logging.Logger.getLogger(LaporanKehadiran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LaporanKehadiran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LaporanKehadiran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LaporanKehadiran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LaporanKehadiran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton CreateButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton HomeButton;
    private javax.swing.JLabel IDLaporan;
    private javax.swing.JTextField IDLaporanBox;
    private javax.swing.JButton JadwalShiftButton;
    private javax.swing.JButton KeluarButton;
    private javax.swing.JLabel Keterangan;
    private javax.swing.JTextField KeteranganBox;
    private javax.swing.JButton LKehadiranButton;
    private javax.swing.JLabel Manajer;
    private javax.swing.JLabel Nama;
    private javax.swing.JTextField NamaBox;
    private javax.swing.JLabel StatusKehadiran;
    private javax.swing.JComboBox<String> StatusKehadiranBox;
    private javax.swing.JScrollPane Tabel;
    private javax.swing.JTable TabelKehadiran;
    private javax.swing.JLabel Tanggal;
    private javax.swing.JTextField TanggalBox;
    private javax.swing.JLabel Username;
    private javax.swing.JTextField UsernameBox;
    // End of variables declaration//GEN-END:variables
}
