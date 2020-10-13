
class Vektor {
    private final double[] vektor = {0,0,0};

    public Vektor(){}

    public Vektor(double x, double y, double z) {
        setVektor(x,y,z);
    }

    public void setX(double x){
        this.vektor[0] = x;
    }

    public void setY(double y){
        this.vektor[1] = y;
    }

    public void setZ(double z){
        this.vektor[2] = z;
    }

    public void setVektor(double x, double y, double z){
        this.setX(x);
        this.setY(y);
        this.setZ(z);
    }

    public double getX(){
        return this.vektor[0];
    }

    public double getY(){
        return this.vektor[1];
    }

    public double getZ(){
        return this.vektor[2];
    }

    public String tampil(){
        String a = "[" + getX() +
                "," + getY() +
                "," + getZ() + "]";
        System.out.println(a);
        return a;
    }

    public Vektor jumlahV(Vektor a){
        double x = a.getX() + this.getX();
        double y = a.getY() + this.getY();
        double z = a.getZ() + this.getZ();
        return new Vektor(x,y,z);
    }

    public Vektor kurangV(Vektor a){
        double x = this.getX() - a.getX();
        double y = this.getY() - a.getY();
        double z = this.getZ() - a.getZ();
        return new Vektor(x,y,z);
    }

    public Vektor kaliS(double a){
        return new Vektor(getX()*a,getY()*a,getZ()*a);
    }

    public Vektor bagiS(double b){
        return new Vektor(getX()/b,getY()/b,getZ()/b);
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Vektor a = new Vektor(3,4,5);
        Vektor b = a.kaliS(2);
        Vektor c = a.bagiS(2);
        Vektor d = a.jumlahV(b);
        Vektor e = b.kurangV(a);
        a.tampil();
        b.tampil();
        c.tampil();
        d.tampil();
        e.tampil();
    }
}

