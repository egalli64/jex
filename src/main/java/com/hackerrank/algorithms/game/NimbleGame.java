/*
 * Prepare > Algorithms > Game Theory > Nimble Game
 *
 * https://www.hackerrank.com/challenges/nimble-game-1/
 *
 * Given a list of squares containing coins, each of them sized at least 1
 * Each player, First and Second, must move a coin from a square to its left
 * Who moves the last "free" coin to square 0 wins
 * Return the winner
 *
 * Actually, it is just a variation on the nim game
 * see https://en.wikipedia.org/wiki/Nim
 *
 * Each coin is a pile of stones sized as the square index
 * Moving a coin to the left is like removing stones from the pile
 * Moving a coin to the 0-indexed square is like removing all the stones from a pile
 *
 * Since the even values could be matched by the other player, only odd values are of interest
 */
package com.hackerrank.algorithms.game;

import java.util.List;

public class NimbleGame {
    public static String nimbleGame(List<Integer> s) {
        int result = 0;
        for (int i = 1; i < s.size(); i++) {
            if (s.get(i) % 2 != 0) {
                result ^= i;
            }
        }
        return result != 0 ? "First" : "Second";
    }
}
