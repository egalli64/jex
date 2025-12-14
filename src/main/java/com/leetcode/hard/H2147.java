/*
 * 2147. Number of Ways to Divide a Long Corridor
 * https://leetcode.com/problems/number-of-ways-to-divide-a-long-corridor/description/
 * LeetCode Hard Problems - https://leetcode.com/problemset/?difficulty=HARD
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.hard;

/**
 * The given string represents a corridor, containing just S (seats) and P (plant).
 * Divide the corridor in the number of ways the corridor could be divided (modulo 10^9 + 7),
 * where each section could contain just two seats, and any number of plants.
 */
public class H2147 {
    private static final int MODULO = 1_000_000_007;

    static void main() {
        H2147 x = new H2147();

        System.out.println(x.numberOfWays("SSPPSPS") == 3);
        System.out.println(x.numberOfWays("PPSPSP") == 1);
        System.out.println(x.numberOfWays("S") == 0);
        System.out.println(x.numberOfWays("PPPPPPPSPPPSPPPPSPPPSPPPPPSPPPSPPSPPSPPPPPSPSPPPPPSPPSPPPPPSPPSPPSPPPSPPPPSPPPPSPPPPPSPSPPPPSPSPPPSPPPPSPPPPPSPSPPSPPPPSPPSPPSPPSPPPSPPSPSPPSSSS") == 18_335_643);
    }

    public int numberOfWays(String corridor) {
        int seatCount = (int) corridor.chars().filter(c -> c == 'S').count();
        if (seatCount == 0 || seatCount % 2 != 0) {
            return 0;
        }

        long result = 1;
        int seat = 0;
        int plant = 0;

        for (char cur : corridor.toCharArray()) {
            if (cur == 'S') {
                if (seat == 2) {
                    result = result * (plant + 1) % MODULO;
                    plant = 0;
                    seat = 0;
                }
                seat += 1;
            } else if (seat == 2) {
                plant += 1;
            }
        }

        return (int) result;
    }
}
