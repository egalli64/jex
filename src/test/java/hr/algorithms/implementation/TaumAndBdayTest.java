package hr.algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TaumAndBdayTest {

    @Test
    void taumBdayZeroth() {
        int b = 3;
        int w = 5;
        int bc = 3;
        int bw = 4;
        int z = 1;

        long expected = 29;
        long actual = TaumAndBday.taumBday(b, w, bc, bw, z);
        assertThat(actual).isEqualTo(expected);
    }
}