/*
 * 3000. Maximum Area of Longest Diagonal Rectangle - https://leetcode.com/problems/maximum-area-of-longest-diagonal-rectangle/description/
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

class MaximumAreaOfLongestDiagonalRectangleTest {
    private static final MaximumAreaOfLongestDiagonalRectangle instance = new MaximumAreaOfLongestDiagonalRectangle();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[][]{{6, 5}, {8, 6}, {2, 10}}, 20), //
                Arguments.of(new int[][]{{10, 3}, {5, 9}, {8, 3}}, 30), //
                Arguments.of(new int[][]{{9, 3}, {8, 6}}, 48), //
                Arguments.of(new int[][]{{3, 4}, {4, 3}}, 12) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[][] input, int expected) {
        var actual = instance.areaOfMaxDiagonal(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}