/*
    Hex - Logic for a Hex game
    https://en.wikipedia.org/wiki/Hex_(board_game)

    Hosted on https://github.com/egalli64/jex
 */
package com.example.jex.hex;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import org.junit.jupiter.api.Test;

class PawnTest {
    private final Pawn blue = new Pawn(Color.BLUE);
    private final Pawn red = new Pawn(Color.RED);
    private final Pawn none = new Pawn(Color.NONE);

    @Test
    void getColorInitial() {
        assertThat(blue.getColor()).isEqualTo(Color.BLUE);
        assertThat(red.getColor()).isEqualTo(Color.RED);
        assertThat(none.getColor()).isEqualTo(Color.NONE);
    }

    @Test
    void getGroupSizeInitial() {
        assertThat(blue.getGroupSize()).isOne();
    }

    @Test
    void getParentInitial() {
        assertThat(red.getParent()).isEqualTo(red);
    }

    @Test
    void setParent() {
        Pawn parent = new Pawn(Color.BLUE);
        blue.setParent(parent);
        assertThat(blue.getParent()).isEqualTo(parent);
    }

    @Test
    void setParentWrong() {
        Pawn parent = new Pawn(Color.BLUE);
        assertThatIllegalArgumentException().isThrownBy(() -> red.setParent(parent));
    }

    @Test
    void addGroupSize() {
        int delta = 42;
        int prev = red.getGroupSize();
        red.addGroupSize(delta);

        int expected = prev + delta;
        assertThat(red.getGroupSize()).isEqualTo(expected);
    }
}