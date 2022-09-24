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

    /**
     * Given 2 int values, return true if one is negative and one is positive. Except if the
     * parameter "negative" is true, then return true only if both are negative.
     *
     * @param a
     * @param b
     * @param negative
     * @return boolean
     */
    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return a < 0 && b < 0;
        }

        return a < 0 && b > 0 || a > 0 && b < 0 ;
    }

    /**
     * Given a string, return new string where "not" has been added to the front. However, if
     * the string already begins with "not", return the string unchanged. Note: use .equals() to
     * compare two strings.
     *
     * @param str
     * @return String
     */
    public String notString(String str) {
        if (str.startsWith("not")) {
            return str;
        }

        return "not ".concat(str);
    }
}
