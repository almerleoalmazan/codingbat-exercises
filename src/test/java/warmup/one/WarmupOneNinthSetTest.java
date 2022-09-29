package warmup.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WarmupOneNinthSetTest {
    
    private WarmupOneNinthSet warmupOneNinthSet;

    @BeforeEach
    void setUp() {
        warmupOneNinthSet = new WarmupOneNinthSet();
    }

    @Test
    void givenEightAndThirteen_whenClose10_thenReturnEight() {
        var actual = warmupOneNinthSet.close10(8, 13);
        assertThat(actual)
                .isEqualTo(8);
    }

    @Test
    void givenThirteenAndEight_whenClose10_thenReturnEight() {
        var actual = warmupOneNinthSet.close10(13, 8);
        assertThat(actual)
                .isEqualTo(8);
    }

    @Test
    void givenThirteenAndSeven_whenClose10_thenReturnZero() {
        var actual = warmupOneNinthSet.close10(13, 7);
        assertThat(actual)
                .isEqualTo(0);
    }
}
