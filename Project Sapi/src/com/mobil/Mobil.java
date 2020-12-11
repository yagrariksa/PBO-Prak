package com.mobil;

import java.util.ArrayList;
import java.util.Random;

public class Mobil {

    int kilometer;
    String jenis;
    Boolean rusak;

    public Mobil(String jenis) {
        this.jenis = jenis;
        this.rusak = false;
        this.kilometer = 0;
    }

    public void celaka(Mobil mobil){
        switch (mobil.jenis){
            case "toyota":
                mobil.rusak = prob(5);
                if (mobil.rusak){
                    System.out.println("toyota kecelakaan");
                }
                break;
            case "honda":
                mobil.rusak = prob(2);
                if (mobil.rusak) {
                    System.out.println("honda kecelakaan");
                }
                break;
            case "lambo":
                mobil.rusak = prob(1);
                if (mobil.rusak){
                    System.out.println("lambo kecelakaan");
                }break;
        }
    }

    public void tahun(Mobil mobil){
        if (!mobil.rusak) {
            Random rn = new Random();
            int keluarberapakali = rn.nextInt(5);
//        0 .. bound-1
//        bound : 51 ( 0,1 .. 49,50)
            for (int i = 0; i < keluarberapakali; i++) {
                if(!mobil.rusak) {
                    mobil.keluar(mobil);
                }
            }
        }
    }

    public void keluar(Mobil mobil){
        mobil.cekrusak(mobil);
        mobil.celaka(mobil);
        if(!mobil.rusak) {

            Random rn = new Random();
            mobil.kilometer += rn.nextInt(100);
        }
    }

    public void cekrusak(Mobil mobil){

        if (!mobil.rusak){
            switch (mobil.jenis){
                case "toyota":
                    if (mobil.kilometer == 200) mobil.rusak = true;
                    if (mobil.rusak) {
                        System.out.println("toyota limit");
                    }
                    break;
                case "honda":
                    if (mobil.kilometer == 300) mobil.rusak = true;
                    if (mobil.rusak) {
                        System.out.println("honda limit"); }
                    break;
                case "lambo":
                    if (mobil.kilometer == 400) mobil.rusak = true;
                    if (mobil.rusak) {
                        System.out.println("lambo limit"); }
                    break;
            }
        }

    }

    public static Boolean prob(int peluang){

        int hasil = probangka();
        System.out.println(hasil +":"+ peluang);
        if (hasil < peluang){
            return true;
        }else {
            return false;
        }
    }

    public static int probangka() {
        Random rn = new Random();
        int hasil = rn.nextInt(10);
//        0->9 ,, 0.5 : 5
        return hasil;
    }

    public static ArrayList<Mobil> garasi(String jenis, int jumlah){
        ArrayList<Mobil> garasi = new ArrayList<>();
        for(int i = 0; i<jumlah;i++){
            Mobil mobil = new Mobil(jenis);
            garasi.add(mobil);
        }

        return garasi;
    }
}
