/*
 * 3461. Check If Digits Are Equal in String After Operations - https://leetcode.com/problems/check-if-digits-are-equal-in-string-after-operations-i/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class CheckIfDigitsAreEqualInStringAfterOperationsTest {
    private static final CheckIfDigitsAreEqualInStringAfterOperations instance = new CheckIfDigitsAreEqualInStringAfterOperations();

    @ParameterizedTest
    @CsvSource({"3902,true", "34789,false"})
    void examples(String input, boolean expected) {
        assertThat(instance.hasSameDigits(input)).isEqualTo(expected);
    }
}
