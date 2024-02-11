/*
 * LeetCode 2. Add Two Numbers
 * https://leetcode.com/problems/add-two-numbers/description/
 * 
 * My repository with solutions
 * https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class AddTwoNumbersTest {
    private static final AddTwoNumbers instance = new AddTwoNumbers();

    @Test
    void addTwoNumbersExample1() {
        var left = new ListNode(3);
        left = new ListNode(4, left);
        left = new ListNode(2, left);

        var right = new ListNode(4);
        right = new ListNode(6, right);
        right = new ListNode(5, right);

        var expected = new ListNode(8);
        expected = new ListNode(0, expected);
        expected = new ListNode(7, expected);

        var actual = instance.addTwoNumbers(left, right);
        while (actual != null) {
            assertThat(actual.val).isEqualTo(expected.val);
            actual = actual.next;
            expected = expected.next;
        }
        assertThat(expected).isNull();
    }
    
    @Test
    void addTwoNumbersExample2() {
        var left = new ListNode(0);
        var right = new ListNode(0);

        var actual = instance.addTwoNumbers(left, right);
        assertThat(actual.val).isZero();
    }    
}
