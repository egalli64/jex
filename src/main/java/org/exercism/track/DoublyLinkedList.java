/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track;

/**
 * Linked List: https://exercism.org/tracks/java/exercises/linked-list
 * 
 * Implement a simple generic doubly linked list
 */
class DoublyLinkedList<T> {
    private Element<T> head;
    private Element<T> tail;

    /**
     * Add a new tail on the list
     * 
     * @param value wrapped in a new element in the list
     */
    void push(T value) {
        Element<T> cur = new Element<T>(value, tail, null);
        if (head == null) {
            head = cur;
        } else {
            tail.next = cur;
            cur.prev = tail;
        }
        tail = cur;
    }

    /**
     * Extract the list tail, or null if the list is empty
     * 
     * @return the value
     */
    T pop() {
        if (tail == null) {
            return null;
        }

        T result = tail.value;
        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        } else {
            head = null;
        }

        return result;
    }

    /**
     * Add a new head on the list
     * 
     * @param value wrapped in a new element in the list
     */
    void unshift(T value) {
        Element<T> cur = new Element<T>(value, null, head);
        if (tail == null) {
            tail = cur;
        } else {
            head.prev = cur;
            cur.next = head;
        }
        head = cur;
    }

    /**
     * Extract the list head, or null if the list is empty
     * 
     * @return the value
     */
    T shift() {
        if (head == null) {
            return null;
        }

        T result = head.value;
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }

        return result;
    }

    /**
     * The list node
     * 
     * @param <T> Any Object is acceptable
     */
    private static final class Element<T> {
        private final T value;
        private Element<T> prev;
        private Element<T> next;

        Element(T value, Element<T> prev, Element<T> next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[ ");

        for (Element<T> cur = head; cur != null; cur = cur.next) {
            result.append(cur.value).append(' ');
        }

        result.append(']');
        return result.toString();
    }
}
