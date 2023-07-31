/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Old35Test {
    @ParameterizedTest
    @CsvSource({ "3,true", "10,true", "15,false" })
    void solutionExamples(int input, boolean expected) {
        assertThat(Old35.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "3,true", "10,true", "15,false" })
    void verboseExamples(int input, boolean expected) {
        assertThat(Old35.verbose(input)).isEqualTo(expected);
    }
}
