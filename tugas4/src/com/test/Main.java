package com.test;
import java.util.Scanner;
import java.util.ArrayList;

class Vektor {
     public Scanner sc = new Scanner(System.in);
    private final ArrayList<Double> vektor = new ArrayList<Double>();

    public Vektor(int n){
        for (int i = 0; i<n; i++){
            System.out.print("masukkan index ke-" + i + " : ");
            vektor.add(sc.nextDouble());
        }
    }

    public Vektor(int n, ArrayList<Double> a){
        for (int i=0; i<n; i++){
            vektor.add(a.get(i));
        }
    }

//    public Vektor(double x, double y, double z) {
//        setVektor(x,y,z);
//    }

    public ArrayList<Double> getVektor() {
        return vektor;
    }

    public void tampil(){
        System.out.print("[ ");
        for (int i = 0 ; i<vektor.size(); i++){
            System.out.print(vektor.get(i) + " ");
        }
        System.out.println("]");
    }


    public static Vektor jumlahV(Vektor v1, Vektor v2){
        ArrayList<Double> vek1 = v1.getVektor();
        ArrayList<Double> vek2 = v2.getVektor();
        ArrayList<Double> hasil = new ArrayList<Double>();
        if (vek1.size() > vek2.size()){
            for (int i=0; i<vek2.size(); i++){
                hasil.add(vek1.get(i) + vek2.get(i));
            }
            for (int j=vek2.size(); j<vek1.size(); j++){
                hasil.add(vek1.get(j));
            }
        }else {
            for (int i=0; i<vek1.size(); i++){
                hasil.add(vek1.get(i) + vek2.get(i));
            }
            for (int j=vek1.size(); j<vek2.size(); j++){
                hasil.add(vek2.get(j));
            }
        }

        Vektor hasilV = new Vektor(hasil.size(), hasil);
        return hasilV;
    }

    public static Vektor kurangV(Vektor v1, Vektor v2){
        ArrayList<Double> vek1 = v1.getVektor();
        ArrayList<Double> vek2 = v2.getVektor();
        ArrayList<Double> hasil = new ArrayList<Double>();
        if (vek1.size() > vek2.size()){
            for (int i=0; i<vek2.size(); i++){
                hasil.add(vek1.get(i) - vek2.get(i));
            }
            for (int j=vek2.size(); j<vek1.size(); j++){
                hasil.add(vek1.get(j));
            }
        }else {
            for (int i=0; i<vek1.size(); i++){
                hasil.add(vek1.get(i) - vek2.get(i));
            }
            for (int j=vek1.size(); j<vek2.size(); j++){
                hasil.add(vek2.get(j));
            }
        }
        return new Vektor(hasil.size(), hasil);
    }

    public static Vektor kaliS(Vektor v1, double skalar){
        ArrayList<Double> vek1 = v1.getVektor();
        ArrayList<Double> hasil = new ArrayList<Double>();
        for (int i=0; i<vek1.size(); i++){
            hasil.add(vek1.get(i)*skalar);
        }
        return new Vektor(hasil.size(),hasil);
    }

    public static Vektor bagiS(Vektor v1, double skalar){
        ArrayList<Double> vek1 = v1.getVektor();
        ArrayList<Double> hasil = new ArrayList<Double>();
        for (int i=0; i<vek1.size(); i++){
            hasil.add(vek1.get(i)/skalar);
        }
        return new Vektor(hasil.size(),hasil);
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Vektor a = new Vektor(3);
        Vektor b = new Vektor(2);

        Vektor c = Vektor.jumlahV(a,b);
        Vektor d = Vektor.kurangV(a,b);
        Vektor e = Vektor.kaliS(b,3);
        Vektor f = Vektor.bagiS(a,2);

        a.tampil();
        b.tampil();
        c.tampil();
        d.tampil();
        e.tampil();
        f.tampil();
    }
}
