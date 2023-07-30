/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class More20Test {
    @ParameterizedTest
    @CsvSource({ "20,false", "21,true", "22,true" })
    void more20Examples(int input, boolean expected) {
        assertThat(More20.solution(input)).isEqualTo(expected);
    }
}
