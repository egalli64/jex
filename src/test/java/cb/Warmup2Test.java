package cb;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class Warmup2Test {
    @ParameterizedTest
    @CsvSource({"2,HiHi", "3,HiHiHi", "1,Hi"})
    void stringTimesHi11(int input, String expected) {
        assertThat(Warmup2.stringTimes11("Hi", input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"2,HiHi", "3,HiHiHi", "1,Hi"})
    void stringTimesHi(int input, String expected) {
        assertThat(Warmup2.stringTimes("Hi", input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"axxbb,true", "axaxax,false", "xxxxx,true"})
    void doubleXExamples(String input, boolean expected) {
        assertThat(Warmup2.doubleX(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"hixxhi,1", "xaxxaxaxx,1", "axxxaaxx,2"})
    void last2Examples(String input, int expected) {
        assertThat(Warmup2.last2(input)).isEqualTo(expected);
    }

    @Test
    void array123Example1() {
        int[] input = {1, 1, 2, 3, 1};
        assertThat(Warmup2.array123(input)).isTrue();
    }

    @ParameterizedTest
    @CsvSource({"kitten,kien", "Chocolate,Chole", "CodingHorror,Congrr"})
    void altPairsExamples(String input, String expected) {
        assertThat(Warmup2.altPairs(input)).isEqualTo(expected);
    }

    @Test
    void array123Empty() {
        assertThat(Warmup2.altPairs("")).isEqualTo("");
    }

    @Test
    void noTriplesExample1() {
        int[] input = {1, 1, 2, 2, 1};
        assertThat(Warmup2.noTriples(input)).isTrue();
    }

}