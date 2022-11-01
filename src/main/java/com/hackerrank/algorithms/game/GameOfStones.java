/*
 * Prepare > Algorithms > Game Theory > Game of Stones
 * https://www.hackerrank.com/challenges/game-of-stones-1/
 *
 * Given the number of stones in [1, 100] and two players, First and Second
 * Return the winner of the game with these rules
 *  First moves as first
 *  the current player removes 2, 3, or 5 stones, or lose
 *
 * 1 -> Second (First can't remove anything)
 * 2 -> First
 * 3 -> First
 * 4 -> First (removes 3, then wins)
 * 5 -> First
 * 6 -> First (removes 5, then wins)
 * 7 -> Second (First removes 2, 3, or 5, then loses)
 * 8 -> Second (First removes 2, 3, or 5, then loses)
 * 9 -> First (removes 2, then wins)
 * 10 -> First (removes 3, then wins)
 * 11 -> First (removes 3, then wins)
 * 12 -> First (removes 5, then wins)
 * 13 -> First (removes 5, then wins)
 * 14 -> Second (First removes 2, 3, or 5, then loses)
 * 15 -> Second (First removes 2, 3, or 5, then loses)
 * ...
 */
package com.hackerrank.algorithms.game;

public class GameOfStones {
    public static String gameOfStones(int n) {
        return n % 7 > 1 ? "First" : "Second";
    }
}
