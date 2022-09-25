package warmup.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WarmupOneFourthSetTest {
    private WarmupOneFourthSet warmupOneFourthSet;

    @BeforeEach
    void setup() {
        warmupOneFourthSet = new WarmupOneFourthSet();
    }

    /** missingChar */
    @Test
    void givenKittenStringAndNumber_whenMissingChar_thenReturnModifiedKittenString() {
        var actual = warmupOneFourthSet.missingChar("kitten", 1);
        assertThat(actual)
                .isEqualTo("ktten");

        actual = warmupOneFourthSet.missingChar("kitten", 0);
        assertThat(actual)
                .isEqualTo("itten");

        actual = warmupOneFourthSet.missingChar("kitten", 4);
        assertThat(actual)
                .isEqualTo("kittn");
    }

    @Test
    void givenHiStringAndNumber_whenMissingChar_thenReturnModifiedHiString() {
        var actual = warmupOneFourthSet.missingChar("Hi", 0);
        assertThat(actual)
                .isEqualTo("i");

        actual = warmupOneFourthSet.missingChar("Hi", 1);
        assertThat(actual)
                .isEqualTo("H");
    }

    @Test
    void givenCodeStringAndNumber_whenMissingChar_thenReturnModifiedCodeString() {
        var actual = warmupOneFourthSet.missingChar("code", 0);
        assertThat(actual)
                .isEqualTo("ode");

        actual = warmupOneFourthSet.missingChar("code", 1);
        assertThat(actual)
                .isEqualTo("cde");

        actual = warmupOneFourthSet.missingChar("code", 2);
        assertThat(actual)
                .isEqualTo("coe");

        actual = warmupOneFourthSet.missingChar("code", 3);
        assertThat(actual)
                .isEqualTo("cod");
    }

    @Test
    void givenChocolateStringAndNumber_whenMissingChar_thenReturnModifiedChocolateString() {
        var actual = warmupOneFourthSet.missingChar("chocolate", 8);
        assertThat(actual)
                .isEqualTo("chocolat");
    }
}