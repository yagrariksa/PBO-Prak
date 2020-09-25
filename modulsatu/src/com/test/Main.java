package com.test;
/*
Buatlah sebuah program untuk menentukan
apakah sebuah bilangan termasuk ke dalam salah satu
kriteria berikut:
a. Positif Genap
b. Negatif Genap
c. Positif Ganjil
d. Negatif Ganjil
Gunakan prinsip class & object dengan sebuah konstruktor
untuk mengeset bilangan.
 */

import java.util.ArrayList;

class Latihan1 {
    private Integer bilangan;
    private String jenis;

    Latihan1 (Integer x){
        this.bilangan = x;
        this.jenis = this.jenis();
    }

    public void setBilangan(Integer bilangan) {
        this.bilangan = bilangan;
    }

    public Integer getBilangan() {
        return this.bilangan;
    }

    public String getJenis() {
        this.jenis = this.jenis();
        return this.jenis;
    }

    public String jenis(){
        String a;
        String b;
        if (this.bilangan>0){
            a = "positif";
        }else {
            a = "negatif";
        }

        if (this.bilangan%2 == 0){
            b = "genap";
        }else {
            b = "ganjil";
        }

        System.out.println(
                this.bilangan + " adalah bilangan " +
                a + " " + b
        );

        return a + " " + b;
    }
}

/*
Buatlah program untuk meng-generate deret dengan
ketentuan terdapat suatu:
    a. Nilai awal
    b. Beda
    c. Jumlah kemunculan angka pada deret
Program akan menghitung nilai rataan dari deret tersebut.
* */

class Latihan2 {
    private Integer nilaiawal,beda,kemunculan;

    Latihan2 (Integer nilaiawal, Integer beda, Integer kemunculan){
        this.nilaiawal = nilaiawal;
        this.beda = beda;
        this.kemunculan = kemunculan;

        this.display();
        this.run();
    }

    public void setBeda(Integer beda) {
        this.beda = beda;
    }

    public void setKemunculan(Integer kemunculan) {
        this.kemunculan = kemunculan;
    }

    public void setNilaiawal(Integer nilaiawal) {
        this.nilaiawal = nilaiawal;
    }

    public Integer getBeda() {
        return beda;
    }

    public Integer getKemunculan() {
        return kemunculan;
    }

    public Integer getNilaiawal() {
        return nilaiawal;
    }

    public void display() {
        System.out.println("nilai awal = " + getNilaiawal());
        System.out.println("beda = " + getBeda());
        System.out.println("kemunculan = " + getKemunculan());
    }
    public void run (){
        int count = 1;
        Integer deret = this.nilaiawal;
        System.out.print("Deret : ");
        while (count <= this.kemunculan){
            System.out.print(deret + " ");
            deret = deret + this.beda;
            count++;
        }
        System.out.println();
    }

    public void run (Integer kemunculan){
        System.out.println("---------");
        System.out.println("kemunculan = " + kemunculan);
        int count = 1;
        Integer deret = this.nilaiawal;
        System.out.print("Deret : ");
        while (count <= kemunculan){
            System.out.print(deret + " ");
            deret = deret + this.beda;
            count++;
        }
        System.out.println();
    }
}

/*
Conan merupakan anak SD penggemar novel detektif. Ia ingin membuat sebuah program untuk
mendata setiap novel detektif yang ia miliki. Setiap novel memiliki judul, nama pengarang dan tahun
terbit. Tapi Conan ingin mengetahui isi dari setiap novel, sehingga ia tahu deskripsi novel tersebut.
Conan juga menginginkan informasi harga beli tercantum di program. Dikarenakan sewaktu-waktu ia
ingin menjual kembali novelnya, terdapat mekanisme untuk menghitung harga jual novel. Rumus
yang ia gunakan adalah “harga jual = harga beli – 20% * harga beli”.
Conan menginginkan programnya dibuat menggunakan konsep OOP, menggunakan bahasa Java
dengan terdapat konsep enkapsulasi di dalamnya.
Bantulah Conan untuk merancang program yang akan ia buat. Tentukanlah atribut dan method
terlibat, gambarkan class diagramnya. Buatlah 3 objek berdasarkan class tersebut (data bebas), dan
tampilkan informasi dari setiap buku tersebut. Lalu, tampilkan harga total beli buku serta harga total
buku jika dijual.
 */

