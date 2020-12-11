package com.perbankan;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Nasabah> nasabah = new ArrayList<Nasabah>();
    private Integer jumlahNasabah;

    public Bank() {
    }

    public void tambahNasabah(String namaawal, String namaakhir){
        Nasabah baru = new Nasabah(namaawal,namaakhir);
        this.nasabah.add(baru);
    }

    public Integer getJumlahNasabah() {
        this.jumlahNasabah = this.nasabah.size();
        return jumlahNasabah;
    }

    public Nasabah getNasabah(Integer index) {
        return nasabah.get(index);
    }
}
