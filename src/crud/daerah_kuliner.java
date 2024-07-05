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
public class daerah_kuliner {
    private String databasename = "2210010175";
    private String username     = "root";
    private String password     = "";
    public static Connection connectionDB;
    
    public daerah_kuliner (){
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
    
    public void tambahdaerah_kuliner(String id_daerah, String nama_daerah) {
        try {
            String sql = "insert into daerah_kuliner (id_daerah, nama_daerah) value(?, ?)";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, id_daerah);
            perintah.setString(2, nama_daerah);
            
            perintah.executeUpdate();
            System.out.println("added");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahdaerah_kuliner(String id_daerah, String nama_daerah){
        try {
            String sql = "update daerah_kuliner set nama_daerah = ? where id_daerah = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, nama_daerah);
            perintah.setString(2, id_daerah);
            
            perintah.executeUpdate();
            System.out.println("updated");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
            
    }
    
    public void hapusdaerah_kuliner(String id_daerah){
        try {
            String sql = "delete from daerah_kuliner where id_daerah = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, id_daerah);
            
            perintah.executeUpdate();
            System.out.println("deleted");
        }
        catch (Exception e){
             System.out.println("updated");
        }
    }
    
    public void caridaerah_kuliner(String id_daerah){
        try {
            String sql = "SELECT * FROM daerah_kuliner WHERE id_daerah = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, id_daerah);
            ResultSet data = perintah.executeQuery();
            while(data.next()){
                System.out.println("id_daerah : " + data.getString("id_daerah"));
                System.out.println("nama_daerah : " + data.getString("nama_daerah"));
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
        
    public void datadaerah_kuliner(){
        try {   
            Statement stmt = connectionDB.createStatement();
            ResultSet baris = stmt.executeQuery("SELECT * FROM daerah_kuliner ORDER BY id_daerah ASC");
            while(baris.next()){
                System.out.println(baris.getString("id_daerah") + "|"+
                        baris.getString("nama_daerah"));
            }
            
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
