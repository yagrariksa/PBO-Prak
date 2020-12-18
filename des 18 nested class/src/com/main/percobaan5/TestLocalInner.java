package com.main.percobaan5;

public class TestLocalInner {
    public static void main(String args[]){
        Outer o = new Outer();
        o.display();
    }
}

class Outer {

    static String classFld = "Static class members are accessible";
    String instFld = "instance flds of enclosing class are accessible";

    void display() {
        final String str = "only final method variables are accessible";

        class Local{
            Local(){
                System.out.println(str);
                System.out.println(classFld);
                System.out.println(instFld);
            }
        }

        new Local();
    }
}