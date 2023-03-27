/*
    Hex - Logic for a Hex game
    https://en.wikipedia.org/wiki/Hex_(board_game)

    Hosted on https://github.com/egalli64/jex
 */
package com.example.jex.hex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ColorTest {
    @Test
    void from() {
        assertThat(Color.from('B')).isEqualTo(Color.BLUE);
        assertThat(Color.from('R')).isEqualTo(Color.RED);
        assertThat(Color.from('x')).isEqualTo(Color.NONE);
    }

    @Test
    void toChar() {
        assertThat(Color.BLUE.toChar()).isEqualTo('B');
        assertThat(Color.RED.toChar()).isEqualTo('R');
        assertThat(Color.NONE.toChar()).isEqualTo(' ');
    }
}