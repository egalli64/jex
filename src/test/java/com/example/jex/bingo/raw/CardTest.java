/*
    Raw Bingo - A simple CLI app emulating a bingo game
    Only minimal Java features used

    Hosted on https://github.com/egalli64/jex
 */
package com.example.jex.bingo.raw;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CardTest {
    @Test
    void checkAll() {
        Extractor extractor = new Extractor();
        Card card = new Card(extractor);

        extractor.shuffle();

        Result result = Result.MISSED;
        while (result != Result.WIN) {
            result = card.check(extractor.extract());
        }
        Assertions.assertThat(result).isEqualTo(Result.WIN);
    }
}