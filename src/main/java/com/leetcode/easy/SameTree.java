/*
 * 100. Same Tree - https://leetcode.com/problems/same-tree/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import com.leetcode.TreeNode;

/**
 * Check if two trees are equal, meaning that they have the same structure and
 * the nodes have the same value
 */
public class SameTree {
    /**
     * Compare two TreeNode trees for equality
     * 
     * @param p a binary tree
     * @param q another binary tree
     * @return true if they are considered equal
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null || p.val != q.val) {
            return false;
        } else {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }
}
