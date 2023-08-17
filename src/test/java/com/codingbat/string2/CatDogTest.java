/*
  CodingBat Java String 2 - https://codingbat.com/java/String-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.string2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CatDogTest {
    @ParameterizedTest
    @CsvSource({ "catdog,true", "catcat,false", "1cat1cadodog,true" })
    void solutionExamples(String input, boolean expected) {
        assertThat(CatDog.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "catdog,true", "catcat,false", "1cat1cadodog,true" })
    void alternativeExamples(String input, boolean expected) {
        assertThat(CatDog.alternative(input)).isEqualTo(expected);
    }
}
