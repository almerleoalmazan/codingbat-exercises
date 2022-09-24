package warmup.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WarmupOneTest {
    private WarmupOne warmupOne;

    @BeforeEach
    void setup() {
        warmupOne = new WarmupOne();
    }

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
}
