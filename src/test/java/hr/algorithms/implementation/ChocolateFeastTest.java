package hr.algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ChocolateFeastTest {

    @Test
    void chocolateFeastExample() {
        int budget = 15;
        int price = 3;
        int extra = 2;

        int actual = ChocolateFeast.chocolateFeast(budget, price, extra);
        int expected = 9;
        assertThat(actual).isEqualTo(expected);
    }
}