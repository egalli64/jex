/*
  CodingBat String 3 - https://codingbat.com/java/String-3

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.string3;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class NotReplaceTest {
    @ParameterizedTest
    @CsvSource({ "is test,is not test", "is-is,is not-is not", "This is right,This is not right" })
    void solutionExamples(String s, String expected) {
        assertThat(NotReplace.solution(s)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "is test,is not test", "is-is,is not-is not", "This is right,This is not right" })
    void byInsertExamples(String s, String expected) {
        assertThat(NotReplace.byInsert(s)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "is test,is not test", "is-is,is not-is not", "This is right,This is not right" })
    void matchingExamples(String s, String expected) {
        assertThat(NotReplace.matching(s)).isEqualTo(expected);
    }
}
