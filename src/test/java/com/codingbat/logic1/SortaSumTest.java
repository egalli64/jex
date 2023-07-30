/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SortaSumTest {
    @ParameterizedTest
    @CsvSource({ "3,4,7", "9,4,20", "10,11,21" })
    void sortaSumExamples(int a, int b, int expected) {
        assertThat(SortaSum.solution(a, b)).isEqualTo(expected);
    }
}
