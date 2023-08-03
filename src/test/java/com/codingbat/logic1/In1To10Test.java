/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class In1To10Test {
    @ParameterizedTest
    @CsvSource({ "5,false,true", "11,false,false", "11,true,true" })
    void solutionExamples(int n, boolean out, boolean expected) {
        assertThat(In1To10.solution(n, out)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "5,false,true", "11,false,false", "11,true,true" })
    void oneLinerExamples(int n, boolean out, boolean expected) {
        assertThat(In1To10.oneLiner(n, out)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "5,false,true", "11,false,false", "11,true,true" })
    void alternativeExamples(int n, boolean out, boolean expected) {
        assertThat(In1To10.alternative(n, out)).isEqualTo(expected);
    }
}
