package warmup.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WarmupOneFifthSetTest {

    private WarmupOneFifthSet warmupOneFifthSet;

    @BeforeEach
    void setup() {
        warmupOneFifthSet = new WarmupOneFifthSet();
    }

    /** backAround */
    @Test
    void givenCatString_whenBackAround_thenReturnLastCharacterAndAppendToFrontAndBackOfTheString() {
        var actual = warmupOneFifthSet.backAround("cat");
        assertThat(actual)
                .isEqualTo("tcatt");
    }

    @Test
    void givenHelloString_whenBackAround_thenReturnLastCharacterAndAppendToFrontAndBackOfTheString() {
        var actual = warmupOneFifthSet.backAround("Hello");
        assertThat(actual)
                .isEqualTo("oHelloo");
    }

    @Test
    void givenAString_whenBackAround_thenReturnLastCharacterAndAppendToFrontAndBackOfTheString() {
        var actual = warmupOneFifthSet.backAround("a");
        assertThat(actual)
                .isEqualTo("aaa");
    }
}
