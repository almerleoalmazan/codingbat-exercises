package warmup.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
}
