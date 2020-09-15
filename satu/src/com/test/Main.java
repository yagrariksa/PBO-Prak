package com.test;

class Hewan {
    private String nama;
    private String habitat;
    private Integer jumlah_kaki;
    private String tipe_pemakan;
    private Integer energi;
    public String nickname;

    Hewan(){
        this.energi = 100;
    }

    Hewan(String nama, String habitat, Integer JK, String TP, String nn) {
        this.nama = nama;
        this.habitat = habitat;
        this.jumlah_kaki = JK;
        this.tipe_pemakan = TP;
        this.energi = 100;
        this.nickname = this.nama + " " + nn;

        System.out.println("Anda sudah menambahkan Hewan baru");
        System.out.println(
                " Hewan : " + this.nama +
                "\n Habitat : " + this.habitat +
                "\n Jumlah Kaki : " + this.jumlah_kaki +
                "\n Tipe Pemakan : " + this.tipe_pemakan +
                "\n Energi : " + this.energi +
                "\n Panggilan : " + this.nickname +
                "\n Kemampuan : makan, tidur, berinteraksi \n");
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

    public void energi(){
        System.out.println("energi " + this.nickname +  " : " + this.energi);
    }

    public void makan(){
        System.out.println(this.nickname + " sedang makan, energi bertambah 5");
        this.energi = this.energi + 5;
        energi();
    }

    public void tidur(){
        System.out.println(this.nickname + " sedang tidur, energi bertambah 5");
        this.energi = this.energi + 5;
        energi();
    }

    public void berinteraksi(){
        System.out.println(this.nickname + " sedang berinteraksi, enegi berkurang 5");
        this.energi = this.energi - 5;
        energi();
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hewan kucing = new Hewan("Kucing" , "Darat", 4,"Carnivora","kitty");

        kucing.berinteraksi();
        kucing.makan();
        kucing.tidur();
    }
}
