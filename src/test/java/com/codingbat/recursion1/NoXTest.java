/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class NoXTest {

    @ParameterizedTest
    @CsvSource({ "xaxb,ab", "abc,abc", "xx,''" })
    void noXExamples(String input, String expected) {
        assertThat(NoX.noX(input)).isEqualTo(expected);
    }
}
