package com.main.throw5;

public class A {

    public static void main(String[] args) {
        try {
            f();
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void f() throws
            NullPointerException,ArrayIndexOutOfBoundsException {
        throw new NullPointerException();
    }
}
