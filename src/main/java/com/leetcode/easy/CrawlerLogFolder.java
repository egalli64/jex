/*
 * 1598. Crawler Log Folder - https://leetcode.com/problems/crawler-log-folder/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

public class CrawlerLogFolder {
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
