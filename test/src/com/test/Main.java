package com.test;

class Bola{
	private Integer jari;
	private Integer luas;

	Bola(Integer x){
		this.jari = x;
	}

	public Integer getJari(){
		return this.jari;
	}

	public Integer luas(){
		this.luas = this.jari*this.jari*22/7;
		return this.luas;
	}

	public void tampil(){
		System.out.println("jari : " + this.jari);
		System.out.println("luas : " + this.luas());
	}

	public void jumlahJ(Bola x){
		Integer hasil = this.jari + x.getJari();
		// write your code here
		System.out.println("hasil jumlah adalah : " + hasil);
	}
}

class Pecahan {
    private int pembilang;
    private int penyebut;

    public Pecahan (int a, int b) {
//        try {
////            if (penyebut == 0);}
//            Integer something = a/b;
//        }catch (ArithmeticException ex) {
//            System.out.println("penyebut tidak boleh 0");
//        }

        if (pembilang < 0) {
            this.pembilang = -a;
            this.penyebut = -b;
        }
        else{
            this.pembilang = a;
            this.penyebut = b;
        }
        System.out.println("sudah berhasil masuk");
    }

    // return
    public int getPembilang() {
        return pembilang;
    }
    public int getPenyebut() {
        return penyebut;
    }
    // pertambahan dengan (p2)
    public Pecahan tambah(Pecahan p2) {
        int pembilang2 = (this.pembilang * p2.penyebut) + (this.penyebut * p2.pembilang);
        int penyebut2 = (this.penyebut * p2.penyebut);
        return new Pecahan (pembilang2, penyebut2);
    }
    public String toString(){
        if (penyebut == 1)
            return pembilang + "";
        else
            return pembilang + "/" + penyebut;
    }

    public void tampil(){
        System.out.println(this.pembilang + "/" + this.penyebut);
    }
    /**
     * @param args the command line arguments
     */

}
public class Main {

    private static class Bahasa{
        public String lang;

        public String getLang() {
            return lang;
        }

        public void setLang(String lang) {
            this.lang = lang;
        }
    }

    public static void main(String[] args) {

        Bahasa bahasa = new Bahasa();
        bahasa.setLang("Java");
        System.out.println("Bahasa : " + bahasa.getLang());

    }
}