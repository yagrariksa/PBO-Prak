package com.main;

public class Sapi {

    Integer umur;
    Boolean hidup; // true hidup :: false mati
    Boolean kelamin; // true laki2 :: false betina

    public Sapi(Boolean kelamin) {
        this.kelamin = kelamin;
        this.umur = 0;
        this.hidup = true;
    }

    @Override
    public String toString() {
        String str = "Umur : " + umur + '\n' +
                "kelamin : " + kelamin + '\n' +
                "hidup : " + hidup;
        return str;
    }
}
