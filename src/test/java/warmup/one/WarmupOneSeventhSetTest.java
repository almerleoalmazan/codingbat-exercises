package warmup.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
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
    @Disabled
    void givenNinetyNineAndNinetyNine_whenLoneTeen_thenReturnFalse() {
        var actual = warmupOneSeventhSet.loneTeen(99, 99);
        assertThat(actual)
                .isFalse();
    }
}
