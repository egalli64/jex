/*
 * 2200. Find All K-Distant Indices in an Array - https://leetcode.com/problems/add-binary/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.List;
import java.util.stream.Stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class FindAllKDistantIndicesInArrayTest {
    private static final FindAllKDistantIndicesInArray instance = new FindAllKDistantIndicesInArray();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 3, 4, 9, 1, 3, 9, 5 }, 9, 1, List.of(1, 2, 3, 4, 5, 6)), //
                Arguments.of(new int[] { 2, 2, 2, 2, 2 }, 2, 2, List.of(0, 1, 2, 3, 4)) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int m, int n, List<Integer> expected) {
        var actual = instance.findKDistantIndices(input, m, n);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
