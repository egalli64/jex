/*
 * 988. Smallest String Starting From Leaf - https://leetcode.com/problems/smallest-string-starting-from-leaf/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import com.leetcode.TreeNode;

/**
 * Given a non-empty binary tree with values [0, 25] as letters in ['a', 'z'],
 * find the smallest string starting at a leaf and ending at the root
 */
public class SmallestStringStartingFromLeaf {
    /**
     * Find "first" string in tree
     * 
     * @param root the tree - not null
     * @return the smallest string in the tree
     */
    public String smallestFromLeaf(TreeNode root) {
        StringBuilder result = new StringBuilder();
        recursion(root, new StringBuilder(), result);
        return result.toString();
    }

    /**
     * Recursive helper
     * 
     * @param node   the current node
     * @param cur    the current word
     * @param result the current found result
     */
    void recursion(TreeNode node, StringBuilder cur, StringBuilder result) {
        cur.append((char) ('a' + node.val));

        if (node.left == null && node.right == null) {
            String candidate = cur.reverse().toString();
            if (result.length() == 0 || candidate.compareTo(result.toString()) < 0) {
                result.setLength(0);
                result.append(candidate);
            }
            cur.reverse();
        }

        if (node.left != null) {
            recursion(node.left, cur, result);
        }
        if (node.right != null) {
            recursion(node.right, cur, result);
        }

        cur.setLength(cur.length() - 1);
    }
}
