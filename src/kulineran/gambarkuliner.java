/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kulineran;

/**
 *
 * @author HP
 */
public class gambarkuliner extends kuliner {
   
    private String gambar2;
    private String gambar3;
    private String gambar4;
    private String gambar5;

    // Constructor
    public gambarkuliner(int idDaerah, int idKategori, String namaKuliner, String deskripsi, String gambar, double longitude, double latitude, String gambar2, String gambar3, String gambar4, String gambar5) {
        super(idDaerah, idKategori, namaKuliner, deskripsi, gambar, longitude, latitude);
        this.gambar2 = gambar2;
        this.gambar3 = gambar3;
        this.gambar4 = gambar4;
        this.gambar5 = gambar5;
    }

    // Getters and Setters
    public String getGambar2() {
        return gambar2;
    }

    public void setGambar2(String gambar2) {
        this.gambar2 = gambar2;
    }

    public String getGambar3() {
        return gambar3;
    }

    public void setGambar3(String gambar3) {
        this.gambar3 = gambar3;
    }

    public String getGambar4() {
        return gambar4;
    }

    public void setGambar4(String gambar4) {
        this.gambar4 = gambar4;
    }

    public String getGambar5() {
        return gambar5;
    }

    public void setGambar5(String gambar5) {
        this.gambar5 = gambar5;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\ngambar2: " + gambar2 +
               "\ngambar3: " + gambar3 +
               "\ngambar4: " + gambar4 +
               "\ngambar5: " + gambar5;
    }

}