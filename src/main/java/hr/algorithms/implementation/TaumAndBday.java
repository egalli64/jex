/*
    Prepare > Algorithms > Implementation > Taum and B'day
    https://www.hackerrank.com/challenges/taum-and-bday/problem

    minimize cost of b (costing bc) and w (costing wc), given the swap cost z
 */
package hr.algorithms.implementation;

public class TaumAndBday {
    public static long taumBday(int b, int w, int bc, int wc, int z) {
        return (long) b * Math.min(bc, wc + z) + (long) w * Math.min(wc, bc + z);
    }
}
