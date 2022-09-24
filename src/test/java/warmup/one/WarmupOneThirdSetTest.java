package warmup.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WarmupOneThirdSetTest {
    private WarmupOneThirdSet warmupOneThirdSet;

    @BeforeEach
    void setup() {
        warmupOneThirdSet = new WarmupOneThirdSet();
    }

    /** nearHundred */
    @Test
    void givenNinetyThree_whenNearHundred_thenReturnTrue() {
        var actual = warmupOneThirdSet.nearHundred(93);
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenNinety_whenNearHundred_thenReturnTrue() {
        var actual = warmupOneThirdSet.nearHundred(90);
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenEightyNine_whenNearHundred_thenReturnFalse() {
        var actual = warmupOneThirdSet.nearHundred(89);
        assertThat(actual)
                .isFalse();
    }

    @Test
    void givenOneHundredTen_whenNearHundred_thenReturnTrue() {
        var actual = warmupOneThirdSet.nearHundred(110);
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenOneHundredEleven_whenNearHundred_thenReturnFalse() {
        var actual = warmupOneThirdSet.nearHundred(111);
        assertThat(actual)
                .isFalse();
    }

    @Test
    void givenOneHundredTwentyOne_whenNearHundred_thenReturnFalse() {
        var actual = warmupOneThirdSet.nearHundred(121);
        assertThat(actual)
                .isFalse();
    }

    @Test
    void givenNegativeOneHundredOne_whenNearHundred_thenReturnFalse() {
        var actual = warmupOneThirdSet.nearHundred(-101);
        assertThat(actual)
                .isFalse();
    }

    @Test
    void givenNegativeTwoHundredNine_whenNearHundred_thenReturnFalse() {
        var actual = warmupOneThirdSet.nearHundred(-209);
        assertThat(actual)
                .isFalse();
    }

    @Test
    void givenOneHundredNinety_whenNearHundred_thenReturnTrue() {
        var actual = warmupOneThirdSet.nearHundred(190);
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenZero_whenNearHundred_thenReturnFalse() {
        var actual = warmupOneThirdSet.nearHundred(0);
        assertThat(actual)
                .isFalse();
    }

    @Test
    void givenFive_whenNearHundred_thenReturnFalse() {
        var actual = warmupOneThirdSet.nearHundred(5);
        assertThat(actual)
                .isFalse();
    }

    @Test
    void givenNegativeFifty_whenNearHundred_thenReturnFalse() {
        var actual = warmupOneThirdSet.nearHundred(-50);
        assertThat(actual)
                .isFalse();
    }

    @Test
    void givenOneHundredNinetyOne_whenNearHundred_thenReturnTrue() {
        var actual = warmupOneThirdSet.nearHundred(191);
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenOneHundredEightyNine_whenNearHundred_thenReturnFalse() {
        var actual = warmupOneThirdSet.nearHundred(189);
        assertThat(actual)
                .isFalse();
    }

    @Test
    void givenTwoHundred_whenNearHundred_thenReturnTrue() {
        var actual = warmupOneThirdSet.nearHundred(200);
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenTwoHundredTen_whenNearHundred_thenReturnTrue() {
        var actual = warmupOneThirdSet.nearHundred(210);
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenTwoHundredEleven_whenNearHundred_thenReturnFalse() {
        var actual = warmupOneThirdSet.nearHundred(211);
        assertThat(actual)
                .isFalse();
    }

    @Test
    void givenTwoHundredNinety_whenNearHundred_thenReturnFalse() {
        var actual = warmupOneThirdSet.nearHundred(290);
        assertThat(actual)
                .isFalse();
    }
}