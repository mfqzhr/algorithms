package com.mfq.leetcode.code169;

import java.util.Arrays;

/**
 * @author 穆繁强
 * @date 2019/12/3
 */
public class Solution {
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count > nums.length / 2) {
                return nums[i];
            }

        }
        return nums[0];
    }

    public static void main(String[] args) {
        int[] num = {3, 2, 3};
        System.out.println(Solution.majorityElement(num));
    }
}
