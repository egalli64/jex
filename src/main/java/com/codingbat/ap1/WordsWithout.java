/*
  CodingBat Java AP (Advanced Placement) 1 - https://codingbat.com/java/AP-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.ap1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * wordsWithout - https://codingbat.com/prob/p121236
 * <p>
 * Generate a new array containing only the items in the passed array not
 * matching the passed target
 */
public class WordsWithout {
    /**
     * Find how many non-target words are in the array. Create an array with that
     * size. Copy the non-targets to the new array.
     * 
     * @param words  an array
     * @param target a string
     * @return input without any target in it
     */
    public static String[] solution(String[] words, String target) {
        int len = 0;
        for (String word : words) {
            if (!word.equals(target)) {
                len += 1;
            }
        }

        String[] result = new String[len];
        for (int i = 0, j = 0; j < len; i++) {
            if (!words[i].equals(target)) {
                result[j] = words[i];
                j += 1;
            }
        }

        return result;
    }

    /**
     * Create a same-size array. Copy only the non-target words to the new array.
     * Use Arrays::copyOf to generate another array with no null at its end.
     *
     * @param words  an array
     * @param target a string
     * @return input without any target in it
     */
    public static String[] byArrayCopy(String[] words, String target) {
        String[] result = new String[words.length];
        int len = 0;
        for (String word : words) {
            if (!word.equals(target)) {
                result[len++] = word;
            }
        }

        return Arrays.copyOf(result, len);
    }

    /**
     * Create a Collection, an ArrayList will do. Add to the collection the words
     * meeting the requirement. Convert the collection to a string array.
     *
     * @param words  an array
     * @param target a string
     * @return input without any target in it
     */
    public static String[] byCollection(String[] words, String target) {
        Collection<String> result = new ArrayList<String>();

        for (String word : words) {
            if (!word.equals(target)) {
                result.add(word);
            }
        }

        return result.toArray(new String[result.size()]);
    }

    /**
     * Stream (in the Java 8 sense) the array, filtering out the target elements.
     * Collect to a String array.
     *
     * @param words  an array
     * @param target a string
     * @return input without any target in it
     */
    public static String[] byStream(String[] words, String target) {
        return Arrays.stream(words).filter(x -> !x.equals(target)).toArray(String[]::new);
    }
}
