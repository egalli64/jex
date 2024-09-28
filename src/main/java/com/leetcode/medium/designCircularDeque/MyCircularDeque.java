/*
 * 641. Design Circular Deque - https://leetcode.com/problems/design-circular-deque/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium.designCircularDeque;

/**
 * A circular double-ended queue
 * <p>
 * Constraints: buffer size is in [1, 1_000], values are in [0, 1_000]
 */
class MyCircularDeque {
    private int[] data;

    private int begin;
    private int end;
    private int size;

    /**
     * Constructor
     * 
     * @param k maximum size
     */
    public MyCircularDeque(int k) {
        this.data = new int[k];
        size = 0;
    }

    /**
     * Add an item at the front
     * 
     * @param value the value to be added
     * @return true if the operation is successful
     */
    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }

        begin = (begin == 0 ? data.length : begin) - 1;
        data[begin] = value;
        size += 1;

        return true;
    }

    /**
     * Add an item at the rear
     * 
     * @param value the value to be added
     * @return true if the operation is successful
     */
    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }

        data[end] = value;
        end = (end + 1) % data.length;
        size += 1;

        return true;
    }

    /**
     * Delete an item from the front
     * 
     * @return true if the operation is successful
     */
    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }

        begin = (begin + 1) % data.length;
        size -= 1;
        return true;
    }

    /**
     * Delete an item from the rear
     * 
     * @return true if the operation is successful
     */
    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }

        end = (end == 0 ? data.length : end) - 1;
        size -= 1;
        return true;
    }

    /**
     * Get the first element
     * 
     * @return -1 if empty
     */
    public int getFront() {
        if (isEmpty()) {
            return -1;
        }

        return data[begin];
    }

    /**
     * Get the last element
     * 
     * @return -1 if empty
     */
    public int getRear() {
        if (isEmpty()) {
            return -1;
        }

        return data[(end == 0 ? data.length : end) - 1];
    }

    /**
     * 
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 
     * @return
     */
    public boolean isFull() {
        return size == data.length;
    }
}
