/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import Main.Login;
import Main.TampilanUtama;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author adham
 */
public class Akun {
    private String username;
    private String password;
    private String nama;
    private String gender;
    private String jabatan;
    
    public Akun(String username, String password, String nama, String gender, String jabatan){
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.gender = gender;
        this.jabatan = jabatan;
    }
    
    public String getUsername(){
        return this.username;
    }    
    
    public String getPassword(){
        return this.password;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public String getGender(){
        return this.gender;
    }
    
    public String getJabatan(){
        return this.jabatan;
    }
    
    public void createAkun(){
        try {
            String query = "INSERT INTO akun (Username, Password, Nama, Gender, Jabatan) VALUES (?, ?, ?, ?, ?)";
            Database.preparedStatement = Database.connection.prepareStatement(query);
            Database.preparedStatement.setString(1, this.getUsername());
            Database.preparedStatement.setString(2, this.getPassword());
            Database.preparedStatement.setString(3, this.getNama());
            Database.preparedStatement.setString(4, this.getGender());
            Database.preparedStatement.setString(5, this.getJabatan());
            
            int rowsAffected = Database.preparedStatement.executeUpdate();
            
            if (rowsAffected > 0){
                JOptionPane.showMessageDialog(null, "Berhasil membuat data");
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal membuat data " + e.getMessage());
        }
    }
    
    public void checkAkun(){
       try {
            String query = "SELECT * FROM akun WHERE Username = ? AND Password = ?";
            Database.preparedStatement = Database.connection.prepareStatement(query);
            Database.preparedStatement.setString(1, this.getUsername());
            Database.preparedStatement.setString(2, this.getPassword());

            Database.resultSet = Database.preparedStatement.executeQuery();

            if (Database.resultSet.next()){
                JOptionPane.showMessageDialog(null, "Berhasil Login");
                TampilanUtama manajer = new TampilanUtama();
                manajer.setVisible(true);
                manajer.pack();
                manajer.setLocationRelativeTo(null);
                manajer.setDefaultCloseOperation(TampilanUtama.EXIT_ON_CLOSE);
            } else {
                JOptionPane.showMessageDialog(null, "Gagal Login");
                Login login = new Login();
                login.setVisible(true);
                login.pack();
                login.setLocationRelativeTo(null);
                login.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal Login " + e.getMessage());
        }
       }
}
