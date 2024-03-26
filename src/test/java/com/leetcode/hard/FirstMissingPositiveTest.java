/*
 * 41. First Missing Positive - https://leetcode.com/problems/first-missing-positive/description/
 * LeetCode Hard Problems - https://leetcode.com/problemset/?difficulty=HARD
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.hard;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class FirstMissingPositiveTest {
    private static final FirstMissingPositive instance = new FirstMissingPositive();

    private static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 2, 0 }, 3), //
                Arguments.of(new int[] { 3, 4, -1, 1 }, 2), //
                Arguments.of(new int[] { 7, 8, 9, 11, 12 }, 1) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int expected) {
        int actual = instance.firstMissingPositive(input);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void minimalExtra() {
        assertThat(instance.firstMissingPositive(new int[] { 1 })).isEqualTo(2);
    }

    @Test
    void minimalMissing() {
        assertThat(instance.firstMissingPositive(new int[] { 0 })).isEqualTo(1);
    }
}
