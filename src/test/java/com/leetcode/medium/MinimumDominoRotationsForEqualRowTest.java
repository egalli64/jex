/*
 * 1007. Minimum Domino Rotations For Equal Row - https://leetcode.com/problems/minimum-domino-rotations-for-equal-row/description/
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

class MinimumDominoRotationsForEqualRowTest {
    private static final MinimumDominoRotationsForEqualRow instance = new MinimumDominoRotationsForEqualRow();

    private static final Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 2, 1, 2, 4, 2, 2 }, new int[] { 5, 2, 6, 2, 3, 2 }, 2), //
                Arguments.of(new int[] { 3, 5, 1, 2, 3 }, new int[] { 3, 6, 3, 3, 4 }, -1) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] tops, int[] bottoms, int expected) {
        var actual = instance.minDominoRotations(tops, bottoms);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
