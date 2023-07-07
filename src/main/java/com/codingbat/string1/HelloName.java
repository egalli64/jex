/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

/**
 * helloName - codingbat.com/prob/p171896
 * <p>
 * concatenate strings
 */
public class HelloName {
    /**
     * Overloaded + operator for String
     *
     * @param name a string representing a name
     * @return "Hello <name>!"
     */
    public static String solution(String name) {
        return "Hello " + name + '!';
    }

    /**
     * StringBuilder
     *
     * @param name a string representing a name
     * @return "Hello <name>!"
     */
    public static String builder(String name) {
        StringBuilder result = new StringBuilder("Hello ");
        result.append(name);
        result.append('!');
        return result.toString();
    }

    /**
     * StringBuilder one-liner
     *
     * @param name a string representing a name
     * @return "Hello <name>!"
     */
    public static String builderCompact(String name) {
        return new StringBuilder("Hello ").append(name).append('!').toString();
    }
}
