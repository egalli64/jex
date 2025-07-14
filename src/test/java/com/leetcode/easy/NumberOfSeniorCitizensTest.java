/*
 * 2678. Number of Senior Citizens - https://leetcode.com/problems/number-of-senior-citizens/description/
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

class NumberOfSeniorCitizensTest {
    private static final NumberOfSeniorCitizens instance = new NumberOfSeniorCitizens();

    private static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new String[] { "7868190130M7522", "5303914400F9211", "9273338290F4010" }, 2), //
                Arguments.of(new String[] { "1313579440F2036", "2921522980M5644" }, 0) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(String[] input, int expected) {
        int actual = instance.countSeniors(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
