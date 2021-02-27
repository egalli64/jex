/*
 * Practice > Data Structures > Trees > Swap Nodes [Algo]
 * https://www.hackerrank.com/challenges/swap-nodes-algo/problem
 *
 * See description on hacker rank, too messed up to explain it here
 */
package hr.dataStructure.trees.swapNodes;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {
    private static int nodeId;

    public static int[][] swapNodes(int[][] indexes, int[] queries) {
        int[][] result = new int[queries.length][indexes.length];

        nodeId = 1;
        Node root = new Node();

        Queue<Node> nodes = new ArrayDeque<>();
        nodes.add(root);
        for (int[] checkers : indexes) {
            Node cur = nodes.remove();
            if (checkers[0] != -1) {
                nodes.add(cur.left = new Node());
            }
            if (checkers[1] != -1) {
                nodes.add(cur.right = new Node());
            }
        }

        for (int i = 0; i < queries.length; i++) {
            swap(root, queries[i], 1);
            inorder(root, result[i], 0);
        }

        return result;
    }

    private static void swap(Node node, int k, int level) {
        if (node == null) {
            return;
        }

        if (level % k == 0) {
            Node temp = node.left;
            node.left = node.right;
            node.right = temp;
        }
        swap(node.left, k, level + 1);
        swap(node.right, k, level + 1);
    }

    private static int inorder(Node node, int[] result, int pos) {
        if (node != null) {
            pos = inorder(node.left, result, pos);
            result[pos++] = node.data;
            pos = inorder(node.right, result, pos);
        }

        return pos;
    }

    private static class Node {
        int data;
        Node left;
        Node right;

        Node() {
            this.data = nodeId++;
        }
    }
}
