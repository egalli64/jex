/*
  CodingBat Java Warmup 2 - https://codingbat.com/java/Warmup-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FrontTimesTest {
    @ParameterizedTest
    @CsvSource({ "Chocolate,2,ChoCho", "Chocolate,3,ChoChoCho", "Abc,3,AbcAbcAbc" })
    void unsupportedExamples(String input, int times, String expected) {
        assertThat(FrontTimes.unsupported(input, times)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "Chocolate,2,ChoCho", "Chocolate,3,ChoChoCho", "Abc,3,AbcAbcAbc" })
    void solutionExamples(String input, int times, String expected) {
        assertThat(FrontTimes.solution(input, times)).isEqualTo(expected);
    }
}
