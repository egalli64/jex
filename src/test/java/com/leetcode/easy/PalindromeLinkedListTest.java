package com.leetcode.easy;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.leetcode.ListNode;

class PalindromeLinkedListTest {
    private static final PalindromeLinkedList instance = new PalindromeLinkedList();

    private static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1)))), true), //
                Arguments.of(new ListNode(1, new ListNode(2, new ListNode(1))), true), //
                Arguments.of(new ListNode(1, new ListNode(2)), false) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(ListNode input, boolean expected) {
        boolean actual = instance.isPalindrome(input);
        assertThat(actual).isEqualTo(expected);
    }
}
