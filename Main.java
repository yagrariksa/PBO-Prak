public class Main {

    public static void main(String[] args) {

        DoraMini dora = new DoraMini("dora","Boots",2020);
        dora.displayData();
        dora.sayDora();

        PermainanArcade arcade = new PermainanArcade();
        arcade.jalankan();

        PermainanStrategy strategy = new PermainanStrategy();
        strategy.jalankan();

//        kode dibawah ini akan membuat program error
//        Permainan p = new Permainan();
    }
}

