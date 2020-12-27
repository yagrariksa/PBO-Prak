package com.main.percobaan6;

public class ThrowExample {

    static void demo(){
        NullPointerException t;
        t = new NullPointerException("coba Throw");
        throw t;
        // baris dibawah ini tidak dikerjakan
        // System.out.println("ini tidak lagi dicetak");
    }

    public static void main(String[] args){
        try {
            demo();
            System.out.println("selesai");
        }catch (NullPointerException e){
            System.out.println("ada pesan error : " + e);
        }
    }
}
