/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

/**
 * teaParty - https://codingbat.com/prob/p177181
 * <p>
 * Check the parameters, return 1 if both ones are at least 5. But return:
 * <li>2 if either one is at least the double of the other one
 * <li>0 if either one is less than five
 */
public class TeaParty {
    /**
     * Check the special cases first
     * 
     * @param tea   a non negative value
     * @param candy a non negative value
     * @return 0, 1, or 2
     */
    public static int solution(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0;
        }
        if (tea >= candy * 2 || candy >= tea * 2) {
            return 2;
        }

        return 1;
    }
}
