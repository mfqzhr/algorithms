package com.mfq.leetcode.demo6;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.Arrays;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 说明：
 *
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 * 示例 1:
 *
 * 输入: [2,2,1]
 * 输出: 1
 * 示例 2:
 *
 * 输入: [4,1,2,1,2]
 * 输出: 4
 */
public class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums.length < 2) {
            return nums[0];
        }
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 && nums[i] != nums[i + 1])
                return nums[0];
            if (i == nums.length - 1 && nums[i] != nums[i - 1])
                return nums[nums.length - 1];
            if (i != 0 && nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                return nums[i];
            }


        }
        return 0;

    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,3,3};
        System.out.println(new Solution().singleNumber(nums));
    }
}
