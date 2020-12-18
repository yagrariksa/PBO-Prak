package com.soal2;

public class Kelas_C2 extends Kelas_B2 implements Kelas_A2 {

    public int c;

    public Kelas_C2(int c, int b) {
        super(b);
        this.c = c;
    }

    public void tampiBC(){
        System.out.println("B : " + Kelas_B2.NILAI_B);
        System.out.println("C : " + this.c);
    }

    public void tampilConsNILAIB(){
        System.out.println("B : " + Kelas_B2.NILAI_B);
    }


    @Override
    public int hitungKali(int a, int b) {
        return (a*b);
    }


}
