package com.main.finally3;

public class A {

    public static void main(String[] args){
        try {
            int a = 1/0;
        }catch (Exception e){
            System.out.println("ada kesaahan yang muncul");
        }finally {
            System.out.println("Terimakasih telah menjalankan program");
        }
    }
}
