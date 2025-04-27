/*
 * 3392. Count Subarrays of Length Three With a Condition - https://leetcode.com/problems/count-subarrays-of-length-three-with-a-condition/description/
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

class CountSubarraysLengthThreeWithConditionTest {
    private static final CountSubarraysLengthThreeWithCondition instance = new CountSubarraysLengthThreeWithCondition();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 2, 1, 4, 1 }, 1), //
                Arguments.of(new int[] { 1, 1, 1 }, 0) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int expected) {
        var actual = instance.countSubarrays(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
