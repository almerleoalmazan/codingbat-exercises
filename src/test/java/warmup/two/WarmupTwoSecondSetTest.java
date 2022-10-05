package warmup.two;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WarmupTwoSecondSetTest {

    private WarmupTwoSecondSet warmupTwoSecondSet;

    @BeforeEach
    void setUp() {
        warmupTwoSecondSet = new WarmupTwoSecondSet();
    }

    /* stringSplosion */
    @Test
    void givenCode_whenStringSplosion_thenReturnCCoCodCode() {
        var actual = warmupTwoSecondSet.stringSplosion("Code");
        assertThat(actual)
                .isEqualTo("CCoCodCode");
    }

    @Test
    void givenAbc_whenStringSplosion_thenReturnAababc() {
        var actual = warmupTwoSecondSet.stringSplosion("abc");
        assertThat(actual)
                .isEqualTo("aababc");
    }

    @Test
    void givenAb_whenStringSplosion_thenReturnAab() {
        var actual = warmupTwoSecondSet.stringSplosion("ab");
        assertThat(actual)
                .isEqualTo("aab");
    }

    /* arrayCount9 */
    @Test
    void givenOneTwoNine_whenArrayCount9_thenReturnOne() {
        var actual = warmupTwoSecondSet.arrayCount9(new int[]{1, 2, 9});
        assertThat(actual)
                .isEqualTo(1);
    }

    @Test
    void givenOneNineNine_whenArrayCount9_thenReturnTwo() {
        var actual = warmupTwoSecondSet.arrayCount9(new int[]{1, 9, 9});
        assertThat(actual)
                .isEqualTo(2);
    }

    @Test
    void givenOneNineNineThreeNine_whenArrayCount9_thenReturnThree() {
        var actual = warmupTwoSecondSet.arrayCount9(new int[]{1, 9, 9, 3, 9});
        assertThat(actual)
                .isEqualTo(3);
    }

    /* arrayFront9 */
    @Test
    void givenOneTwoNineThreeFour_whenArrayFront9_thenReturnTrue() {
        var actual = warmupTwoSecondSet.arrayFront9(new int[]{1, 2, 9, 3, 4});
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenOneTwoThreeFourNine_whenArrayFront9_thenReturnFalse() {
        var actual = warmupTwoSecondSet.arrayFront9(new int[]{1, 2, 3, 4, 9});
        assertThat(actual)
                .isFalse();
    }

    @Test
    void givenOntTwoThreeFourFive_whenArrayFront9_thenReturnFalse() {
        var actual = warmupTwoSecondSet.arrayFront9(new int[]{1, 2, 3, 4, 5});
        assertThat(actual)
                .isFalse();
    }

    @Test
    void givenOntTwoThree_whenArrayFront9_thenReturnFalse() {
        var actual = warmupTwoSecondSet.arrayFront9(new int[]{1, 2, 3});
        assertThat(actual)
                .isFalse();
    }
}
