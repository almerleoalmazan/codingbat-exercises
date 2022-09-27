package warmup.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WarmupOneEightSetTest {

    private WarmupOneEightSet warmupOneEightSet;

    @BeforeEach
    void setUp() {
        warmupOneEightSet = new WarmupOneEightSet();
    }

    @Test
    void givenMixSnacks_whenMixStart_thenReturnTrue() {
        var actual = warmupOneEightSet.mixStart("mix snacks");
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenPixSnacks_whenMixStart_thenReturnTrue() {
        var actual = warmupOneEightSet.mixStart("pix snacks");
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenPizSnacks_whenMixStart_thenReturnTrue() {
        var actual = warmupOneEightSet.mixStart("piz snacks");
        assertThat(actual)
                .isFalse();
    }

    @Test
    void givenAt_whenMixStart_thenReturnFalse() {
        var actual = warmupOneEightSet.mixStart("at");
        assertThat(actual)
                .isFalse();
    }

    @Test
    void givenEmptyString_whenMixStart_thenReturnFalse() {
        var actual = warmupOneEightSet.mixStart("");
        assertThat(actual)
                .isFalse();
    }
}
