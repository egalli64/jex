/*
 * 515. Find Largest Value in Each Tree Row - https://leetcode.com/problems/find-largest-value-in-each-tree-row/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.leetcode.TreeNode;

class FindLargestValueInEachTreeRowTest {
    private static final FindLargestValueInEachTreeRow instance = new FindLargestValueInEachTreeRow();

    private static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new TreeNode(1, new TreeNode(3, new TreeNode(5), new TreeNode(3)),
                        new TreeNode(2, null, new TreeNode(9))), List.of(1, 3, 9)),
                Arguments.of(new TreeNode(1, new TreeNode(2), new TreeNode(3)), List.of(1, 3)) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(TreeNode input, List<Integer> expected) {
        var actual = instance.largestValues(input);
        assertThat(actual).isEqualTo(expected);
    }
}
