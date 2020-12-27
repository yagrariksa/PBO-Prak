package com.main.catch2;

public class A {

    public static void main(String[] args){

        try {
            int a = 1/0;
            System.out.println("perintah selanjutnya");
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
