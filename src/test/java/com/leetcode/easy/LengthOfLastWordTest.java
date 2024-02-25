/*
 * 58. Length of Last Word - https://leetcode.com/problems/length-of-last-word/description/
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

class LengthOfLastWordTest {
    private static final LengthOfLastWord instance = new LengthOfLastWord();

    private static final Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of("Hello World", 5), //
                Arguments.of("   fly me   to   the moon  ", 4), //
                Arguments.of("luffy is still joyboy", 6) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(String input, int expected) {
        int actual = instance.lengthOfLastWord(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
