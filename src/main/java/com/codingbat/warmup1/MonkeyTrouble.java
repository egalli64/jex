/*
  CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

/**
 * monkeyTrouble - codingbat.com/prob/p181646
 * <p>
 * Check trouble caused by monkeys
 */
public class MonkeyTrouble {
    /**
     * Plain
     * 
     * @param aSmile first monkey smiling
     * @param bSmile second monkey smiling
     * @return true if both or neither are smiling
     */
    public static boolean plain(boolean aSmile, boolean bSmile) {
        return aSmile == bSmile;
    }

    /**
     * Exposing full details
     * 
     * @param aSmile first monkey smiling
     * @param bSmile second monkey smiling
     * @return true if both or neither are smiling
     */
    public static boolean verbose(boolean aSmile, boolean bSmile) {
        if ((aSmile == true && bSmile == true) || (aSmile == false && bSmile == false)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Using exclusive or
     * 
     * @param aSmile first monkey smiling
     * @param bSmile second monkey smiling
     * @return true if both or neither are smiling
     */
    public static boolean obscure(boolean aSmile, boolean bSmile) {
        return !(aSmile ^ bSmile);
    }
}
