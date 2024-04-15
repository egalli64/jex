package com.leetcode.medium;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.leetcode.TreeNode;

class SumRootToLeafNumbersTest {
    private static final SumRootToLeafNumbers instance = new SumRootToLeafNumbers();

    private static final Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new TreeNode(1, new TreeNode(2), new TreeNode(3)), 25), //
                Arguments.of(new TreeNode(4, new TreeNode(9, new TreeNode(5), new TreeNode(1)), new TreeNode(0)), 1026), //
                Arguments.of(new TreeNode(0, new TreeNode(1), null), 1) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(TreeNode input, int expected) {
        int actual = instance.sumNumbers(input);
        assertThat(actual).isEqualTo(expected);
    }
}
