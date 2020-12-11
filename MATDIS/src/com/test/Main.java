package com.test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static ArrayList<ArrayList<Integer>> anjayani = new ArrayList<>();
    public static Integer hohoho = 1;


//        param a adalah banyaknya variabel
//        param b adalah besarnya pangkat
//        param c harus 0, jangan dibuah2
//        param index gaguna asline
//        param arraylist masukin kosongan


    public static int valueMulti(int a, int b, int c, int index, ArrayList<Integer> arrayList) {
        index = index - 1;
        int hasil = 0;
        ArrayList<Integer> hey = arrayList;
        int x = a - 1;
        for (int i = b; i >= 0; i--) {

            if (x > 0) {
                ArrayList<Integer> ho = new ArrayList<>();
                for ( int p = 0; p<arrayList.size(); p++){
                    ho.add(arrayList.get(p));
                }
                ho.add(i);

//                System.out.print(i + ":" + index +"*"+x+ " ,");
                hasil = hasil + valueMulti(x, b, i+c, index, ho);
            } else {
                if ((i + c) == b) {
//                    if (i == 0){
//                        System.out.println("0");
//                    }
//                    System.out.print(i);
//                    System.out.print(":" + index);
//                    System.out.println();
                    hey.add(i);
                    System.out.print(hohoho + " => ");
                    hohoho++;
                    System.out.println(hey);
                    anjayani.add(hey);
                    return 1;
//                    1,3,6,10,15,21
                }
            }
        }
        return hasil;
    }


    public static void main(String[] args) {
	// write your code here
        ArrayList oh = new ArrayList();

        int v = valueMulti(4,10, 0, 3, oh);
        System.out.println();
        System.out.println("HASILNYA : " + v);
        
//      ini maksudnya tuh buat nyari suku ke n => anjayani.get(n-1);
        System.out.println(anjayani.get(5-1));
        System.out.println(anjayani.get(33-1));
        System.out.println(anjayani.get(17-1));
//        System.out.println(anjayani.get(6-1));
//        System.out.println(anjayani.get(16));
//        System.out.println(anjayani.get(32));
/*
        System.out.println("ANJAYANI : " + anjayani.size());
        ArrayList<Integer> indexan = new ArrayList<>();
        for (int i = 0; i<anjayani.size();){
            int index = anjayani.get(i).get(0);
            int count = 0;
            for (int j = 0; j<anjayani.size(); j++) {
                if(anjayani.get(j).get(0) == index){
                    count++;
                }
            }
            i = i+count;
            indexan.add(count);
        }
        System.out.println(indexan); */
    }
}

// 5 variabel pangkat 12
// 3,6,10,15,21,28,36,45,55,66,78,91
//[1, 4, 10, 20, 35, 56, 84, 120, 165, 220, 286, 364, 455]
//[1, 3, 6, 10, 15, 21, 28, 36, 45, 55, 66, 78, 91]
