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

    @ParameterizedTest
    @CsvSource({"Hello,There,ellohere", "java,code,avaode", "shotl,java,hotlava"})
    void nonStartExamples(String left, String right, String expected) {
        assertThat(String1.nonStart(left, right)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"Hello,true,H", "Hello,false,o", "oh,true,o"})
    void theEndExamples(String s, boolean front, String expected) {
        assertThat(String1.theEnd(s, front)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"oddly,true", "y,false", "oddy,false"})
    void endsLyExamples(String s, Boolean expected) {
        assertThat(String1.endsLy(s)).isEqualTo(expected);
    }
}