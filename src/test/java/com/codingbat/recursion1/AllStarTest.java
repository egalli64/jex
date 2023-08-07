/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class AllStarTest {
    @ParameterizedTest
    @CsvSource({ "hello,h*e*l*l*o", "abc,a*b*c", "ab,a*b" })
    void allStarExamples(String input, String expected) {
        assertThat(AllStar.allStar(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "hello,h*e*l*l*o", "abc,a*b*c", "ab,a*b" })
    void allternativeExamples(String input, String expected) {
        assertThat(AllStar.tailRec(input)).isEqualTo(expected);
    }
}
