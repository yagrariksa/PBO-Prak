package com.main.percobaan8;

import java.io.IOException;

public class Utama {
    public static void main(String[] args){
        Test3 o = new Test3();
        o.methodA();
        try {
            o.methodB();
        }catch (Exception e){
            System.out.println("error di method B");
        }finally {
            System.out.println("ini selalu dicetak");
        }
    }
}

class Test3{
    public void methodA(){
        System.out.println("Method A");
    }

    public void methodB() throws IOException
    {
        System.out.println(20/0);
        System.out.println("Method B");
    }
}
