package com.main.percobaan1;

public class Perc1 {
    private String variabelLuar = "variabel luar";

    class Dalam{
        String varabelDalam = "variabel dalam";

        public void bicara(){
            System.out.println(this.varabelDalam);
            System.out.println(variabelLuar);
        }
    }
}

class TestDalam{
    public static void main(String args[]){
        Perc1 l = new Perc1();
        Perc1.Dalam d = l.new Dalam();
        d.bicara();
    }
}

