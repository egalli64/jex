/*
 * 15. 3Sum - https://leetcode.com/problems/3sum/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.List;
import java.util.stream.Stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ThreeSumTest {
    private static final ThreeSum instance = new ThreeSum();

    private static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { -1, 0, 1, 2, -1, -4 }, List.of(List.of(-1, -1, 2), List.of(-1, 0, 1))), //
                Arguments.of(new int[] { 0, 1, 1 }, List.of()), //
                Arguments.of(new int[] { 0, 0, 0 }, List.of(List.of(0, 0, 0))) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, List<List<Integer>> expected) {
        var actual = instance.threeSum(input);
        Assertions.assertThat(actual).containsExactlyInAnyOrderElementsOf(expected);
    }
}
