/*
    Raw Bingo - A simple CLI app emulating a bingo game
    Only minimal Java features used

    Hosted on https://github.com/egalli64/jex
 */
package bingo.raw;

import java.util.Arrays;

/**
 * A single row in a bingo card
 */
public class CardRow {
    /**
     * the sorted numbers
     */
    private final int[] numbers;
    /**
     * found matches
     */
    private int extracted;

    public CardRow(int[] numbers) {
        Arrays.sort(numbers);
        this.numbers = numbers;
        this.extracted = 0;
    }

    public boolean check(int current) {
        for (int number : numbers) {
            if (number == current) {
                extracted += 1;
                return true;
            }
        }
        return false;
    }

    public boolean isWinning() {
        return extracted == numbers.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(numbers);
    }
}
