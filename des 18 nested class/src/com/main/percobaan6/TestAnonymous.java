package com.main.percobaan6;

public class TestAnonymous {
    public static void main(String str[]){

        Father f = new Father() {
            @Override
            public void method(int x) {
                System.out.println("hello world");
            }
        };


    }

    interface Father {
        void method(int x);

    }
}
