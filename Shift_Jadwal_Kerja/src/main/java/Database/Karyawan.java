/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import Main.Login;
import java.sql.SQLException;

/**
 *
 * @author adham
 */
public class Karyawan extends Akun{
    private final String posisi;
    
    public Karyawan(String username, String password, String nama, String gender, String jabatan, String posisi){
        super(username, password, nama, gender, jabatan);
        this.posisi = posisi;
    }
    
    public String getPosisi(){
        return this.posisi;
    }
    
    @Override
    public void createAkun(){
        try {
            String query = "INSERT INTO karyawan (Username, Posisi) VALUES (?, ?)";
            Database.preparedStatement = Database.connection.prepareStatement(query);
            Database.preparedStatement.setString(1, this.getUsername());
            Database.preparedStatement.setString(2, this.getPosisi());
            Database.preparedStatement.executeUpdate();
            
            int rowsAffected = Database.preparedStatement.executeUpdate();
            
            if (rowsAffected > 0){
            }
        } catch (SQLException ex) {
            Login login = new Login();
            login.setVisible(true);
            login.pack();
            login.setLocationRelativeTo(null);
            login.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
        }
    }
}
