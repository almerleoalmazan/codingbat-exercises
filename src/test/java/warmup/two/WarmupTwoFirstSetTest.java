package warmup.two;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WarmupTwoFirstSetTest {

    private WarmupTwoFirstSet warmupTwoFirstSet;

    @BeforeEach
    void setUp() {
        warmupTwoFirstSet = new WarmupTwoFirstSet();
    }

    /* stringTimes */
    @Test
    void givenHiAndTwo_whenStringTimes_thenReturnHiHi() {
        var actual = warmupTwoFirstSet.stringTimes("Hi", 2);
        assertThat(actual)
                .isEqualTo("HiHi");
    }

    @Test
    void givenHiAndThree_whenStringTimes_thenReturnHiHiHi() {
        var actual = warmupTwoFirstSet.stringTimes("Hi", 3);
        assertThat(actual)
                .isEqualTo("HiHiHi");
    }

    @Test
    void givenHiAndOne_whenStringTimes_thenReturnHi() {
        var actual = warmupTwoFirstSet.stringTimes("Hi", 1);
        assertThat(actual)
                .isEqualTo("Hi");
    }
}
