package warmup.one;

public class WarmupOneSeventhSet {

    /**
     * We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values,
     * return true if 1 or more of them are teen.
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public boolean hasTeen(int a, int b, int c) {
        if (a > 12 && a < 20) {
            return true;
        }

        if (b > 12 && b < 20) {
            return true;
        }

        return c > 12 && c < 20;
    }
}
