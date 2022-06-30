package cb;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class Logic2Test {
    @ParameterizedTest
    @CsvSource({"3,1,8,true", "3,1,9,false", "3,2,10,true"})
    void makeBricksExamples(int small, int big, int goal, boolean expected) {
        assertThat(Logic2.makeBricks(small, big, goal)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"1,2,3,6", "2,13,1,3", "2,1,14,3"})
    void noTeenSumExamples(int first, int second, int third, int expected) {
        assertThat(Logic2.noTeenSum(first, second, third)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"19,21,21", "21,19,21", "19,22,19"})
    void blackjackExamples(int first, int second, int expected) {
        assertThat(Logic2.blackjack(first, second)).isEqualTo(expected);
    }
}