/*
 * 206. Reverse Linked List - https://leetcode.com/problems/reverse-linked-list/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.leetcode.ListNode;

class ReverseLinkedListTest {
    private static final ReverseLinkedList instance = new ReverseLinkedList();

    private static final Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))),
                        new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1)))))), //
                Arguments.of(new ListNode(1, new ListNode(2)), new ListNode(2, new ListNode(1))), //
                Arguments.of(null, null));
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(ListNode input, ListNode expected) {
        ListNode actual = instance.reverseList(input);
        assertThat(actual).isEqualTo(expected);
    }
}
