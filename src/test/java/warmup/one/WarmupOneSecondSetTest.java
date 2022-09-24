package warmup.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WarmupOneSecondSetTest {
    private WarmupOneSecondSet warmupOneSecondSet;

    @BeforeEach
    void setup() {
        warmupOneSecondSet = new WarmupOneSecondSet();
    }

    /**
     * diff21
     */
    @Test
    void givenNineteen_whenDiff21_thenReturnTwo() {
        var actual = warmupOneSecondSet.diff21(19);
        assertThat(actual)
                .isEqualTo(2);
    }

    @Test
    void givenTen_whenDiff21_thenReturnEleven() {
        var actual = warmupOneSecondSet.diff21(10);
        assertThat(actual)
                .isEqualTo(11);
    }

    @Test
    void givenTwentyOne_whenDiff21_thenReturnZero() {
        var actual = warmupOneSecondSet.diff21(21);
        assertThat(actual)
                .isEqualTo(0);
    }

    @Test
    void givenTwentyTwo_whenDiff21_thenReturnTwo() {
        var actual = warmupOneSecondSet.diff21(22);
        assertThat(actual)
                .isEqualTo(2);
    }

    @Test
    void givenTwentyFive_whenDiff21_thenReturnEight() {
        var actual = warmupOneSecondSet.diff21(25);
        assertThat(actual)
                .isEqualTo(8);
    }

    @Test
    void givenThirty_whenDiff21_thenReturnEighteen() {
        var actual = warmupOneSecondSet.diff21(30);
        assertThat(actual)
                .isEqualTo(18);
    }

    @Test
    void givenZero_whenDiff21_thenReturnTwentyOne() {
        var actual = warmupOneSecondSet.diff21(0);
        assertThat(actual)
                .isEqualTo(21);
    }

    @Test
    void givenOne_whenDiff21_thenReturnTwenty() {
        var actual = warmupOneSecondSet.diff21(1);
        assertThat(actual)
                .isEqualTo(20);
    }

    @Test
    void givenTwo_whenDiff21_thenReturnNineteen() {
        var actual = warmupOneSecondSet.diff21(2);
        assertThat(actual)
                .isEqualTo(19);
    }

    @Test
    void givenNegativeOne_whenDiff21_thenReturnTwentyTwo() {
        var actual = warmupOneSecondSet.diff21(-1);
        assertThat(actual)
                .isEqualTo(22);
    }

    @Test
    void givenNegativeTwo_whenDiff21_thenReturnTwentyThree() {
        var actual = warmupOneSecondSet.diff21(-2);
        assertThat(actual)
                .isEqualTo(23);
    }

    @Test
    void givenFifty_whenDiff21_thenReturnFiftyEight() {
        var actual = warmupOneSecondSet.diff21(50);
        assertThat(actual)
                .isEqualTo(58);
    }


    /**
     * parrotTrouble
     */
    @Test
    void givenTrueAndSix_whenParrotTrouble_thenReturnTrue() {
        var actual = warmupOneSecondSet.parrotTrouble(true, 6);
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenTrueAndSeven_whenParrotTrouble_thenReturnFalse() {
        var actual = warmupOneSecondSet.parrotTrouble(true, 7);
        assertThat(actual)
                .isFalse();
    }

    @Test
    void givenFalseAndSix_whenParrotTrouble_thenReturnFalse() {
        var actual = warmupOneSecondSet.parrotTrouble(false, 6);
        assertThat(actual)
                .isFalse();
    }

    @Test
    void givenTrueAndTwentyOne_whenParrotTrouble_thenReturnTrue() {
        var actual = warmupOneSecondSet.parrotTrouble(true, 21);
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenFalseAndTwentyOne_whenParrotTrouble_thenReturnFalse() {
        var actual = warmupOneSecondSet.parrotTrouble(false, 21);
        assertThat(actual)
                .isFalse();
    }

    @Test
    void givenFalseAndTwenty_whenParrotTrouble_thenReturnFalse() {
        var actual = warmupOneSecondSet.parrotTrouble(false, 20);
        assertThat(actual)
                .isFalse();
    }

    @Test
    void givenTrueAndTwentyThree_whenParrotTrouble_thenReturnTrue() {
        var actual = warmupOneSecondSet.parrotTrouble(true, 23);
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenFalseAndTwentyThree_whenParrotTrouble_thenReturnFalse() {
        var actual = warmupOneSecondSet.parrotTrouble(false, 23);
        assertThat(actual)
                .isFalse();
    }

    @Test
    void givenTrueAndTwenty_whenParrotTrouble_thenReturnFalse() {
        var actual = warmupOneSecondSet.parrotTrouble(true, 20);
        assertThat(actual)
                .isFalse();
    }

    @Test
    void givenFalseAndTwelve_whenParrotTrouble_thenReturnFalse() {
        var actual = warmupOneSecondSet.parrotTrouble(false, 12);
        assertThat(actual)
                .isFalse();
    }


    /**
     * makes10
     */
    @Test
    void givenNineAndTen_whenMakes10_thenReturnTrue() {
        var actual = warmupOneSecondSet.makes10(9, 10);
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenNineAndNine_whenMakes10_thenReturnFalse() {
        var actual = warmupOneSecondSet.makes10(9, 9);
        assertThat(actual)
                .isFalse();
    }

    @Test
    void givenOneAndNine_whenMakes10_thenReturnTrue() {
        var actual = warmupOneSecondSet.makes10(1, 9);
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenTenAndOne_whenMakes10_thenReturnTrue() {
        var actual = warmupOneSecondSet.makes10(10, 1);
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenTenAndTen_whenMakes10_thenReturnTrue() {
        var actual = warmupOneSecondSet.makes10(10, 10);
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenEightAndTwo_whenMakes10_thenReturnTrue() {
        var actual = warmupOneSecondSet.makes10(8, 2);
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenEightAndThree_whenMakes10_thenReturnFalse() {
        var actual = warmupOneSecondSet.makes10(8, 3);
        assertThat(actual)
                .isFalse();
    }

    @Test
    void givenTenAndFortyTwo_whenMakes10_thenReturnTrue() {
        var actual = warmupOneSecondSet.makes10(10, 42);
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenTwelveAndNegativeTwo_whenMakes10_thenReturnTrue() {
        var actual = warmupOneSecondSet.makes10(12, -2);
        assertThat(actual)
                .isTrue();
    }
}
