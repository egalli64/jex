/*
  CodingBat Java String 2 - https://codingbat.com/java/String-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.string2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RepeatFrontTest {
    @ParameterizedTest
    @CsvSource({ "Chocolate,4,ChocChoChC", "Chocolate,3,ChoChC", "Ice Cream,2,IcI" })
    void solutionExamples(String s, int n, String expected) {
        assertThat(RepeatFront.solution(s, n)).isEqualTo(expected);
    }
}
