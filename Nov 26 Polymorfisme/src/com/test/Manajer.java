package com.test;

public class Manajer extends Pegawai {

    protected int tunjangan;

    Manajer(String nama, int gaji, int tunjangan) {
        super(nama, gaji);
        this.tunjangan = tunjangan;
    }

    @Override
    public int infoGaji() {
        return super.infoGaji();
    }

    public int infoTunjangan() {
        return tunjangan;
    }
}
