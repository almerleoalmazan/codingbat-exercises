package warmup.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WarmupOneTenthSetTest {

    private WarmupOneTenthSet warmupOneTenthSet;

    @BeforeEach
    void setUp() {
        warmupOneTenthSet = new WarmupOneTenthSet();
    }

    /* stringE */
    @Test
    void givenHello_whenStringE_thenReturnTrue() {
        var actual = warmupOneTenthSet.stringE("Hello");
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenHeelle_whenStringE_thenReturnTrue() {
        var actual = warmupOneTenthSet.stringE("Heelle");
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenHeelele_whenStringE_thenReturnFalse() {
        var actual = warmupOneTenthSet.stringE("Heelele");
        assertThat(actual)
                .isFalse();
    }
}
