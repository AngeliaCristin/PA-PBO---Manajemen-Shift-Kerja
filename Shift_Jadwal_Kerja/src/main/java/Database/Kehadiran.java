/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author adham
 */
public class Kehadiran {
    private String username;
    private String id_laporan;
    private String nama_karyawan;
    private String tanggal;
    private String status_kehadiran;
    
    public Kehadiran(String username, String id_laporan, String nama_karyawan, String tanggal, String status_kehadiran){
        this.username = username;
        this.id_laporan = id_laporan;
        this.nama_karyawan = nama_karyawan;
        this.tanggal = tanggal;
        this.status_kehadiran = status_kehadiran;
    }

    public Kehadiran(String akun_username, String id_laporan, String nama_karyawan, String tanggal, String status_kehadiran, String absensi) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public String getUsername(){
        return this.username;
    }
    
    public String getIDLaporan(){
        return this.id_laporan;
    }    
    
    public String getNamaKaryawan(){
        return this.nama_karyawan;
    }
    
    public String getTanggal(){
        return this.tanggal;
    }
    
    public String getStatusKehadiran(){
        return this.status_kehadiran;
    }
    
    public void createKehadiran(){
        try {
            String query = "INSERT INTO laporan_kehadiran (AKUN_Username, ID_Laporan, Nama_Karyawan, Tanggal, Status_Kehadiran) VALUES (?, ?, ?, ?, ?)";
            Database.preparedStatement = Database.connection.prepareStatement(query);
            Database.preparedStatement.setString(1, this.getUsername());
            Database.preparedStatement.setString(2, this.getIDLaporan());
            Database.preparedStatement.setString(3, this.getNamaKaryawan());
            Database.preparedStatement.setString(4, this.getTanggal());
            Database.preparedStatement.setString(5, this.getStatusKehadiran());
            
            int rowsAffected = Database.preparedStatement.executeUpdate();
            
            if (rowsAffected > 0){
                JOptionPane.showMessageDialog(null, "Berhasil membuat data");
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal membuat data " + e.getMessage());
        }
    }
    
    public void deleteKehadiran() {
        try {
            String query = "DELETE FROM laporan_kehadiran WHERE ID_Laporan = ?";
            Database.preparedStatement = Database.connection.prepareStatement(query);
            Database.preparedStatement.setString(1, this.getIDLaporan());

            int rowsAffected = Database.preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Berhasil menghapus data");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal menghapus data " + e.getMessage());
        }
    }
}
