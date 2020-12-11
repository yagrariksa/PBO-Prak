package com.main;

import java.sql.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.println("Awal Populasi");
        Integer jantanawal = 5;
        Integer betinaawal = 10;

        ArrayList<Sapi> kandang = new ArrayList<Sapi>();

        kandang.addAll(Method.sapibaru(jantanawal, true));
        kandang.addAll(Method.sapibaru(betinaawal, false));
        System.out.println("KANDANG : " + kandang.size());

        System.out.print("Masukkan Siklus brp Tahun ? : ");
        Integer tahun = sn.nextInt();

        for (int i = 1; i<=tahun; i++){
            System.out.println("+++++++++");
            System.out.println("tahun : " + i);
            int hidup = 0;
            int mati = 0;
            int betina = 0;
            for (int j = 0; j<kandang.size(); j++){

                Sapi sapi = kandang.get(j);
                if (sapi.hidup) {
                    sapi.hidup = !Method.mati(sapi.umur);
                }

                if (sapi.umur >= 3 && sapi.umur <= 7 && !sapi.kelamin && sapi.hidup){
                    kandang.add(Method.lahir());
                    betina++;
                }

                if (sapi.hidup){
                    sapi.umur++;
                    hidup++;
                }else {
                    mati++;
                }
            }
            System.out.println("betina melahirkan : " + betina);
            System.out.println("hidup : " + hidup);
            System.out.println("mati : " + mati);
        }

        kandang.removeIf(sapi -> sapi.hidup==false);
        System.out.println();
        System.out.println("kandang : " + kandang.size());

    }


}
