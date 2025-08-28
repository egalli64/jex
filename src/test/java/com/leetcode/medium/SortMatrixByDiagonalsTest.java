/*
 * 3446. Sort Matrix by Diagonals - https://leetcode.com/problems/sort-matrix-by-diagonals/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SortMatrixByDiagonalsTest {
    private static final SortMatrixByDiagonals instance = new SortMatrixByDiagonals();

    private static Stream<Arguments> provider() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 7, 3}, {9, 8, 2}, {4, 5, 6}},
                        new int[][]{{8, 2, 3}, {9, 6, 7}, {4, 5, 1}}),
                Arguments.of(new int[][]{{0, 1}, {1, 2}}, new int[][]{{2, 1}, {1, 0}}),
                Arguments.of(new int[][]{{1}}, new int[][]{{1}}));
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[][] input, int[][] expected) {
        var actual = instance.sortMatrix(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}