/*
 * 145. Binary Tree Postorder Traversal - https://leetcode.com/problems/binary-tree-postorder-traversal/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

import com.leetcode.TreeNode;

/**
 * Convert a binary tree to list by post-order traversal
 */
public class BinaryTreePostorderTraversal {
    /**
     * Start the recursion from the user input
     * 
     * @param root the tree root
     * @return the list conversion by post-order traversal
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }

    /**
     * Recursion for post-order traversal
     * 
     * @param cur  the current node
     * @param sink where to place the tree values
     */
    private void traverse(TreeNode cur, List<Integer> sink) {
        if (cur != null) {
            traverse(cur.left, sink);
            traverse(cur.right, sink);
            sink.add(cur.val);
        }
    }
}
