package warmup.one;

public class WarmupOneFirstSet {

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

}
