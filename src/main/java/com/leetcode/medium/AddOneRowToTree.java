/*
 * 623. Add One Row to Tree - https://leetcode.com/problems/add-one-row-to-tree/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import com.leetcode.TreeNode;

/**
 * Given a binary tree, add a row of nodes with a given value at the given depth
 * (1 for root level)
 */
public class AddOneRowToTree {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        return depth == 1 ? new TreeNode(val, root, null) : recursion(root, val, depth, 1);
    }

    TreeNode recursion(TreeNode root, int val, int depth, int cur) {
        if (root == null)
            return null;

        if (cur == depth - 1) {
            TreeNode left = root.left;
            TreeNode right = root.right;

            root.left = new TreeNode(val);
            root.right = new TreeNode(val);
            root.left.left = left;
            root.right.right = right;
        } else {
            cur += 1;

            root.left = recursion(root.left, val, depth, cur);
            root.right = recursion(root.right, val, depth, cur);
        }

        return root;
    }
}
