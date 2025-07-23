/*
 * 1717. Maximum Score From Removing Substrings - https://leetcode.com/problems/maximum-score-from-removing-substrings/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class MaximumScoreFromRemovingSubstringsTest {
    private static final MaximumScoreFromRemovingSubstrings instance = new MaximumScoreFromRemovingSubstrings();

    @ParameterizedTest
    @CsvSource({"cdbcbbaaabab,4,5,19", "aabbaaxybbaabb,5,4,20"})
    void examples(String input, int ab, int ba, int expected) {
        assertThat(instance.maximumGain(input, ab, ba)).isEqualTo(expected);
    }
}
