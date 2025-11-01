/*
 * 3217. Delete Nodes From Linked List Present in Array
 * https://leetcode.com/problems/delete-nodes-from-linked-list-present-in-array/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import com.leetcode.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Drop the nums element from the passed list.
 * <p>
 * No duplicates in nums, no empty arrays/list involved.
 */
public class DeleteNodesFromLinkedListPresentInArray {
    /**
     * Smoke Test
     */
    static void main() {
        DeleteNodesFromLinkedListPresentInArray x = new DeleteNodesFromLinkedListPresentInArray();

        // #1
        ListNode result = x.modifiedList(new int[]{1, 2, 3},
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))));
        ListNode expected = new ListNode(4, new ListNode(5));
        System.out.println("Is " + result + " equal to " + expected + " ?");

        // #2
        result = x.modifiedList(new int[]{1},
                new ListNode(1, new ListNode(2, new ListNode(1, new ListNode(2, new ListNode(1, new ListNode(2)))))));
        expected = new ListNode(2, new ListNode(2, new ListNode(2)));
        System.out.println("Is " + result + " equal to " + expected + " ?");


        // #3
        result = x.modifiedList(new int[]{5},
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4)))));
        expected = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        System.out.println("Is " + result + " equal to " + expected + " ?");
    }

    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> buffer = new HashSet<>();
        for (int num : nums) {
            buffer.add(num);
        }

        while (head != null && buffer.contains(head.val)) {
            head = head.next;
        }
        if (head == null) {
            return null;
        }

        ListNode runner = head;
        while (runner.next != null) {
            if (buffer.contains(runner.next.val)) {
                runner.next = runner.next.next;
            } else {
                runner = runner.next;
            }
        }

        return head;
    }
}
