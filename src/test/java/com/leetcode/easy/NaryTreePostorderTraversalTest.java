/*
 * 590. N-ary Tree Postorder Traversal - https://leetcode.com/problems/n-ary-tree-postorder-traversal/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.leetcode.Node;

class NaryTreePostorderTraversalTest {
    private static final NaryTreePostorderTraversal instance = new NaryTreePostorderTraversal();

    private static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new Node(1, List.of( //
                        new Node(3, List.of(new Node(5), new Node(6))), new Node(2), new Node(4))), //
                        List.of(5, 6, 3, 2, 4, 1)), //
                Arguments.of(null, List.of()) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(Node input, List<Integer> expected) {
        List<Integer> actual = instance.postorder(input);
        assertThat(actual).isEqualTo(expected);
    }
}
