/*
 * 2962. Count Subarrays Where Max Element Appears at Least K Times - https://leetcode.com/problems/count-subarrays-where-max-element-appears-at-least-k-times/description/
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

class CountSubarraysMaxElementKPlusTimesTest {
    private static final CountSubarraysMaxElementKPlusTimes instance = new CountSubarraysMaxElementKPlusTimes();

    private static final Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 3, 2, 3, 3 }, 2, 6), //
                Arguments.of(new int[] { 1, 4, 2, 1 }, 3, 0) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int target, int expected) {
        long actual = instance.countSubarrays(input, target);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
