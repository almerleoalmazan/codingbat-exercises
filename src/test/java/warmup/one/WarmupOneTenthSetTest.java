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

    /* lastDigit */
    @Test
    void givenSevenAndSeventeen_whenLastDigit_thenReturnTrue() {
        var actual = warmupOneTenthSet.lastDigit(7, 17);
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenSixAndSeventeen_whenLastDigit_thenReturnFalse() {
        var actual = warmupOneTenthSet.lastDigit(6, 17);
        assertThat(actual)
                .isFalse();
    }

    @Test
    void givenThreeAndOneHundredThirteen_whenLastDigit_thenReturnTrue() {
        var actual = warmupOneTenthSet.lastDigit(3, 113);
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenTwentySevenAndFiftySeven_whenLastDigit_thenReturnTrue() {
        var actual = warmupOneTenthSet.lastDigit(27, 57);
        assertThat(actual)
                .isTrue();
    }

    /* endUp */
    @Test
    void givenHello_whenEndUp_thenReturnHeLLO() {
        var actual = warmupOneTenthSet.endUp("Hello");
        assertThat(actual)
                .isEqualTo("HeLLO");
    }

    @Test
    void givenHiThere_whenEndUp_thenReturnHithERE() {
        var actual = warmupOneTenthSet.endUp("hi there");
        assertThat(actual)
                .isEqualTo("hi thERE");
    }

    @Test
    void givenHi_whenEndUp_thenReturnHI() {
        var actual = warmupOneTenthSet.endUp("hi");
        assertThat(actual)
                .isEqualTo("HI");
    }
}
