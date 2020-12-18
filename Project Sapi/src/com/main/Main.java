package com.main;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        System.out.println("compare 1+2 = " + Integer.compare(1,2));

        Scanner sn = new Scanner(System.in); // scanner
        System.out.print("Masukkan Siklus brp Tahun ? : "); // penanda
        Integer tahun = sn.nextInt(); // tahun looping
        ArrayList<ArrayList<Double>> data = new ArrayList<>(); // generate data hitung
        Double[][] data1 = new Double[tahun][20];
//        [
//                [15,15,15,15,15,15],
//                [13,14,12],
//                [16,17,18]
//        ]
        for (int i = 0 ; i<tahun; i++){
            data.add(new ArrayList<>());
        }
        for (int k = 0; k<20; k++){ // start looping hitung sbnyk 20

            ArrayList<Sapi> kandang = new ArrayList<Sapi>(); // generate kandang baru
            Sapi[] kandang1 = new Sapi[15];
            Sapi[] kandang2 = new Sapi[kandang1.length+1];
            kandang.addAll(Method.sapibaru(5, true)); // inisialisasi sapi jantan
            kandang.addAll(Method.sapibaru(10, false)); // inisialisasi sapi betina
            for (int i = 1; i<=tahun; i++){ // looping tahun
                for (int j = 0; j<kandang.size(); j++){ // looping ternak
                    Sapi sapi = kandang.get(j); // get sapi satuan
                    if (sapi.hidup) { sapi.hidup = !Method.mati(sapi.umur); } // generate kehidupan
                    if (sapi.umur >= 3 && sapi.umur <= 7 && !sapi.kelamin && sapi.hidup){kandang.add(Method.lahir()); } // generate kelahiran
                    if (sapi.hidup){ sapi.umur++; } // penambahan umur
                }
                kandang.removeIf(sapi -> sapi.hidup==false); // filter kandang
                // foreach(array) -> hitung yang hidup -> totalhidup
                // [ hidup, mati, mati, hidup ]
                // [ hidup, 0 , 0 , hidup ]
                data.get(
                        (i-1)
                ).add(
                        (double) kandang.size()
                );
                data1[i-1][k] = (double) kandang.size();
                System.out.println("tahun ke - "+ i + " : " + kandang.size());

            }
//            data.add(kandang.size()); // masukin ke data hitung
        }

        // data -> array terluar

        for (int z = 0 ; z<data.size();z++){
            ArrayList<Double> a = data.get(z);
            Double[] a1         = data1[z];

            System.out.println("Tahun ke - " + (z+1));

            Double jumlah = (double) 0;
            Double jumlah1 = (double) 0;

            for (int i = 0 ; i < a1.length ; i++){
                jumlah+=a.get(i);
                jumlah1 += a1[i];
            }
            Double mean = jumlah/a.size();
            Double mean1 = jumlah1/a1.length;
            System.out.println(" JUMLAH : " + jumlah + "\n MEAN : " + mean);
            System.out.println(" JUMLAH : " + jumlah1 + "\n MEAN : " + mean1);
            Double sigma = (double) 0;
            Double sigma1 = (double) 0;
            for (int i=0;i<a.size();i++){
                Double b = a.get(i) - mean;
                Double b1 = a1[i] - mean1;
                sigma+=b;
                sigma1+=b1;
            }
            double varians = (sigma*sigma) / (double) a.size();
            double varians1 = (sigma1*sigma1) / (double) a1.length;

            System.out.println(" Varian : " + varians);
            System.out.println(" Varian : " + varians1);
            // sigma (x / xbar) ^2 / jumlah data
        }

        // ############################################################################
//        long intSum = data.stream()
//                .mapToLong(Integer::longValue)
//                .sum();
//        long mean = intSum / data.size();
//
//        ArrayList<Long> sigma = new ArrayList<>();
//
        
//
//        long longSum = sigma.stream()
//                .mapToLong(Long::longValue)
//                .sum();
//
//        longSum = longSum*longSum;
//        long varians = longSum/data.size();
//
//        System.out.println("hasil sum : " + intSum);
//        System.out.println("Mean : " + mean);
//        System.out.println("Varians : "+varians);
        // ############################################################################




    }
}
