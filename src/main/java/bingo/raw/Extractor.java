/*
    Raw Bingo - A simple CLI app emulating a bingo game
    Only minimal Java features used

    Hosted on https://github.com/egalli64/jex
 */
package bingo.raw;

import java.util.Random;

/**
 * The numbers to be extracted in random order
 * <p>
 * It could be reset to generate a fresh new random sequence.
 */
public class Extractor {
    /**
     * Default largest number generated
     */
    private static final int DEFAULT_SIZE = 90;
    /**
     * the current sequence
     */
    private final int[] numbers;
    /**
     * next extraction index
     */
    private int next;

    public Extractor() {
        this(DEFAULT_SIZE);
    }

    public Extractor(int size) {
        numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = i + 1;
        }

        shuffle();
    }

    /**
     * Randomly shuffle the numbers, the next extraction will return the first one
     */
    public void shuffle() {
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            int j = random.nextInt(numbers.length);
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }

        next = 0;
    }

    /**
     * The next extracted number
     *
     * @return a number in [1..size]
     * @throws ArrayIndexOutOfBoundsException if the numbers has already been fully used
     */
    public int extract() {
        return numbers[next++];
    }
}
