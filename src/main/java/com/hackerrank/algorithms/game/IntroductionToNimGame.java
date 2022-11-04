/*
 * Prepare > Algorithms > Game Theory > Introduction to Nim Game
 * https://www.hackerrank.com/challenges/nim-game-1/
 *
 * Given a list of piles of stones, each of them sized at least 1
 * Each player, First and Second, should remove at least a stone from a single pile
 * Who removes the last stone wins
 * Return the winner
 *
 * see https://en.wikipedia.org/wiki/Nim
 *
 * If all piles are sized 1, it is easy, First wins if list is odd sized
 * Otherwise it's complicated, see wiki reference
 * In short, xor all the stone sizes, Second wins only if the result is zero
 */
package com.hackerrank.algorithms.game;

import java.util.List;

public class IntroductionToNimGame {
    public static String nimGame(List<Integer> pile) {
        if (pile.stream().allMatch(x -> x == 1)) {
            return pile.size() % 2 == 1 ? "First" : "Second";
        }
        return pile.stream().reduce(0, (x, y) -> x ^ y) != 0 ? "First" : "Second";
    }
}
