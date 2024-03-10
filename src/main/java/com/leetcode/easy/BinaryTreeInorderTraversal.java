/*
 * 94. Binary Tree Inorder Traversal - https://leetcode.com/problems/binary-tree-inorder-traversal/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import com.leetcode.TreeNode;

/**
 * Convert a binary tree to list by inorder traversal
 */
public class BinaryTreeInorderTraversal {
    /**
     * Iterative implementation for inorder traversal
     * 
     * Being the algorithm inherently recursive, so I do not expect any performance
     * gain against the more elegant recursive implementation (see below)
     * 
     * @param root the tree root
     * @return the list conversion by inorder traversal
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }

            cur = stack.pop();
            result.add(cur.val);

            cur = cur.right;
        }

        return result;
    }

    /**
     * Start the recursion from the user input
     * 
     * @param root the tree root
     * @return the list conversion by inorder traversal
     */
    public List<Integer> recursiveInorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root != null) {
            traverse(root, result);
        }
        return result;
    }

    /**
     * Recursion for inorder traversal
     * 
     * @param cur  the current node
     * @param sink where to place the tree values
     */
    private void traverse(TreeNode cur, List<Integer> sink) {
        if (cur.left != null) {
            traverse(cur.left, sink);
        }

        sink.add(cur.val);

        if (cur.right != null) {
            traverse(cur.right, sink);
        }
    }
}
