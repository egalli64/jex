/*
 * LeetCode 27. Remove Element
 * https://leetcode.com/problems/remove-element/description/
 * 
 * My repository with solutions
 * https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class RemoveElementTest {
    private static final RemoveElement instance = new RemoveElement();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 3, 2, 2, 3 }, 3, new int[] { 2, 2 }, 2), //
                Arguments.of(new int[] { 0, 1, 2, 2, 3, 0, 4, 2 }, 2, new int[] { 0, 1, 4, 0, 3 }, 5) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void removeElementExamples(int[] input, int value, int[] expected, int k) {
        int actual = instance.removeElement(input, value);
        assertThat(actual).isEqualTo(k);

        int[] cut = Arrays.copyOf(input, k);
        assertThat(cut).containsExactlyInAnyOrder(expected);
    }
}
