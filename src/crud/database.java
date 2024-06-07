/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author DarkHard
 */
public class database {
    private String databasename = "muhammad_maulana_sidiq_2210010175";
    private String username     = "root";
    private String password     = "";
    public static Connection connectionDB;
    
    public database (){
       try {
           String location = "jdbc:mysql://localhost/" + databasename;
           Class.forName("com.mysql.jdbc.Driver");
           connectionDB = DriverManager.getConnection(location, username, password);
           System.out.println("database terkoneksi");
       }
       catch (Exception e){
           System.out.println(e.getMessage());
       }
    }
    
    public void tambahuji(String nik, String nama, String telp, String alamat) {
        try {
            String sql = "insert into uji (nik, nama, telp, alamat) value(?, ?, ?, ?,)";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, nik);
            perintah.setString(2, nama);
            perintah.setString(3, telp);
            perintah.setString(4, alamat);
            
            perintah.executeUpdate();
            System.out.println("added");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahuji(String nik, String nama, String telp, String alamat){
        try {
            String sql = "update uji set nama = ?, telp = ?, alamat = ? where nik = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, nama);
            perintah.setString(2, telp);
            perintah.setString(3, alamat);
            perintah.setString(4, nik);
            
            perintah.executeUpdate();
            System.out.println("updated");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
            
    }
    
    public void hapusuji(String nik){
        try {
            String sql = "delete from uji where nik = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, nik);
            
            perintah.executeUpdate();
            System.out.println("deleted");
        }
        catch (Exception e){
             System.out.println("updated");
        }
    }
}