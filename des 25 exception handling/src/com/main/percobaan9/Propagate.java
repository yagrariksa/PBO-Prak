package com.main.percobaan9;

public class Propagate {

    public static void main(String[] args){
        try {
            System.out.println(reverse("this is a string"));
        }catch (Exception e){
            System.out.println("This string was blank");
        }finally {
            System.out.println("all done");
        }
    }

    public static String reverse(String a) throws Exception
    {
        if (a.length() == 0){
            throw new Exception();
        }

        String reverseStr= "";
        for (int i=a.length(); i>=0 ; i--){
            reverseStr+=a.charAt(i);
        }
        return reverseStr;
    }
}
