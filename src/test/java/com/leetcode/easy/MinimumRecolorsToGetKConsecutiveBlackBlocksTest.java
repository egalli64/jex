/*
 * 2379. Minimum Recolors to Get K Consecutive Black Blocks - https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MinimumRecolorsToGetKConsecutiveBlackBlocksTest {
    private static final MinimumRecolorsToGetKConsecutiveBlackBlocks instance = new MinimumRecolorsToGetKConsecutiveBlackBlocks();

    @ParameterizedTest
    @CsvSource({ "WBBWWBBWBW,7, 3", "WBWBBBW,2,0" })
    void examples(String input, int size, int expected) {
        assertThat(instance.minimumRecolors(input, size)).isEqualTo(expected);
    }
}
