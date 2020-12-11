public abstract class Robot {

    protected String nama;
    protected String pemilik;
    protected int tahun;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public abstract void displayData();

}

