/*
  CodingBat Java Logic 2 - https://codingbat.com/java/Logic-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.logic2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MakeChocolateTest {
    @ParameterizedTest
    @CsvSource({ "4, 1, 9, 4", "4, 1, 10, -1", "4, 1, 7, 2" })
    void makeChocolateExamples(int small, int big, int target, int expected) {
        assertThat(MakeChocolate.solution(small, big, target)).isEqualTo(expected);
    }
}
