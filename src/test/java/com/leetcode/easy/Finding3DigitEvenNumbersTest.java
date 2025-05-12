/*
 * 2094. Finding 3-Digit Even Numbers - https://leetcode.com/problems/finding-3-digit-even-numbers/description/
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

class Finding3DigitEvenNumbersTest {
    private static final Finding3DigitEvenNumbers instance = new Finding3DigitEvenNumbers();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 2, 1, 3, 0 }, new int[] { 102, 120, 130, 132, 210, 230, 302, 310, 312, 320 }), //
                Arguments.of(new int[] { 2, 2, 8, 8, 2 }, new int[] { 222, 228, 282, 288, 822, 828, 882 }), //
                Arguments.of(new int[] { 3, 7, 5 }, new int[] {}) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int[] expected) {
        var actual = instance.findEvenNumbers(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
