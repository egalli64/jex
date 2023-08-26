/*
  CodingBat Java AP (Advanced Placement) 1 - https://codingbat.com/java/AP-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.ap1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class UserCompareTest {
    @ParameterizedTest
    @CsvSource({ "bb,1,zz,2,-1", "bb,1,aa,2,1", "bb,1,bb,1,0" })
    void userCompareExamples(String left, int leftId, String right, int rightId, int expected) {
        assertThat(UserCompare.solution(left, leftId, right, rightId)).isEqualTo(expected);
    }
}
