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

    /**
     * Given an array of ints, return the number of 9's in the array.
     *
     * @param nums
     * @return
     */
    public int arrayCount9(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (num == 9) {
                count++;
            }
        }

        return count;
    }

    /**
     * Given an array of ints, return true if one of the first 4 elements in the array is a 9. The
     * array length may be less than 4.
     *
     * @param nums
     * @return
     */
    public boolean arrayFront9(int[] nums) {
        int numsLen = nums.length;

        if (numsLen > 4) {
            numsLen = 4;
        }

        for (int i = 0; i < numsLen; i++) {
            if (nums[i] == 9) {
                return true;
            }
        }

        return false;
    }

    /**
     * Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
     *
     * @param nums
     * @return
     */
    public boolean array123(int[] nums) {
        int numsLen = nums.length / 2;

        if (nums.length < 3) return false;

        for (int i = 0; i < numsLen+1; i++) {
            if (nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3) {
                return true;
            }
        }

        return false;
    }

    /**
     * Given 2 strings, a and b, return the number of the positions where they contain the same
     * length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az"
     * substrings appear in the same place in both strings.
     *
     * @param a
     * @param b
     * @return
     */
    public int stringMatch(String a, String b) {
        int strLen = Math.min(a.length(), b.length());
        int count = 0;

        if (strLen < 2) return 0;

        for (int i = 0; i < strLen - 1; i++) {
            if (a.substring(i, i+2).equals(b.substring(i, i+2))) {
                count++;
            }
        }

        return count;
    }
}
