package com.mfq.leetcode.code136;

/**
 * @author 穆繁强
 * @date 2019/12/3
 */
public class Solution2 {
    public int singleNumber(int[] nums) {
        int rs = 0;
        for (int i =0 ;i < nums.length ; i++){
            rs = rs ^ nums[i];
            System.out.println(rs);

        }
        return rs;
    }
}
