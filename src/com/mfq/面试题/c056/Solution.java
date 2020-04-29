package com.mfq.面试题.c056;

import java.util.BitSet;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/28 13:01
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {
    public int[] singleNumbers(int[] nums) {

        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            temp = temp ^ nums[i];
        }
        return new int[]{nums[nums.length - 1]};
    }
}
