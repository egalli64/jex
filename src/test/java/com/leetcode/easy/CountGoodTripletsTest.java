/*
 * 1534. Count Good Triplets - https://leetcode.com/problems/count-good-triplets/description/
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

class CountGoodTripletsTest {
    private static final CountGoodTriplets instance = new CountGoodTriplets();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 3, 0, 1, 1, 9, 7 }, 7, 2, 3, 4), //
                Arguments.of(new int[] { 1, 1, 2, 2, 3 }, 0, 0, 1, 0) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int a, int b, int c, int expected) {
        var actual = instance.countGoodTriplets(input, a, b, c);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
