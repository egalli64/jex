/**
 * https://codingbat.com/java/Logic-2
 */
package com.codingbat;

public class Logic2 {
    private Logic2() {
    }

    /**
     * codingbat.com/prob/p191363
     * 
     * @param small number of chunks sized one
     * @param big   number of chunks sized five
     * @param goal  the target
     * @return how many small chunk are used (big first), or -1
     */
    public static int makeChocolate(int small, int big, int goal) {
        while (goal >= 5 && big > 0) {
            goal -= 5;
            big -= 1;
        }

        return small >= goal ? goal : -1;
    }
}
