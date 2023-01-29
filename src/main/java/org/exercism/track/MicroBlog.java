/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track;

/**
 * Micro Blog: exercism.org/tracks/java/exercises/micro-blog
 */
public class MicroBlog {
    /**
     * Max string length in Micro Blog
     */
    private static final int MAX_LEN = 5;

    /**
     * The string can't be longer than MAX_LEN
     *
     * @param input a string
     * @return a short string
     */
    public String truncate(String input) {
        int[] cps = input.codePoints().limit(MAX_LEN).toArray();
        return new String(cps, 0, cps.length);
    }
}
