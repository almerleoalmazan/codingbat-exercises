package warmup.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WarmupOneTest {
    private WarmupOne warmupOne;

    @BeforeEach
    void setup() {
        warmupOne = new WarmupOne();
    }

    /** sleepIn */
    @Test
    void givenNotWeekdayAndNotVacation_whenSleepIn_thenReturnTrue() {
        var actual = warmupOne.sleepIn(false, false);
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenWeekdayAndNotVacation_whenSleepIn_thenReturnTrue() {
        var actual = warmupOne.sleepIn(true, false);
        assertThat(actual)
                .isFalse();
    }

    @Test
    void givenNotWeekdayAndVacation_whenSleepIn_thenReturnTrue() {
        var actual = warmupOne.sleepIn(false, true);
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenWeekdayAndVacation_whenSleepIn_thenReturnTrue() {
        var actual = warmupOne.sleepIn(true, true);
        assertThat(actual)
                .isTrue();
    }

    /** monkeyTrouble */
    @Test
    void givenASmileAndBSmile_whenMonkeyTrouble_thenReturnTrue() {
        var actual = warmupOne.monkeyTrouble(true, true);
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenNotASmileAndNotBSmile_whenMonkeyTrouble_thenReturnTrue() {
        var actual = warmupOne.monkeyTrouble(false, false);
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenASmileAndNotBSmile_whenMonkeyTrouble_thenReturnFalse() {
        var actual = warmupOne.monkeyTrouble(true, false);
        assertThat(actual)
                .isFalse();
    }

    @Test
    void givenNotASmileAndBSmile_whenMonkeyTrouble_thenReturnFalse() {
        var actual = warmupOne.monkeyTrouble(false, true);
        assertThat(actual)
                .isFalse();
    }


    /** sumDouble */
    @Test
    void givenTwoDifferentNumbers_whenSumDouble_thenReturnSumOfTwoNumbers() {
        assertThat(warmupOne.sumDouble(1, 2))
                .isEqualTo(3);

        assertThat(warmupOne.sumDouble(3, 2))
                .isEqualTo(5);

        assertThat(warmupOne.sumDouble(-1, 0))
                .isEqualTo(-1);

        assertThat(warmupOne.sumDouble(0, 1))
                .isEqualTo(1);

        assertThat(warmupOne.sumDouble(3, 4))
                .isEqualTo(7);
    }

    @Test
    void givenTheSameNumber_whenSumDouble_thenReturnDoubleTheirSum() {
        var actual = warmupOne.sumDouble(2, 2);
        assertThat(actual)
                .isEqualTo(8);

        actual = warmupOne.sumDouble(3, 3);
        assertThat(actual)
                .isEqualTo(12);

        actual = warmupOne.sumDouble(0, 0);
        assertThat(actual)
                .isEqualTo(0);
    }


    /** diff21 */
    @Test
    void givenNineteen_whenDiff21_thenReturnTwo() {
        var actual = warmupOne.diff21(19);
        assertThat(actual)
                .isEqualTo(2);
    }

    @Test
    void givenTen_whenDiff21_thenReturnEleven() {
        var actual = warmupOne.diff21(10);
        assertThat(actual)
                .isEqualTo(11);
    }

    @Test
    void givenTwentyOne_whenDiff21_thenReturnZero() {
        var actual = warmupOne.diff21(21);
        assertThat(actual)
                .isEqualTo(0);
    }

    @Test
    void givenTwentyTwo_whenDiff21_thenReturnTwo() {
        var actual = warmupOne.diff21(22);
        assertThat(actual)
                .isEqualTo(2);
    }

    @Test
    void givenTwentyFive_whenDiff21_thenReturnEight() {
        var actual = warmupOne.diff21(25);
        assertThat(actual)
                .isEqualTo(8);
    }

    @Test
    void givenThirty_whenDiff21_thenReturnEighteen() {
        var actual = warmupOne.diff21(30);
        assertThat(actual)
                .isEqualTo(18);
    }

    @Test
    void givenZero_whenDiff21_thenReturnTwentyOne() {
        var actual = warmupOne.diff21(0);
        assertThat(actual)
                .isEqualTo(21);
    }

    @Test
    void givenOne_whenDiff21_thenReturnTwenty() {
        var actual = warmupOne.diff21(1);
        assertThat(actual)
                .isEqualTo(20);
    }

    @Test
    void givenTwo_whenDiff21_thenReturnNineteen() {
        var actual = warmupOne.diff21(2);
        assertThat(actual)
                .isEqualTo(19);
    }

    @Test
    void givenNegativeOne_whenDiff21_thenReturnTwentyTwo() {
        var actual = warmupOne.diff21(-1);
        assertThat(actual)
                .isEqualTo(22);
    }

    @Test
    void givenNegativeTwo_whenDiff21_thenReturnTwentyThree() {
        var actual = warmupOne.diff21(-2);
        assertThat(actual)
                .isEqualTo(23);
    }

    @Test
    void givenFifty_whenDiff21_thenReturnFiftyEight() {
        var actual = warmupOne.diff21(50);
        assertThat(actual)
                .isEqualTo(58);
    }


    /** parrotTrouble */
    @Test
    void givenTrueAndSix_whenParrotTrouble_thenReturnTrue() {
        var actual = warmupOne.parrotTrouble(true, 6);
        assertThat(actual)
                .isTrue();
    }
    
    @Test
    void givenTrueAndSeven_whenParrotTrouble_thenReturnFalse() {
        var actual = warmupOne.parrotTrouble(true, 7);
        assertThat(actual)
                .isFalse();
    }

    @Test
    void givenFalseAndSix_whenParrotTrouble_thenReturnFalse() {
        var actual = warmupOne.parrotTrouble(false, 6);
        assertThat(actual)
                .isFalse();
    }

    @Test
    void givenTrueAndTwentyOne_whenParrotTrouble_thenReturnTrue() {
        var actual = warmupOne.parrotTrouble(true, 21);
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenFalseAndTwentyOne_whenParrotTrouble_thenReturnFalse() {
        var actual = warmupOne.parrotTrouble(false, 21);
        assertThat(actual)
                .isFalse();
    }

    @Test
    void givenFalseAndTwenty_whenParrotTrouble_thenReturnFalse() {
        var actual = warmupOne.parrotTrouble(false, 20);
        assertThat(actual)
                .isFalse();
    }

    @Test
    void givenTrueAndTwentyThree_whenParrotTrouble_thenReturnTrue() {
        var actual = warmupOne.parrotTrouble(true, 23);
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenFalseAndTwentyThree_whenParrotTrouble_thenReturnFalse() {
        var actual = warmupOne.parrotTrouble(false, 23);
        assertThat(actual)
                .isFalse();
    }

    @Test
    void givenTrueAndTwenty_whenParrotTrouble_thenReturnFalse() {
        var actual = warmupOne.parrotTrouble(true, 20);
        assertThat(actual)
                .isFalse();
    }

    @Test
    void givenFalseAndTwelve_whenParrotTrouble_thenReturnFalse() {
        var actual = warmupOne.parrotTrouble(false, 12);
        assertThat(actual)
                .isFalse();
    }


    /** makes10 */
    @Test
    void givenNineAndTen_whenMakes10_thenReturnTrue() {
        var actual = warmupOne.makes10(9, 10);
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenNineAndNine_whenMakes10_thenReturnFalse() {
        var actual = warmupOne.makes10(9, 9);
        assertThat(actual)
                .isFalse();
    }

    @Test
    void givenOneAndNine_whenMakes10_thenReturnTrue() {
        var actual = warmupOne.makes10(1, 9);
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenTenAndOne_whenMakes10_thenReturnTrue() {
        var actual = warmupOne.makes10(10, 1);
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenTenAndTen_whenMakes10_thenReturnTrue() {
        var actual = warmupOne.makes10(10, 10);
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenEightAndTwo_whenMakes10_thenReturnTrue() {
        var actual = warmupOne.makes10(8, 2);
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenEightAndThree_whenMakes10_thenReturnFalse() {
        var actual = warmupOne.makes10(8, 3);
        assertThat(actual)
                .isFalse();
    }

    @Test
    void givenTenAndFortyTwo_whenMakes10_thenReturnTrue() {
        var actual = warmupOne.makes10(10, 42);
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenTwelveAndNegativeTwo_whenMakes10_thenReturnTrue() {
        var actual = warmupOne.makes10(12, -2);
        assertThat(actual)
                .isTrue();
    }
}
