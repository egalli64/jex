package cb;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class String1Test {
    @ParameterizedTest
    @CsvSource({"Bob,Hello Bob!", "Alice,Hello Alice!", "X,Hello X!"})
    void helloNameExamples(String input, String expected) {
        assertThat(String1.helloName(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"<<>>,Yay,<<Yay>>", "<<>>,WooHoo,<<WooHoo>>", "[[]],word,[[word]]"})
    void makeOutWordExamples(String template, String word, String expected) {
        assertThat(String1.makeOutWord(template, word)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"WooHoo,Woo", "HelloThere,Hello", "abcdef,abc"})
    void firstHalfExamples(String input, String expected) {
        assertThat(String1.firstHalf(input)).isEqualTo(expected);
    }
}