/*
 * 287. Find the Duplicate Number - https://leetcode.com/problems/find-the-duplicate-number/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.stream.Stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class FindTheDuplicateNumberTest {
    private static final FindTheDuplicateNumber instance = new FindTheDuplicateNumber();

    private static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 3, 4, 2, 2 }, 2), //
                Arguments.of(new int[] { 3, 1, 3, 4, 2 }, 3), //
                Arguments.of(new int[] { 3, 3, 3, 3, 3 }, 3) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int expected) {
        int actual = instance.findDuplicate(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
