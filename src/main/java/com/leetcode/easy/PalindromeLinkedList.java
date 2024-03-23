/*
 * 234. Palindrome Linked List - https://leetcode.com/problems/palindrome-linked-list/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import com.leetcode.ListNode;

/**
 * Given a singly linked list, check if it is a palindrome
 * 
 * The list size is in [1 .. 100_000]
 */
public class PalindromeLinkedList {
    /**
     * Split the list in two parts, first one reversed, then compare them
     * 
     * @param head the input list
     * @return true if palindrome
     */
    public boolean isPalindrome(ListNode head) {
        ListNode left = null;
        ListNode right = head;

        ListNode tail = head;
        while (tail != null && tail.next != null) {
            ListNode cur = right.next;
            tail = tail.next.next;
            right.next = left;
            left = right;
            right = cur;
        }

        if (tail != null) {
            right = right.next;
        }

        while (left != null && right != null) {
            if (left.val != right.val) {
                return false;
            }

            left = left.next;
            right = right.next;
        }

        return true;
    }

    private static final int MAX_SIZE = 100_000;

    /**
     * Copy the values in an array, check from extremes toward the center
     * 
     * @param head the input list
     * @return true if palindrome
     */
    public boolean isPalindromeBuffer(ListNode head) {
        int[] buffer = new int[MAX_SIZE];

        int size = 0;
        while (head != null) {
            buffer[size] = head.val;
            size += 1;
            head = head.next;
        }

        for (int i = 0; i < size / 2; i++) {
            if (buffer[i] != buffer[size - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
