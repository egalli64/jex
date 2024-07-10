/*
  CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1

  My repo - https://github.com/egalli64/jex/

  close10 - codingbat.com/prob/p172021
 */
package com.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Close10Test {
    @ParameterizedTest
    @CsvSource({ "8,13,8", "13,8,8", "13,7,0" })
    void examples(int first, int second, int expected) {
        assertThat(Close10.solution(first, second)).isEqualTo(expected);
    }
    
    @ParameterizedTest
    @CsvSource({ "8,13,8", "13,8,8", "13,7,0" })
    void lessReadableExamples(int first, int second, int expected) {
        assertThat(Close10.lessReadableSolution(first, second)).isEqualTo(expected);
    }
}
