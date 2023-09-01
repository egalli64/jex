/*
  CodingBat Array 3 - https://codingbat.com/java/Array-3

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.array3;

/**
 * countClumps - https://codingbat.com/prob/p193817
 * <p>
 * If a "clump" is a group of 2+ elements in an array having the same value,
 * count the clumps in the passed array.
 */
public class CountClumps {
    /**
     * Keep in a counter the number of clumps detected, and flag if we are in a
     * clump. Loop on all pairs in the passed array, if we are not in a clump and
     * the current pair elements have the same value, increase the counter and flag
     * it as a clump. Otherwise, if the two elements have a different value, we are
     * not (anymore) in a clump.
     *
     * @param nums an array
     * @return number of clumps
     */
    public static int solution(int[] nums) {
        int counter = 0;

        boolean clump = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (!clump && nums[i] == nums[i + 1]) {
                counter += 1;
                clump = true;
            } else if (nums[i] != nums[i + 1]) {
                clump = false;
            }
        }

        return counter;
    }

    /**
     * Loop on all the pairs in the input array. If the current pair elements have
     * the same values, increase the clump counter. Discard all the following until
     * a different one is found, or the array end is reached.
     *
     * @param nums an array
     * @return number of clumps
     */
    public static int alternative(int[] nums) {
        int counter = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                counter += 1;
                while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                    i += 1;
                }
            }
        }

        return counter;
    }
}
