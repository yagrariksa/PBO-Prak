package com.main.percobaan1;

public class Exception {

    public static void main(String[] args){
        int a[] = new int[5];

        try {
            a[5] = 100;
        }
        catch (java.lang.Exception e){
            System.out.println("terjadi pelanggaran memory");
        }
    }
}
