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

    @ParameterizedTest
    @CsvSource({"Hello there,llo,He there", "Hello there,e,Hllo thr", "Hello there,x,Hello there"})
    void withoutStringExamples(String base, String remove, String expected) {
        assertThat(String3.withoutString(base, remove)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"abcXXXabc,1", "xxxabyyyycd,3", "a,0"})
    void countTripleExamples(String s, int expected) {
        assertThat(String3.countTriple(s)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"abXYZba,ab", "abca,a", "aba,aba", "123and then 321,123"})
    void mirrorEndsExamples(String s, String expected) {
        assertThat(String3.mirrorEnds(s)).isEqualTo(expected);
    }

}