package warmup.one;

public class WarmupOneThirdSet {

    /**
     * Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes
     * the absolute value of a number.
     *
     * @param n
     * @return boolean
     */
    public boolean nearHundred(int n) {
        int absoluteValueOf100 = Math.abs(n - 100);
        int absoluteValueOf200 = Math.abs(n - 200);
        return absoluteValueOf100 < 10
                || absoluteValueOf100 == 10
                || absoluteValueOf200 < 10
                || absoluteValueOf200 == 10;
    }
}
