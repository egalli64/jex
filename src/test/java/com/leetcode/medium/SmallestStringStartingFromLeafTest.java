/*
 * 988. Smallest String Starting From Leaf - https://leetcode.com/problems/smallest-string-starting-from-leaf/description/
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

import com.leetcode.TreeNode;

class SmallestStringStartingFromLeafTest {
    private static final SmallestStringStartingFromLeaf instance = new SmallestStringStartingFromLeaf();

    private static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new TreeNode(0, new TreeNode(1, new TreeNode(3), new TreeNode(4)),
                        new TreeNode(2, new TreeNode(3), new TreeNode(4))), "dba"), //
                Arguments.of(new TreeNode(25, new TreeNode(1, new TreeNode(1), new TreeNode(3)),
                        new TreeNode(3, new TreeNode(0), new TreeNode(2))), "adz"), //
                Arguments.of(new TreeNode(2, new TreeNode(2, null, new TreeNode(1, new TreeNode(0), null)),
                        new TreeNode(1, new TreeNode(0), null)), "abc") //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(TreeNode input, String expected) {
        String actual = instance.smallestFromLeaf(input);
        assertThat(actual).isEqualTo(expected);
    }
}
