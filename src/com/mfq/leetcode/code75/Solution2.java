package com.mfq.leetcode.code75;

import java.util.Arrays;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/14 15:10
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution2 {
    public void sortColors(int[] nums) {
        sort(nums, 0, nums.length - 1);
    }

    void sort(int[] nums, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int i = lo, j = hi, pivot = nums[(lo + hi) / 2];
        while (i <= j) {
            while (nums[i] < pivot) {
                i++;
            }
            while (nums[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            } else if (i == j){
                i++;
            }
        }
        sort(nums, lo, j);
        sort(nums, i, hi);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,0,0,2,2,1};
        new Solution2().sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
