/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track;

/**
 * Play Your Cards: exercism.org/tracks/java/exercises/blackjack
 */
public class Blackjack {
    private static final int BLACKJACK = 21;

    /**
     * Convert a card to its blackjack value
     *
     * @param card from "two" to "ace"
     * @return value in [2 .. 11], or 0 for unknown card (as designed)
     */
    public int parseCard(String card) {
        return switch (card) {
            case "ace" -> 11;
            case "two" -> 2;
            case "three" -> 3;
            case "four" -> 4;
            case "five" -> 5;
            case "six" -> 6;
            case "seven" -> 7;
            case "eight" -> 8;
            case "nine" -> 9;
            case "ten", "jack", "queen", "king" -> 10;
            default -> 0;
        };
    }

    /**
     * Checks if the couple result in a blackjack
     *
     * @param card1 first card
     * @param card2 second card
     * @return true if blackjack
     */
    public boolean isBlackjack(String card1, String card2) {
        return parseCard(card1) + parseCard(card2) == BLACKJACK;
    }

    /**
     * The player could win (BJ vs 9) or should stand
     *
     * @param isBlackjack player score hint
     * @param dealerScore dealer score
     * @return The player strategy in {"W", "S"}
     */
    public String largeHand(boolean isBlackjack, int dealerScore) {
        return isBlackjack && dealerScore < 10 ? "W" : "S";
    }

    /**
     * The player should stand (17+ or dealer 6-) or hit
     *
     * @param handScore   the player score
     * @param dealerScore the dealer score
     * @return The player strategy in {"H", "S"}
     */
    public String smallHand(int handScore, int dealerScore) {
        if (handScore > 16) {
            return "S";
        }
        if (handScore < 12) {
            return "H";
        }
        return dealerScore > 6 ? "H" : "S";
    }

    /**
     * FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
     * This function is already implemented and does not need to be edited. It pulls the other functions together in a
     * complete decision tree for the first turn.
     *
     * @param card1      player first card
     * @param card2      player second card
     * @param dealerCard dealer card
     * @return chosen strategy
     */
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (handScore > BLACKJACK) {
            return "P";
        }
        if (handScore > 20) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        }
        return smallHand(handScore, dealerScore);
    }
}
