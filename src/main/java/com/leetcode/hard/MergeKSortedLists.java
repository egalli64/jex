/*
 * 23. Merge k Sorted Lists - https://leetcode.com/problems/merge-k-sorted-lists/description/
 * LeetCode Hard Problems - https://leetcode.com/problemset/?difficulty=HARD
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.hard;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of k naturally sorted linked lists, merge them into one and
 * return it
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

    /**
     * Push the non-empty lists in an ArrayList; loop repeatedly the lists from the
     * extremes to the center in the left one, discarding the right one, until just
     * one merged list survives
     * 
     * @param lists naturally sorted linked lists
     * @return the merge of all the passed lists
     */
    public ListNode arrayBuffer(ListNode[] lists) {
        List<ListNode> buffer = new ArrayList<>(lists.length);
        for (ListNode list : lists) {
            if (list != null) {
                buffer.add(list);
            }
        }
        while (buffer.size() > 1) {
            for (int i = 0, j = buffer.size() - 1; i < j; i++, j--) {
                buffer.set(i, merge(buffer.get(i), buffer.remove(j)));
            }
        }

        return buffer.isEmpty() ? null : buffer.get(0);
    }

    /**
     * Merge all the other lists in the first one. Not efficient, the elements of
     * the first list are merged many times, and each step makes it growing
     * 
     * @param lists naturally sorted linked lists
     * @return the merge of all the passed lists
     */
    public ListNode simpleMerge(ListNode[] lists) {
        ListNode result = lists.length > 0 ? lists[0] : null;
        for (int i = 1; i < lists.length; i++) {
            result = merge(result, lists[i]);
        }
        return result;
    }

    /**
     * Algorithms based on plain merge are more efficient
     * 
     * @param left  a list
     * @param right another list
     * @return the merged list
     */
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

    /**
     * Choosing the minimal value comparing the elements in each list. It is kind of
     * an extended merging algorithm.
     * 
     * Not efficient, each element could be compared many times.
     * 
     * @param lists naturally sorted linked lists
     * @return the merge of all the passed lists
     */
    public ListNode polyMerge(ListNode[] lists) {
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
