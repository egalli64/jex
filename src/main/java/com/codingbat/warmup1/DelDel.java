/*
  CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

/**
 * delDel - codingbat.com/prob/p100905
 * <p>
 * "del" substring remover, if it is in position 1
 */
public class DelDel {
    /**
     * Check position of "del" by String::indexOf()
     * 
     * @param str a string
     * @return "del"-free (in position 1) copy of input
     */
    public static String solution(String str) {
        return str.indexOf("del") == 1 ? str.charAt(0) + str.substring(4) : str;
    }

    /**
     * Check "del" by String::substring()
     * 
     * @param str a string
     * @return "del"-free (in position 1) copy of input
     */
    public static String sub(String str) {
        if (str.length() > 3 && str.substring(1, 4).equals("del")) {
            return str.substring(0, 1) + str.substring(4);
        }
        return str;
    }
}
