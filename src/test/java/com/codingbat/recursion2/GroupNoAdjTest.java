/*
  CodingBat Java Recursion 2 - https://codingbat.com/java/Recursion-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion2;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class GroupNoAdjTest {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 2, 5, 10, 4 }, 12, true), //
                Arguments.of(new int[] { 2, 5, 10, 4 }, 14, false), //
                Arguments.of(new int[] { 2, 5, 10, 4 }, 7, false) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(int[] data, int target, boolean expected) {
        assertThat(GroupNoAdj.solution(0, data, target)).isEqualTo(expected);
    }

    @Test
    void solutionFromOneToEmpty() {
        assertThat(GroupNoAdj.solution(0, new int[] { 9 }, 0)).isTrue();
    }
}
