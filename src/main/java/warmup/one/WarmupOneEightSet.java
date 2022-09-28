package warmup.one;

public class WarmupOneEightSet {

    /**
     * Return true if the given string begins with "mix", except the 'm' can be anything, so "pix",
     * "9ix" .. all count.
     *
     * @param str
     * @return boolean
     */
    public boolean mixStart(String str) {
        if (str.length() < 3) {
            return false;
        }

        return str.substring(1, 3).equals("ix");
    }


    /**
     * Given a string, return a string made of the first 2 chars (if present), however include first
     * char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
     *
     * @param str
     * @return
     */
    public String startOz(String str) {
        String theWord = "";

        if (str.length() >= 1 && str.charAt(0) == 'o') {
            theWord += String.valueOf(str.charAt(0));
        }

        if (str.length() >= 2 && str.charAt(1) == 'z') {
            theWord += String.valueOf(str.charAt(1));
        }

        return theWord;
    }

    /**
     * Given three int values, a b c, return the largest.
     *
     * @param a
     * @param b
     * @param c
     * @return int
     */
    public int intMax(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
}
