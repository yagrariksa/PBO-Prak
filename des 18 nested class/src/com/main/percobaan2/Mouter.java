package com.main.percobaan2;

public class Mouter {

    private int m = (int) (Math.random()*1000);

    public static void main(String args[]){
        Mouter that = new Mouter();
        that.go((int)(Math.random()*1000), (int)(Math.random()*1000));
    }

    private void go(int x, final int y) {
        int a = x+y;
        final int b = x-y;
        class Minner{
            public void method(){
                System.out.println("nilai m adalah:"+m);
                System.out.println("nilai x adalah:"+x);
                System.out.println("nilai y adalah:"+y);
                System.out.println("nilai a adalah:"+a);
                System.out.println("nilai b adalah:"+b);

            }
        }

        Minner that = new Minner();
        that.method();
    }
}
