package warmup.one;

public class WarmupOneNinthSet {

    /**
     * Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the
     * event of a tie. Note that Math.abs(n) returns the absolute value of a number.
     *
     * @param a
     * @param b
     * @return
     */
    public int close10(int a, int b) {
        int absOfA = Math.abs(10 - a);
        int absOfB = Math.abs(10 - b);

        if (absOfA == absOfB) {
            return 0;
        }

        return absOfA < absOfB ? a : b;
    }
}
