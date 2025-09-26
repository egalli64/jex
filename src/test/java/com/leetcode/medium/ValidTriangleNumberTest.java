/*
 * 611. Valid Triangle Number - https://leetcode.com/problems/valid-triangle-number/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class ValidTriangleNumberTest {
    private static final ValidTriangleNumber instance = new ValidTriangleNumber();

    private static Stream<Arguments> provider() {
        return Stream.of(
                Arguments.of(new int[]{2, 2, 3, 4}, 3),
                Arguments.of(new int[]{4, 2, 3, 4}, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int expected) {
        var actual = instance.triangleNumber(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}