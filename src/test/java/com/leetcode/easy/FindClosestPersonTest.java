/*
 * 3516. Find Closest Person - https://leetcode.com/problems/find-closest-person/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class FindClosestPersonTest {
    private static final FindClosestPerson instance = new FindClosestPerson();

    @ParameterizedTest
    @CsvSource({"2,7,4,1", "2,5,6,2", "1,5,3,0"})
    void examples(int x, int y, int z, int expected) {
        assertThat(instance.findClosest(x, y, z)).isEqualTo(expected);
    }
}