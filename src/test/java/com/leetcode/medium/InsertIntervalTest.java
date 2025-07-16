/*
 * 57. Insert Interval - https://leetcode.com/problems/insert-interval/description/
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

class InsertIntervalTest {
    private static final InsertInterval instance = new InsertInterval();

    private static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[][] { new int[] { 1, 3 }, new int[] { 6, 9 } }, //
                        new int[] { 2, 5 }, //
                        new int[][] { new int[] { 1, 5 }, new int[] { 6, 9 } }),
                Arguments.of(
                        new int[][] { new int[] { 1, 2 }, new int[] { 3, 5 }, new int[] { 6, 7 }, new int[] { 8, 10 },
                                new int[] { 12, 16 } }, //
                        new int[] { 4, 8 }, //
                        new int[][] { new int[] { 1, 2 }, new int[] { 3, 10 }, new int[] { 12, 16 } }) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[][] input, int[] extra, int[][] expected) {
        int[][] actual = instance.insert(input, extra);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
