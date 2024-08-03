/*
 * 1460. Make Two Arrays Equal by Reversing Subarrays - https://leetcode.com/problems/make-two-arrays-equal-by-reversing-subarrays/description/
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

class MakeTwoArraysEqualByReversingSubarraysTest {
    private static final MakeTwoArraysEqualByReversingSubarrays instance = new MakeTwoArraysEqualByReversingSubarrays();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 2, 3, 4 }, new int[] { 2, 4, 1, 3 }, true), //
                Arguments.of(new int[] { 7 }, new int[] { 7 }, true), //
                Arguments.of(new int[] { 3, 7, 9 }, new int[] { 3, 7, 11 }, false) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] left, int[] right, boolean expected) {
        boolean actual = instance.canBeEqual(left, right);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
