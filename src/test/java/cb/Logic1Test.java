package cb;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class Logic1Test {
    @ParameterizedTest
    @CsvSource({ "30,false,false", "50,false,true", "70,true,true" })
    void cigarPartyExamples(int cigars, boolean isWeekend, boolean expected) {
        assertThat(Logic1.cigarParty(cigars, isWeekend)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "60,false,0", "65,false,1", "65,true,0" })
    void caughtSpeedingExamples(int speed, boolean isBirthday, int expected) {
        assertThat(Logic1.caughtSpeeding(speed, isBirthday)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "6,4,true", "4,5,false", "1,5,true" })
    void love6Examples(int first, int second, boolean expected) {
        assertThat(Logic1.love6(first, second)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "20,false", "21,true", "22,true" })
    void more20Examples(int input, boolean expected) {
        assertThat(Logic1.more20(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "12,true", "17,false", "19,true" })
    void nearTenExamples(int input, boolean expected) {
        assertThat(Logic1.nearTen(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "6,8,1", "3,8,0", "20,6,2" })
    void teaPartyExamples(int tea, int candy, int expected) {
        assertThat(Logic1.teaParty(tea, candy)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "1, 2, 3, true", "3, 1, 2, true", "3, 2, 2, false" })
    void twoAsOneExamples(int a, int b, int c, boolean expected) {
        assertThat(Logic1.twoAsOne(a, b, c)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "23, 19, 13, true", "23, 19, 12, false", "23, 19, 3, true" })
    void lastDigitExamples(int a, int b, int c, boolean expected) {
        assertThat(Logic1.lastDigit(a, b, c)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "2,3,3", "6,2,6", "3,2,3" })
    void maxMod5Examples(int a, int b, int expected) {
        assertThat(Logic1.maxMod5(a, b)).isEqualTo(expected);
    }

}