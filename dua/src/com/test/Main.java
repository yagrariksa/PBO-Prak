package com.test;

class Pecahan {

    private Integer pembilang;
    private Integer penyebut = 1;
    private boolean error = false;

    Pecahan(Integer pembilang){
        this.setPembilang(pembilang);
    }

    Pecahan(Integer pembilang, Integer penyebut){
        this.setPembilang(pembilang);
        this.setPenyebut(penyebut);
    }

    public boolean isError() {
        return error;
    }

    public void setPembilang(Integer pembilang) {
        this.pembilang = pembilang;
    }

    public void setPenyebut(Integer penyebut) {
        this.penyebut = penyebut;
        if(this.penyebut == 0){
            error = true;
            System.out.println(this.getPembilang() + "/" + this.getPenyebut() + " = tidak terdefinisi");
        }
    }

    public Integer getPembilang(){
        return this.pembilang;
    }

    public Integer getPenyebut() {
        return this.penyebut;
    }

    public Integer efpebe(Integer a, Integer b){
        if (b == 0){
            return a;
        }
        return efpebe(b, a%b);
    }

    public Pecahan tambah(Pecahan pecahan){
        if( this.isError() || pecahan.isError() ){
            Pecahan satu = new Pecahan(1,0);
            System.out.println(
                    this.pembilang + "/" + this.penyebut +
                            " + " + pecahan.getPembilang() + "/" + pecahan.getPenyebut() +
                            " = tidak terdefinisi"
            );
            return satu;
        }else {
            Integer finalPenyebut = this.penyebut*pecahan.getPenyebut();
            Integer finalSatu = this.pembilang*pecahan.getPenyebut();
            Integer finalDua = pecahan.getPembilang()*this.penyebut;
            Integer finalPembilang = finalSatu+finalDua;

            System.out.println(
                    this.pembilang + "/" + this.penyebut +
                    " + " + pecahan.getPembilang() + "/" + pecahan.getPenyebut() +
                    " = " + finalPembilang + "/" + finalPenyebut
            );

            Integer efpebe = efpebe(finalPembilang, finalPenyebut);
            if(efpebe != 1) {
                finalPembilang = finalPembilang / efpebe;
                finalPenyebut = finalPenyebut / efpebe;

                System.out.println(
                        this.pembilang + "/" + this.penyebut +
                                " + " + pecahan.getPembilang() + "/" + pecahan.getPenyebut() +
                                " = " + finalPembilang + "/" + finalPenyebut
                );
            }

            Pecahan satu = new Pecahan(finalPembilang, finalPenyebut);
            return satu;
        }
    }

    public void tampil(){
        System.out.println("bilangan pecahan : " + this.pembilang + "/" + this.penyebut);
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Pecahan Objek1 = new Pecahan(3,2);
        Pecahan Objek2 = new Pecahan(5,6);

        Pecahan Objek3 = Objek1.tambah(Objek2);

        Objek1.tampil();
        Objek2.tampil();
        Objek3.tampil();
    }
}
