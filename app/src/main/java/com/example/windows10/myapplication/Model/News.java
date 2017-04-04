package com.example.windows10.myapplication.Model;

/**
 * Created by Windows 10 on 4/3/2017.
 */

public class News {

    private String namaInstansi;
    private String keterangan;

    public News(String namaInstansi, String keterangan) {
        this.namaInstansi = namaInstansi;
        this.keterangan = keterangan;
    }

    public String getNamaInstansi() {
        return namaInstansi;
    }

    public void setNamaInstansi(String namaInstansi) {
        this.namaInstansi = namaInstansi;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
}
