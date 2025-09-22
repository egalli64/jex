/*
 * 3005. Count Elements With Maximum Frequency - https://leetcode.com/problems/count-elements-with-maximum-frequency/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class CountElementsWithMaximumFrequencyTest {
    private static final CountElementsWithMaximumFrequency instance = new CountElementsWithMaximumFrequency();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[]{1, 2, 2, 3, 1, 4}, 4),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int expected) {
        var actual = instance.maxFrequencyElements(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
