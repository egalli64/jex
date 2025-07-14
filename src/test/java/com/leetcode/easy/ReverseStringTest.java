/*
 * 344. Reverse String - https://leetcode.com/problems/reverse-string/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ReverseStringTest {
    private static final ReverseString instance = new ReverseString();

    private static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new char[] { 'h', 'e', 'l', 'l', 'o' }, new char[] { 'o', 'l', 'l', 'e', 'h' }), //
                Arguments.of(new char[] { 'H', 'a', 'n', 'n', 'a', 'h' }, new char[] { 'h', 'a', 'n', 'n', 'a', 'H' }));
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(char[] input, char[] expected) {
        instance.reverseString(input);
        assertThat(input).isEqualTo(expected);
    }
}
