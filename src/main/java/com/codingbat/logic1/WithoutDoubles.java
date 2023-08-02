/*
  CodingBat Java Logic 1 - https://codingbat.com/java/Logic-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.logic1;

/**
 * withoutDoubles - https://codingbat.com/prob/p115233
 * <p>
 * If the passed values are same, increase one, wrapping around (so 5,5 is
 * changed to 5,6 and 6,6 to 6,1) then return their sum
 */
public class WithoutDoubles {
    /**
     * A plain solution
     * 
     * @param die1      [1..6]
     * @param die2      [1..6]
     * @param noDoubles when true, in case of double one value is increased
     *                  (wrapping around)
     * @return the sum
     */
    public static int solution(int die1, int die2, boolean noDoubles) {
        if (noDoubles && die1 == die2) {
            die2 = die2 % 6 + 1;
        }
        return die1 + die2;
    }

    /**
     * A compact solution
     * 
     * @param die1      [1..6]
     * @param die2      [1..6]
     * @param noDoubles when true, in case of double one value is increased
     *                  (wrapping around)
     * @return the sum
     */
    public static int oneLiner(int die1, int die2, boolean noDoubles) {
        return die1 + (noDoubles && die1 == die2 ? die2 % 6 + 1 : die2);
    }
}
