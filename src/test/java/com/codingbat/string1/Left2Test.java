/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Left2Test {
    @ParameterizedTest
    @CsvSource({ "Hello,lloHe", "java,vaja", "Hi,Hi" })
    void solutionExamples(String input, String expected) {
        assertThat(Left2.solution(input)).isEqualTo(expected);
    }
}
