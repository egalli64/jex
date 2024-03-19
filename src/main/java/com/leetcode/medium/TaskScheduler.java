/*
 * 621. Task Scheduler - https://leetcode.com/problems/task-scheduler/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.Arrays;

/**
 * Given a non-empty array of tasks in [A .. Z], max length 10000 and a cooling
 * time n in [0 .. 100]. Identical tasks must be separated by at least n
 * intervals.
 * 
 * Return the minimum number of intervals required to complete all tasks.
 */
public class TaskScheduler {
    /**
     * 
     * @param tasks the task to be scheduled
     * @param n     the cooling time
     * @return the required number of intervals
     */
    public int leastInterval(char[] tasks, int n) {
        int[] frequences = new int[26];
        for (char task : tasks) {
            frequences[task - 'A'] += 1;
        }

        Arrays.sort(frequences);
        int count = frequences[25] - 1;
        int cool = count * n;

        for (int i = 24; i >= 0; i--) {
            cool -= Math.min(count, frequences[i]);
        }

        return cool < 0 ? tasks.length : tasks.length + cool;
    }
}
