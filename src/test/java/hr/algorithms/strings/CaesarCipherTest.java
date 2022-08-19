package hr.algorithms.strings;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CaesarCipherTest {
    @Test
    void caesarCipherSample() {
        String input = "middle-Outz";
        int gap = 2;
        String expected = "okffng-Qwvb";
        String actual = CaesarCipher.caesarCipher(input, gap);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}