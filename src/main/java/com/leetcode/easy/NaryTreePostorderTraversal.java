/*
 * 590. N-ary Tree Postorder Traversal - https://leetcode.com/problems/n-ary-tree-postorder-traversal/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

import com.leetcode.Node;

/**
 * Convert an N-ary tree to list by post-order traversal
 */
public class NaryTreePostorderTraversal {
    /**
     * Start the recursion from the user input
     * 
     * @param root the tree root
     * @return the list conversion by post-order traversal
     */
    public List<Integer> postorder(Node root) {
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
    private void traverse(Node cur, List<Integer> sink) {
        if (cur != null) {
            if (cur.children != null) {
                for (Node child : cur.children) {
                    traverse(child, sink);
                }
            }
            sink.add(cur.val);
        }
    }
}
