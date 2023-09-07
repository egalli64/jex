/*
  CodingBat String 3 - https://codingbat.com/java/String-3

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.string3;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class EqualIsNotTest {
    @ParameterizedTest
    @CsvSource({ "This is not,false", "This is notnot,true", "noisxxnotyynotxisi,true" })
    void solutionExamples(String s, boolean expected) {
        assertThat(EqualIsNot.solution(s)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "This is not,false", "This is notnot,true", "noisxxnotyynotxisi,true" })
    void byIndexOfExamples(String s, boolean expected) {
        assertThat(EqualIsNot.verbose(s)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "This is not,false", "This is notnot,true", "noisxxnotyynotxisi,true" })
    void matchingExamples(String s, boolean expected) {
        assertThat(EqualIsNot.matching(s)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "This is not,false", "This is notnot,true", "noisxxnotyynotxisi,true" })
    void unsupportedExamples(String s, boolean expected) {
        assertThat(EqualIsNot.unsupported(s)).isEqualTo(expected);
    }
}
