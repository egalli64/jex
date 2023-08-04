/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Count7Test {
    @ParameterizedTest
    @CsvSource({ "717,2", "7,1", "123,0" })
    void count7Examples(int input, int expected) {
        assertThat(Count7.count7(input)).isEqualTo(expected);
    }
}
