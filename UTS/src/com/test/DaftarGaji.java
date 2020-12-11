package com.test;

import java.util.ArrayList;

public class DaftarGaji {

    private ArrayList<Pegawai> listPegawai = new ArrayList<>();

    public DaftarGaji() { }

    public ArrayList<Pegawai> getListPegawai() {
        return listPegawai;
    }

    public void addPegawai(Pegawai pegawai) {
        this.listPegawai.add(pegawai);
    }

    public void printSemuaGaji(){
        for (Pegawai p:listPegawai) {
            System.out.println(p.getGaji());
        }
    }

    public void printSemuaPegawai(){
        for (Pegawai p:listPegawai) {
            System.out.println(p);
        }
    }
}
