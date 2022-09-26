package warmup.one;

public class WarmupOneSixthSet {

    /**
     * Given a string, return true if the string starts with "hi" and false otherwise.
     *
     * @param str
     * @return boolean
     */
    public boolean startHi(String str) {
        return str.startsWith("hi");
    }


    /**
     * Given two temperatures, return true if one is less than 0 and the other is greater than 100.
     *
     * @param temp1
     * @param temp2
     * @return boolean
     */
    public boolean icyHot(int temp1, int temp2) {
        return temp1 < 0 && temp2 > 100 || temp1 > 100 && temp2 < 0;
    }

    /**
     * Given 2 int values, return true if either of them is in the range 10..20 inclusive.
     *
     * @param a
     * @param b
     * @return boolean
     */
    public boolean in1020(int a, int b) {
        if (a > 9 && a < 21) {
            return true;
        }

        return b > 9 && b < 21;
    }
}
