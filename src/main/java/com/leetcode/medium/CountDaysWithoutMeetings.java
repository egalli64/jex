/*
 * 3169. Count Days Without Meetings - https://leetcode.com/problems/count-days-without-meetings/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Given the number of available working days for an employee and a 2D array
 * meetings meetings[i] = [start_i, end_i] is the starting and ending days of
 * meeting i (inclusive). Return the number of days when the employee is
 * available for work and no meetings are scheduled.
 */
public class CountDaysWithoutMeetings {
    /**
     * Sort the schedule by starting day. Loop on each scheduled meeting, if the
     * starting day of the current meeting leaves a gap from the end of the previous
     * meeting, then increase the result from the hole size. Reset the end each
     * time, checking the current ending. After checking all the meetings, remember
     * to check if there is a hole in the end.
     * 
     * @param days     employee availability
     * @param meetings meeting schedule
     * @return number of working days with no meeting
     */
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, Comparator.comparingInt(x -> x[0]));

        int result = 0;
        int end = 0;
        for (int[] meeting : meetings) {
            if (meeting[0] > end + 1) {
                result += meeting[0] - end - 1;
            }

            end = Math.max(end, meeting[1]);
        }

        result += days - end;
        return result;
    }
}
