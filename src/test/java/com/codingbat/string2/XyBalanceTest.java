/*
  CodingBat Java String 2 - https://codingbat.com/java/String-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.string2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class XyBalanceTest {
    @ParameterizedTest
    @CsvSource({ "aaxbby,true", "aaxbb,false", "yaaxbb,false" })
    void solutionExamples(String input, boolean expected) {
        assertThat(XyBalance.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "aaxbby,true", "aaxbb,false", "yaaxbb,false" })
    void byIndexExamples(String input, boolean expected) {
        assertThat(XyBalance.byIndex(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "aaxbby,true", "aaxbb,false", "yaaxbb,false" })
    void byLastIndexExamples(String input, boolean expected) {
        assertThat(XyBalance.byLastIndex(input)).isEqualTo(expected);
    }
}
