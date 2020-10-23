package com.test;

import java.util.ArrayList;

public class Tim {
    public String nama;
    public ArrayList<Member> m = new ArrayList<Member>();

    public void setM(Member m) {
        this.m.add(m);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void displayFullMember(){
        for (int i=0; i<this.m.size();i++ ){
//            Member a = this.m.get(i);
//            try {
//                a.getLamaTraining();
//            } catch (Exception e ){
//                continue;
//            }
            if (this.m.get(i).getClass().getSimpleName().equals("Member")){
                this.m.get(i).display();
            }

        }
    }

    public void displayTrainee(){
        for (int i=0; i<this.m.size();i++ ){
//            Member a = ;
//            try {
//                a.getLamaTraining();
//            } catch (Exception e){
//                a.display();
//            }
            if (this.m.get(i).getClass().getSimpleName().equals("Trainee")){
                this.m.get(i).display();
            }


        }
    }
}
