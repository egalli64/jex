/*
 * 23. Merge k Sorted Lists - https://leetcode.com/problems/merge-k-sorted-lists/description/
 * LeetCode Hard Problems - https://leetcode.com/problemset/?difficulty=HARD
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.hard;

/**
 * Given an array of k naturally sorted linked-lists lists, merge them into one
 * and return it
 * <p>
 * Constraints:
 * <li>0 <= k <= 10^4
 * <li>0 <= lists[i].length <= 500
 */
public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        for (int i = 1; i < lists.length; i *= 2) {
            for (int j = 0; j < lists.length - i; j += 2 * i) {
                lists[j] = merge(lists[j], lists[j + i]);
            }
        }

        return lists.length > 0 ? lists[0] : null;
    }

    public ListNode mergeKListsB(ListNode[] lists) {
        ListNode result = lists.length > 0 ? lists[0] : null;
        for (int i = 1; i < lists.length; i++) {
            result = merge(result, lists[i]);
        }
        return result;
    }

    private ListNode merge(ListNode left, ListNode right) {
        ListNode result = new ListNode();
        ListNode tail = result;

        while (left != null && right != null) {
            if (left.val < right.val) {
                tail.next = left;
                left = left.next;
            } else {
                tail.next = right;
                right = right.next;
            }

            tail = tail.next;
        }

        tail.next = left != null ? left : right;

        return result.next;
    }

    public ListNode mergeKListsA(ListNode[] lists) {
        ListNode result = new ListNode();
        ListNode tail = result;
        while (true) {
            int j = -1;
            for (int i = 0; i < lists.length; i++) {
                ListNode cur = lists[i];
                if (cur != null && (j == -1 || lists[i].val < lists[j].val)) {
                    j = i;
                }
            }

            if (j >= 0) {
                tail.next = lists[j];
                tail = tail.next;
                lists[j] = lists[j].next;
            } else {
                break;
            }
        }
        return result.next;
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
        StringBuilder sb = new StringBuilder("[ ");
        ListNode cur = this;
        do {
            sb.append(cur.val);
            sb.append(' ');
            cur = cur.next;
        } while (cur != null);
        sb.append(']');
        return sb.toString();
    }
}
