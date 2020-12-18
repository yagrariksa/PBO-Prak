package com.main;

public class Kelas_C1 implements Kelas_A1 {

    public int c;

    public Kelas_C1(int c) {
        this.c = c;
    }

    public void tampiBC(){
        System.out.println("B :" + Kelas_B1.NILAI_B);
        System.out.println("C :" + this.c);
    }

    public void tampilConsNILAIB(){
        System.out.println("B :" + Kelas_B1.NILAI_B);
    }


    @Override
    public int hitungKali(int a, int b) {
        return (a*b);
    }


}
