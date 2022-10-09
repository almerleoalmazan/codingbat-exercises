package warmup.two;

public class WarmupTwoThirdSet {
    /**
     * Given a string, return a version where all the "x" have been removed. Except an "x" at the
     * very start or end should not be removed.
     *
     * @param str
     * @return
     */
    public String stringX(String str) {
        String modifiedString = "";

        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == 'x' && i == 0) || str.charAt(str.length() - 1) == 'x' && (i == str.length()-1)) {
                modifiedString += str.charAt(i);
                continue;
            }

            if (str.charAt(i) != 'x') {
                modifiedString += str.charAt(i);
            }
        }

        return modifiedString;
    }
}
