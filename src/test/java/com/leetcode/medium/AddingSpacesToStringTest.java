/*
 * 2109. Adding Spaces to a String - https://leetcode.com/problems/adding-spaces-to-a-string/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class AddingSpacesToStringTest {
    private static final AddingSpacesToString instance = new AddingSpacesToString();

    private static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of("EnjoyYourCoffee", new int[] { 5, 9 }, "Enjoy Your Coffee"), //
                Arguments.of("LeetcodeHelpsMeLearn", new int[] { 8, 13, 15 }, "Leetcode Helps Me Learn"), //
                Arguments.of("icodeinpython", new int[] { 1, 5, 7, 9 }, "i code in py thon"), //
                Arguments.of("spacing", new int[] { 0, 1, 2, 3, 4, 5, 6 }, " s p a c i n g") //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(String input, int[] positions, String expected) {
        String actual = instance.addSpaces(input, positions);
        assertThat(actual).isEqualTo(expected);
    }
}
