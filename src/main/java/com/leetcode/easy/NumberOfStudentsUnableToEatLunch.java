/*
 * 1700. Number of Students Unable to Eat Lunch - https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given two integer arrays, students and sandwiches, find the number of
 * students that are unable to eat.
 * 
 * There are two types of sandwich, 0 and 1. The students prefer one or the
 * other type of sandwich, once served leaves the queue with the sandwich.
 * 
 * Loop on students until no student want the top sandwich
 */
public class NumberOfStudentsUnableToEatLunch {
    /**
     * Count the unserved students
     * 
     * @param students   the sandwich preference for each student
     * @param sandwiches the sandwich types
     * @return the number of unserved students
     */
    public int countStudents(int[] students, int[] sandwiches) {
        int zeroes = 0;
        int ones = 0;

        for (int student : students) {
            if (student == 1) {
                ones++;
            } else {
                zeroes++;
            }
        }

        for (int sandwich : sandwiches) {
            if (sandwich == 1 && ones > 0) {
                ones -= 1;
            } else if (sandwich == 0 && zeroes > 0) {
                zeroes -= 1;
            } else {
                return ones + zeroes;
            }
        }
        return 0;
    }
}
