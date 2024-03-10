/*
 * 100. Same Tree - https://leetcode.com/problems/same-tree/description/
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

class SameTreeTest {
    private static final SameTree instance = new SameTree();

    private static final Stream<Arguments> provider() {
        TreeNode t213 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode t213b = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode t21_ = new TreeNode(1, new TreeNode(2), null);
        TreeNode t_12 = new TreeNode(1, null, new TreeNode(2));
        TreeNode t211 = new TreeNode(1, new TreeNode(2), new TreeNode(1));
        TreeNode t112 = new TreeNode(1, new TreeNode(1), new TreeNode(2));
        TreeNode t_11 = new TreeNode(1, null, new TreeNode(1));
        TreeNode t_11b = new TreeNode(1, null, new TreeNode(1));

        return Stream.of( //
                Arguments.of(t213, t213b, true), //
                Arguments.of(t21_, t_12, false), //
                Arguments.of(t211, t112, false), //
                Arguments.of(t_11, t_11b, true) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(TreeNode left, TreeNode right, boolean expected) {
        boolean actual = instance.isSameTree(left, right);
        assertThat(actual).isEqualTo(expected);
    }
}
