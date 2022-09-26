package warmup.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WarmupOneSixthSetTest {

    private WarmupOneSixthSet warmupOneSixthSet;

    @BeforeEach
    void setup() {
        warmupOneSixthSet = new WarmupOneSixthSet();
    }

    @Test
    void givenStringContainingHiWord_whenStartHi_thenReturnTrue() {
        var actual = warmupOneSixthSet.startHi("hi there");
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenStringNotContainingHiWord_whenStartHi_thenReturnFalse() {
        var actual = warmupOneSixthSet.startHi("there");
        assertThat(actual)
                .isFalse();

        actual = warmupOneSixthSet.startHi("");
        assertThat(actual)
                .isFalse();
    }
}
