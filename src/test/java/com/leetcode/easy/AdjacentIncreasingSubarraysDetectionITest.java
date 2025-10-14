/*
 * 3349. Adjacent Increasing Subarrays Detection I - https://leetcode.com/problems/adjacent-increasing-subarrays-detection-i/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class AdjacentIncreasingSubarraysDetectionITest {
    private static final AdjacentIncreasingSubarraysDetectionI instance = new AdjacentIncreasingSubarraysDetectionI();

    static Stream<Arguments> provider() {
        return Stream.of(
                Arguments.of(List.of(2, 5, 7, 8, 9, 2, 3, 4, 3, 1), 3, true),
                Arguments.of(List.of(1, 2, 3, 4, 4, 4, 4, 5, 6, 7), 5, false));
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(List<Integer> input, int size, boolean expected) {
        var actual = instance.hasIncreasingSubarrays(input, size);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
