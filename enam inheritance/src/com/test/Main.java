package com.test;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Tim t = new Tim();
        t.setNama("Tim T");

        Member m1 = new Member("Melody",23);
        Member m2 = new Member("Haruka",23);
        Member m3 = new Member("Kinal",19);
        Trainee t1 = new Trainee("Alicia",17,3);
        Trainee t2 = new Trainee("Alicia",17,5);

        t.setM(m1);
        t.setM(m2);
        t.setM(m3);
        t.setM(t1);
        t.setM(t2);

        System.out.println("full member");
        t.displayFullMember();
        System.out.println("\nTrainee");
        t.displayTrainee();
    }
}
