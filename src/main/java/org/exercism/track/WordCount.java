/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Word Count - https://exercism.org/tracks/java/exercises/word-count
 * <p>
 * Map each word in input to its count. Case insensitive, contractions are
 * considered as word (e.g.: "we're"), numbers are words. As separator use
 * whitespace and punctuation (but not single apostrophe ' in contractions).
 */
class WordCount {
    /**
     * Convert the input in an array of strings, stream it, collect the result of
     * grouping by word, counting each occurrence in the stream
     * 
     * @param input a string
     * @return each word associated to its counter
     */
    public Map<String, Integer> phrase(String input) {
        String[] words = toWords(input);
        return Arrays.stream(words).collect(Collectors.groupingBy(s -> s, Collectors.summingInt(s -> 1)));
    }

    /**
     * Split the input string to an array, following this procedure:
     * <li>convert the string to lower (case insensitive requirement)
     * <li>keep only letter, digit and apostrophes, converting all other chars to
     * blanks
     * <li>get rid of apostrophes at begin/end of string, then at begin end of each
     * word (leaving the blank before/after, to avoid merging words)
     * <li>get rid of leading/trailing blanks
     * <li>split the string, using one or more spaces as delimiter
     * 
     * @param input a string
     * @return the string converted to an array of words
     */
    String[] toWords(String input) {
        return input.toLowerCase() //
                .replaceAll("[^a-z0-9' ]", " ").replaceAll("^'|'$", "").replaceAll(" '|' ", " ") //
                .trim().split("\\s+");
    }
}
