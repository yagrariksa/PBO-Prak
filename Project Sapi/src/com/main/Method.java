package com.main;

import java.util.ArrayList;
import java.util.Random;

public class Method {

    public static ArrayList<Sapi> sapibaru(Integer jumlah, Boolean kelamin){
        ArrayList<Sapi> array = new ArrayList<Sapi>();
        for (int i = 0; i<jumlah; i++){
            Sapi sapi = new Sapi(kelamin);
            array.add(sapi);
        }

        return  array;
    }

    public static Boolean prob(Integer chance){

        Random rn = new Random();
        Integer hasil = rn.nextInt(10);


        if (hasil>(chance-1)){
            return false;
        }else {
            return true;
        }

    }

    public static Boolean mati(Integer umur){

        Boolean res;

        switch (umur){
            case 0 :
                res = false;
                break;
            case 1 :
            case 2 :
                res = prob(1);
                break;
            case 3:
            case 4:
                res = prob(2);
                break;
            case 5:
            case 6:
                res = prob(3);
                break;
            case 7:
                res = prob(4);
                break;
            case 8:
                res = prob(5);
                break;
            case 9:
                res = prob(10);
                break;
            default:
                res = false;
                break;
        }
        if (res){
        }
        return res;
    }

    public static Sapi lahir() {
        Sapi sapi  = new Sapi(prob(4));
        return sapi;
    }
}
