package warmup.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        assertTrue(actual);
    }

    @Test
    void givenWeekdayAndNotVacation_whenSleepIn_thenReturnTrue() {
        var actual = warmupOne.sleepIn(true, false);
        assertFalse(actual);
    }

    @Test
    void givenNotWeekdayAndVacation_whenSleepIn_thenReturnTrue() {
        var actual = warmupOne.sleepIn(false, true);
        assertTrue(actual);
    }

    @Test
    void givenWeekdayAndVacation_whenSleepIn_thenReturnTrue() {
        var actual = warmupOne.sleepIn(true, true);
        assertTrue(actual);
    }

    /** monkeyTrouble */
    @Test
    void givenASmileAndBSmile_whenMonkeyTrouble_thenReturnTrue() {
        var actual = warmupOne.monkeyTrouble(true, true);
        assertTrue(actual);
    }

    @Test
    void givenNotASmileAndNotBSmile_whenMonkeyTrouble_thenReturnTrue() {
        var actual = warmupOne.monkeyTrouble(false, false);
        assertTrue(actual);
    }

    @Test
    void givenASmileAndNotBSmile_whenMonkeyTrouble_thenReturnFalse() {
        var actual = warmupOne.monkeyTrouble(true, false);
        assertFalse(actual);
    }

    @Test
    void givenNotASmileAndBSmile_whenMonkeyTrouble_thenReturnFalse() {
        var actual = warmupOne.monkeyTrouble(false, true);
        assertFalse(actual);
    }


    /** sumDouble */
    @Test
    void givenTwoDifferentNumbers_whenSumDouble_thenReturnSumOfTwoNumbers() {
        var actual = warmupOne.sumDouble(1, 2);
        assertEquals(3, actual);

        actual = warmupOne.sumDouble(3, 2);
        assertEquals(5, actual);

        actual = warmupOne.sumDouble(-1, 0);
        assertEquals(-1, actual);

        actual = warmupOne.sumDouble(0, 1);
        assertEquals(1, actual);

        actual = warmupOne.sumDouble(3, 4);
        assertEquals(7, actual);
    }

    @Test
    void givenTheSameNumber_whenSumDouble_thenReturnDoubleTheirSum() {
        var actual = warmupOne.sumDouble(2, 2);
        assertEquals(8, actual);

        actual = warmupOne.sumDouble(3, 3);
        assertEquals(12, actual);

        actual = warmupOne.sumDouble(0, 0);
        assertEquals(0, actual);
    }
}
