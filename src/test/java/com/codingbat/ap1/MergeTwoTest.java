/*
  CodingBat Java AP (Advanced Placement) 1 - https://codingbat.com/java/AP-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.ap1;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MergeTwoTest {
    static Stream<Arguments> provider() {
        String[] acz = { "a", "c", "z" };
        String[] cfg = { "c", "f", "g" };
        return Stream.of( //
                Arguments.of(acz, new String[] { "b", "f", "z" }, 3, new String[] { "a", "b", "c" }),
                Arguments.of(acz, new String[] { "c", "f", "z" }, 3, new String[] { "a", "c", "f" }),
                Arguments.of(new String[] { "f", "g", "z" }, cfg, 3, cfg));
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(String[] left, String[] right, int n, String[] expected) {
        assertThat(MergeTwo.solution(left, right, n)).isEqualTo(expected);
    }
}
