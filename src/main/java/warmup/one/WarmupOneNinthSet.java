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

    /**
     * Given 2 ints, return true if they are both in the range 30..40 inclusive, or they are
     * both in the range 40..50 inclusive.
     *
     * @param a
     * @param b
     * @return
     */
    public boolean in3050(int a, int b) {
        boolean isAInTheRangeOf30To40 = a >= 30 && a <= 40;
        boolean isBInTheRangeOf30To40 = b >= 30 && b <= 40;
        boolean isAInTheRangeOf40To50 = a >= 40 && a <= 50;
        boolean isBInTheRangeOf40To50 = b >= 40 && b <= 50;

        return isAInTheRangeOf30To40 && isBInTheRangeOf30To40
                || isAInTheRangeOf40To50 && isBInTheRangeOf40To50;
    }


    /**
     * Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or
     * return 0 if neither is in the range.
     *
     * @param a
     * @param b
     * @return
     */
    public int max1020(int a, int b) {
        boolean inRangeOfA = a >= 10 && a <= 20;
        boolean inRangeOfB = b >= 10 && b <= 20;

        if (inRangeOfA && inRangeOfB) {
            return Math.max(a, b);
        }

        if (inRangeOfA) {
            return a;
        }

        if (inRangeOfB) {
            return b;
        }

        return 0;
    }
}
