/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import Main.LaporanKehadiran;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author adham
 */
public class TanpaKeterangan extends Kehadiran{
    private final String pesan_peringatan;
    
    public TanpaKeterangan(String username, String id_laporan, String nama_karyawan, String tanggal, String status_kehadiran, String pesan_peringatan){
        super(username, id_laporan, nama_karyawan, tanggal, status_kehadiran);
        this.pesan_peringatan = pesan_peringatan;
    }
    
    public String getPesanPeringatan(){
        return this.pesan_peringatan;
    }
    
    @Override
    public void createKehadiran(){
        try {
            String query = "INSERT INTO tanpa_keterangan (Pesan_Peringatan) VALUES (?)";
            Database.preparedStatement = Database.connection.prepareStatement(query);
            Database.preparedStatement.setString(1, this.getPesanPeringatan());
            Database.preparedStatement.executeUpdate();
            
            int rowsAffected = Database.preparedStatement.executeUpdate();
            
            if (rowsAffected > 0){
            }
        } catch (SQLException ex) {
        }
    }
    
    @Override
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
