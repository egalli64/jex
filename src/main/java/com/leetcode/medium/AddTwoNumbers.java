/*
 * LeetCode 2. Add Two Numbers
 * https://leetcode.com/problems/add-two-numbers/description/
 * 
 * My repository with solutions
 * https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

/**
 * Given two non-empty linked lists representing two non-negative integers. The
 * digits are stored in reverse order, and each of their nodes contains a single
 * digit. Add the two numbers and return the sum as a linked list.
 * 
 * The two numbers do not contain any leading zero, except the number 0 itself.
 */
public class AddTwoNumbers {
    /**
     * Sum two integers presented as reversed linked list
     * 
     * @param l1 left operand
     * @param l2 right operand
     * @return a new list representing the result
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean carry = false;
        var dummy = new ListNode();

        var cur = dummy;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + (carry ? 1 : 0);
            carry = sum > 9;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        var tail = l1 == null ? l2 : l1;
        while (tail != null) {
            if (carry) {
                if (tail.val == 9) {
                    cur.next = new ListNode(0);
                } else {
                    cur.next = new ListNode(tail.val + 1);
                    carry = false;
                }
            } else {
                cur.next = new ListNode(tail.val);
            }

            cur = cur.next;
            tail = tail.next;
        }

        if (carry) {
            cur.next = new ListNode(1);
        }

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
