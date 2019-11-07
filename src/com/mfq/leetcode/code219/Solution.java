package com.mfq.leetcode.code219;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 穆繁强
 * @date 2019/9/30
 */
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length < 2) {
            return false;
        }
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);

        }

        return false;
    }

}
