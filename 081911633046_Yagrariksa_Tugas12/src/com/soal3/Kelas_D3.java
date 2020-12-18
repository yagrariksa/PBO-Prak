package com.soal3;

public class Kelas_D3 implements Kelas_C3{

    public int d;

    public Kelas_D3(int d) {
        this.d = d;
    }

    public void tampilD() {
        System.out.println("D " + this.d);
    }


    @Override
    public int hitungJumlah(int a, int b) {
        return (a+b);
    }

    @Override
    public int hitungKali(int a, int b) {
        return (a*b);
    }

    @Override
    public int hitungKurang(int a, int b) {
        return (a-b);
    }
}
