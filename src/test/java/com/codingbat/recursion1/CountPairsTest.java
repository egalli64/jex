/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CountPairsTest {
    @ParameterizedTest
    @CsvSource({ "axa,1", "axax,2", "axbx,1" })
    void countPairsExamples(String input, int expected) {
        assertThat(CountPairs.countPairs(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "axa,1", "axax,2", "axbx,1" })
    void alternativeExamples(String input, int expected) {
        assertThat(CountPairs.alternative(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "axa,1", "axax,2", "axbx,1" })
    void tailRecExamples(String input, int expected) {
        assertThat(CountPairs.tailRec(input)).isEqualTo(expected);
    }
}
