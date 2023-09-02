/**
 * https://codingbat.com/java/Map-1
 */
package com.codingbat;

import java.util.Map;

public class Map1 {
    /**
     * codingbat.com/prob/p115011
     *
     * @param map a map
     * @return the input map, if the keys "a" and "b" are both in the map and have
     *         equal values, remove them
     */
    public static Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b") && map.get("a").equals(map.get("b"))) {
            map.remove("a");
            map.remove("b");
        }
        return map;
    }

    /**
     * codingbat.com/prob/p115012
     *
     * @param map a map
     * @return if only one between keys "a" or "b" has a value, set the other to
     *         that value
     */
    public static Map<String, String> mapAB3(Map<String, String> map) {
        String a = map.get("a");
        String b = map.get("b");

        if (a != null && b == null) {
            map.put("b", a);
        }
        if (a == null && b != null) {
            map.put("a", b);
        }
        return map;
    }

    /**
     * codingbat.com/prob/p136950
     *
     * @param map a map
     * @return
     * 
     *         <pre>
     * if key "a" and key "b" have values with different lengths, set "c" -> the longest
     * if they have the same length -> set both to empty strings
     *         </pre>
     */
    public static Map<String, String> mapAB4(Map<String, String> map) {
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
