/*
 * 2221. Find Triangular Sum of an Array - https://leetcode.com/problems/find-triangular-sum-of-an-array/description/
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

class FindTriangularSumOfArrayTest {
    private static final FindTriangularSumOfArray instance = new FindTriangularSumOfArray();

    private static Stream<Arguments> provider() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 8),
                Arguments.of(new int[]{5}, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int expected) {
        var actual = instance.triangularSum(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
