/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author DarkHard
 */
public class kuliner {
    private String databasename = "2210010175";
    private String username     = "root";
    private String password     = "";
    public static Connection connectionDB;
    
    public kuliner (){
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
    
    public void tambahkategori_kuliner(String id_kategori, String nama_kategori) {
        try {
            String sql = "insert into kategori_kuliner (id_kategori, nama_kategori) value(?, ?)";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, id_kategori);
            perintah.setString(2, nama_kategori);
            
            perintah.executeUpdate();
            System.out.println("added");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahkategori_kuliner(String id_kategori, String nama_kategori){
        try {
            String sql = "update kategori_kuliner set nama_kategori = ? where id_kategori = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, nama_kategori);
            perintah.setString(2, id_kategori);
            
            perintah.executeUpdate();
            System.out.println("updated");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
            
    }
    
    public void hapuskategori_kuliner(String id_kategori){
        try {
            String sql = "delete from kategori_kuliner where id_kategori = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, id_kategori);
            
            perintah.executeUpdate();
            System.out.println("deleted");
        }
        catch (Exception e){
             System.out.println("updated");
        }
    } 
    
    public void carikategori_kuliner(String id_kategori){
        try {
            String sql = "SELECT * FROM kategori_kuliner WHERE id_kategori = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, id_kategori);
            ResultSet data = perintah.executeQuery();
            while(data.next()){
                System.out.println("id_kategori : " + data.getString("id_kategori"));
                System.out.println("nama_kategori : " + data.getString("nama_kategori"));
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
        
    public void datakategori_kuliner(){
        try {   
            Statement stmt = connectionDB.createStatement();
            ResultSet baris = stmt.executeQuery("SELECT * FROM kategori_kuliner ORDER BY id_kategori ASC");
            while(baris.next()){
                System.out.println(baris.getString("id_kategori") + "|"+
                        baris.getString("nama_kategori"));
            }
            
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
