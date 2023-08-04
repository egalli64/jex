/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Count8Test {
    @ParameterizedTest
    @CsvSource({ "8,1", "818,2", "8818,4" })
    void count8Examples(int input, int expected) {
        assertThat(Count8.count8(input)).isEqualTo(expected);
    }
}
