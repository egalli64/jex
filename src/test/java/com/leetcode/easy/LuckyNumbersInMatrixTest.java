/*
 * 1380. Lucky Numbers in a Matrix - https://leetcode.com/problems/lucky-numbers-in-a-matrix/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.List;
import java.util.stream.Stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LuckyNumbersInMatrixTest {
    private static final LuckyNumbersInMatrix instance = new LuckyNumbersInMatrix();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[][] { { 3, 7, 8 }, { 9, 11, 13 }, { 15, 16, 17 } }, new Integer[] { 15 }), //
                Arguments.of(new int[][] { { 1, 10, 4, 2 }, { 9, 3, 8, 7 }, { 15, 16, 17, 12 } }, new Integer[] { 12 }), //
                Arguments.of(new int[][] { { 7, 8 }, { 1, 2 } }, new Integer[] { 7 }) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[][] input, Integer[] expected) {
        List<Integer> actual = instance.luckyNumbers(input);
        Assertions.assertThat(actual).containsOnly(expected);
    }
}
