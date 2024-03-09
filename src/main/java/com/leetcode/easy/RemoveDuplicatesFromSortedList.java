/*
 * 83. Remove Duplicates from Sorted List - https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import com.leetcode.ListNode;

/**
 * Given a sorted linked list, delete all duplicates.
 * 
 * The input list is sorted and sized [0..300] (empty list is just a null)
 */
public class RemoveDuplicatesFromSortedList {
    /**
     * Kill the duplicates
     * 
     * @param head the input list
     * @return no-duplicate in the list
     */
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        ListNode prev = null;
        while (cur != null) {
            if (prev != null && cur.val == prev.val) {
                prev.next = cur.next;
            } else {
                prev = cur;
            }
            cur = cur.next;
        }
        return head;
    }
}
