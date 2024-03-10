/*
 * LeetCode https://leetcode.com/problemset/
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode;

/**
 * A simple binary tree used in a few LeetCode problems
 * 
 * The data member are public (yuck!), as the constructors, to be compatible
 * with the original class - they are package-private in LeetCode implementation
 * - since my version is in another package - required by my package structure,
 * where each problem is in a specific difficulty related package
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    /**
     * Added as debug helper
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        if (left != null) {
            result.append(left + " ");
        }

        result.append(val);

        if (right != null) {
            result.append(" " + right);
        }

        return result.toString();
    }
}
