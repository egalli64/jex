/*
 * 25. Reverse Nodes in k-Group - https://leetcode.com/problems/reverse-nodes-in-k-group/description/
 * LeetCode Hard Problems - https://leetcode.com/problemset/?difficulty=HARD
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.hard;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.leetcode.ListNode;

class ReverseNodesInKGroupTest {
    private static final ReverseNodesInKGroup instance = new ReverseNodesInKGroup();

    private static final Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 2,
                        new ListNode(2, new ListNode(1, new ListNode(4, new ListNode(3, new ListNode(5)))))), //
                Arguments.of(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 3,
                        new ListNode(3, new ListNode(2, new ListNode(1, new ListNode(4, new ListNode(5)))))) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(ListNode input, int size, ListNode expected) {
        ListNode actual = instance.reverseKGroup(input, size);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void reverse() {
        ListNode input = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode actual = instance.reverse(input);
        ListNode expected = new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1)))));
        assertThat(actual).isEqualTo(expected);
    }
}
