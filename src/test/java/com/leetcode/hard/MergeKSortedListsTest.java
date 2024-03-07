/*
 * 23. Merge k Sorted Lists - https://leetcode.com/problems/merge-k-sorted-lists/description/
 * LeetCode Hard Problems - https://leetcode.com/problemset/?difficulty=HARD
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.hard;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MergeKSortedListsTest {
    private static final MergeKSortedLists instance = new MergeKSortedLists();

    private static final Stream<Arguments> provider() {
        ListNode left = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode center = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode right = new ListNode(2, new ListNode(6));
        ListNode[] empty = {};
        ListNode[] longer = new ListNode[] { new ListNode(1), new ListNode(2, new ListNode(6)), //
                new ListNode(4), null, new ListNode(5), new ListNode(1), new ListNode(3), new ListNode(4), null };

        ListNode expected = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, //
                new ListNode(4, new ListNode(4, new ListNode(5, new ListNode(6))))))));

        return Stream.of( //
                Arguments.of(new ListNode[] { left, center, right }, expected), //
                Arguments.of(empty, null), //
                Arguments.of(new ListNode[] { null }, null), //
                Arguments.of(longer, expected));
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(ListNode[] input, ListNode expected) {
        ListNode actual = instance.mergeKLists(input);
        while (actual != null) {
            assertThat(actual.val).isEqualTo(expected.val);
            actual = actual.next;
            expected = expected.next;
        }
        assertThat(expected).isNull();
    }

    @ParameterizedTest
    @MethodSource("provider")
    void polyMergeExamples(ListNode[] input, ListNode expected) {
        ListNode actual = instance.polyMerge(input);
        while (actual != null) {
            assertThat(actual.val).isEqualTo(expected.val);
            actual = actual.next;
            expected = expected.next;
        }
        assertThat(expected).isNull();
    }
}
