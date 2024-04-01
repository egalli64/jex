/*
 * 25. Reverse Nodes in k-Group - https://leetcode.com/problems/reverse-nodes-in-k-group/description/
 * LeetCode Hard Problems - https://leetcode.com/problemset/?difficulty=HARD
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.hard;

import com.leetcode.ListNode;

/**
 * Given a linked list, reverse the nodes k by k, and return it.
 * 
 * k is a positive integer and is less than or equal to the length of the list.
 * 
 * The eventual left-out nodes, should remain as is.
 * 
 * The change should be performed on the nodes, not on the values.
 */
public class ReverseNodesInKGroup {
    ListNode move(ListNode cur, int distance) {
        for (int i = 0; i < distance; i++) {
            if (cur.next == null) {
                return null;
            } else {
                cur = cur.next;
            }
        }
        return cur;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        for (ListNode prev = null, beg = head, end = head, next = null; beg != null; prev = beg, beg = next, end = next) {
            if ((end = move(end, k - 1)) == null) {
                break;
            }

            next = end.next;
            end.next = null;
            if (prev != null) {
                prev.next = null;
            }
            end = reverse(beg);

            if (prev != null) {
                prev.next = end;
            } else {
                head = end;
            }
            beg.next = next;
        }

        return head;
    }

    /**
     * Reverse a list
     * 
     * @param head the list head
     * @return the new head for the reversed list
     */
    ListNode reverse(ListNode head) {
        ListNode result = null;

        for (ListNode cur = head, next = head; cur != null; cur = next) {
            next = next.next;
            cur.next = result;
            result = cur;
        }
        return result;
    }
}
