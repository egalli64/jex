/*
 * 3151. Special Array I - https://leetcode.com/problems/special-array-i/description/
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

class SpecialArrayITest {
    private static final SpecialArrayI instance = new SpecialArrayI();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1 }, true), //
                Arguments.of(new int[] { 2, 1, 4 }, true), //
                Arguments.of(new int[] { 4, 3, 1, 6 }, false) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, boolean expected) {
        var actual = instance.isArraySpecial(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
