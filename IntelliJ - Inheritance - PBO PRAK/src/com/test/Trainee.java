package com.test;

public class Trainee extends Member {
    public Integer lamaTraining;

    public Trainee(String nama, Integer umur, Integer lamaTraining) {
        super(nama, umur);
        this.lamaTraining = lamaTraining;
    }

    public Integer getLamaTraining() {
        return lamaTraining;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Lama Training : " + this.lamaTraining);
    }
}
