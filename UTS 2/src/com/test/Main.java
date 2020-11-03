package com.test;

import java.util.ArrayList;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

//        bahan data dummy;
        Vector datadummy = new Vector();
        for (int i=1;i<=10;i+=2) {
            datadummy.add(i);
        }

        System.out.println(datadummy);

//        data dummy
        Vektor vektor1 = new Vektor(datadummy);

//        cari varians
        System.out.println(vektor1.getPanjangVektor());
        System.out.println(vektor1.jmlVektor());
        System.out.println(vektor1.hitungMean());
        System.out.println(vektor1.kuadratVektor());
        System.out.println(vektor1.kurangVektorKonstanta(2));

        Double hasilVarians = vektor1.hitungVarians();
        System.out.println("Varians : " + hasilVarians);
    }
}
