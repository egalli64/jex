/*
 * 94. Binary Tree Inorder Traversal - https://leetcode.com/problems/binary-tree-inorder-traversal/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.leetcode.TreeNode;

class BinaryTreeInorderTraversalTest {
    private static final BinaryTreeInorderTraversal instance = new BinaryTreeInorderTraversal();

    private static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null)), List.of(1, 3, 2)), //
                Arguments.of(null, List.of()), //
                Arguments.of(new TreeNode(1), List.of(1)) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(TreeNode input, List<Integer> expected) {
        List<Integer> actual = instance.inorderTraversal(input);
        assertThat(actual).isEqualTo(expected);
    }
}
