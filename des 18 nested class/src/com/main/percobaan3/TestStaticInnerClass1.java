package com.main.percobaan3;

public class TestStaticInnerClass1 {

    static String test = "Outer class static field";
    String instFld = "This is an instance field";

    public static void main(String[] args){
        System.out.println(Inner.value);
        new Inner();
    }

    static class Inner {
        static int value = 100;

        Inner() {
            System.out.println("New static inner class");
            System.out.println(test);
            // System.out.println(instFld); tidak bisa
            TestStaticInnerClass1 tsi = new TestStaticInnerClass1();
            System.out.println(tsi.instFld);
        }
    }
}
