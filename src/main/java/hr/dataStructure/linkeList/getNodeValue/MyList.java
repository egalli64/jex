/*
    Based on
    Practice > Data Structures > Linked Lists > Get Node Value
    https://www.hackerrank.com/challenges/get-the-value-of-the-node-at-a-specific-position-from-the-tail/problem

    Given a pointer to the head of a linked list and a specific position, determine the data value at that position.
    Count backwards from the tail node. The tail is at position 0, its parent is at 1 and so on.
 */
package hr.dataStructure.linkeList.getNodeValue;

public class MyList {
    static class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
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

    public int getNode(int positionFromTail) {
        MyList.Node runner = head;
        MyList.Node actual = head;

        for(int i = 0; i < positionFromTail; i++) {
            runner = runner.next;
        }

        while(runner.next != null) {
            runner = runner.next;
            actual = actual.next;
        }

        return actual.data;
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
}
