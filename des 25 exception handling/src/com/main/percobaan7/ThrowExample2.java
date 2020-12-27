package com.main.percobaan7;

public class ThrowExample2 {
    public static void main(String[] args){
        try {
            throw new Exception("Here's my exeption");
        }catch (Exception e){
            System.out.println("caught exception");
            System.out.println("e.getmessaege() : "+e.getMessage());
            System.out.println("e.toString() : "+e.toString());
            System.out.println("e.prinStackTrace() : ");
            e.printStackTrace();
        }
    }
}
