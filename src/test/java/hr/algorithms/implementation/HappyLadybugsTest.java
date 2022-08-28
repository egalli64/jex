package hr.algorithms.implementation;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class HappyLadybugsTest {
    @ParameterizedTest
    @CsvSource({"RBY_YBR,YES", "X_Y__X,NO", "__,YES", "B_RRBR,YES"})
    void happyLadybugsSamples0(String input, String expected) {
        String actual = HappyLadybugs.happyLadybugs(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"AABBC,NO", "AABBC_C,YES", "_,YES", "DD__FQ_QQF,YES", "AABCBC, NO"})
    void happyLadybugsSamples1(String input, String expected) {
        String actual = HappyLadybugs.happyLadybugs(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"XXAAX,NO", "XAA,NO", "AAX,NO", "AXA,NO", "AAXAA,NO"})
    void happyLadybugsSingleUnhappy(String input, String expected) {
        String actual = HappyLadybugs.happyLadybugs(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"XAAX,NO", "AXAX,NO", "AAXAAX,NO"})
    void happyLadybugsCoupleUnhappy(String input, String expected) {
        String actual = HappyLadybugs.happyLadybugs(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"'',YES", "X,NO", "AA,YES"})
    void happyLadybugsTiny(String input, String expected) {
        String actual = HappyLadybugs.happyLadybugs(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}