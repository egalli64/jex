/*
 * 2138. Divide a String Into Groups of Size k - https://leetcode.com/problems/divide-a-string-into-groups-of-size-k/description/
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

class DivideStringIntoGroupsOfSizeKTest {
    private static final DivideStringIntoGroupsOfSizeK instance = new DivideStringIntoGroupsOfSizeK();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of("abcdefghi", 3, 'x', new String[] { "abc", "def", "ghi" }), //
                Arguments.of("abcdefghij", 3, 'x', new String[] { "abc", "def", "ghi", "jxx" }) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(String input, int size, char filler, String[] expected) {
        var actual = instance.divideString(input, size, filler);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
