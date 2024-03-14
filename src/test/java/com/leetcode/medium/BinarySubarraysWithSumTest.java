/*
 * 930. Binary Subarrays With Sum - https://leetcode.com/problems/binary-subarrays-with-sum/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.stream.Stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class BinarySubarraysWithSumTest {
    private static final BinarySubarraysWithSum instance = new BinarySubarraysWithSum();

    private static final Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 0, 1, 0, 1 }, 2, 4), //
                Arguments.of(new int[] { 0, 0, 0, 0, 0 }, 0, 15) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int target, int expected) {
        int actual = instance.numSubarraysWithSum(input, target);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
