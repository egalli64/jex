package hr.dataStructure.linkeList;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class MyList {
    static class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        @Override
        public String toString() {
            return "(" + data + ", " + next + '}';
        }
    }

    private Node head;

    public MyList(int[] values) {
        for(int value: values) {
            add(value);
        }
    }

    public void add(int value) {
        head = new Node(value, head);
    }

    /**
     * Based on
     * Practice > Data Structures > Linked Lists > Get Node Value
     * https://www.hackerrank.com/challenges/get-the-value-of-the-node-at-a-specific-position-from-the-tail/problem
     *
     * Given a pointer to the head of a linked list and a specific position, determine the data value at that position.
     * Count backwards from the tail node. The tail is at position 0, its parent is at 1 and so on.
     */
    public int getNode(int positionFromTail) {
        Node runner = head;
        Node actual = head;

        for(int i = 0; i < positionFromTail; i++) {
            runner = runner.next;
        }

        while(runner.next != null) {
            runner = runner.next;
            actual = actual.next;
        }

        return actual.data;
    }

    /**
     * Based on
     * Practice > Data Structures > Linked Lists > Delete duplicate-value nodes from a sorted linked list
     * https://www.hackerrank.com/challenges/delete-duplicate-value-nodes-from-a-sorted-linked-list/problem
     *
     * Assuming linked list where the data in the nodes is in ascending order.
     * Delete duplicated values, keeping the list sorted.
     */
    public void removeDuplicates() {
        Node current = head;
        while(current != null) {
            Node runner = current.next;
            while(runner != null && current.data == runner.data) {
                runner = runner.next;
            }

            current.next = runner;
            current = runner;
        }
    }

    /**
     * Based on
     * Practice > Data Structures > Linked Lists > Find Merge Point of Two Lists
     * https://www.hackerrank.com/challenges/find-the-merge-point-of-two-joined-linked-lists/problem
     *
     * Given pointers to the head nodes of two linked lists that merge together at some point,
     * find the node where the two lists merge
     */
    public int mergeNode(Node other) {
        Set<Node> nodes = new HashSet<>();
        Node current = head;
        while(current != null) {
            nodes.add(current);
            current = current.next;
        }

        while(other != null) {
            if(nodes.contains(other)) {
                return other.data;
            }
            other = other.next;
        }

        throw new IllegalStateException("Can't find merge node");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        Node current = head;
        while(current != null) {
            sb.append(current.data);
            sb.append( " -> " );
            current = current.next;
        }
        sb.append("null ]");
        return sb.toString();
    }

    public static void main(String[] args) {
        MyList ml = new MyList(new int[] {3,3,3,3,2,2,1});
        System.out.println(ml);

        ml.removeDuplicates();
        System.out.println("Expect 1 -> 2 -> 3, actual is " + ml);

        int actual = new MyList(new int[]{0, 1, 2, 3}).getNode(2);
        System.out.println("Expect 2, actual is " + actual);
    }
}
