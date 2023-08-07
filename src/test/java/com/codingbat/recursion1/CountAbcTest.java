/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CountAbcTest {
    @ParameterizedTest
    @CsvSource({ "abc,1", "abcxxabc,2", "abaxxaba,2" })
    void countAbcExamples(String input, int expected) {
        assertThat(CountAbc.countAbc(input)).isEqualTo(expected);
    }
    
    @ParameterizedTest
    @CsvSource({ "abc,1", "abcxxabc,2", "abaxxaba,2" })
    void tailRecExamples(String input, int expected) {
        assertThat(CountAbc.tailRec(input)).isEqualTo(expected);
    }
}
