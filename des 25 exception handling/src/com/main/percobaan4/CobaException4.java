package com.main.percobaan4;

public class CobaException4 {

    public static void main(String[] args){
        int bil=10;
        String b[] = {"a","b","c"};
        try {
//            System.out.println(bil/0);
            System.out.println(b[3]);
        }catch (ArithmeticException e){
            System.out.println("Terjadi aritmatika error");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Melebihi jumlah array");
        }catch (Exception e){
            System.out.println("ini menghadle error yang terjadi");
        }
    }
}
