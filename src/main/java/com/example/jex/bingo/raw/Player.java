/*
    Raw Bingo - A simple CLI app emulating a bingo game
    Only minimal Java features used

    Hosted on https://github.com/egalli64/jex
 */
package com.example.jex.bingo.raw;

import java.util.Arrays;

/**
 * A player owns one or more cards
 */
public class Player {
    /**
     * cards owned by the player
     */
    private final Card[] cards;

    /**
     * Each player owns a few cards.
     * Notice that the lot can't have duplicated numbers.
     * Hence, we have an implicit maximum number of cards for player.
     *
     * @param nr        the number of cards
     * @param extractor the number generator
     */
    public Player(int nr, Extractor extractor) {
        cards = new Card[nr];
        for (int i = 0; i < nr; i++) {
            cards[i] = new Card(extractor);
        }
    }

    /**
     * Check the passed number against the owned cards
     *
     * @param number the current extraction
     * @return the best result in the cards
     */
    public Result check(int number) {
        Result result = Result.MISSED;
        for (Card card : cards) {
            Result current = card.check(number);
            if (current == Result.FOUND && result == Result.MISSED) {
                result = Result.FOUND;
            } else if (current == Result.WIN) {
                result = Result.WIN;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return Arrays.toString(cards);
    }
}
