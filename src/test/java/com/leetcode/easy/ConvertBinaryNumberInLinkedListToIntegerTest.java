package com.leetcode.easy;

import com.leetcode.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ConvertBinaryNumberInLinkedListToIntegerTest {
    private static final ConvertBinaryNumberInLinkedListToInteger instance = new ConvertBinaryNumberInLinkedListToInteger();

    private static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new ListNode(1, new ListNode(0, new ListNode(1))), 5),
                Arguments.of(new ListNode(0), 0));
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(ListNode input, int expected) {
        var actual = instance.getDecimalValue(input);
        assertThat(actual).isEqualTo(expected);
    }
}
