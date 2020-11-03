package com.test;

public class Dosen extends Pegawai {

    private Integer jumlahSKS, TARIF_SKS;

    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
        this.jumlahSKS = 0;
        this.TARIF_SKS = 0;
    }

    public Integer getJumlahSKS() {
        return jumlahSKS;
    }

    public void setJumlahSKS(Integer jumlahSKS) {
        this.jumlahSKS = jumlahSKS;
        this.refreshGaji();
    }

    public Integer getTARIF_SKS() {
        return TARIF_SKS;
    }

    public void setTARIF_SKS(Integer TARIF_SKS) {
        this.TARIF_SKS = TARIF_SKS;
        this.refreshGaji();

    }

    private void refreshGaji(){
        int tambahan = this.getJumlahSKS()*this.getTARIF_SKS();
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
                "\njumlahSKS = " + jumlahSKS +
                "\nTARIF_SKS = " + TARIF_SKS ;
    }
}
