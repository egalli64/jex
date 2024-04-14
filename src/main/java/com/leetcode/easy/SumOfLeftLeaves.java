/*
 * 404. Sum of Left Leaves - https://leetcode.com/problems/sum-of-left-leaves/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import com.leetcode.TreeNode;

public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        return recursive(root, false);
    }

    int recursive(TreeNode node, boolean left) {
        if (node == null) {
            return 0;
        } else if (node.left == null && node.right == null) {
            return left ? node.val : 0;
        }

        return recursive(node.left, true) + recursive(node.right, false);
    }
}
