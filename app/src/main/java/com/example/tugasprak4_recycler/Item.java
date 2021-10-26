package com.example.tugasprak4_recycler;

public class Item {
    private String nama,keterangan,ukuran;
    private int logo;

    public Item(String nama, String keterangan, String ukuran, int logo) {
        this.nama = nama;
        this.keterangan = keterangan;
        this.ukuran = ukuran;
        this.logo = logo;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }
}
