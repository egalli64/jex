/*
 * 66. Plus One - https://leetcode.com/problems/plus-one/description/
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

class PlusOneTest {
    private static final PlusOne instance = new PlusOne();

    private static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 2, 3 }, new int[] { 1, 2, 4 }),
                Arguments.of(new int[] { 4, 3, 2, 1 }, new int[] { 4, 3, 2, 2 }),
                Arguments.of(new int[] { 9 }, new int[] { 1, 0 }));
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int[] expected) {
        int[] actual = instance.plusOne(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
