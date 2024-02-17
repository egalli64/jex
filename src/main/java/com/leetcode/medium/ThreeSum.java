/*
 * LeetCode Problems - Medium difficulty
 * https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * LeetCode 15. 3Sum
 * 
 * https://leetcode.com/problems/3sum/description/
 */
public class ThreeSum {
    /**
     * Find zero-sum triplets
     * 
     * @param nums an array with length in 3 .. 3_000
     * @return all the triplets in nums having zero sum (no duplicates)
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; ++i) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                int left = i + 1;
                int right = nums.length - 1;
                while (left < right) {
                    int sum = nums[i] + nums[left] + nums[right];
                    if (sum < 0) {
                        left += 1;
                    } else if (sum > 0) {
                        right -= 1;
                    } else {
                        result.add(List.of(nums[i], nums[left++], nums[right--]));
                        while (left < right && nums[left] == nums[left - 1])
                            left += 1;
                        while (left < right && nums[right] == nums[right + 1])
                            right -= 1;
                    }
                }
            }
        }
        return result;
    }
}
