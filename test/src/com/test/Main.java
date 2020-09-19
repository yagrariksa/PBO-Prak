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
public class Main {

    public static void main(String[] args) {
	// write your code here
	
	Bola b1 = new Bola(7);
	b1.tampil();

	Bola b2 = new Bola(14);
	b2.tampil();

	b1.jumlahJ(b2);
    }
}