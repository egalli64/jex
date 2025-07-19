/*
 * 1233. Remove Sub-Folders from the Filesystem - https://leetcode.com/problems/remove-sub-folders-from-the-filesystem/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class RemoveSubFoldersFromTheFilesystemTest {
    private static final RemoveSubFoldersFromTheFilesystem instance = new RemoveSubFoldersFromTheFilesystem();

    private static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new String[]{"/a", "/a/b", "/c/d", "/c/d/e", "/c/f"}, List.of("/a", "/c/d", "/c/f")), //
                Arguments.of(new String[]{"/a", "/a/b/c", "/a/b/d"}, List.of("/a")), //
                Arguments.of(new String[]{"/a/b/c", "/a/b/ca", "/a/b/d"}, List.of("/a/b/c", "/a/b/ca", "/a/b/d"))
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(String[] input, List<String> expected) {
        var actual = instance.removeSubfolders(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
