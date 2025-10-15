/*
 * 3350. Adjacent Increasing Subarrays Detection II - https://leetcode.com/problems/adjacent-increasing-subarrays-detection-ii/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class AdjacentIncreasingSubarraysDetectionIITest {
    private static final AdjacentIncreasingSubarraysDetectionII instance = new AdjacentIncreasingSubarraysDetectionII();

    static Stream<Arguments> provider() {
        return Stream.of(
                Arguments.of(List.of(2, 5, 7, 8, 9, 2, 3, 4, 3, 1), 3),
                Arguments.of(List.of(1, 2, 3, 4, 4, 4, 4, 5, 6, 7), 2));
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(List<Integer> input, int expected) {
        var actual = instance.maxIncreasingSubarrays(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
