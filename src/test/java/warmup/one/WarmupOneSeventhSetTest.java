package warmup.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WarmupOneSeventhSetTest {
    
    private WarmupOneSeventhSet warmupOneSeventhSet;

    @BeforeEach
    void setUp() {
        warmupOneSeventhSet = new WarmupOneSeventhSet();
    }

    @Test
    void givenThirteenAndTwentyAndTen_whenHasTeen_thenReturnTrue() {
        var actual = warmupOneSeventhSet.hasTeen(13, 20, 10);
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenTwentyAndNineteenAndTen_whenHasTeen_thenReturnTrue() {
        var actual = warmupOneSeventhSet.hasTeen(20, 19, 10);
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenTwentyAndTenAndThirteen_whenHasTeen_thenReturnTrue() {
        var actual = warmupOneSeventhSet.hasTeen(20, 10, 13);
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenOneAndTwentyAndTwelve_whenHasTeen_thenReturnFalse() {
        var actual = warmupOneSeventhSet.hasTeen(1, 20, 12);
        assertThat(actual)
                .isFalse();
    }

    @Test
    void givenNineteenAndTwentyAndTwelve_whenHasTeen_thenReturnTrue() {
        var actual = warmupOneSeventhSet.hasTeen(19, 20,12);
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenTwelveAndTwentyAndNineteen_whenHasTeen_thenReturnTrue() {
        var actual = warmupOneSeventhSet.hasTeen(12, 20, 19);
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenTwelveAndNineAndTwenty_whenHasTeen_thenReturnFalse() {
        var actual = warmupOneSeventhSet.hasTeen(12, 9, 20);
        assertThat(actual)
                .isFalse();
    }

    @Test
    void givenTwelveAndEighteenAndTwenty_whenHasTeen_thenReturnTrue() {
        var actual = warmupOneSeventhSet.hasTeen(12, 18, 20);
        assertThat(actual)
                .isTrue();
    }
    
    
    /** loneTeen */
    @Test
    void givenThirteenAndNinetyNine_whenLoneTeen_thenReturnTrue() {
        var actual = warmupOneSeventhSet.loneTeen(13, 99);
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenTwentyOneAndNineteen_whenLoneTeen_thenReturnTrue() {
        var actual = warmupOneSeventhSet.loneTeen(21, 19);
        assertThat(actual)
                .isTrue();
    }

    @Test
    void givenThirteenAndThirteen_whenLoneTeen_thenReturnFalse() {
        var actual = warmupOneSeventhSet.loneTeen(13, 13);
        assertThat(actual)
                .isFalse();
    }

    @Test
    void givenNinetyNineAndNinetyNine_whenLoneTeen_thenReturnFalse() {
        var actual = warmupOneSeventhSet.loneTeen(99, 99);
        assertThat(actual)
                .isFalse();
    }
    
    
    /** delDel */
    @Test
    void givenAdelbcString_whenDelDel_thenReturnAbcString() {
        var actual = warmupOneSeventhSet.delDel("adelbc");
        assertThat(actual)
                .isEqualTo("abc");
    }

    @Test
    void givenAdelHelloString_whenDelDel_thenReturnAHelloString() {
        var actual = warmupOneSeventhSet.delDel("adelHello");
        assertThat(actual)
                .isEqualTo("aHello");
    }

    @Test
    void givenAdedbcString_whenDelDel_thenReturnAdedbcString() {
        var actual = warmupOneSeventhSet.delDel("adedbc");
        assertThat(actual)
                .isEqualTo("adedbc");
    }

    @Test
    void givenA_whenDelDel_thenReturnA() {
        var actual = warmupOneSeventhSet.delDel("a");
        assertThat(actual)
                .isEqualTo("a");
    }

    @Test
    void givenEmptyString_whenDelDel_thenReturnEmptyString() {
        var actual = warmupOneSeventhSet.delDel("");
        assertThat(actual)
                .isEqualTo("");
    }
}
