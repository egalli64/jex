/*
    Raw Bingo - A simple CLI app emulating a bingo game
    Only minimal Java features used

    Hosted on https://github.com/egalli64/jex
 */
package com.example.jex.bingo.raw;

import org.junit.jupiter.api.Test;

class PlayerTest {
    @Test
    void checkWin() {
        Extractor extractor = new Extractor();
        Player player = new Player(1, extractor);

        extractor.shuffle();
        Result result = Result.MISSED;
        while (result != Result.WIN) {
            result = player.check(extractor.extract());
        }
    }
}