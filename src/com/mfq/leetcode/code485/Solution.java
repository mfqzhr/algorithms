package com.mfq.leetcode.code485;



/**
 * @author mufanqiang
 */
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int k = 0, temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                temp = Math.max(temp, k);
                k = 0;
            } else {
                k++;

            }

        }
        return Math.max(temp, k);
    }

    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(new Solution().findMaxConsecutiveOnes(nums));
    }
}
