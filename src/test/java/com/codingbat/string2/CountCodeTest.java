/*
  CodingBat Java String 2 - https://codingbat.com/java/String-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.string2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CountCodeTest {
    @ParameterizedTest
    @CsvSource({ "aaacodebbb,1", "codexxcode,2", "cozexxcope,2", "cocode,1" })
    void solutionExamples(String input, int expected) {
        assertThat(CountCode.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "aaacodebbb,1", "codexxcode,2", "cozexxcope,2", "cocode,1" })
    void unsupportedClassicMatchExamples(String input, int expected) {
        assertThat(CountCode.unsupportedClassicMatch(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "aaacodebbb,1", "codexxcode,2", "cozexxcope,2", "cocode,1" })
    void unsupportedModernMatchExamples(String input, int expected) {
        assertThat(CountCode.unsupportedModernMatch(input)).isEqualTo(expected);
    }
}
