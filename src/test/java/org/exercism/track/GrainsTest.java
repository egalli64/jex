package org.exercism.track;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.math.BigInteger;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

class GrainsTest {
    private final Grains grains = new Grains();

    @Test
    void grainsOnSquare0() {
        assertThatIllegalArgumentException().isThrownBy(() -> grains.grainsOnSquare(0));
    }

    @Test
    void grainsOnSquare1() {
        BigInteger actual = grains.grainsOnSquare(1);
        assertThat(actual).isEqualTo(BigInteger.ONE);
    }

    @Test
    void grainsOnSquare2() {
        BigInteger actual = grains.grainsOnSquare(2);
        assertThat(actual).isEqualTo(BigInteger.TWO);
    }

    @ParameterizedTest
    @CsvSource(textBlock = """
            16, 32768
            64, 9223372036854775808
            """)
    void grainsOnSquare(int position, String expected) {
        BigInteger actual = grains.grainsOnSquare(position);
        assertThat(actual).isEqualTo(new BigInteger(expected));
    }

    @Test
    void grainsOnBoard() {
        BigInteger actual = grains.grainsOnBoard();
        BigInteger expected = new BigInteger("18446744073709551615");
        assertThat(actual).isEqualTo(expected);
    }
}