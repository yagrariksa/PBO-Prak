package com.test;
import java.nio.CharBuffer;
import java.util.*;
/*
penjumlahan dua bilangan bulat
pengurangan dua bilangan bulat
perkalian dua bilangan bulat
pembagian dua bilangan bulat -> floor kebawah
perkalian antara bilangan bulat dan bilangan riil
perkalian antara bilangan riil dan bilangan riil
pembagian antara bilangan bulat dan bilangan riil
pembagian antara bilangan riil dan bilangan riil
 */

class Withargumen {
    public Withargumen() {
    }

    public void jumlah(Integer a, Integer b){
        int c = a+b;
        System.out.println(a + " + " + b + " = " + c);
    }

    public void kurang(Integer a, Integer b){
        int c = a-b;
        System.out.println(a + " - " + b + " = " + c);
    }

    public void kali(Integer a, Integer b){
        int c = a*b;
        System.out.println(a + " * " + b + " = " + c);
    }

    public void bagi(Integer a, Integer b){
        int c = a/b;
        System.out.println(a + " / " + b + " = " + c);
    }

    public void kalisilang(Integer a, double b){
        double c = a * b;
        System.out.println(a + " * " + b + " = " + c);
    }

    public void kaliriil(double a, double b){
        double c = a * b;
        System.out.println(a + " * " + b + " = " + c);
    }

    public void bagisilang(Integer a, double b){
        double c = a / b;
        System.out.println(a + " / " + b + " = " + c);
    }

    public void bagiriil(double a, double b){
        double c = a / b;
        System.out.println(a + " / " + b + " = " + c);
    }
}

class Withoutargumen {
    private final int a,b;
    private final  double c,d;
    public Withoutargumen() {
        a=5;
        b=2;
        c=2.3;
        d=5.1;
    }
    public void jumlah(){

        int h = a+b;
        System.out.println(a + " + " + b + " = " + h );
    }

    public void kurang(){
        int h  = a-b;
        System.out.println(a + " - " + b + " = " + h );
    }

    public void kali(){
        int h  = a*b;
        System.out.println(a + " * " + b + " = " + h );
    }

    public void bagi(){
        int h  = a/b;
        System.out.println(a + " / " + b + " = " + h );
    }

    public void kalisilang(){
        double h  = a*c;
        System.out.println(a + " * " + c + " = " + h );
    }

    public void kaliriil(){
        double h  = c*d;
        System.out.println(c + " * " + d + " = " + h );
    }

    public void bagisilang(){
        double h  = a/c;
        System.out.println(a + " / " + c + " = " + h );
    }
    public void bagiriil(){
        double h  = d/c;
        System.out.println(d + " / " + c + " = " + h );
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Withargumen a = new Withargumen();
        a.jumlah(1,2);
        a.kurang(5,3);
        a.kali(2,2);
        a.bagi(5,2);
        a.kalisilang(2,2.6);
        a.kaliriil(2,2.6);
        a.bagisilang(5,2);
        a.bagiriil(5,2);

        System.out.println("\n\n");

        Withoutargumen b = new Withoutargumen();
        b.jumlah();
        b.kurang();
        b.kali();
        b.bagi();
        b.kalisilang();
        b.kaliriil();
        b.bagisilang();
        b.bagiriil();
    }
}
