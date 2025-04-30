/*
 * 1295. Find Numbers with Even Number of Digits - https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
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

class FindNumbersWithEvenNumberOfDigitsTest {
    private static final FindNumbersWithEvenNumberOfDigits instance = new FindNumbersWithEvenNumberOfDigits();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 12, 345, 2, 6, 7896 }, 2), //
                Arguments.of(new int[] { 555, 901, 482, 1771 }, 1) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int expected) {
        var actual = instance.findNumbers(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void fastAndDirty(int[] input, int expected) {
        var actual = instance.fastAndDirty(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
