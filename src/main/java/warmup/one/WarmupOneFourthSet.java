package warmup.one;

public class WarmupOneFourthSet {

    /**
     * Given a non-empty string and an int n, return a new string where the char at index n has
     * been removed. The value of n will be a valid index of a char in the original string (i.e. n will
     * be in the range 0..str.length()-1 inclusive).
     *
     * @param str
     * @param n
     * @return
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
     * @return
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
}
