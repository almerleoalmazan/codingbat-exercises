package warmup.two;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WarmupTwoThirdSetTest {

    private WarmupTwoThirdSet warmupTwoThirdSet;

    @BeforeEach
    void setUp() {
        warmupTwoThirdSet = new WarmupTwoThirdSet();
    }

    @Test
    void givenXxHxix_whenStringX_thenReturnXHix() {
        var actual = warmupTwoThirdSet.stringX("xxHxix");
        assertThat(actual)
                .isEqualTo("xHix");
    }

    @Test
    void givenAbxxxcd_whenStringX_thenReturnAbcd() {
        var actual = warmupTwoThirdSet.stringX("abxxxcd");
        assertThat(actual)
                .isEqualTo("abcd");
    }

    @Test
    void givenXabxxxcdx_whenStringX_thenReturnXabcdx() {
        var actual = warmupTwoThirdSet.stringX("xabxxxcdx");
        assertThat(actual)
                .isEqualTo("xabcdx");
    }
}