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

    /* array123 */

    @Test
    void givenOneOneTwoThreeOne_whenArray123_thenReturnTrue() {
        var actual = warmupTwoSecondSet.array123(new int[]{1, 1, 2, 3, 1});
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenOneOneTwoFourOne_whenArray123_thenReturnFalse() {
        var actual = warmupTwoSecondSet.array123(new int[]{1, 1, 2, 4, 1});
        assertThat(actual)
                .isFalse();
    }

    @Test
    void givenOneOneTwoOneTwoThree_whenArray123_thenReturnTrue() {
        var actual = warmupTwoSecondSet.array123(new int[]{1, 1, 2, 1, 2, 3});
        assertThat(actual)
                .isTrue();
    }
    
    /* stringMatch */
    @Test
    void givenStringOfXxcaazzAndXxbaaz_whenStringMatch_thenReturnThree() {
        var actual = warmupTwoSecondSet.stringMatch("xxcaazz", "xxbaaz");
        assertThat(actual)
                .isEqualTo(3);
    }

    @Test
    void givenStringOfAbcAndAbc_whenStringMatch_thenReturnTwo() {
        var actual = warmupTwoSecondSet.stringMatch("abc", "abc");
        assertThat(actual)
                .isEqualTo(2);
    }

    @Test
    void givenStringOfAbcAndAxc_whenStringMatch_thenReturnZero() {
        var actual = warmupTwoSecondSet.stringMatch("abc", "axc");
        assertThat(actual)
                .isEqualTo(0);
    }
}
