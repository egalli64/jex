/*
 * 621. Task Scheduler - https://leetcode.com/problems/task-scheduler/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.stream.Stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TaskSchedulerTest {
    private static final TaskScheduler instance = new TaskScheduler();

    private static final Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new char[] { 'A', 'A', 'A', 'B', 'B', 'B' }, 2, 8), //
                Arguments.of(new char[] { 'A', 'C', 'A', 'B', 'D', 'B' }, 1, 6), //
                Arguments.of(new char[] { 'A', 'A', 'A', 'B', 'B', 'B' }, 3, 10) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(char[] input, int gap, int expected) {
        int actual = instance.leastInterval(input, gap);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
