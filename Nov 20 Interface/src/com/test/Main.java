package com.test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner input = new Scanner (System.in);

        DoraMini doramini = new DoraMini();


        // Mengatur Nama Robot
        System.out.println("Masukkan nama robot : ");
        String b = input.next();
        doramini.setNama(b);

        // Mengatur Nama Pemilik Robot
        System.out.println("Masukkan nama pemilik : ");
        String a = input.next();
        doramini.setPemilik(a);

        // Mengatur tahun Pembuatan Robot
        System.out.println("Masukkan tahun pembuatan :");
        int c = input.nextInt();
        doramini.setTahunPembuatan(c);

        doramini.displayData();
        doramini.displayKantongAjaib();
        doramini.sayDora();

    }
}
