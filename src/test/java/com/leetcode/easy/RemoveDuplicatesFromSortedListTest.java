/*
 * 83. Remove Duplicates from Sorted List - https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=EASY
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

class RemoveDuplicatesFromSortedListTest {
    private static final RemoveDuplicatesFromSortedList instance = new RemoveDuplicatesFromSortedList();

    private static final Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new ListNode(1, new ListNode(1, new ListNode(2))), //
                        new ListNode(1, new ListNode(2))),
                Arguments.of(new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3))))),
                        new ListNode(1, new ListNode(2, new ListNode(3)))));
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(ListNode input, ListNode expected) {
        ListNode actual = instance.deleteDuplicates(input);
        while (actual != null) {
            assertThat(actual.val).isEqualTo(expected.val);
            actual = actual.next;
            expected = expected.next;
        }
        assertThat(expected).isNull();
    }
}
