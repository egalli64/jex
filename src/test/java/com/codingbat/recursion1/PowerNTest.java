/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PowerNTest {
    @ParameterizedTest
    @CsvSource({"3,1,3", "3,2,9", "3,3,27"})
    void powerNExamples(int base, int exp, int expected) {
        assertThat(PowerN.powerN(base, exp)).isEqualTo(expected);
    }
}
