package warmup.one;

public class WarmupOneTenthSet {

    /**
     * Return true if the given string contains between 1 and 3 'e' chars.
     *
     * @param str
     * @return
     */
    public boolean stringE(String str) {
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                counter += 1;
            }
        }
        return counter >= 1 && counter <= 3;
    }

    /**
     * Given two non-negative int values, return true if they have the same last digit, such as
     * with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
     *
     * @param a
     * @param b
     * @return
     */
    public boolean lastDigit(int a, int b) {
        return b % 10 == a % 10;
    }
}
