/*
 * 2161. Partition Array According to Given Pivot - https://leetcode.com/problems/partition-array-according-to-given-pivot/description/
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

class PartitionArrayAccordingGivenPivotTest {
    private static final PartitionArrayAccordingGivenPivot instance = new PartitionArrayAccordingGivenPivot();

    private static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 9, 12, 5, 10, 14, 3, 10 }, 10, new int[] { 9, 5, 3, 10, 10, 12, 14 }), //
                Arguments.of(new int[] { -3, 4, 3, 2 }, 2, new int[] { -3, 2, 4, 3 }) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int target, int[] expected) {
        var actual = instance.pivotArray(input, target);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
