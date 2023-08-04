/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CountHiTest {
    @ParameterizedTest
    @CsvSource({"xxhixx,1", "xhixhix,2", "hi,1"})
    void countHiExamples(String input, int expected) {
        assertThat(CountHi.countHi(input)).isEqualTo(expected);
    }
}
