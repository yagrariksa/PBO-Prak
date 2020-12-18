package com.soal3;

public class Eksekusi_D3 {

    public static void main(String[] args){

        Kelas_D3 eksekusi = new Kelas_D3(5);

        eksekusi.tampilD();

        int jml1 = eksekusi.hitungJumlah(1,2);
        System.out.println("penjumlahan 1+2 = " + jml1);

        int kali = eksekusi.hitungKali(2,3);
        System.out.println("Perkalian 2*3 = "+kali);

        int kurang = eksekusi.hitungKurang(5,3);
        System.out.println("Pengurangan 5-3 = "+kurang);
    }
}
