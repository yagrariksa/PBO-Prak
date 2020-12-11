public class PermainanStrategy extends Permainan {
    @Override
    public int hitungSkor(int hit, int miss) {
        int skor = hit*5;
        return skor;
    }
}

