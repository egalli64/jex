/*
 * 1128. Number of Equivalent Domino Pairs - https://leetcode.com/problems/number-of-equivalent-domino-pairs/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.stream.Stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class NumberOfEquivalentDominoPairsTest {
    private static final NumberOfEquivalentDominoPairs instance = new NumberOfEquivalentDominoPairs();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[][] { { 1, 2 }, { 2, 1 }, { 3, 4 }, { 5, 6 } }, 1), //
                Arguments.of(new int[][] { { 1, 2 }, { 1, 2 }, { 1, 1 }, { 1, 2 }, { 2, 2 } }, 3) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[][] input, int expected) {
        var actual = instance.numEquivDominoPairs(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
