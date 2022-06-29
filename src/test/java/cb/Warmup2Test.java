package cb;

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

}