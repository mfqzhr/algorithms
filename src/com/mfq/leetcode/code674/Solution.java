package com.mfq.leetcode.code674;

public class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 1;
        int count = 1, max = 1;
        while (i < nums.length) {
            if (nums[i] > nums[i - 1]) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 1;
            }
            i++;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 2, 2, 2, 2};
        System.out.println(new Solution().findLengthOfLCIS(arr));
    }
}