class Buku {
    private String judul, namapengarang, deskripsi;
    private double tahunterbit, hargabeli, hargajual;

    public Buku(String judul, String namapengarang, String deskripsi, double tahunterbit, double hargabeli) {
        this.judul = judul;
        this.namapengarang = namapengarang;
        this.deskripsi = deskripsi;
        this.tahunterbit = tahunterbit;
        this.hargabeli = hargabeli;

        this.hargajual = hargabeli * 80 / 100;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getNamapengarang() {
        return namapengarang;
    }

    public void setNamapengarang(String namapengarang) {
        this.namapengarang = namapengarang;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public double getTahunterbit() {
        return tahunterbit;
    }

    public void setTahunterbit(double tahunterbit) {
        this.tahunterbit = tahunterbit;
    }

    public double getHargabeli() {
        return hargabeli;
    }

    public void setHargabeli(double hargabeli) {
        this.hargabeli = hargabeli;
    }

    public double getHargajual() {
        return hargajual;
    }

    public void setHargajual(double hargajual) {
        this.hargajual = hargajual;
    }

    @Override
    public String toString() {
        return "\n" +
                "judul = " + judul + '\n' +
                "nama pengarang = " + namapengarang + '\n' +
                "deskripsi = " + deskripsi + '\n' +
                "tahun terbit = " + tahunterbit + '\n' +
                "harga beli = " + hargabeli + '\n' +
                "harga jual = " + hargajual + '\n';
    }
}

class Daftarbuku {
    private ArrayList<Buku> koleksi = new ArrayList<Buku>();

    public void tambahBuku(
            String judul, String namapengarang,
            String deskripsi, double tahunterbit, double hargabeli){
        Buku a = new Buku(judul,namapengarang,deskripsi,tahunterbit,hargabeli);
        this.koleksi.add(a);
    }

    public void tampil(){
        System.out.println(koleksi);
    }

    public void totalhargabeli(){
        double beli = 0;
        for (Buku i:koleksi) {
            beli = beli + i.getHargabeli();
        }
        System.out.println("total harga beli = " + beli);
    }

    public void totalhargajual(){
        double jual = 0;
        for (Buku i:koleksi) {
            jual = jual + i.getHargajual();
        }
        System.out.println("total harga jual = " + jual);
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("\n\n----LATIHAN 1----");
        Latihan1 satu = new Latihan1(4);
        Latihan1 dua = new Latihan1(-3);
        Latihan1 tiga = new Latihan1(5);
        Latihan1 empat = new Latihan1(-4);

        System.out.println("\n\n----LATIHAN 2----");
        Latihan2 lima = new Latihan2(2,3,4);
        lima.run(8);

        System.out.println("\n\n----LATIHAN 3----");
        Daftarbuku conan = new Daftarbuku();
        conan.tambahBuku(
                "conan mencari domba",
                "eichiro oda",
                "Conan menggembala namun domba nya hilang secara misterius",
                2018,100000);
        conan.tambahBuku(
                "conan jalan-jalan ke jepang",
                "eichiro Soda",
                "conan liburan musim panas liburan ke jepang bersama teman dan sahabat",
                2015, 80000);
        conan.tambahBuku(
                "conan mencari jejak",
                "Haciro Omda",
                "anjing tetangga conan hilang misterius, conan mencari nya segera",
                2016,90000);

        conan.tampil();
        conan.totalhargabeli();
        conan.totalhargajual();

    }
}
