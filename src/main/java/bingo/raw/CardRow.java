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

    /**
     * Ctor
     *
     * @param numbers the current row
     */
    public CardRow(int[] numbers) {
        Arrays.sort(numbers);
        this.numbers = numbers;
        this.extracted = 0;
    }

    /**
     * Is the current number in this row?
     *
     * @param current the extracted number
     * @return the adjusted hit count, or 0 for a miss
     */
    public int check(int current) {
        for (int number : numbers) {
            if (number == current) {
                extracted += 1;
                return extracted;
            }
        }
        return 0;
    }

    /**
     * Hit count for the row
     *
     * @return [0 .. size]
     */
    public int getExtracted() {
        return extracted;
    }

    @Override
    public String toString() {
        return Arrays.toString(numbers);
    }
}
