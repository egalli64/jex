/*
 * 129. Sum Root to Leaf Numbers - https://leetcode.com/problems/sum-root-to-leaf-numbers/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import com.leetcode.TreeNode;

/**
 * Given a tree where each root-to-leaf path represents a number, calculate the
 * total sum of them.
 * 
 * The tree is not-empty, and the value of each node is in [0..9].
 */
public class SumRootToLeafNumbers {
    /**
     * Get the root-to-leaf number sum
     * 
     * @param root the tree root
     * @return the sum
     */
    public int sumNumbers(TreeNode root) {
        return recursion(root, 0);
    }

    /**
     * Recursive helper
     * 
     * @param node the current node (not null)
     * @param acc  the accumulator
     * @return the calculated sum
     */
    private int recursion(TreeNode node, int acc) {
        if (node == null) {
            return 0;
        } else {
            acc = acc * 10 + node.val;

            if (node.left == null && node.right == null)
                return acc;

            return recursion(node.left, acc) + recursion(node.right, acc);
        }
    }
}
