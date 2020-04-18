package com.mfq.leetcode.code75;

import java.util.Arrays;

/**
 * @author mufanqiang
 * @date 2019-9- 8 13:53:43
 */
public class Solution {
    public void sortColors(int[] nums) {
        int lo = 0, hi = nums.length - 1, current = 0;
        while (current <= hi) {
            if (nums[current] == 0) {
                swap(nums, lo, current);
                lo++;
                current++;
            } else if (nums[current] == 2) {
                swap(nums, hi, current);
                hi--;
            } else {
                current++;
            }

        }
        System.out.println(Arrays.toString(nums));

    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2};
        new Solution().sortColors(nums);
    }

}
