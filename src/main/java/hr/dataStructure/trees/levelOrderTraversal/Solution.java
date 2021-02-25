/*
 * Practice > Data Structures > Trees > Tree: Level Order Traversal
 * https://www.hackerrank.com/challenges/tree-level-order-traversal/problem
 *
 * Print the level order traversal from the passed node on
 */
package hr.dataStructure.trees.levelOrderTraversal;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {
    public static void levelOrder(Node root) {
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.print(node.data + " ");
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

    private static class Node {
        int data;
        Node left;
        Node right;
    }
}
