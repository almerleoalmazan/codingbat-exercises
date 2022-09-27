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


    /** startOz */
    @Test
    void givenOzymandias_whenStartOz_thenReturnOz() {
        var actual = warmupOneEightSet.startOz("ozymandias");
        assertThat(actual)
                .isEqualTo("oz");
    }

    @Test
    void givenBzoo_whenStartOz_thenReturnZ() {
        var actual = warmupOneEightSet.startOz("bzoo");
        assertThat(actual)
                .isEqualTo("z");
    }

    @Test
    void givenOxx_whenStartOz_thenReturnO() {
        var actual = warmupOneEightSet.startOz("oxx");
        assertThat(actual)
                .isEqualTo("o");
    }

    @Test
    void givenA_whenStartOz_thenReturnEmptyString() {
        var actual = warmupOneEightSet.startOz("a");
        assertThat(actual)
                .isEqualTo("");
    }

    @Test
    void givenOunce_whenStartOz_thenReturnO() {
        var actual = warmupOneEightSet.startOz("ounce");
        assertThat(actual)
                .isEqualTo("o");
    }

    @Test
    void givenO_whenStartOz_thenReturnO() {
        var actual = warmupOneEightSet.startOz("o");
        assertThat(actual)
                .isEqualTo("o");
    }

    @Test
    void givenEmpty_whenStartOz_thenReturnEmpty() {
        var actual = warmupOneEightSet.startOz("");
        assertThat(actual)
                .isEqualTo("");
    }
}
