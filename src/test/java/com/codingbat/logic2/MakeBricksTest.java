/*
  CodingBat Java Logic 2 - https://codingbat.com/java/Logic-2

  My git repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.logic2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MakeBricksTest {
    @ParameterizedTest
    @CsvSource({ "3,1,8,true", "3,1,9,false", "3,2,10,true" })
    void solutionExamples(int small, int big, int goal, boolean expected) {
        assertThat(MakeBricks.solution(small, big, goal)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "3,1,8,true", "3,1,9,false", "3,2,10,true" })
    void verboseExamples(int small, int big, int goal, boolean expected) {
        assertThat(MakeBricks.stepByStep(small, big, goal)).isEqualTo(expected);
    }
}
