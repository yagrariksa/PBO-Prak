package com.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Matriks {

    private ArrayList<ArrayList<Integer>> matriks = new ArrayList<ArrayList<Integer>>();
    private Integer baris,kolom;

    public Matriks(){}

    public Matriks(Integer baris, Integer kolom) {
        this.baris = baris;
        this.kolom = kolom;
        this.setAllMatriks();
    }

    public void setBaris(Integer baris) {
        this.baris = baris;
    }

    public void setKolom(Integer kolom) {
        this.kolom = kolom;
    }

    public void setMatriks(ArrayList<ArrayList<Integer>> matriks) {
        this.matriks = matriks;
        this.setBaris(matriks.size());
        this.setKolom(matriks.get(0).size());
    }

    private void setAllMatriks() {
//        method yang digunakan untuk memasukkan isian Array dari LOG
        for (int i=0;i<baris;i++) {
            matriks.add(new ArrayList<Integer>());
            for (int j=0;j<kolom;j++) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("masukkan untuk index " + i + "-" + j + " : ");
                matriks.get(i).add(scanner.nextInt());
            }
        }
    }

    public Integer getBaris() {
        return baris;
    }

    public Integer getKolom() {
        return kolom;
    }

    public Integer getValueOfMatriks(int i, int j) {
        return matriks.get(i).get(j);
    }

    public void setValueOfMatriks(int i, int j, int value) {
        matriks.get(i).set(j,value);
    }

    public static Matriks jumlah2Matriks(Matriks M1, Matriks M2) {
        System.out.println("\nanda masuk ke method penjumlahan 2 matriks");
        System.out.println("KOLOM dan BARIS dari 2 Matriks harus sama");
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if (M1.getBaris() != M2.getBaris()) {
            System.out.println("BARIS tidak sama");
        }else if(M1.getKolom() != M2.getKolom()) {
            System.out.println("KOLOM tidak sama");
        }else {
            System.out.println("KOLOM dan BARIS dari 2 Matriks sudah sama, operasi dilanjutkan\n");
            for (int i=0;i<M1.getBaris();i++) {
                ArrayList<Integer> dalam = new ArrayList<>();
                for (int j=0;j<M1.getKolom();j++) {
                    dalam.add(M1.getValueOfMatriks(i,j)+M2.getValueOfMatriks(i,j));
                }
                result.add(dalam);
            }
        }

        Matriks hasilAkhir = new Matriks();
        hasilAkhir.setBaris(M1.getBaris());
        hasilAkhir.setKolom(M1.getKolom());
        hasilAkhir.setMatriks(result);

        return hasilAkhir;
    }

    public static Matriks kurang2Matriks(Matriks M1, Matriks M2) {

//        info
        System.out.println("\nanda masuk ke method pengurangan 2 matriks");
        System.out.println("KOLOM dan BARIS dari 2 Matriks harus sama");

//        declare data array
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

//        pengecekan jumlah baris
        if (M1.getBaris() != M2.getBaris()) {
            System.out.println("BARIS tidak sama");

//            pengecekan jumlah kolom
        }else if(M1.getKolom() != M2.getKolom()) {
            System.out.println("KOLOM tidak sama");
        }else {
            System.out.println("KOLOM dan BARIS dari 2 Matriks sudah sama, operasi dilanjutkan\n");

//            operasi hitung
            for (int i=0;i<M1.getBaris();i++) {
                ArrayList<Integer> dalam = new ArrayList<>();
                for (int j=0;j<M1.getKolom();j++) {
                    dalam.add(M1.getValueOfMatriks(i,j)-M2.getValueOfMatriks(i,j));
                }
                result.add(dalam);
            }
        }

//        data return reg
        Matriks hasilAkhir = new Matriks();
        hasilAkhir.setMatriks(result);

        return hasilAkhir;
    }

    private void print(){
        System.out.println("MATRIKS : ");
        for (int i=0;i<this.getBaris();i++){
            System.out.println(matriks.get(i));
        }
    }

    @Override
    public String toString() {
        this.print();
        return "";
    }
}
