/*
 * 992. Subarrays with K Different Integers - https://leetcode.com/problems/subarrays-with-k-different-integers/description/
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

class SubarraysWithKDifferentIntegersTest {
    private static final SubarraysWithKDifferentIntegers instance = new SubarraysWithKDifferentIntegers();

    private static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 2, 1, 2, 3 }, 2, 7), //
                Arguments.of(new int[] { 1, 2, 1, 3, 4 }, 3, 3) //
        );
    }

    private static Stream<Arguments> internal() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 2, 1, 2, 3 }, 2, 12), //
                Arguments.of(new int[] { 1, 2, 1, 3, 4 }, 3, 13), //
                Arguments.of(new int[] { 1, 2, 1, 2, 3 }, 1, 5), //
                Arguments.of(new int[] { 1, 2, 1, 3, 4 }, 2, 10) //
        );
    }
    
    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int target, int expected) {
        int actual = instance.subarraysWithKDistinct(input, target);
        assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("internal")
    void examplesInternal(int[] input, int target, int expected) {
        int actual = instance.maxKSubarray(input, target);
        assertThat(actual).isEqualTo(expected);
    }
}
