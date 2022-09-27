/*
    SF Bingo - A simple CLI app emulating a bingo game

    Hosted on https://github.com/egalli64/jex
 */
package bingo.sf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
    private final List<Integer> numbers;
    /**
     * for the next extraction
     */
    private Iterator<Integer> it;

    public Extractor() {
        this(DEFAULT_SIZE);
    }

    /**
     * Prepare a random sequence in [1 .. size]
     *
     * @param size the biggest value generated
     */
    public Extractor(int size) {
        numbers = IntStream.rangeClosed(1, size).boxed().collect(Collectors.toCollection(ArrayList::new));
        shuffle();
    }

    /**
     * Randomly shuffle the numbers, the next extraction will return the first one
     */
    public void shuffle() {
        Collections.shuffle(numbers);
        it = numbers.iterator();
    }

    /**
     * The next extracted number
     *
     * @return a number in [1..size]
     * @throws java.util.NoSuchElementException if the numbers has already been fully used
     */
    public int extract() {
        return it.next();
    }
}
