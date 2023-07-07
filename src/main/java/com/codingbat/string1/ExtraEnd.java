/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

/**
 * extraEnd - codingbat.com/prob/p108853
 * <p>
 * the last two input chars (assumed always possible) multiplied by 3
 */
public class ExtraEnd {
    /**
     * Extract the tag by substring, concatenate with self three times
     * 
     * @param str a string sized 2+
     * @return 3 copies of the last 2 chars
     */
    public static String solution(String str) {
        String tag = str.substring(str.length() - 2);
        return tag + tag + tag;
    }

    /**
     * Java 11 String::repeat() makes it simpler
     * 
     * @param str a string sized 2+
     * @return 3 copies of the last 2 chars
     */
    public static String solution11(String str) {
        return str.substring(str.length() - 2).repeat(3);
    }

    /**
     * Going through a StringBuilder
     * 
     * @param str a string sized 2+
     * @return 3 copies of the last 2 chars
     */
    public static String builder(String str) {
        String tag = str.substring(str.length() - 2);
        StringBuilder result = new StringBuilder(tag);
        for (int i = 0; i < 2; i++) {
            result.append(tag);
        }
        return result.toString();
    }
}
