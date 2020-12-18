package com.main.percobaan6;

public class TestAnonymous {
    public static void main(String str[]){
        final int d = 10;

        TestAnonymous t = new TestAnonymous();
        Father f = t.new Father();


    }

    class Father {

    }
}
