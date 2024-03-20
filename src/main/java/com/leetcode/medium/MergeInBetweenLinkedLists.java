/*
 * 1669. Merge In Between Linked Lists - https://leetcode.com/problems/merge-in-between-linked-lists/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import com.leetcode.ListNode;

/**
 * Given two linked lists, remove nodes in the [a..b] interval from the first
 * list, and put the other list nodes in their place
 */
public class MergeInBetweenLinkedLists {
    /**
     * Just loop on the lists
     * 
     * @param list1 the base list
     * @param a     index of the first node to be removed
     * @param b     index of the last node to be removed
     * @param list2 the merging list
     * @return the merged list
     */
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode left = list1;
        int i = 0;
        while (i < a - 1) {
            left = left.next;
            i += 1;
        }

        ListNode cur = list2;
        while (cur.next != null) {
            cur = cur.next;
        }

        ListNode front = left;
        while (i < b + 1) {
            left = left.next;
            i += 1;
        }

        front.next = list2;
        cur.next = left;
        return list1;
    }
}
