package com.main.throw4;

public class A {

    public static void main(String[] args){
        try {
            throw new B();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

class B extends Exception{
    B(){}

    @Override
    public String toString() {
        return "object dengan tipe kelas B";
    }
}
