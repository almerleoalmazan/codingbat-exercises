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

    /**
     * We'll say that a number is "teen" if it is in the range of 13..19 inclusive. Given 2 int values,
     * return true if one or the other is teen, but not both.
     *
     * @param a
     * @param b
     * @return boolean
     */
    public boolean loneTeen(int a, int b) {
        if (a > 12 && a < 20 && !(b > 12 && b < 20)) {
            return true;
        }

        return b > 12 && b < 20 && !(a > 12 && a < 20);
    }
}
