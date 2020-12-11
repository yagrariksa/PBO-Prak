package com.mobil;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMobil {

    public static void main(String[] args){
        // write your code here
        System.out.println("Hello World !");

//        Scanner sn = new Scanner(System.in);

//        System.out.print("Masukkan Tahun Siklus : ");
//        int siklus = sn.nextInt();
//
//        System.out.println("Siklus : " + siklus);

        ArrayList<Mobil> garasi = new ArrayList<>();

        garasi.addAll(Mobil.garasi("toyota", 5));
        garasi.addAll(Mobil.garasi("honda", 2));
        garasi.addAll(Mobil.garasi("lambo", 1));

        int i = 1;
        while (garasi.size() > 0){
            System.out.println("+++++++++");
            System.out.println("Tahun ke : " + i);
            for (int j = 0; j<garasi.size();j++){

                Mobil mobil = garasi.get(j);
                mobil.tahun(mobil);
            }
            garasi.removeIf(mobil -> mobil.rusak==true);
            i++;
            if (i%2 == 0){
                int jmltambah = Mobil.probangka();
                System.out.println("mobil bertambah : " + jmltambah);
                int mobil = Mobil.probangka();
                if (mobil>7){
                    garasi.addAll(Mobil.garasi("lambo", jmltambah));
                }else if (mobil>4){
                    garasi.addAll(Mobil.garasi("honda", jmltambah));
                }else {
                    garasi.addAll(Mobil.garasi("toyota", jmltambah));
                }
            }
            System.out.println("jumlah mobil : " + garasi.size());

        }

        // tiap tahun berapa kali keluar

        // tiap keluar ada kilometer

        // jika kilometer sudah 300 maka rusak

        // tiap keluar dia punya kemungkinan kecelakaan

        // tiap dua tahun beli mobil ya kemungkinan nya maksimal 10
    }

}
