/*
 * 2444. Count Subarrays With Fixed Bounds - https://leetcode.com/problems/count-subarrays-with-fixed-bounds/description/
 * LeetCode Hard Problems - https://leetcode.com/problemset/?difficulty=HARD
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.hard;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class CountSubarraysWithFixedBoundsTest {
    private static final CountSubarraysWithFixedBounds instance = new CountSubarraysWithFixedBounds();

    private static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 3, 5, 2, 7, 5 }, 1, 5, 2), //
                Arguments.of(new int[] { 1, 1, 1, 1 }, 1, 1, 10) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int min, int max, long expected) {
        long actual = instance.countSubarrays(input, min, max);
        assertThat(actual).isEqualTo(expected);
    }
}
