/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class WithoutDoublesTest {
    @ParameterizedTest
    @CsvSource({ "2,3,true,5", "3,3,true,7", "3,3,false,6" })
    void solutionExamples(int a, int b, boolean change, int expected) {
        assertThat(WithoutDoubles.solution(a, b, change)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "2,3,true,5", "3,3,true,7", "3,3,false,6" })
    void oneLinerExamples(int a, int b, boolean change, int expected) {
        assertThat(WithoutDoubles.oneLiner(a, b, change)).isEqualTo(expected);
    }
}
