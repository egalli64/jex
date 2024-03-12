/*
 * 1171. Remove Zero Sum Consecutive Nodes from Linked List - https://leetcode.com/problems/remove-zero-sum-consecutive-nodes-from-linked-list/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.HashMap;

import com.leetcode.ListNode;

/**
 * Given the head of a linked list, we repeatedly delete consecutive sequences
 * of nodes that sum to 0 until there are no such sequences.
 * 
 * After doing so, return the head of the final linked list - there could be
 * more than one valid answer
 */
public class RemoveZeroSumConsecutiveNodesFromLinkedList {
    public ListNode removeZeroSumSublists(ListNode head) {
        HashMap<Integer, ListNode> map = new HashMap<>();
        map.put(0, new ListNode(0, head));

        int sum = 0;
        while (head != null) {
            sum += head.val;
            if (map.containsKey(sum)) {
                ListNode start = map.get(sum);
                ListNode cur = start;
                int key = sum;
                while (cur != head) {
                    cur = cur.next;
                    key += cur.val;
                    if (cur != head)
                        map.remove(key);
                }
                start.next = head.next;
            } else {
                map.put(sum, head);
            }
            head = head.next;
        }

        return map.get(0).next;
    }
}
