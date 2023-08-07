package com.codingbat.recursion1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Count11Test {
    @ParameterizedTest
    @CsvSource({ "11abc11,2", "abc11x11x11,3", "111,1" })
    void count11Examples(String input, int expected) {
        assertThat(Count11.count11(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "11abc11,2", "abc11x11x11,3", "111,1" })
    void tailRecExamples(String input, int expected) {
        assertThat(Count11.tailRec(input)).isEqualTo(expected);
    }
}
