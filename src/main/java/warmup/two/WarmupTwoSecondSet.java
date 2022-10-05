package warmup.two;

public class WarmupTwoSecondSet {

    /**
     * Given a non-empty string like "Code" return a string like "CCoCodCode".
     *
     * @param str
     * @return
     */
    public String stringSplosion(String str) {
        int count = 0;
        int strLen = str.length();
        String modifiedString = "";

        while (strLen >= count) {
            modifiedString += str.substring(0, count);
            count++;
        }

        return modifiedString;
    }
}
