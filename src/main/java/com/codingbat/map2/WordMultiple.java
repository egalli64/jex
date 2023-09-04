/*
  CodingBat Map 2 - https://codingbat.com/java/Map-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.map2;

import java.util.HashMap;
import java.util.Map;

/**
 * wordMultiple - https://codingbat.com/prob/p190862
 * <p>
 * Generate a map having as keys the passed strings, and as value true if the
 * key appears at least twice in the input array.
 */
public class WordMultiple {
    /**
     * For each string in the input array, replace in the map its value with true.
     * If the key is not in the map, replace returns null, in that case, put in the
     * map a new entry for the string with value false.
     * 
     * @param strings an array of strings
     * @return the generated map
     */
    public static Map<String, Boolean> solution(String[] strings) {
        Map<String, Boolean> result = new HashMap<>();
        for (String key : strings) {
            if (result.replace(key, true) == null) {
                result.put(key, false);
            }
        }

        return result;
    }

    /**
     * For each string in the input array, check if it is already in it as a key, if
     * so, check its value, if false, set it to true. If the key is not in the map,
     * create a new entry for the string with value false.
     *
     * @param strings a string array
     * @return a map having strings as keys, associated to true if multiple
     */
    public static Map<String, Boolean> verbose(String[] strings) {
        Map<String, Boolean> result = new HashMap<>();
        for (String key : strings) {
            if (result.containsKey(key)) {
                if (!result.get(key)) {
                    result.put(key, true);
                }
            } else {
                result.put(key, false);
            }
        }

        return result;
    }
}
