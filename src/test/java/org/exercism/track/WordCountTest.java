/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

/**
 * Word Count - https://exercism.org/tracks/java/exercises/word-count
 */
class WordCountTest {
    private final WordCount wordCount = new WordCount();

    @Test
    public void countOneWord() {
        Map<String, Integer> expectedWordCount = new HashMap<>();
        expectedWordCount.put("word", 1);
        Map<String, Integer> actualWordCount = wordCount.phrase("word");
        assertEquals(expectedWordCount, actualWordCount);
    }

    @Test
    public void countOneOfEachWord() {
        Map<String, Integer> expectedWordCount = new HashMap<>();
        expectedWordCount.put("one", 1);
        expectedWordCount.put("of", 1);
        expectedWordCount.put("each", 1);

        Map<String, Integer> actualWordCount = wordCount.phrase("one of each");

        assertEquals(expectedWordCount, actualWordCount);
    }

    @Test
    public void multipleOccurrencesOfAWord() {
        Map<String, Integer> expectedWordCount = new HashMap<>();
        expectedWordCount.put("one", 1);
        expectedWordCount.put("fish", 4);
        expectedWordCount.put("two", 1);
        expectedWordCount.put("red", 1);
        expectedWordCount.put("blue", 1);

        Map<String, Integer> actualWordCount = wordCount.phrase("one fish two fish red fish blue fish");

        assertEquals(expectedWordCount, actualWordCount);
    }

    @Test
    public void handlesCrampedLists() {
        Map<String, Integer> expectedWordCount = new HashMap<>();
        expectedWordCount.put("one", 1);
        expectedWordCount.put("two", 1);
        expectedWordCount.put("three", 1);

        Map<String, Integer> actualWordCount = wordCount.phrase("one,two,three");

        assertEquals(expectedWordCount, actualWordCount);
    }

    @Test
    public void handlesExpandedLists() {
        Map<String, Integer> expectedWordCount = new HashMap<>();
        expectedWordCount.put("one", 1);
        expectedWordCount.put("two", 1);
        expectedWordCount.put("three", 1);

        Map<String, Integer> actualWordCount = wordCount.phrase("one,\ntwo,\nthree");

        assertEquals(expectedWordCount, actualWordCount);
    }

    @Test
    public void ignorePunctuation() {
        Map<String, Integer> expectedWordCount = new HashMap<>();
        expectedWordCount.put("car", 1);
        expectedWordCount.put("carpet", 1);
        expectedWordCount.put("as", 1);
        expectedWordCount.put("java", 1);
        expectedWordCount.put("javascript", 1);

        Map<String, Integer> actualWordCount = wordCount.phrase("car : carpet as java : javascript!!&@$%^&");

        assertEquals(expectedWordCount, actualWordCount);

    }

    @Test
    public void includeNumbers() {
        Map<String, Integer> expectedWordCount = new HashMap<>();
        expectedWordCount.put("testing", 2);
        expectedWordCount.put("1", 1);
        expectedWordCount.put("2", 1);

        Map<String, Integer> actualWordCount = wordCount.phrase("testing, 1, 2 testing");

        assertEquals(expectedWordCount, actualWordCount);
    }

    @Test
    public void normalizeCase() {
        Map<String, Integer> expectedWordCount = new HashMap<>();
        expectedWordCount.put("go", 3);
        expectedWordCount.put("stop", 2);

        Map<String, Integer> actualWordCount = wordCount.phrase("go Go GO Stop stop");

        assertEquals(expectedWordCount, actualWordCount);
    }

    @Test
    public void withApostrophes() {
        Map<String, Integer> expectedWordCount = new HashMap<>();
        expectedWordCount.put("first", 1);
        expectedWordCount.put("don't", 2);
        expectedWordCount.put("laugh", 1);
        expectedWordCount.put("then", 1);
        expectedWordCount.put("cry", 1);

        Map<String, Integer> actualWordCount = wordCount.phrase("First: don't laugh. Then: don't cry.");

        assertEquals(expectedWordCount, actualWordCount);
    }

    @Test
    public void substringsFromTheBeginning() {
        Map<String, Integer> expectedWordCount = new HashMap<>();
        expectedWordCount.put("joe", 1);
        expectedWordCount.put("can't", 1);
        expectedWordCount.put("tell", 1);
        expectedWordCount.put("between", 1);
        expectedWordCount.put("app", 1);
        expectedWordCount.put("apple", 1);
        expectedWordCount.put("and", 1);
        expectedWordCount.put("a", 1);

        Map<String, Integer> actualWordCount = wordCount.phrase("Joe can't tell between app, apple and a.");

        assertEquals(expectedWordCount, actualWordCount);
    }

    @Test
    public void withQuotations() {
        Map<String, Integer> expectedWordCount = new HashMap<>();
        expectedWordCount.put("joe", 1);
        expectedWordCount.put("can't", 1);
        expectedWordCount.put("tell", 1);
        expectedWordCount.put("between", 1);
        expectedWordCount.put("large", 2);
        expectedWordCount.put("and", 1);

        Map<String, Integer> actualWordCount = wordCount.phrase("Joe can't tell between 'large' and large.");

        assertEquals(expectedWordCount, actualWordCount);
    }

    @Test
    public void multipleSpacesNotDetectedAsAWord() {
        Map<String, Integer> expectedWordCount = new HashMap<>();
        expectedWordCount.put("multiple", 1);
        expectedWordCount.put("whitespaces", 1);

        Map<String, Integer> actualWordCount = wordCount.phrase(" multiple   whitespaces");

        assertEquals(expectedWordCount, actualWordCount);
    }

    @Test
    public void alternatingWordSeperatorsNotDetectedAsAWord() {
        Map<String, Integer> expectedWordCount = new HashMap<>();
        expectedWordCount.put("one", 1);
        expectedWordCount.put("two", 1);
        expectedWordCount.put("three", 1);
        Map<String, Integer> actualWordCount = wordCount.phrase(",\n,one,\n ,two \n 'three'");

        assertEquals(expectedWordCount, actualWordCount);
    }
}
