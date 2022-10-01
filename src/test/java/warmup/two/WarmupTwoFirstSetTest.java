package warmup.two;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WarmupTwoFirstSetTest {

    private WarmupTwoFirstSet warmupTwoFirstSet;

    @BeforeEach
    void setUp() {
        warmupTwoFirstSet = new WarmupTwoFirstSet();
    }

    /* stringTimes */
    @Test
    void givenHiAndTwo_whenStringTimes_thenReturnHiHi() {
        var actual = warmupTwoFirstSet.stringTimes("Hi", 2);
        assertThat(actual)
                .isEqualTo("HiHi");
    }

    @Test
    void givenHiAndThree_whenStringTimes_thenReturnHiHiHi() {
        var actual = warmupTwoFirstSet.stringTimes("Hi", 3);
        assertThat(actual)
                .isEqualTo("HiHiHi");
    }

    @Test
    void givenHiAndOne_whenStringTimes_thenReturnHi() {
        var actual = warmupTwoFirstSet.stringTimes("Hi", 1);
        assertThat(actual)
                .isEqualTo("Hi");
    }

    /* frontTimes */
    @Test
    void givenChocolateAndTwo_whenFrontTimes_thenReturnChoCho() {
        var actual = warmupTwoFirstSet.frontTimes("Chocolate", 2);
        assertThat(actual)
                .isEqualTo("ChoCho");
    }

    @Test
    void givenChocolateAndThree_whenFrontTimes_thenReturnChoChoCho() {
        var actual = warmupTwoFirstSet.frontTimes("Chocolate", 3);
        assertThat(actual)
                .isEqualTo("ChoChoCho");
    }

    @Test
    void givenAbcAndThree_whenFrontTimes_thenReturnAbcAbcAbc() {
        var actual = warmupTwoFirstSet.frontTimes("Abc", 3);
        assertThat(actual)
                .isEqualTo("AbcAbcAbc");
    }

    @Test
    void givenAbAndFour_whenFrontTimes_thenReturnAbAbAbAb() {
        var actual = warmupTwoFirstSet.frontTimes("Ab", 4);
        assertThat(actual)
                .isEqualTo("AbAbAbAb");
    }

    /* countXX */
    @Test
    void givenAbcxx_whenCountXX_thenReturn1() {
        var actual = warmupTwoFirstSet.countXX("abcxx");
        assertThat(actual)
                .isEqualTo(1);
    }
}
