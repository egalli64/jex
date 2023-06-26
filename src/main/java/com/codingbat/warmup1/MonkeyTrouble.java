/**
 * CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1
 * monkeyTrouble - codingbat.com/prob/p181646
 * 
 * My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

public class MonkeyTrouble {
    /**
     * Check trouble caused by monkeys
     * 
     * @param aSmile first monkey smiling
     * @param bSmile second monkey smiling
     * @return true if both or neither are smiling
     */
    public static boolean plain(boolean aSmile, boolean bSmile) {
        return aSmile == bSmile;
    }

    /**
     * Check verbosely trouble caused by monkeys
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
     * Check obscurely trouble caused by monkeys
     * 
     * @param aSmile first monkey smiling
     * @param bSmile second monkey smiling
     * @return true if both or neither are smiling
     */
    public static boolean obscure(boolean aSmile, boolean bSmile) {
        return !(aSmile ^ bSmile);
    }
}