/*
 * 2. Add Two Numbers - https://leetcode.com/problems/add-two-numbers/description/
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

class AddTwoNumbersTest {
    private static final AddTwoNumbers instance = new AddTwoNumbers();

    private static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new ListNode(2, new ListNode(4, new ListNode(3))),
                        new ListNode(5, new ListNode(6, new ListNode(4))),
                        new ListNode(7, new ListNode(0, new ListNode(8)))),
                Arguments.of(new ListNode(0), new ListNode(0), new ListNode(0)),
                Arguments.of(new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, //
                        new ListNode(9, new ListNode(9, new ListNode(9))))))),
                        new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))),
                        new ListNode(8, new ListNode(9, new ListNode(9, new ListNode(9,
                                new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1))))))))));
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(ListNode left, ListNode right, ListNode expected) {
        ListNode actual = instance.addTwoNumbers(left, right);
        assertThat(actual).isEqualTo(expected);
    }
}
