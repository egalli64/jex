/*
 * 94. Binary Tree Inorder Traversal - https://leetcode.com/problems/binary-tree-inorder-traversal/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

import com.leetcode.TreeNode;

/**
 * Convert a binary tree to list by inorder traversal
 */
public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root != null) {
            traverse(root, result);
        }
        return result;
    }

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
