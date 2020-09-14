package com.test;

class Hewan {

    private String nama;
    private Integer jumlah_kaki;
    private String habitat;
    private String tipe_pemakan;
    private Integer energi;
    public String nickname;

    Hewan() {
        this.energi = 100;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJumlah_kaki(Integer jumlah_kaki) {
        this.jumlah_kaki = jumlah_kaki;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setTipe_pemakan(String tipe_pemakan) {
        this.tipe_pemakan = tipe_pemakan;
    }

    public String getNama() {
        return nama;
    }

    public Integer getJumlah_kaki() {
        return jumlah_kaki;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getTipe_pemakan() {
        return tipe_pemakan;
    }

    public void makan(){
        System.out.println(this.nama + " sedang makan");
        this.energi = this.energi + 5;
    }

    public void tidur(){
        System.out.println(this.nama + " sedang tidur");
        this.energi = this.energi + 5;
    }

    public void berinteraksi(){
        System.out.println(this.nama + " sedang berinteraksi");
        this.energi = this.energi - 5;
        System.out.println("energi " + this.nama +  " : "+ this.energi);
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Hewan kucing = new Hewan();
        kucing.setNama("kucing lucu");
        kucing.setJumlah_kaki(4);
        kucing.setHabitat("darat");

        kucing.berinteraksi();
    }
}
