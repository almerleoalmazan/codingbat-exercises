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


    /** icyHot */
    @Test
    void givenOneTwentyAndNegativeOne_whenIcyHot_thenReturnTrue() {
        var actual = warmupOneSixthSet.icyHot(120, -1);
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenNegativeOneAndOneHundredTwenty_whenIcyHot_thenReturnTrue() {
        var actual = warmupOneSixthSet.icyHot(-1, 120);
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenTwoAndOneHundredTwenty_whenIcyHot_thenReturnFalse() {
        var actual = warmupOneSixthSet.icyHot(2, 120);
        assertThat(actual)
                .isFalse();
    }

    @Test
    void givenNegativeOneAndOneHundred_whenIcyHot_thenReturnFalse() {
        var actual = warmupOneSixthSet.icyHot(-1, 100);
        assertThat(actual)
                .isFalse();
    }

    @Test
    void givenNegativeTwoAndNegativeTwo_whenIcyHot_thenReturnFalse() {
        var actual = warmupOneSixthSet.icyHot(-2, -2);
        assertThat(actual)
                .isFalse();
    }

    @Test
    void givenOneHundredTwentyAndOneHundredTwenty_whenIcyHot_thenReturnFalse() {
        var actual = warmupOneSixthSet.icyHot(120, 120);
        assertThat(actual)
                .isFalse();
    }


    /** in1020 */
    @Test
    void givenTwelveAndNinetyNine_whenIn1020_thenReturnTrue() {
        var actual = warmupOneSixthSet.in1020(12, 99);
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenTwentyOneAndTwelve_whenIn1020_thenReturnTrue() {
        var actual = warmupOneSixthSet.in1020(21, 12);
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenEightAndNinetyNine_whenIn1020_thenReturnFalse() {
        var actual = warmupOneSixthSet.in1020(8, 99);
        assertThat(actual)
                .isFalse();
    }

    @Test
    void givenNinetyNineAndTen_whenIn1020_thenReturnTrue() {
        var actual = warmupOneSixthSet.in1020(99, 10);
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenTwentyAndTwenty_whenIn1020_thenReturnTrue() {
        var actual = warmupOneSixthSet.in1020(20, 20);
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenTwentyOneAndTwentyOne_whenIn1020_thenReturnFalse() {
        var actual = warmupOneSixthSet.in1020(21, 21);
        assertThat(actual)
                .isFalse();
    }

    @Test
    void givenNineAndNine_whenIn1020_thenReturnFalse() {
        var actual = warmupOneSixthSet.in1020(9, 9);
        assertThat(actual)
                .isFalse();
    }
}
