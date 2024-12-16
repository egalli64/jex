/*
 * 3264. Final Array State After K Multiplication Operations I - https://leetcode.com/problems/final-array-state-after-k-multiplication-operations-i/description/
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

class FinalArrayStateAfterKMultiplicationOperationsITest {
    private static final FinalArrayStateAfterKMultiplicationOperationsI instance = new FinalArrayStateAfterKMultiplicationOperationsI();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 2, 1, 3, 5, 6 }, 5, 2, new int[] { 8, 4, 6, 5, 6 }), //
                Arguments.of(new int[] { 1, 2 }, 3, 4, new int[] { 16, 8 }) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int m, int n, int[] expected) {
        var actual = instance.getFinalState(input, m, n);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
