package warmup.one;

public class WarmupOneFourthSet {

    /**
     * Given a non-empty string and an int n, return a new string where the char at index n has
     * been removed. The value of n will be a valid index of a char in the original string (i.e. n will
     * be in the range 0..str.length()-1 inclusive).
     *
     * @param str
     * @param n
     * @return String
     */
    public String missingChar(String str, int n) {
        if (n == 0) {
            return str.substring(1);
        }

        return str.substring(0, n) + str.substring(n+1);
    }

    /**
     * Given a string, return a new string where the first and last chars have been exchanged.
     *
     * @param str
     * @return String
     */
    public String frontBack(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return str;
        }

        String firstCharacter = str.substring(0, 1);
        String lastCharacter = str.substring(str.length()-1);
        String otherCharacters = str.substring(1, str.length()-1);

        return lastCharacter + otherCharacters + firstCharacter;
    }

    /**
     * Given a string, we'll say that the front is the first 3 chars of the string. If the string length
     * is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.
     *
     * @param str
     * @return String
     */
    public String front3(String str) {
        String resultString = "";

        if (str.length() < 3) {
            return str + str + str;
        }

        resultString = str.substring(0, 3);

        return resultString + resultString + resultString;
    }
}
