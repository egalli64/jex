/*
 * 950. Reveal Cards In Increasing Order - https://leetcode.com/problems/reveal-cards-in-increasing-order/description/
 * LeetCode Hard Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * Given an array, return its element rearranged in a way that, applying a silly
 * procedure, the caller could get them sorted in natural order.
 * 
 * The silly procedure is:
 * <ol>
 * <li>Take the top card, and reveal it</li>
 * <li>Put the next top at the bottom</li>
 * <li>Repeat until done</li>
 * </ol>
 */
public class RevealCardsInIncreasingOrder {
    /**
     * Prepare a ready-to-be ordered array
     * 
     * @param deck the array to be prepared
     * @return the prepared array
     */
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Deque<Integer> stack = new ArrayDeque<>();
        stack.addFirst(deck[deck.length - 1]);
        for (int i = deck.length - 2; i >= 0; i--) {
            stack.addFirst(stack.removeLast());
            stack.addFirst(deck[i]);
        }

        for (int i = 0; i < deck.length; i++) {
            deck[i] = stack.removeFirst();
        }
        return deck;
    }
}
