/*
 * 21. Merge Two Sorted Lists - https://leetcode.com/problems/merge-two-sorted-lists/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Constraints:
 * <ul>
 * <li>The number of nodes in both lists is in the range [0, 50]
 * <li>-100 <= Node.val <= 100
 * <li>Both list1 and list2 are sorted in non-decreasing order.
 */
public class MergeTwoSortedLists {
    /**
     * List merger
     * 
     * @param list1 a list
     * @param list2 another list
     * @return the head of the merged linked list
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode cur = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }

        if (list1 != null)
            cur.next = list1;

        if (list2 != null)
            cur.next = list2;

        return dummy.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "[" + val + "]";
    }
}
