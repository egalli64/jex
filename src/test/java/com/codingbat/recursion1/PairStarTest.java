/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PairStarTest {
    @ParameterizedTest
    @CsvSource({ "hello,hel*lo", "xxyy,x*xy*y", "aaaa,a*a*a*a" })
    void pairStarExamples(String input, String expected) {
        assertThat(PairStar.pairStar(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "hello,hel*lo", "xxyy,x*xy*y", "aaaa,a*a*a*a" })
    void alternativeExamples(String input, String expected) {
        assertThat(PairStar.alternative(input)).isEqualTo(expected);
    }
}
