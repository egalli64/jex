/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Play Your Cards: exercism.org/tracks/java/exercises/blackjack
 */
class BlackjackTest {
    private final Blackjack instance = new Blackjack();

    @Test
    void parseCardAce() {
        String input = "ace";
        int expected = 11;
        int actual = instance.parseCard(input);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void isBlackjackQueenAce() {
        assertThat(instance.isBlackjack("queen", "ace")).isTrue();
    }

    @Test
    void largeHandBlackjackVs7() {
        assertThat(instance.largeHand(true, 7)).isEqualTo("W");
    }

    @Test
    void smallHand15Vs7() {
        assertThat(instance.smallHand(15, 12)).isEqualTo("H");
    }

    @ParameterizedTest
    @CsvSource(textBlock = """
            ace, ace, ace, P
            two, eight, two, H
            two, two, five, H
            """)
    void firstTurn22Vs11(String first, String second, String dealer, String expected) {
        assertThat(instance.firstTurn(first, second, dealer)).isEqualTo(expected);
    }
}