/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track;

import java.util.ArrayList;
import java.util.List;

/**
 * Diamond: https://exercism.org/tracks/java/exercises/diamond
 * <p>
 * Generate a "diamond" based on the passed char
 */
class DiamondPrinter {
    List<String> printToList(char a) {
        if (a == 'A') {
            return List.of("A");
        }

        List<String> result = new ArrayList<>();

        String externalPadding = " ".repeat(a - 'A');
        String aRow = externalPadding + "A" + externalPadding;
        result.add(0, aRow);
        result.add(aRow);

        for (int i = 1; i < a - 'A'; i++) {
            char cur = (char) ('A' + i);
            String internalPadding = " ".repeat(1 + (2 * (i - 1)));
            externalPadding = externalPadding.substring(1);
            String row = externalPadding + cur + internalPadding + cur + externalPadding;
            result.add(i, row);
            result.add(result.size() - i, row);
        }

        String central = a + " ".repeat(2 * (a - 'A') - 1) + a;
        result.add(result.size() / 2, central);

        return result;
    }
}