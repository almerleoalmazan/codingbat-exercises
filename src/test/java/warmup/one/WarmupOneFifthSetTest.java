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


    /** or35 */
    @Test
    void givenANumberWhichIsMultipleOfThreeOrFive_whenOr35_thenReturnTrue() {
        var actual = warmupOneFifthSet.or35(3);
        assertThat(actual)
                .isTrue();

        actual = warmupOneFifthSet.or35(10);
        assertThat(actual)
                .isTrue();

        actual = warmupOneFifthSet.or35(15);
        assertThat(actual)
                .isTrue();

        actual = warmupOneFifthSet.or35(5);
        assertThat(actual)
                .isTrue();

        actual = warmupOneFifthSet.or35(9);
        assertThat(actual)
                .isTrue();

        actual = warmupOneFifthSet.or35(6);
        assertThat(actual)
                .isTrue();

        actual = warmupOneFifthSet.or35(18);
        assertThat(actual)
                .isTrue();

        actual = warmupOneFifthSet.or35(20);
        assertThat(actual)
                .isTrue();

        actual = warmupOneFifthSet.or35(45);
        assertThat(actual)
                .isTrue();

        actual = warmupOneFifthSet.or35(99);
        assertThat(actual)
                .isTrue();

        actual = warmupOneFifthSet.or35(100);
        assertThat(actual)
                .isTrue();

        actual = warmupOneFifthSet.or35(123);
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenANumberWhichIsNotMultipleOfThreeOrFive_whenOr35_thenReturnFalse() {
        var actual = warmupOneFifthSet.or35(8);
        assertThat(actual)
                .isFalse();

        actual = warmupOneFifthSet.or35(4);
        assertThat(actual)
                .isFalse();

        actual = warmupOneFifthSet.or35(7);
        assertThat(actual)
                .isFalse();

        actual = warmupOneFifthSet.or35(17);
        assertThat(actual)
                .isFalse();

        actual = warmupOneFifthSet.or35(29);
        assertThat(actual)
                .isFalse();

        actual = warmupOneFifthSet.or35(22);
        assertThat(actual)
                .isFalse();

        actual = warmupOneFifthSet.or35(101);
        assertThat(actual)
                .isFalse();

        actual = warmupOneFifthSet.or35(121);
        assertThat(actual)
                .isFalse();

        actual = warmupOneFifthSet.or35(122);
        assertThat(actual)
                .isFalse();
    }
}
