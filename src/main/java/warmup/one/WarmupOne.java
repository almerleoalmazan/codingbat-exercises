package warmup.one;

public class WarmupOne {

    /**
     * The parameter weekday is true if it is a weekday, and the parameter vacation is true if we
     * are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we
     * sleep in.
     *
     * @param weekday
     * @param vacation
     * @return boolean
     */
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }


    /**
     * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is
     * smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return
     * true if we are in trouble.
     *
     * @param aSmile
     * @param bSmile
     * @return boolean
     */
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile && bSmile || !aSmile && !bSmile;
    }

    /**
     * Given two int values, return their sum. Unless the two values are the same, then return double their sum.
     *
     * @param a
     * @param b
     * @return int
     */
    public int sumDouble(int a, int b) {
        return a == b ? (a+b) * 2 : a+b;
    }

    /**
     * Given an int n, return the absolute difference between n and 21, except return double the
     * absolute difference if n is over 21.
     *
     * @param n
     * @return int
     */
    public int diff21(int n) {
        int difference = n - 21;
        return n > 21 ? Math.abs(difference)*2 : Math.abs(difference);
    }

    /**
     * We have a loud talking parrot. The "hour" parameter is the current hour time in the range
     * 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return
     * true if we are in trouble.
     *
     * @param talking
     * @param hour
     * @return
     */
    public boolean parrotTrouble(boolean talking, int hour) {
        return talking && (hour < 7 || hour > 20);
    }

    /**
     * Given 2 ints, a and b, return true if one of them is 10 or if their sum is 10.
     *
     * @param a
     * @param b
     * @return boolean
     */
    public boolean makes10(int a, int b) {
        return a == 10 || b == 10 || (a+b) == 10;
    }
}
