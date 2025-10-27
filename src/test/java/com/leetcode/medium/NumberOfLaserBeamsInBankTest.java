/*
 * 2125. Number of Laser Beams in a Bank - https://leetcode.com/problems/number-of-laser-beams-in-a-bank/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class NumberOfLaserBeamsInBankTest {
    private static final NumberOfLaserBeamsInBank instance = new NumberOfLaserBeamsInBank();

    private static Stream<Arguments> provider() {
        return Stream.of(
                Arguments.of(new String[]{"011001", "000000", "010100", "001000"}, 8),
                Arguments.of(new String[]{"000", "111", "000"}, 0));
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(String[] input, int expected) {
        var actual = instance.numberOfBeams(input);
        assertThat(actual).isEqualTo(expected);
    }


    @ParameterizedTest
    @MethodSource("provider")
    void examplesFun(String[] input, int expected) {
        var actual = instance.fun(input);
        assertThat(actual).isEqualTo(expected);
    }
}
