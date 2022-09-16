package bingo.raw;

import java.util.Random;

public class Board {
    /**
     * the extractions for this game
     */
    private final int[] numbers;

    /**
     * index for next extraction
     */
    private int next;

    public Board(int size) {
        numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = i + 1;
        }

        Random random = new Random();
        for (int i = 0; i < size; i++) {
            int j = random.nextInt(size);
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }

        next = 0;
    }

    /**
     * The next extracted number
     *
     * @return a number in [1..90]
     * @throws ArrayIndexOutOfBoundsException if the board has already been fully used
     */
    public int extract() {
        return numbers[next++];
    }
}
