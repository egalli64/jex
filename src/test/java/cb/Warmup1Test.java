package cb;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class Warmup1Test {
    @ParameterizedTest
    @CsvSource({"false,false,true", "true,false,false", "false,true,true"})
    void sleepInExamples(boolean weekday, boolean vacation, boolean expected) {
        assertThat(Warmup1.sleepIn(weekday, vacation)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"19,2", "10,11", "21,0"})
    void diff21Examples(int input, int expected) {
        assertThat(Warmup1.diff21(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"93,true", "90,true", "89,false"})
    void nearHundredExamples(int input, boolean expected) {
        assertThat(Warmup1.nearHundred(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"1,ktten", "0,itten", "4,kittn"})
    void missingCharExamples(int input, String expected) {
        assertThat(Warmup1.missingChar("kitten", input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"cat,tcatt", "Hello,oHelloo", "a,aaa"})
    void backAroundExamples(String input, String expected) {
        assertThat(Warmup1.backAround(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"hi there,true", "hi,true", "hello hi,false"})
    void startHiExamples(String input, boolean expected) {
        assertThat(Warmup1.startHi(input)).isEqualTo(expected);
    }

}