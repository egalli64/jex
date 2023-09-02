/*
  CodingBat Map 1 - https://codingbat.com/java/Map-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.map1;

import java.util.Map;

/**
 * mapAB4 - https://codingbat.com/prob/p136950
 * <p>
 * if the "a" and "b" keys have values with different lengths, set "c" with the
 * longest between them. If they have the same length, set them both to empty
 * strings
 */
public class MapAB4 {
    /**
     * Get the two values, reset them to empty string or put the longest one in c.
     *
     * @param map a map
     * @return the changed map
     */
    public static Map<String, String> solution(Map<String, String> map) {
        String a = map.get("a");
        String b = map.get("b");
        if (a != null && b != null) {
            if (a.length() == b.length()) {
                map.put("a", "");
                map.put("b", "");
            } else {
                map.put("c", a.length() > b.length() ? a : b);
            }
        }
        return map;
    }
}
