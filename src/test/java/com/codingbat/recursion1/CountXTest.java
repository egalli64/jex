/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CountXTest {
    @ParameterizedTest
    @CsvSource({ "xxhixx,4", "xhixhix,3", "hi,0" })
    void solutionExamples(String input, int expected) {
        assertThat(CountX.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "xxhixx,4", "xhixhix,3", "hi,0" })
    void alterativeExamples(String input, int expected) {
        assertThat(CountX.alterative(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "xxhixx,4", "xhixhix,3", "hi,0" })
    void innerAlterativeExamples(String input, int expected) {
        assertThat(CountX.alterative(input, 0)).isEqualTo(expected);
    }
}
