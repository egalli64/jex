/*
 * 2197. Replace Non-Coprime Numbers in Array - https://leetcode.com/problems/replace-non-coprime-numbers-in-array/description/
 * LeetCode Hard Problems - https://leetcode.com/problemset/?difficulty=HARD
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.hard;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ReplaceNonCoprimeNumbersInArrayTest {
    private static final ReplaceNonCoprimeNumbersInArray instance = new ReplaceNonCoprimeNumbersInArray();

    private static Stream<Arguments> provider() {
        return Stream.of(
                Arguments.of(new int[]{31, 97561, 97561, 97561, 97561, 97561, 97561, 97561, 97561}, List.of(31, 97561)),
                Arguments.of(new int[]{6, 4, 3, 2, 7, 6, 2}, List.of(12, 7, 6)),
                Arguments.of(new int[]{2, 2, 1, 1, 3, 3, 3}, List.of(2, 1, 1, 3))
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, List<Integer> expected) {
        var actual = instance.replaceNonCoprimes(input);
        assertThat(actual).isEqualTo(expected);
    }
}