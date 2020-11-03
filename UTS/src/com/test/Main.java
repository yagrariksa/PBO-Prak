package com.test;

public class Main {

    public static void main(String[] args) {

//        data dummy
        Staf putu = new Staf("123234345", "Putu Suputu", "Surabaya");
        Dosen dharmadi = new Dosen("567678789", "Dharmadi sudharmadi", "Sidoarjo");
        Staf kadek = new Staf("876765987","Kadek Sukadek","Gresik");
        DaftarGaji datamaster = new DaftarGaji();

//        mengatur kehadiran putu (5 kehadiran) dan Tarif Harian (100.000)
        putu.setJumlahKehadiran(5);y
        putu.setTARIF_HARIAN(100000);

//        mengatur jumlah sks Dharmadi (30 sks) dan Tarif per SKS (30.000)
        dharmadi.setJumlahSKS(30);
        dharmadi.setTARIF_SKS(30000);

//        mengatur kehadiran kadek (10 kehadiran) dan Tarif Harian (100.000)
        kadek.setJumlahKehadiran(10);
        kadek.setTARIF_HARIAN(100000);

        datamaster.addPegawai(putu);
        datamaster.addPegawai(dharmadi);
        datamaster.addPegawai(kadek);

        datamaster.printSemuaGaji();
        datamaster.printSemuaPegawai();

    }
}
