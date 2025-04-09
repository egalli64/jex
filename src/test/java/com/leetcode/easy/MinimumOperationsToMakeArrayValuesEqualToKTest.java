/*
 * 3375. Minimum Operations to Make Array Values Equal to K - https://leetcode.com/problems/minimum-operations-to-make-array-values-equal-to-k/description/
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

class MinimumOperationsToMakeArrayValuesEqualToKTest {
    private static final MinimumOperationsToMakeArrayValuesEqualToK instance = new MinimumOperationsToMakeArrayValuesEqualToK();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 5, 2, 5, 4, 5 }, 2, 2), //
                Arguments.of(new int[] { 2, 1, 2 }, 2, -1), //
                Arguments.of(new int[] { 9, 7, 5, 3 }, 1, 4) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int target, int expected) {
        var actual = instance.minOperations(input, target);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
