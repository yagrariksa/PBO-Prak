package com.test;

public class Member {
    protected String nama;
    protected Integer umur;

    public Member(String nama, Integer umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void setUmur(Integer umur) {
        this.umur = umur;
    }

    public void display(){
        System.out.println("Nama : " + this.nama);
        System.out.println("Umur : " + this.umur);
    }
}
