package com.mfq.leetcode.code001;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/8/21 14:57
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length < 2) {
            return new int[]{-1, -1};
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};
    }
}
