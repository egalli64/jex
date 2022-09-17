package bingo.raw;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ExtractorTest {
    @Test
    void extractSingle() {
        Extractor extractor = new Extractor(1);
        int actual = extractor.extract();
        Assertions.assertThat(actual).isEqualTo(1);
    }

    @Test
    void extractSingleOutOfBound() {
        Extractor extractor = new Extractor(1);
        extractor.extract();
        try {
            extractor.extract();
            Assertions.fail("An ArrayIndexOutOfBoundsException was expected!");
        } catch (ArrayIndexOutOfBoundsException ex) {
            // as expected
        }
    }

    @Test
    void extractPlain() {
        Extractor extractor = new Extractor();
        int actual = 0;
        for (int i = 0; i < 90; i++) {
            actual += extractor.extract();
        }
        Assertions.assertThat(actual).isEqualTo(91 * 45);
    }
}