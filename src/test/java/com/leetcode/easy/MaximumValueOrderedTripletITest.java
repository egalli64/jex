/*
 * 2873. Maximum Value of an Ordered Triplet I - https://leetcode.com/problems/maximum-value-of-an-ordered-triplet-i/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MaximumValueOrderedTripletITest {
    private static final MaximumValueOrderedTripletI instance = new MaximumValueOrderedTripletI();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 12, 6, 1, 2, 7 }, 77), //
                Arguments.of(new int[] { 1, 10, 3, 4, 19 }, 133), //
                Arguments.of(new int[] { 1, 2, 3 }, 0) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, long expected) {
        var actual = instance.maximumTripletValue(input);
        assertThat(actual).isEqualTo(expected);
    }
}
