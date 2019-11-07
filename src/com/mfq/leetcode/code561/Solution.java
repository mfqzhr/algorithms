package com.mfq.leetcode.code561;

import java.util.Arrays;

/**
 * @author mufanqiang
 */
public class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; ) {
            sum += Math.min(nums[i], nums[i + 1]);
            i = i + 2;
        }

        return sum;
    }
}
