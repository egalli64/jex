/*
 * 1598. Crawler Log Folder - https://leetcode.com/problems/crawler-log-folder/description/
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

class CrawlerLogFolderTest {
    private static final CrawlerLogFolder instance = new CrawlerLogFolder();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new String[] { "d1/", "d2/", "../", "d21/", "./" }, 2), //
                Arguments.of(new String[] { "d1/", "d2/", "./", "d3/", "../", "d31/" }, 3), //
                Arguments.of(new String[] { "d1/", "../", "../", "../" }, 0) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(String[] input, int expected) {
        int actual = instance.minOperations(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
