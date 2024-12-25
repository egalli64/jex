/*
 * 515. Find Largest Value in Each Tree Row - https://leetcode.com/problems/find-largest-value-in-each-tree-row/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import com.leetcode.TreeNode;

/**
 * Given a binary tree, get the max value in each of its level, put it in a
 * list, and return it. Notice that the tree could be empty (its root is null)
 */
public class FindLargestValueInEachTreeRow {
    /**
     * BFS, get the max value for each level, put it in the result
     * 
     * @param root the root of the tree to analyze
     * @return the list of max values by level
     */
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int max = Integer.MIN_VALUE;
            int len = queue.size();

            for (int i = 0; i < len; i++) {
                TreeNode cur = queue.remove();
                max = Math.max(max, cur.val);

                if (cur.left != null) {
                    queue.add(cur.left);
                }
                if (cur.right != null) {
                    queue.add(cur.right);
                }
            }

            result.add(max);
        }

        return result;
    }
}
