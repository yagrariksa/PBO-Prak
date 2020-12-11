package com.test;

public class DoraMini extends Robot {
    @Override
    public void displayData() {
        System.out.println(
                        "nama : " + this.nama + '\n' +
                        "pemilik : " + this.pemilik + '\n' +
                        "tahun Pembuatan : " + this.tahun
        );
    }

    public void sayDora(){
        System.out.println("Halo, Saya Dora Mini");
    }

    public DoraMini(String nama, String pemilik, int tahunpembuatan) {
        this.setTahun(tahunpembuatan);
        this.setNama(nama);
        this.pemilik = pemilik;
    }
}
