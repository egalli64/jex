package com.hackerrank.dataStructure.trees;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {
    /*
     * Practice > Data Structures > Trees > Tree: Level Order Traversal
     * https://www.hackerrank.com/challenges/tree-level-order-traversal/problem
     *
     * Print the level order traversal from the passed node on
     */
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

    /*
     * Practice > Data Structures > Trees > Binary Search Tree : Insertion
     * https://www.hackerrank.com/challenges/binary-search-tree-insertion/problem
     *
     * Unbalanced BST - Insert a node below the passed node (it could be null!)
     */
    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        Node current = root;
        for (; ; ) {
            if (data < current.data) {
                if (current.left == null) {
                    current.left = new Node(data);
                    break;
                } else {
                    current = current.left;
                }
            } else {
                if (current.right == null) {
                    current.right = new Node(data);
                    break;
                } else {
                    current = current.right;
                }
            }
        }

        return root;
    }

    /*
     * Practice > Data Structures > Trees > Binary Search Tree : Lowest Common Ancestor
     * https://www.hackerrank.com/challenges/binary-search-tree-lowest-common-ancestor/problem
     *
     * return the lowest common ancestor (LCA) of v1 and v2 in the passed BST
     */
    public static Node lca(Node root, int v1, int v2) {
        while (root != null) {
            if (root.data > v1 && root.data > v2) {
                root = root.left;
            } else if (root.data < v1 && root.data < v2) {
                root = root.right;
            } else {
                return root;
            }
        }

        throw new IllegalStateException();
    }

    /*
     * Practice > Data Structures > Trees > Tree: Huffman Decoding
     * https://www.hackerrank.com/challenges/tree-huffman-decoding/problem
     *
     * Passed a string of 0/1 (left-right) and the relative Huffman tree
     * generate and print the decoded word
     * - the node definition should have a char data and an int frequency (not used by the code)
     * - however I didn't test the code, just run it
     */
    void decode(String s, Node root) {
        StringBuilder sb = new StringBuilder();
        Node current = root;
        for (char c : s.toCharArray()) {
            current = c == '0' ? current.left : current.right;
            if (current.data != '\0') {
                sb.append(current.data);
                current = root;
            }
        }
        System.out.print(sb);
    }

    private static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
}
