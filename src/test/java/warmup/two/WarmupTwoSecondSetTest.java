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
}
