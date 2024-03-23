/*
 * 21. Merge Two Sorted Lists - https://leetcode.com/problems/merge-two-sorted-lists/description/
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

class MergeTwoSortedListsTest {
    private static final MergeTwoSortedLists instance = new MergeTwoSortedLists();

    private static final Stream<Arguments> provider() {
        ListNode left = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode right = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode expected = new ListNode(1,
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))));

        ListNode zero = new ListNode(0);

        return Stream.of( //
                Arguments.of(left, right, expected), //
                Arguments.of(null, null, null), //
                Arguments.of(null, zero, zero) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(ListNode left, ListNode right, ListNode expected) {
        ListNode actual = instance.mergeTwoLists(left, right);
        assertThat(actual).isEqualTo(expected);
    }
}
