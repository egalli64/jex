/*
 * 2073. Time Needed to Buy Tickets - https://leetcode.com/problems/time-needed-to-buy-tickets/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given a queue of requests to be round-robin served.
 * 
 * Assuming each service take 1 second.
 * 
 * Calculate the time to get all the service done for a given position.
 */
public class TimeNeededToBuyTickets {
    /**
     * Calculate the required time
     * 
     * @param tickets the queue
     * @param k       the position
     * @return the required time
     */
    public int timeRequiredToBuy(int[] tickets, int k) {
        int result = 0;

        for (int i = 0; i < tickets.length; i++) {
            if (i <= k) {
                result += Math.min(tickets[i], tickets[k]);
            } else {
                result += Math.min(tickets[i], tickets[k] - 1);
            }
        }

        return result;
    }
}
