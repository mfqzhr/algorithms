package com.mfq.leetcode.code169;

import java.util.Arrays;

/**
 * @author 穆繁强
 * @date 2019/12/3
 */
public class Solution2 {
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public static void main(String[] args) {
        int[] num = {3, 2, 3};
        System.out.println(Solution.majorityElement(num));
    }
}
