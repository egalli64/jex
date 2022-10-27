/*
 * Prepare > Algorithms > Bit Manipulation > Maximizing XOR
 * https://www.hackerrank.com/challenges/maximizing-xor/
 *
 * Given two positive ordered integers, left and right
 * Return the maximum xor between values in that interval
 */
package hr.algorithms.bit;

public class MaximizingXOR {
    public static int maximizingXor(int l, int r) {
        int result = 0;

        for (int i = l; i < r; i++) {
            for (int j = i + 1; j <= r; j++) {
                result = Math.max(result, i ^ j);
            }
        }

        return result;
    }
}
