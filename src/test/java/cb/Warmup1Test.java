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
}