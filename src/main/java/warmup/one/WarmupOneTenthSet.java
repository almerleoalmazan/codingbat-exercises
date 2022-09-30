package warmup.one;

public class WarmupOneTenthSet {

    /**
     * Return true if the given string contains between 1 and 3 'e' chars.
     *
     * @param str
     * @return
     */
    public boolean stringE(String str) {
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                counter += 1;
            }
        }
        return counter >= 1 && counter <= 3;
    }
}
