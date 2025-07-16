/*
 * 1669. Merge In Between Linked Lists - https://leetcode.com/problems/merge-in-between-linked-lists/description/
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

class MergeInBetweenLinkedListsTest {
    private static final MergeInBetweenLinkedLists instance = new MergeInBetweenLinkedLists();

    private static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new ListNode(10, new ListNode(1, new ListNode(13, //
                        new ListNode(6, new ListNode(9, new ListNode(5)))))), //
                        3, 4, //
                        new ListNode(100, new ListNode(101, new ListNode(102))),
                        new ListNode(10, new ListNode(1, new ListNode(13, //
                                new ListNode(100, new ListNode(101, new ListNode(102, //
                                        new ListNode(5)))))))), //
                Arguments.of(new ListNode(0, new ListNode(1, new ListNode(2, //
                        new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))))), //
                        2, 5, //
                        new ListNode(100, new ListNode(101, new ListNode(102, new ListNode(103, new ListNode(104))))),
                        new ListNode(0, new ListNode(1, new ListNode(100, new ListNode(101,
                                new ListNode(102, new ListNode(103, new ListNode(104, new ListNode(6))))))))) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(ListNode left, int a, int b, ListNode right, ListNode expected) {
        ListNode actual = instance.mergeInBetween(left, a, b, right);
        assertThat(actual).isEqualTo(expected);
    }
}
