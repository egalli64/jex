/*
 * 2210. Count Hills and Valleys in an Array - https://leetcode.com/problems/count-hills-and-valleys-in-an-array/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class CountHillsAndValleysInArrayTest {
    private static final CountHillsAndValleysInArray instance = new CountHillsAndValleysInArray();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[]{2, 4, 1, 1, 6, 5}, 3), //
                Arguments.of(new int[]{6, 6, 5, 5, 4, 1}, 0) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int expected) {
        var actual = instance.countHillValley(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
