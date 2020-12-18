package com.main;

public class Main {

    public static void main(String[] args) {

        Kelas_C1 eksekusi = new Kelas_C1(5);

        eksekusi.tampiBC();
        eksekusi.tampilConsNILAIB();

        System.out.println("Perkalian 3*5 = " +eksekusi.hitungKali(3,5));
    }
}
