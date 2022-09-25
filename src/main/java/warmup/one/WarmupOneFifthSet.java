package warmup.one;

public class WarmupOneFifthSet {

    /**
     * Given a string, take the last char and return a new string with the last char added at the
     * front and back, so "cat" yields "tcatt". The original string will be length 1 or more.
     *
     * @param str
     * @return String
     */
    public String backAround(String str) {
        String character = str.substring(str.length()-1);

        return character + str + character;
    }

    /**
     * Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the
     * % "mod" operator.
     *
     * @param n
     * @return boolean
     */
    public boolean or35(int n) {
        return n % 3 == 0 || n % 5 == 0;
    }
}
