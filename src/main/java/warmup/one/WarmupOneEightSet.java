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
}
