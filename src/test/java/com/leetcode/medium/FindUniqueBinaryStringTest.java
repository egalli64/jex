/*
 * 1980. Find Unique Binary String - https://leetcode.com/problems/find-unique-binary-string/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class FindUniqueBinaryStringTest {
    private static final FindUniqueBinaryString instance = new FindUniqueBinaryString();

    static Stream<List<String>> provider() {
        return Stream.of(List.of("01", "10"), List.of("00", "01"), List.of("111", "011", "001"));
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(List<String> input) {
        String actual = instance.findDifferentBinaryString(input.toArray(new String[0]));
        assertThat(actual).isNotIn(input);
    }
}
