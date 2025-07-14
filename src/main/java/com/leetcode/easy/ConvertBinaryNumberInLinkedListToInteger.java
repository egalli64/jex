/*
 * 1290. Convert Binary Number in a Linked List to Integer - https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import com.leetcode.ListNode;

/**
 * Given a custom linked list containing just 0s and 1s, see it as an integer and return it.
 */
public class ConvertBinaryNumberInLinkedListToInteger {
    public int getDecimalValue(ListNode head) {
        int result = 0;

        for (; head != null; head = head.next) {
            result *= 2;
            result += head.val;
        }

        return result;
    }
}
