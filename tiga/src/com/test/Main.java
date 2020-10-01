package com.test;

class GameCharacter{
    private String name;
    private Integer lifePoint, attackHitPoint, attackKickPoint;

    public GameCharacter(String name, Integer attackHitPoint, Integer attackKickPoint) {
        this.name = name;
        this.attackHitPoint = attackHitPoint;
        this.attackKickPoint = attackKickPoint;
        this.lifePoint = 100;
    }

    public void damage(int x){
        this.lifePoint = this.lifePoint - x;
    }

    public String getName() {
        return name;
    }

    public Integer getLifePoint() {
        return lifePoint;
    }

    public void hit(GameCharacter b){
        if ( b == this ){
            System.out.println("tidak bisa melukai diri sendiri");
        }else if (b.die()){
            System.out.println(b.getName() + ":: musuh sudah mati, tidak bisa dikenai aksi");
        }else if(this.die()){
            System.out.println(this.getName() + ":: anda sudah mati, tidak bisa melakukan aksi");
        }else{
            System.out.println(this.getName() + " memukul " + b.getName());
            b.damage(this.attackHitPoint);
        }
    }

    public void kick(GameCharacter b){
        if ( b == this ){
            System.out.println("tidak bisa melukai diri sendiri");
        }else if (b.die()){
            System.out.println(b.getName() + ":: musuh sudah mati, tidak bisa dikenai aksi");
        }else if(this.die()){
            System.out.println(this.getName() + ":: anda sudah mati, tidak bisa melakukan aksi");
        }else{
            System.out.println(this.getName() + " menendang " + b.getName());
            b.damage(this.attackKickPoint);
        }
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' + "\n" +
                "lifePoint=" + lifePoint + "\n";
    }

    public boolean die(){
        if ( this.getLifePoint() <= 0 ){
            return true;
        }else{
            return false;
        }
    }

    public void compare(GameCharacter b){
        int selisih;
        if (this.getLifePoint() > b.getLifePoint()){
            selisih = this.getLifePoint() - b.getLifePoint();
            System.out.println("selisih nyawa : " + selisih);
            System.out.println("winner : " + this.getName());
        }else if(this.getLifePoint() < b.getLifePoint()){
            selisih = b.getLifePoint() - this.getLifePoint();
            System.out.println("selisih nyawa : " + selisih);
            System.out.println("winner : " + b.getName());
        }else{
            System.out.println("selisih nyawa : 0");
            System.out.println("seri");
        }
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        GameCharacter raiden = new GameCharacter("Raiden",10,20);
        GameCharacter subzero = new GameCharacter("Sub-Zero", 5,25);

        System.out.println("PERTARUNGAN DIMULAI");
        raiden.kick(subzero);
        subzero.kick(raiden);
        for (int i=0;i<3;i++){
            subzero.hit(raiden);
        }
        for (int i=0;i<4;i++){
            raiden.kick(subzero);
        }
        subzero.hit(raiden);
        raiden.kick(subzero);
        raiden.hit(raiden);
        System.out.println("PERTARUNGAN BERAKHIR");

        System.out.println("\n" + raiden + "\n" + subzero);

        raiden.compare(subzero);

        
//        if(raiden.getLifePoint() > subzero.getLifePoint()){
//            int selisih = raiden.getLifePoint() - subzero.getLifePoint();
//            System.out.println("selisih nyawa : " + selisih);
//            System.out.println("winner : " + raiden.getName());
//        }else {
//            int selisih = subzero.getLifePoint() - raiden.getLifePoint();
//            System.out.println("selisih nyawa : " + selisih);
//            System.out.println("winner : " + subzero.getName());
//        }
    }
}
