/*
 * 1171. Remove Zero Sum Consecutive Nodes from Linked List - https://leetcode.com/problems/remove-zero-sum-consecutive-nodes-from-linked-list/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.leetcode.ListNode;

class RemoveZeroSumConsecutiveNodesFromLinkedListTest {
    private static final RemoveZeroSumConsecutiveNodesFromLinkedList instance = new RemoveZeroSumConsecutiveNodesFromLinkedList();

    private static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new ListNode(1, new ListNode(2, new ListNode(-3, new ListNode(3, new ListNode(1))))),
                        new ListNode(3, new ListNode(1))),
                Arguments.of(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(-3, new ListNode(4))))),
                        new ListNode(1, new ListNode(2, new ListNode(4)))),
                Arguments.of(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(-3, new ListNode(-2))))),
                        new ListNode(1)));
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(ListNode input, ListNode expected) {
        ListNode actual = instance.removeZeroSumSublists(input);
        assertThat(actual).isEqualTo(expected);
    }
}
