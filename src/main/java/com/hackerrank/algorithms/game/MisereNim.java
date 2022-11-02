/*
 * Prepare > Algorithms > Game Theory > Misere Nim
 * https://www.hackerrank.com/challenges/misere-nim-1/
 *
 * Given a list of piles of stones, each of them sized at least 1
 * Each player, First and Second, should remove at least a stone from a single pile
 * Who removes the last stone loses
 * Return the winner
 *
 * see https://en.wikipedia.org/wiki/Nim
 *
 * If all piles are sized 1, it is easy, First wins if list is even sized
 * Otherwise it's complicated, see wiki reference
 * In short, xor all the stone sizes, Second wins only if the result is zero
 */
package com.hackerrank.algorithms.game;

import java.util.List;

public class MisereNim {
    public static String misereNim(List<Integer> s) {
        if (s.stream().allMatch(x -> x == 1)) {
            return s.size() % 2 == 0 ? "First" : "Second";
        }
        return s.stream().reduce(0, (x, y) -> x ^ y) != 0 ? "First" : "Second";
    }
}
