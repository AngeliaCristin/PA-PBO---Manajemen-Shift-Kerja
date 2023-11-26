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
public class Jadwal {
    private String username;
    private String id_jadwal;
    private String nama_karyawan;
    private String tanggal;
    private String jam_masuk;
    private String jam_keluar;
    
    public Jadwal(String username, String id_jadwal, String nama_karyawan, String tanggal, String jam_masuk, String jam_keluar){
        this.username = username;
        this.id_jadwal = id_jadwal;
        this.nama_karyawan = nama_karyawan;
        this.tanggal = tanggal;
        this.jam_masuk = jam_masuk;
        this.jam_keluar = jam_keluar;
    }
    
    public String getUsername(){
        return this.username;
    }
    
    public String getIDJadwal(){
        return this.id_jadwal;
    }    
    
    public String getNamaKaryawan(){
        return this.nama_karyawan;
    }
    
    public String getTanggal(){
        return this.tanggal;
    }
    
    public String getJamMasuk(){
        return this.jam_masuk;
    }
    
    public String getJamKeluar(){
        return this.jam_keluar;
    }
    
    public void createJadwal(){
        try {
            String query = "INSERT INTO jadwal_shift (AKUN_Username, ID_Jadwal, Nama_Karyawan, Tanggal, Jam_Masuk, Jam_Keluar) VALUES (?, ?, ?, ?, ?, ?)";
            Database.preparedStatement = Database.connection.prepareStatement(query);
            Database.preparedStatement.setString(1, this.getUsername());
            Database.preparedStatement.setString(2, this.getIDJadwal());
            Database.preparedStatement.setString(3, this.getNamaKaryawan());
            Database.preparedStatement.setString(4, this.getTanggal());
            Database.preparedStatement.setString(5, this.getJamMasuk());
            Database.preparedStatement.setString(6, this.getJamKeluar());
            
            int rowsAffected = Database.preparedStatement.executeUpdate();
            
            if (rowsAffected > 0){
                JOptionPane.showMessageDialog(null, "Berhasil membuat data");
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal membuat data " + e.getMessage());
        }
    }

    public void deleteJadwal() {
        try {
            String query = "DELETE FROM jadwal_shift WHERE ID_Jadwal = ?";
            Database.preparedStatement = Database.connection.prepareStatement(query);
            Database.preparedStatement.setString(1, this.getIDJadwal());

            int rowsAffected = Database.preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Berhasil menghapus data");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal menghapus data " + e.getMessage());
        }
    }
    
    public final void updateJadwal(){
        try {
            String query = "UPDATE jadwal_shift SET Nama_Karyawan = ?, Tanggal = ?, Jam_Masuk = ?, Jam_Keluar = ? WHERE ID_Jadwal = ?";
            Database.preparedStatement = Database.connection.prepareStatement(query);
            Database.preparedStatement.setString(1, this.getNamaKaryawan());
            Database.preparedStatement.setString(2, this.getTanggal());
            Database.preparedStatement.setString(3, this.getJamMasuk());
            Database.preparedStatement.setString(4, this.getJamKeluar());
            Database.preparedStatement.setString(5, this.getIDJadwal());

            int rowsAffected = Database.preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Berhasil mengupdate data");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal mengupdate data " + e.getMessage());
        }
    }
}