/*
 * 404. Sum of Left Leaves - https://leetcode.com/problems/sum-of-left-leaves/description/
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

import com.leetcode.TreeNode;

class SumOfLeftLeavesTest {
    private static final SumOfLeftLeaves instance = new SumOfLeftLeaves();

    private static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(15))),
                        24), //
                Arguments.of(new TreeNode(1), 0) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(TreeNode input, int expected) {
        int actual = instance.sumOfLeftLeaves(input);
        assertThat(actual).isEqualTo(expected);
    }
}
