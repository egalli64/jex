/*
    SF Bingo - A simple CLI app emulating a bingo game

    Hosted on https://github.com/egalli64/jex
 */
package com.example.jex.bingo.sf;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

class ExtractorTest {
    /**
     * A 1-based extractor should provide just 1 as value
     */
    @Test
    void extractSingle() {
        Extractor extractor = new Extractor(1);
        int actual = extractor.extract();
        Assertions.assertThat(actual).isEqualTo(1);
    }

    /**
     * Asking for more values than expected would lead to an ArrayIndexOutOfBoundsException
     */
    @Test
    void extractSingleOutOfBound() {
        Extractor extractor = new Extractor(1);
        extractor.extract();

        Assertions.assertThatExceptionOfType(NoSuchElementException.class).isThrownBy(extractor::extract);
    }

    /**
     * The default Extractor gives all values in [1..90]
     */
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