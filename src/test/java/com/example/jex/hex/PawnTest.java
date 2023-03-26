/*
    Hex - Logic for a Hex game
    https://en.wikipedia.org/wiki/Hex_(board_game)

    Hosted on https://github.com/egalli64/jex
 */
package com.example.jex.hex;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PawnTest {
    private final Pawn blue = new Pawn(Pawn.Color.BLUE);
    private final Pawn red = new Pawn(Pawn.Color.RED);
    private final Pawn none = new Pawn(Pawn.Color.NONE);

    @Test
    void getColorInitial() {
        Assertions.assertThat(blue.getColor()).isEqualTo(Pawn.Color.BLUE);
        Assertions.assertThat(red.getColor()).isEqualTo(Pawn.Color.RED);
        Assertions.assertThat(none.getColor()).isEqualTo(Pawn.Color.NONE);
    }

    @Test
    void getGroupSizeInitial() {
        Assertions.assertThat(blue.getGroupSize()).isOne();
    }

    @Test
    void getParentInitial() {
        Assertions.assertThat(red.getParent()).isEqualTo(red);
    }

    @Test
    void setParent() {
        Pawn parent = new Pawn(Pawn.Color.BLUE);
        blue.setParent(parent);
        Assertions.assertThat(blue.getParent()).isEqualTo(parent);
    }

    @Test
    void setParentWrong() {
        Pawn parent = new Pawn(Pawn.Color.BLUE);
        Assertions.assertThatIllegalArgumentException().isThrownBy(() -> red.setParent(parent));
    }

    @Test
    void addGroupSize() {
        int delta = 42;
        int prev = red.getGroupSize();
        red.addGroupSize(delta);

        int expected = prev + delta;
        Assertions.assertThat(red.getGroupSize()).isEqualTo(expected);
    }

    @Test
    void colorFromChar() {
        Assertions.assertThat(Pawn.Color.from('B')).isEqualTo(Pawn.Color.BLUE);
        Assertions.assertThat(Pawn.Color.from('R')).isEqualTo(Pawn.Color.RED);
        Assertions.assertThat(Pawn.Color.from('x')).isEqualTo(Pawn.Color.NONE);
    }
}