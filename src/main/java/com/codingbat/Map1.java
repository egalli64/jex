/**
 * https://codingbat.com/java/Map-1
 */
package com.codingbat;

import java.util.Map;

public class Map1 {
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
