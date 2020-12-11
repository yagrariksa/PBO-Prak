package com.test;

public class Programmer extends Pegawai{

    protected int bonus;

    Programmer(String nama, int gaji, int bonus) {
        super(nama, gaji);
        this.bonus = bonus;
    }

    @Override
    public int infoGaji() {
        return super.infoGaji();
    }

    public int infoBonus() {
        return bonus;
    }
}
