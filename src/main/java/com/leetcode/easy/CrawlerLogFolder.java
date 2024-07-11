/*
 * 1598. Crawler Log Folder - https://leetcode.com/problems/crawler-log-folder/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given a sequence of strings, each of them representing the argument for a
 * change directory command, in the form (a) "../", (b) "./", or (c) "x/", where
 * x is a valid string representing an existing folder. Assuming that all the cd
 * commands are executed, return the minimum number of operations needed to go
 * back to the main folder after the change folder operations.
 */
public class CrawlerLogFolder {
    /**
     * Keep track of the depth in the file system, looping on the logged commands,
     * increasing for (c), decreasing for (a), doing nothing for (b)
     * 
     * @param logs the command log
     * @return the final depth
     */
    public int minOperations(String[] logs) {
        int result = 0;

        for (String log : logs) {
            switch (log) {
            case "../" -> {
                if (result > 0) {
                    result -= 1;
                }
            }
            case "./" -> {
            }
            default -> {
                result += 1;
            }
            }
        }

        return result;
    }
}
