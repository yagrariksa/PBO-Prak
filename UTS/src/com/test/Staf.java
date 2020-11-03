package com.test;

public class Staf extends Pegawai {

    private Integer jumlahKehadiran, TARIF_HARIAN;

    public Staf(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
        this.jumlahKehadiran = 0;
        this.TARIF_HARIAN = 0;
    }

    public Integer getJumlahKehadiran() {
        return jumlahKehadiran;
    }

    public void setJumlahKehadiran(Integer jumlahKehadiran) {
        this.jumlahKehadiran = jumlahKehadiran;
        this.refreshGaji();
    }

    public Integer getTARIF_HARIAN() {
        return TARIF_HARIAN;
    }

    public void setTARIF_HARIAN(Integer TARIF_HARIAN) {
        this.TARIF_HARIAN = TARIF_HARIAN;
        this.refreshGaji();
    }

    private void refreshGaji(){
        int tambahan = this.getJumlahKehadiran()*this.getTARIF_HARIAN();
        int gajiawal = this.getGaji();
        int total = gajiawal+tambahan;
        this.setGaji(total);
    }

    @Override
    public int getGaji() {
        return super.getGaji();
    }

    @Override
    public String toString() {
        return
                super.toString() +
                "\njumlahKehadiran = " + jumlahKehadiran +
                "\nTARIF_HARIAN = " + TARIF_HARIAN ;
    }
}
