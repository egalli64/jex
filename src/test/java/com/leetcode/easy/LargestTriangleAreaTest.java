/*
 * 812. Largest Triangle Area - https://leetcode.com/problems/largest-triangle-area/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class LargestTriangleAreaTest {
    private static final LargestTriangleArea instance = new LargestTriangleArea();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[][]{new int[]{0, 0}, new int[]{0, 1}, new int[]{1, 0}, new int[]{0, 2}, new int[]{2, 0}}, 2.0),
                Arguments.of(new int[][]{new int[]{1, 0}, new int[]{0, 0}, new int[]{0, 1}}, .5) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[][] input, double expected) {
        var actual = instance.largestTriangleArea(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
