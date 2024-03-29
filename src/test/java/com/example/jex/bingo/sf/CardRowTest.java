/*
    SF Bingo - A simple CLI app emulating a bingo game

    Hosted on https://github.com/egalli64/jex
 */
package com.example.jex.bingo.sf;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class CardRowTest {
    /**
     * If a value is in the row, its check should succeed
     */
    @Test
    void check42() {
        CardRow row = new CardRow(Arrays.asList(82, 13, 42, 5, 18));
        int actual = row.check(42);
        Assertions.assertThat(actual).isNotZero();
    }

    /**
     * If a value is not in the row, its check should fail
     */
    @Test
    void checkMissing() {
        CardRow row = new CardRow(Arrays.asList(82, 13, 42, 5, 18));
        int actual = row.check(21);
        Assertions.assertThat(actual).isZero();
    }

    /**
     * After checking all values in a row, the row is a winner
     */
    @Test
    void checkForWinPositive() {
        List<Integer> input = Arrays.asList(82, 13, 42, 5, 18);
        CardRow row = new CardRow(input);
        for (int current : input) {
            Assertions.assertThat(row.check(current)).isNotZero();
        }
        Assertions.assertThat(row.getExtracted()).isEqualTo(input.size());
    }
}