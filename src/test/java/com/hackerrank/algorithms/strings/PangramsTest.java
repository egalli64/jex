package com.hackerrank.algorithms.strings;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PangramsTest {
    @ParameterizedTest
    @CsvSource({"We promptly judged antique ivory buckles for the next prize,pangram", //
            "We promptly judged antique ivory buckles for the prize,not pangram"})
    void pangramsSamples(String input, String expected) {
        String actual = Pangrams.pangrams(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}