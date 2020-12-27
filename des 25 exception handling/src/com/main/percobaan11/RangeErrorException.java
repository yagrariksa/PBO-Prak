package com.main.percobaan11;

public class RangeErrorException extends Throwable {
    public RangeErrorException(String s){
        super(s);
    }

    public static void main(String[] args){
        int pos = 1;
        try {
            if (pos>0){
                throw new RangeErrorException("position "+pos);
            }
        }catch (RangeErrorException e){
            System.out.println("range error: " + e.getMessage());
        }
        System.out.println("this is the last program");
    }
}
