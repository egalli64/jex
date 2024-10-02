/*
 * 1331. Rank Transform of an Array - https://leetcode.com/problems/rank-transform-of-an-array/description/
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

class RankTransformArrayTest {
    private static final RankTransformArray instance = new RankTransformArray();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 40, 10, 20, 30 }, new int[] { 4, 1, 2, 3 }), //
                Arguments.of(new int[] { 100, 100, 100 }, new int[] { 1, 1, 1 }), //
                Arguments.of(new int[] { 37, 12, 28, 9, 100, 56, 80, 5, 12 }, new int[] { 5, 3, 4, 2, 8, 6, 7, 1, 3 }) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int[] expected) {
        var actual = instance.arrayRankTransform(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
