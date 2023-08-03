/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class BunnyEars2Test {
    @ParameterizedTest
    @CsvSource({ "0,0", "1,2", "2,5" })
    void bunnyEars2Examples(int input, int expected) {
        assertThat(BunnyEars2.bunnyEars2(input)).isEqualTo(expected);
    }
}
