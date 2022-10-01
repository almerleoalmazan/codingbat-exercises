package warmup.two;

public class WarmupTwoFirstSet {


    /**
     * Given a string and a non-negative int n, return a larger string that is n copies of the
     * original string.
     *
     * @param str
     * @param n
     * @return
     */
    public String stringTimes(String str, int n) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            result.append(str);
        }

        return result.toString();
    }

    /**
     * Given a string and a non-negative int n, we'll say that the front of the string is the first 3
     * chars, or whatever is there if the string is less than length 3. Return n copies of the front.
     *
     * @param str
     * @param n
     * @return
     */
    public String frontTimes(String str, int n) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (str.length() < 3) {
                result.append(str);
                continue;
            }

            result.append(str.substring(0, 3));
        }

        return result.toString();
    }
}
