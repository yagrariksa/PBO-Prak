package com.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        persiapan data dummy
        int baris = 3;
        int kolom = 4;

//        inisiasi isi array dummy
        ArrayList<ArrayList<Integer>> datadummy = new ArrayList<ArrayList<Integer>>();
        for (int i=0;i<baris;i++){
            ArrayList<Integer> isian = new ArrayList<>();
            for (int j=0;j<kolom;j++){
                isian.add(j);
            }
            datadummy.add(isian);
        }

        Matriks matriksdummy = new Matriks();
        matriksdummy.setMatriks(datadummy);

        System.out.println("MATRIKS DUMMY ==>");
        System.out.print(matriksdummy);
        System.out.println(">>======<<");

//        dibawah ini jika anda memasukkan data
//        menggunakan input dari log
        System.out.println("Menggunakan matriks jika menginput data dari LOG");

        Scanner scanner = new Scanner(System.in);
        System.out.print("masukkan banyak baris pada matriks = ");
        baris = scanner.nextInt();
        System.out.print("masukkan banyak kolom pada matriks = ");
        kolom = scanner.nextInt();

        Matriks data1 = new Matriks(baris,kolom);
        Matriks jumlah = Matriks.jumlah2Matriks(data1,data1);
        Matriks kurang = Matriks.kurang2Matriks(data1,data1);

        System.out.println(data1);
        System.out.println(jumlah);
        System.out.println(kurang);

    }
}
