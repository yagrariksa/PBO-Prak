package com.main.percobaan3;

public class Exception3 {

    public static void main(String[] args){
        int bil=10;
        try {
            System.out.println(bil / 0);
        }catch (ArithmeticException e){
            System.out.println("terjadi aritmatika error");
        }catch (Exception e){
            System.out.println("ini menghandle error yang terjadi");
        }
    }
}
