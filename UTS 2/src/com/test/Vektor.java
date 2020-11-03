package com.test;

import java.util.Vector;

public class Vektor {

    private Vector<Integer> vektor = new Vector<>();
    private Integer panjangVektor;

    public Vektor(Vector<Integer> vektor) {
        this.vektor = vektor;
        this.panjangVektor = vektor.size();
    }

    public Integer getPanjangVektor(){
        return panjangVektor;
    }

    public Integer jmlVektor(){
        int total = 0;
        for (Integer i:vektor) {
            total += i;
        }
        return total;
    }

    public Vektor kurangVektorKonstanta(int konstanta) {
        Vector<Integer> inputan = new Vector<Integer>();
        for (int i=0; i<vektor.size();i++) {
            int a = vektor.get(i) - konstanta;
            inputan.add(a);
        }
        Vektor v = new Vektor(inputan);
        return v;
    }

    public Vektor kuadratVektor() {
        Vector<Integer> inputan = new Vector<>();
        for (int i=0; i<vektor.size();i++) {
                int a = vektor.get(i)*vektor.get(i);
            inputan.add(a);
        }
        Vektor v = new Vektor(inputan);
        return v;
    }

    public Integer hitungMean(){
        int mean = this.jmlVektor()/this.getPanjangVektor();
        return mean;
    }

    public Double hitungVarians(){
        int xbar = this.hitungMean();
        System.out.println("rata-rata : " + xbar);

        Vektor xminxbar = this.kurangVektorKonstanta(xbar);
        System.out.println("Xi - rata2 = " + xminxbar);

        Vektor kuadrat = xminxbar.kuadratVektor();
        System.out.println("(Xi - rata2)^2 = " + kuadrat);

        int sum = kuadrat.jmlVektor();
        System.out.println("Total dari yang diatas = " + sum);

        Double varians = Double.valueOf(sum)/(this.getPanjangVektor()-1) ;
        return varians;
    }

    @Override
    public String toString() {
        return "Vektor = " + vektor;
    }
}
