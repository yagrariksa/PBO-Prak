package com.soal2;

public class Eksekusi_C2 {

    public static void main(String[] args) {
        Kelas_C2 eksekusi = new Kelas_C2(3,2);

        eksekusi.tampiBC();

        eksekusi.tampilConsNILAIB();

        int kali = eksekusi.hitungKali(2,3);
        System.out.println("Perkalian 2*3 = "+kali);

        int kurang = eksekusi.hitungKurang(5,3);
        System.out.println("Pengurangan 5-3 = " + kurang);

    }
}
