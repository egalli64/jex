/*
 * 623. Add One Row to Tree - https://leetcode.com/problems/add-one-row-to-tree/description/
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

import com.leetcode.TreeNode;

class AddOneRowToTreeTest {
    private static final AddOneRowToTree instance = new AddOneRowToTree();

    private static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new TreeNode(4, new TreeNode(2, new TreeNode(3), new TreeNode(1)), //
                        new TreeNode(6, new TreeNode(5), null)), 1, 2, //
                        new TreeNode(4, new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(1)), null),
                                new TreeNode(1, null, new TreeNode(6, new TreeNode(5), null)))) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(TreeNode input, int value, int level, TreeNode expected) {
        TreeNode actual = instance.addOneRow(input, value, level);
        assertThat(actual).isEqualTo(expected);
    }
}
