package com.mfq.leetcode.code27;

import java.util.Arrays;

/**
 * @author mufanqiang
 */
class Solution {
    public int removeElement(int[] nums, int val) {

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }

        }

        return j;

    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(new Solution().removeElement(nums, 2));
    }
}