/*
    Exercism Java track

    Source: https://exercism.org/tracks/java/exercises/say
    My solutions: https://github.com/egalli64/jex

    Say: Given a number from 0 to 999,999,999,999, spell out that number in English.
 */
package org.exercism.track;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.*;

public class SayTest {
    private final Say say = new Say();

    @ParameterizedTest
    @CsvSource({"0, zero", "19, nineteen", "20, twenty", //
            "99, ninety-nine", "999, nine hundred ninety-nine", //
            "9_999, nine thousand nine hundred ninety-nine", //
            "999_999_999_999, nine hundred ninety-nine billion nine hundred ninety-nine million nine hundred ninety-nine thousand nine hundred ninety-nine"})
    void edges(long input, String expected) {
        assertThat(say.say(input)).isEqualTo(expected);
    }

    @Test
    void one() {
        assertThat(say.say(1)).isEqualTo("one");
    }

    @Test
    void fourteen() {
        assertThat(say.say(14)).isEqualTo("fourteen");
    }

    @Test
    void twentyTwo() {
        assertThat(say.say(22)).isEqualTo("twenty-two");
    }

    @Test
    void oneHundred() {
        assertThat(say.say(100)).isEqualTo("one hundred");
    }

    @Test
    void oneHundredTwentyThree() {
        assertThat(say.say(123)).isEqualTo("one hundred twenty-three");
    }

    @Test
    void oneThousand() {
        assertThat(say.say(1_000)).isEqualTo("one thousand");
    }

    @Test
    void oneThousandTwoHundredThirtyFour() {
        assertThat(say.say(1_234)).isEqualTo("one thousand two hundred thirty-four");
    }

    @Test
    void oneMillion() {
        assertThat(say.say(1_000_000)).isEqualTo("one million");
    }

    @Test
    void oneMillionTwoThousandThreeHundredFortyFive() {
        assertThat(say.say(1_002_345)).isEqualTo("one million two thousand three hundred forty-five");
    }

    @Test
    void oneBillion() {
        assertThat(say.say(1_000_000_000)).isEqualTo("one billion");
    }

    @Test
    void nineHundredEightySevenBillionSixHundredFiftyFourThreeHundredTwentyOneThousandOneHundredTwentyThree() {
        assertThat(say.say(987_654_321_123L)).isEqualTo("nine hundred eighty-seven billion six hundred fifty-four million three hundred twenty-one thousand one hundred twenty-three");
    }

    @Test
    void illegalNegativeNumber() {
        assertThatIllegalArgumentException().isThrownBy(() -> say.say(-1));
    }

    @Test
    void illegalTooBigNumber() {
        assertThatIllegalArgumentException().isThrownBy(() -> say.say(1_000_000_000_000L));
    }
}