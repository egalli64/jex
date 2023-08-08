/*
  CodingBat Java Warmup 2 - https://codingbat.com/java/Warmup-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CountXXTest {
    @ParameterizedTest
    @CsvSource({ "abcxx,1", "xxx,2", "xxxx,3" })
    void countXXExamples(String input, int expected) {
        assertThat(CountXX.solution(input)).isEqualTo(expected);
    }
}
