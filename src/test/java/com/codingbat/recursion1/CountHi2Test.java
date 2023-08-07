package com.codingbat.recursion1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CountHi2Test {
    @ParameterizedTest
    @CsvSource({ "ahixhi,1", "ahibhi,2", "xhixhi,0" })
    void countHi2Examples(String input, int expected) {
        assertThat(CountHi2.countHi2(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "ahixhi,1", "ahibhi,2", "xhixhi,0" })
    void tailRecExamples(String input, int expected) {
        assertThat(CountHi2.tailRec(input)).isEqualTo(expected);
    }
}
