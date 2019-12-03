package com.mfq.leetcode.code136;

import java.util.Arrays;

/**
 * @author 穆繁强
 * @date 2019/12/3
 */
public class Solution {
    public int singleNumber(int[] nums) {

        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res = res ^ nums[i];
        }

        return res;
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 2, 6, 3, 6, 3};
        System.out.println(new Solution().singleNumber(num));
    }
}

