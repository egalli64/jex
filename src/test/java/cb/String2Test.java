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

    @ParameterizedTest
    @CsvSource({ "aaxbby,true", "aaxbb,false", "yaaxbb,false" })
    void xyBalanceExamples(String input, boolean expected) {
        assertThat(String2.xyBalance(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "abc,xyz,axbycz", "Hi,There,HTihere", "xxxx,There,xTxhxexre" })
    void mixStringExamples(String a, String b, String expected) {
        assertThat(String2.mixString(a, b)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "Chocolate,4,ChocChoChC", "Chocolate,3,ChoChC", "Ice Cream,2,IcI" })
    void repeatFrontExamples(String s, int n, String expected) {
        assertThat(String2.repeatFront(s, n)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "Word,X,3,WordXWordXWord", "This,And,2,ThisAndThis", "This,And,1,This" })
    void repeatSeparatorExamples(String word, String separator, int n, String expected) {
        assertThat(String2.repeatSeparator(word, separator, n)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "AAxyzBB,true", "AxyzBB,true", "AxyzBBB,false" })
    void xyzMiddleExamples(String input, boolean expected) {
        assertThat(String2.xyzMiddle(input)).isEqualTo(expected);
    }
}