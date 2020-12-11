package com.test;

import java.util.Scanner;

public abstract class Permainan {

    protected String namaPemain;
    protected int levelPemain;

    public String getNamaPemain() {
        return namaPemain;
    }

    public void setNamaPemain(String namaPemain) {
        this.namaPemain = namaPemain;
    }

    public int getLevelPemain() {
        return levelPemain;
    }

    public void setLevelPemain(int levelPemain) {
        this.levelPemain = levelPemain;
    }

    public void jalankan(){
        Scanner scn = new Scanner(System.in);
        System.out.print("masukkan nama : ");

        this.setNamaPemain(scn.nextLine());
        do {
            System.out.print("masukkan level (1-100) : ");
            this.setLevelPemain(scn.nextInt());
        } while (this.levelPemain>100 || this.levelPemain<1) ;

        String power;
        if(this.levelPemain > 80){
            power = "hard";
        }else if(this.levelPemain >20){
            power = "medium";
        }else{
            power = "normal";
        }
        System.out.print("masukkan hit : ");
        int hit = scn.nextInt();
        System.out.print("masukkan miss : ");
        int miss = scn.nextInt();
        int skor = this.hitungSkor(hit,miss);


        System.out.println(
                "Nama : " + this.namaPemain + '\n' +
                "Level : " + this.levelPemain + " - " + power + '\n' +
                "Skor : " + skor
        );
    }

    public abstract int hitungSkor(int hit, int miss);
}
