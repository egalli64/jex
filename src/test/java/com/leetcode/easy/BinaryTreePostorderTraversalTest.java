/*
 * 145. Binary Tree Postorder Traversal - https://leetcode.com/problems/binary-tree-postorder-traversal/description/
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

class BinaryTreePostorderTraversalTest {
    private static final BinaryTreePostorderTraversal instance = new BinaryTreePostorderTraversal();

    private static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null)), List.of(3, 2, 1)), //
                Arguments.of(null, List.of()), //
                Arguments.of(new TreeNode(1), List.of(1)) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(TreeNode input, List<Integer> expected) {
        List<Integer> actual = instance.postorderTraversal(input);
        assertThat(actual).isEqualTo(expected);
    }
}
