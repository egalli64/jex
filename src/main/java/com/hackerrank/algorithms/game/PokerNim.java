/*
 * Prepare > Algorithms > Game Theory > Poker Nim
 * https://www.hackerrank.com/challenges/poker-nim-1/
 *
 * see https://en.wikipedia.org/wiki/Nim
 *
 * It's just the plain Nim game, but each player could also add a stone k times to each pile
 *
 * Actually, no real change, only we can't shortcut the check even if the piles are all set to 1
 */
package com.hackerrank.algorithms.game;

import java.util.List;

public class PokerNim {
    public static String pokerNim(int k, List<Integer> c) {
        assert k > 0 && k < 101;
        return c.stream().reduce(0, (x, y) -> x ^ y) != 0 ? "First" : "Second";
    }
}
