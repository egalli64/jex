/*
 * 452. Minimum Number of Arrows to Burst Balloons - https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.stream.Stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MinimumNumberOfArrowsToBurstBalloonsTest {
    private static final MinimumNumberOfArrowsToBurstBalloons instance = new MinimumNumberOfArrowsToBurstBalloons();

    private static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[][] { new int[] { 10, 16 }, new int[] { 2, 8 }, new int[] { 1, 6 },
                        new int[] { 7, 12 } }, 2), //
                Arguments.of(
                        new int[][] { new int[] { 1, 2 }, new int[] { 3, 4 }, new int[] { 5, 6 }, new int[] { 7, 8 } },
                        4), //
                Arguments.of(
                        new int[][] { new int[] { 1, 2 }, new int[] { 2, 3 }, new int[] { 3, 4 }, new int[] { 4, 5 } },
                        2) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[][] input, int expected) {
        int actual = instance.findMinArrowShots(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
