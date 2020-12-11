public class PermainanArcade extends Permainan {
    @Override
    public int hitungSkor(int hit, int miss) {
        int skor = (hit*3) - (miss*1);
        return skor;
    }
}


