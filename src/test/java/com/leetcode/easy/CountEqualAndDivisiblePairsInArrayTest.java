/*
 * 2176. Count Equal and Divisible Pairs in an Array - https://leetcode.com/problems/add-binary/description/
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

class CountEqualAndDivisiblePairsInArrayTest {
    private static final CountEqualAndDivisiblePairsInArray instance = new CountEqualAndDivisiblePairsInArray();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 3, 1, 2, 2, 2, 1, 3 }, 2, 4), //
                Arguments.of(new int[] { 1, 2, 3, 4 }, 1, 0) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int k, int expected) {
        var actual = instance.countPairs(input, k);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
