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

    /**
     * Given a string, return a new string where the last 3 chars are now in upper case. If the
     * string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase()
     * returns the uppercase version of a string.
     *
     * @param str
     * @return
     */
    public String endUp(String str) {
        if (str.length() > 3) {
            int endIndex = str.length() - 3;
            String endStr = str.substring(str.length()-3);

            return str.substring(0, endIndex) + endStr.toUpperCase();
        }

        return str.toUpperCase();
    }

    /**
     * Given a non-empty string and an int N, return the string made starting with char 0, and
     * then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or
     * more.
     *
     * @param str
     * @param n
     * @return
     */
    public String everyNth(String str, int n) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (i % n == 0) {
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }
}
