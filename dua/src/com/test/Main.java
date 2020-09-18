package com.test;

class Pecahan {

    private Integer pembilang;
    private Integer penyebut;

    Pecahan(Integer pembilang, Integer penyebut){
        this.pembilang = pembilang;
        this.penyebut = penyebut;
    }

    public Integer getPembilang(){
        return this.pembilang;
    }

    public Integer getPenyebut() {
        return this.penyebut;
    }

    public Pecahan tambah(Pecahan pecahan){
        Integer finalPenyebut = this.penyebut*pecahan.getPenyebut();
        Integer finalSatu = this.pembilang*pecahan.getPenyebut();
        Integer finalDua = pecahan.getPembilang()*this.penyebut;
        Integer finalPembilang = finalSatu+finalDua;

        System.out.println(
                this.pembilang + "/" + this.penyebut +
                " + " + pecahan.getPembilang() + "/" + pecahan.getPenyebut() +
                " = " + finalPembilang + "/" + finalPenyebut
        );

        Pecahan satu = new Pecahan(finalPembilang, finalPenyebut);
        return satu;
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Pecahan Objek1 = new Pecahan(3,2);
        Pecahan Objek2 = new Pecahan(5,6);

        Pecahan Objek3 = Objek1.tambah(Objek2);
    }
}
