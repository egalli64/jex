package cb;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class String3Test {
    @ParameterizedTest
    @CsvSource({"fez day,2", "day fez,2", "day fyyyz,2"})
    void countYZExamples(String input, int expected) {
        assertThat(String3.countYZ(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"xxggxx,true", "xxgxx,false", "xxggyygxx,false"})
    void gHappyExamples(String input, boolean expected) {
        assertThat(String3.gHappy(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"abXYab,ab", "xx,x", "xxx,x"})
    void sameEndsExamples(String input, String expected) {
        assertThat(String3.sameEnds(input)).isEqualTo(expected);
    }
}