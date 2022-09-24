package warmup.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WarmupOneFirstSetTest {
    private WarmupOneFirstSet warmupOneFirstSet;

    @BeforeEach
    void setup() {
        warmupOneFirstSet = new WarmupOneFirstSet();
    }

    /** sleepIn */
    @Test
    void givenNotWeekdayAndNotVacation_whenSleepIn_thenReturnTrue() {
        var actual = warmupOneFirstSet.sleepIn(false, false);
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenWeekdayAndNotVacation_whenSleepIn_thenReturnTrue() {
        var actual = warmupOneFirstSet.sleepIn(true, false);
        assertThat(actual)
                .isFalse();
    }

    @Test
    void givenNotWeekdayAndVacation_whenSleepIn_thenReturnTrue() {
        var actual = warmupOneFirstSet.sleepIn(false, true);
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenWeekdayAndVacation_whenSleepIn_thenReturnTrue() {
        var actual = warmupOneFirstSet.sleepIn(true, true);
        assertThat(actual)
                .isTrue();
    }

    /** monkeyTrouble */
    @Test
    void givenASmileAndBSmile_whenMonkeyTrouble_thenReturnTrue() {
        var actual = warmupOneFirstSet.monkeyTrouble(true, true);
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenNotASmileAndNotBSmile_whenMonkeyTrouble_thenReturnTrue() {
        var actual = warmupOneFirstSet.monkeyTrouble(false, false);
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenASmileAndNotBSmile_whenMonkeyTrouble_thenReturnFalse() {
        var actual = warmupOneFirstSet.monkeyTrouble(true, false);
        assertThat(actual)
                .isFalse();
    }

    @Test
    void givenNotASmileAndBSmile_whenMonkeyTrouble_thenReturnFalse() {
        var actual = warmupOneFirstSet.monkeyTrouble(false, true);
        assertThat(actual)
                .isFalse();
    }


    /** sumDouble */
    @Test
    void givenTwoDifferentNumbers_whenSumDouble_thenReturnSumOfTwoNumbers() {
        assertThat(warmupOneFirstSet.sumDouble(1, 2))
                .isEqualTo(3);

        assertThat(warmupOneFirstSet.sumDouble(3, 2))
                .isEqualTo(5);

        assertThat(warmupOneFirstSet.sumDouble(-1, 0))
                .isEqualTo(-1);

        assertThat(warmupOneFirstSet.sumDouble(0, 1))
                .isEqualTo(1);

        assertThat(warmupOneFirstSet.sumDouble(3, 4))
                .isEqualTo(7);
    }

    @Test
    void givenTheSameNumber_whenSumDouble_thenReturnDoubleTheirSum() {
        var actual = warmupOneFirstSet.sumDouble(2, 2);
        assertThat(actual)
                .isEqualTo(8);

        actual = warmupOneFirstSet.sumDouble(3, 3);
        assertThat(actual)
                .isEqualTo(12);

        actual = warmupOneFirstSet.sumDouble(0, 0);
        assertThat(actual)
                .isEqualTo(0);
    }
}
