/*
 * 2348. Number of Zero-Filled Subarrays - https://leetcode.com/problems/number-of-zero-filled-subarrays/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class NumberOfZeroFilledSubarraysTest {
    private static final NumberOfZeroFilledSubarrays instance = new NumberOfZeroFilledSubarrays();

    private static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[]{1, 3, 0, 0, 2, 0, 0, 4}, 6), //
                Arguments.of(new int[]{0, 0, 0, 2, 0, 0}, 9), //
                Arguments.of(new int[]{2, 10, 2019}, 0) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, long expected) {
        long actual = instance.zeroFilledSubarray(input);
        assertThat(actual).isEqualTo(expected);
    }
}
