package com.main.percobaan2;

public class Exception2 {

    public static void main(String[] args){
        int i = 0;
        String greeting[]={
                "Hello World!",
                "No, I mean it",
                "Hello World"
        };

        while (i<4){
            try {
                System.out.println(greeting[i]);
                i++;
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Bye index value");
                i=5;
            }

        }
    }
}
