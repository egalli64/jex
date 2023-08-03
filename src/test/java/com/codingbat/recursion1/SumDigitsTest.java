/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SumDigitsTest {
    @ParameterizedTest
    @CsvSource({ "126,9", "49,13", "12,3" })
    void sumDigitsExamples(int input, int expected) {
        assertThat(SumDigits.sumDigits(input)).isEqualTo(expected);
    }
}
