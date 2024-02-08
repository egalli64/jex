/*
 * LeetCode 21. Merge Two Sorted Lists
 * https://leetcode.com/problems/merge-two-sorted-lists/description/
 * 
 * My repository with solutions
 * https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class MergeTwoSortedListsTest {
    private static final MergeTwoSortedLists instance = new MergeTwoSortedLists();

    @Test
    void mergeTwoListsExample1() {
        var left = new ListNode(4);
        left = new ListNode(2, left);
        left = new ListNode(1, left);

        var right = new ListNode(4);
        right = new ListNode(3, right);
        right = new ListNode(1, right);

        var expected = new ListNode(4);
        expected = new ListNode(4, expected);
        expected = new ListNode(3, expected);
        expected = new ListNode(2, expected);
        expected = new ListNode(1, expected);
        expected = new ListNode(1, expected);

        var actual = instance.mergeTwoLists(left, right);
        while (actual != null) {
            assertThat(actual.val).isEqualTo(expected.val);
            actual = actual.next;
            expected = expected.next;
        }
        assertThat(expected).isNull();
    }
}
