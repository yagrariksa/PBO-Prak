package com.main.percobaan5;

public class Exception5 {
    public static void main(String[] args){
        int bil = 10;

        try {
            System.out.println(bil/0);
        } catch (ArithmeticException e){
            System.out.println("pessan error");
//            System.out.println(e.getMessage());
            System.out.println(e.getMessage());
            System.out.println("Info stack erase");
            e.printStackTrace();
            e.printStackTrace(System.out);
        } catch (Exception e){
            System.out.println("ini menghandle error yang terjadi");
        }
    }
}
