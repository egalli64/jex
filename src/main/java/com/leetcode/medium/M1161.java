/*
 * 1161. Maximum Level Sum of a Binary Tree
 * https://leetcode.com/problems/greatest-sum-divisible-by-three/description/
 * LeetCode Medium Problems
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import com.leetcode.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Find the lowest level having the largest sum of values for the passed TreeNode.
 */
class M1161 {
    /**
     * Smoke Test
     */
    static void main() {
        M1161 x = new M1161();

        System.out.println(x.maxLevelSum(new TreeNode(1,
                new TreeNode(7, new TreeNode(7), new TreeNode(-8)), new TreeNode(0))) == 2);
        System.out.println(x.maxLevelSum(new TreeNode(989, null,
                new TreeNode(10250, new TreeNode(98693),
                        new TreeNode(-89388, new TreeNode(-32127), null)))) == 2);
    }

    public int maxLevelSum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> nodes = new ArrayDeque<>();
        nodes.add(root);

        int largestSum = Integer.MIN_VALUE;
        int result = 1;
        int level = 1;

        while (!nodes.isEmpty()) {
            int sum = 0;

            for (int i = 0, curSize = nodes.size(); i < curSize; i++) {
                TreeNode node = nodes.remove();
                sum += node.val;

                if (node.left != null) {
                    nodes.add(node.left);
                }
                if (node.right != null) {
                    nodes.add(node.right);
                }
            }

            if (sum > largestSum) {
                largestSum = sum;
                result = level;
            }

            level += 1;
        }

        return result;
    }
}
