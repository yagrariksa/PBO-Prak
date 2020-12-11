package com.main;

import com.perbankan.*;

public class Main {

    public static void main(String[] args) {
        int tmp;
        boolean status;

        Nasabah nasabah = new Nasabah("Agus","Daryanto");

        System.out.println("Nasabah atas nama : " +
                nasabah.getNamaAwal() +  " "  +
                nasabah.getNamaAkhir());

        nasabah.setTabungan(new Tabungan(5000));

        tmp = nasabah.getTabungan().getSaldo();
        System.out.println("Saldo awal : " + tmp);

        nasabah.getTabungan().simpanUang(3000);
        System.out.println("Jumlah uang disimpan : 3000");

        status = nasabah.getTabungan().ambilUang(6000);
        System.out.print("Jumlah uang diambil : 6000");
        if (status) {
            System.out.println("  ok");
        }else {
            System.out.println("  gagal");
        }

        nasabah.getTabungan().simpanUang(3500);
        System.out.println("Jumlah uang disimpan : 3500");

        status = nasabah.getTabungan().ambilUang(4000);
        System.out.print("Jumlah uang yang diambil : 4000");
        if (status) {
            System.out.println("  ok");
        }else {
            System.out.println("  gagal");
        }

        status = nasabah.getTabungan().ambilUang(1600);
        System.out.print("Jumlah uang yang diambil : 1600");
        if (status) {
            System.out.println("  ok");
        }else {
            System.out.println("  gagal");
        }

        nasabah.getTabungan().simpanUang(2000);
        System.out.println("Jumlah uang disimpan : 2000");

        tmp = nasabah.getTabungan().getSaldo();
        System.out.println("Saldo sekarang : " + tmp);

        System.out.println("\n\n");
        Bank bank = new Bank();

        bank.tambahNasabah("Agus","Daryanto");
        bank.getNasabah(0).setTabungan(new Tabungan(5000));

        bank.tambahNasabah("Tuti","Irawan");
        bank.getNasabah(1).setTabungan(new Tabungan(7000));

        bank.tambahNasabah("Ani","Ratna");
        bank.getNasabah(2).setTabungan(new Tabungan(4000));

        bank.tambahNasabah("Bambang","Darmawan");
        bank.getNasabah(3).setTabungan(new Tabungan(6500));

        System.out.println("Jumlah nasabah = " +
                bank.getJumlahNasabah());

        for (int i=0; i<bank.getJumlahNasabah(); i++){
            System.out.println("nasabah ke-" + (i+1) + " : " +
                    bank.getNasabah(i).getNamaAwal() + " " +
                    bank.getNasabah(i).getNamaAkhir() + " ; Saldo = " +
                    bank.getNasabah(i).getTabungan().getSaldo());
        }
    }
}
