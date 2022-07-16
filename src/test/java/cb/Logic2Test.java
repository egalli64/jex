package cb;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class Logic2Test {
    @ParameterizedTest
    @CsvSource({ "3,1,8,true", "3,1,9,false", "3,2,10,true" })
    void makeBricksExamples(int small, int big, int goal, boolean expected) {
        assertThat(Logic2.makeBricks(small, big, goal)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "1,2,3,6", "2,13,1,3", "2,1,14,3" })
    void noTeenSumExamples(int first, int second, int third, int expected) {
        assertThat(Logic2.noTeenSum(first, second, third)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "19,21,21", "21,19,21", "19,22,19" })
    void blackjackExamples(int first, int second, int expected) {
        assertThat(Logic2.blackjack(first, second)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "1,2,3,6", "3,2,3,2", "3,3,3,0" })
    void loneSumExamples(int first, int second, int third, int expected) {
        assertThat(Logic2.loneSum(first, second, third)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "16,17,18,60", "12,13,14,30", "6,4,4,10" })
    void roundSumExamples(int first, int second, int third, int expected) {
        assertThat(Logic2.roundSum(first, second, third)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "2,4,6,true", "4,6,2,true", "4,6,3,false" })
    void evenlySpacedExamples(int first, int second, int third, boolean expected) {
        assertThat(Logic2.evenlySpaced(first, second, third)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "1, 2, 3, 6", "1, 2, 13, 3", "1, 13, 3, 1" })
    void luckySumExamples(int first, int second, int third, int expected) {
        assertThat(Logic2.luckySum(first, second, third)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "1, 2, 10, true", "1, 2, 3, false", "4, 1, 3, true" })
    void closeFarExamples(int first, int second, int third, boolean expected) {
        assertThat(Logic2.closeFar(first, second, third)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "4, 1, 9, 4", "4, 1, 10, -1", "4, 1, 7, 2" })
    void makeChocolateExamples(int small, int big, int target, int expected) {
        assertThat(Logic2.makeChocolate(small, big, target)).isEqualTo(expected);
    }
}