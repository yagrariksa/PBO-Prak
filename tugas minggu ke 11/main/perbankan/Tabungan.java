package perbankan;

public class Tabungan {

    private Integer saldo;

    public Tabungan(Integer saldo) {
        this.saldo = saldo;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void simpanUang(Integer jumlah){
        this.saldo += jumlah;
    }

    public boolean ambilUang(Integer jumlah){
        if (this.saldo > jumlah) {
            this.saldo -= jumlah;
            return true;
        }else{
            return false;
        }
    }
}
