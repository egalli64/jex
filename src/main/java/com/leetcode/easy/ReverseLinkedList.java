/*
 * 206. Reverse Linked List - https://leetcode.com/problems/reverse-linked-list/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import com.leetcode.ListNode;

/**
 * Given the head of a singly linked list, reverse it
 */
public class ReverseLinkedList {
    /**
     * Reverser
     * 
     * @param head the original list head
     * @return the reversed list
     */
    public ListNode reverseList(ListNode head) {
        ListNode result = null;
        while (head != null) {
            ListNode prev = result;
            result = new ListNode(head.val, prev);
            head = head.next;
        }
        return result;
    }
}
