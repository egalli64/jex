/*
  CodingBat Java String 2 - https://codingbat.com/java/String-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.string2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class EndOtherTest {
    @ParameterizedTest
    @CsvSource({ "Hiabc,abc,true", "AbC,HiaBc,true", "abc,abXabc,true" })
    void solutionExamples(String a, String b, boolean expected) {
        assertThat(EndOther.solution(a, b)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "Hiabc,abc,true", "AbC,HiaBc,true", "abc,abXabc,true" })
    void matchExamples(String a, String b, boolean expected) {
        assertThat(EndOther.matching(a, b)).isEqualTo(expected);
    }
}
