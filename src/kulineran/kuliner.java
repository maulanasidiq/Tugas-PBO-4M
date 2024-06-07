/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kulineran;

/**
 *
 * @author HP
 */
public class kuliner {
    
    private int idDaerah;
    private int idKategori;
    private String namaKuliner;
    private String deskripsi;
    private String gambar;
    private double longitude;
    private double latitude;

    // Constructor
    public kuliner(int idDaerah, int idKategori, String namaKuliner, String deskripsi, String gambar, double longitude, double latitude) {
        this.idDaerah = idDaerah;
        this.idKategori = idKategori;
        this.namaKuliner = namaKuliner;
        this.deskripsi = deskripsi;
        this.gambar = gambar;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    // Getters and Setters
    public int getIdDaerah() {
        return idDaerah;
    }

    public void setIdDaerah(int idDaerah) {
        this.idDaerah = idDaerah;
    }

    public int getIdKategori() {
        return idKategori;
    }

    public void setIdKategori(int idKategori) {
        this.idKategori = idKategori;
    }

    public String getNamaKuliner() {
        return namaKuliner;
    }

    public void setNamaKuliner(String namaKuliner) {
        this.namaKuliner = namaKuliner;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return "kuliner:" + 
               "\nidDaerah: " + idDaerah +
               "\nidKategori: " + idKategori +
               "\nnamaKuliner: " + namaKuliner +
               "\ndeskripsi: " + deskripsi +
               "\ngambar: " + gambar +
               "\nlongitude: " + longitude +
               "\nlatitude: " + latitude;
    }

}