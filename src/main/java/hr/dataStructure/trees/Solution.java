package hr.dataStructure.trees;

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
        if(root == null) {
            return new Node(data);
        }

        Node current = root;

        for(;;) {
            if(data < current.data) {
                if(current.left == null) {
                    current.left = new Node(data);
                    break;
                } else {
                    current = current.left;
                }
            } else {
                if(current.right == null) {
                    current.right = new Node(data);
                    break;
                } else {
                    current = current.right;
                }
            }
        }

        return root;
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
