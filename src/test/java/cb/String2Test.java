package cb;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class String2Test {
    @ParameterizedTest
    @CsvSource({ "The,TThhee", "AAbb,AAAAbbbb", "Hi-There,HHii--TThheerree" })
    void doubleCharExamples(String input, String expected) {
        assertThat(String2.doubleChar(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "aaacodebbb,1", "codexxcode,2", "cozexxcope,2" })
    void countCodeExamples(String input, int expected) {
        assertThat(String2.countCode(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "aaacodebbb,1", "codexxcode,2", "cozexxcope,2" })
    void countCode9Examples(String input, int expected) {
        assertThat(String2.countCode9(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "abcbob,true", "b9b,true", "bac,false" })
    void bobThereExamples(String input, boolean expected) {
        assertThat(String2.bobThere(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "Hello,3,llollollo", "Hello,2,lolo", "Hello,1,o" })
    void repeatEnd11Examples(String s, int n, String expected) {
        assertThat(String2.repeatEnd11(s, n)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "Hello,3,llollollo", "Hello,2,lolo", "Hello,1,o" })
    void repeatEndExamples(String s, int n, String expected) {
        assertThat(String2.repeatEnd(s, n)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "abXYabc,1,true", "abXYabc,2,true", "abXYabc,3,false" })
    void prefixAgainExamples(String s, int n, boolean expected) {
        assertThat(String2.prefixAgain(s, n)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "xy*yzz,true", "xy*zzz,false", "*xa*az,true" })
    void sameStarCharExamples(String input, boolean expected) {
        assertThat(String2.sameStarChar(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "abc hi ho,1", "ABChi hi,2", "hihi,2" })
    void countHiExamples(String input, int expected) {
        assertThat(String2.countHi(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "catdog,true", "catcat,false", "1cat1cadodog,true" })
    void catDogExamples(String input, boolean expected) {
        assertThat(String2.catDog(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "Hiabc,abc,true", "AbC,HiaBc,true", "abc,abXabc,true" })
    void endOtherExamples(String a, String b, boolean expected) {
        assertThat(String2.endOther(a, b)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "abcxyz,true", "abc.xyz,false", "xyz.abc,true" })
    void xyzThereExamples(String input, boolean expected) {
        assertThat(String2.xyzThere(input)).isEqualTo(expected);
    }
}