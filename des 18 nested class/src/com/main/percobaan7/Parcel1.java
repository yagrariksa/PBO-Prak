package com.main.percobaan7;

public class Parcel1 {

    public static void main(String[] args){
        Parcel1 p = new Parcel1();
        Tujuan t = p.ke("Hello World");
        System.out.println(t.bacaLabel());
    }

    public Tujuan ke(String s){
        class Tujuannya implements Tujuan{
            private String label;

            Tujuannya(String tuj){
                label = tuj;
            }

            @Override
            public String bacaLabel() {
                return label;
            }
        }
        return new Tujuannya(s);
    }
}

interface Tujuan{
    String bacaLabel();
}
