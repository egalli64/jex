/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DateFashionTest {
    @ParameterizedTest
    @CsvSource({ "5,10,2", "5,2,0", "5,5,1" })
    void dateFashionExamples(int a, int b, int expected) {
        assertThat(DateFashion.solution(a, b)).isEqualTo(expected);
    }
}
