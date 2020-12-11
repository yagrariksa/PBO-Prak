package com.test;

public class DoraMini implements Robot,Doraemon {

    private String nama;
    private String pemilik;
    private int tahun;

    @Override
    public void sayDora() {
        System.out.println("Halo, Saya Dora Mini");
    }

    @Override
    public void displayKantongAjaib() {
        System.out.println("Saya juga seperti Doraemon yang memiliki kantung ajaib");
    }

    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public void setTahunPembuatan(int tahun) {
        this.tahun = tahun;
    }

    @Override
    public void displayData() {
        System.out.println("Nama Robot : " + this.nama);
        System.out.println("Nama Pemilik : " + this.pemilik);
        System.out.println("Tahun : " + this.tahun);
    }

    public String getPemilik() {
        return pemilik;
    }

    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }
}
