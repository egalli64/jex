/*
 * 1051. Height Checker - https://leetcode.com/problems/height-checker/description/
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

class HeightCheckerTest {
    private static final HeightChecker instance = new HeightChecker();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 1, 4, 2, 1, 3 }, 3), //
                Arguments.of(new int[] { 5, 1, 2, 3, 4 }, 5), //
                Arguments.of(new int[] { 1, 2, 3, 4, 5 }, 0) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int expected) {
        int actual = instance.heightChecker(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
