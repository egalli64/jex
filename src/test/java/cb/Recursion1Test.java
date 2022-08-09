package cb;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class Recursion1Test {
    @ParameterizedTest
    @CsvSource({"1,1", "2,2", "3,6"})
    void factorialExamples(int input, int expected) {
        assertThat(Recursion1.factorial(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"0,0", "1,2", "2,5"})
    void bunnyEars2Examples(int input, int expected) {
        assertThat(Recursion1.bunnyEars2(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"717,2", "7,1", "123,0"})
    void count7Examples(int input, int expected) {
        assertThat(Recursion1.count7(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"xxhixx,4", "xhixhix,3", "hi,0"})
    void countXExamples(String input, int expected) {
        assertThat(Recursion1.countX(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"xpix,x3.14x", "pipi,3.143.14", "pip,3.14p"})
    void changePiExamples(String input, String expected) {
        assertThat(Recursion1.changePi(input)).isEqualTo(expected);
    }

    @Test
    void array11Example1() {
        int[] input = {1, 2, 11};
        int expected = 1;
        assertThat(Recursion1.array11(input, 0)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"0,0", "1,2", "2,4"})
    void bunnyEarsExamples(int input, int expected) {
        assertThat(Recursion1.bunnyEars(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"0,0", "1,1", "2,1"})
    void fibonacciExamples(int input, int expected) {
        assertThat(Recursion1.fibonacci(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"0,0", "1,1", "2,3"})
    void triangleExamples(int input, int expected) {
        assertThat(Recursion1.triangle(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"126,9", "49,13", "12,3"})
    void sumDigitsExamples(int input, int expected) {
        assertThat(Recursion1.sumDigits(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"8,1", "818,2", "8818,4"})
    void count8Examples(int input, int expected) {
        assertThat(Recursion1.count8(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"3,1,3", "3,2,9", "3,3,27"})
    void powerNExamples(int base, int exp, int expected) {
        assertThat(Recursion1.powerN(base, exp)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"xxhixx,1", "xhixhix,2", "hi,1"})
    void countHiExamples(String input, int expected) {
        assertThat(Recursion1.countHi(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"codex,codey", "xxhixx,yyhiyy", "xhixhix,yhiyhiy"})
    void changeXYExamples(String input, String expected) {
        assertThat(Recursion1.changeXY(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"xaxb,ab", "abc,abc", "xx,''"})
    void noXExamples(String input, String expected) {
        assertThat(Recursion1.noX(input)).isEqualTo(expected);
    }

    @Test
    void array6Example1() {
        int[] input = {1, 6, 4};
        assertThat(Recursion1.array6(input, 0)).isTrue();
    }

    @Test
    void array220Example1() {
        int[] input = {1, 2, 20};
        assertThat(Recursion1.array220(input, 0)).isTrue();
    }

    @ParameterizedTest
    @CsvSource({"hello,h*e*l*l*o", "abc,a*b*c", "ab,a*b"})
    void allStarExamples(String input, String expected) {
        assertThat(Recursion1.allStar(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"hello,hel*lo", "xxyy,x*xy*y", "aaaa,a*a*a*a"})
    void pairStarExamples(String input, String expected) {
        assertThat(Recursion1.pairStar(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"xxre,rexx", "xxhixx,hixxxx", "xhixhix,hihixxx", "x,x", "'',''"})
    void endXExamples(String input, String expected) {
        assertThat(Recursion1.endX(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"axa,1", "axax,2", "axbx,1"})
    void countPairsExamples(String input, int expected) {
        assertThat(Recursion1.countPairs(input)).isEqualTo(expected);
    }
}