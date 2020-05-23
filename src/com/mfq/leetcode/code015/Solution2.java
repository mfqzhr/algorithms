package com.mfq.leetcode.code015;

import java.util.*;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/30 15:41
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution2 {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null) {
            return null;
        }
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length < 3) {
            return res;
        }
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        int tag = 0;
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            if (nums[i] >= 0) {
                tag = i;
            }
        }
        Set<int[]> help = new HashSet<>();
        for (int i = 0; i < tag - 1; i++) {
            for (int j = 1; j < tag; j++) {
                int value = -(nums[i] + nums[j]);
                if (set.contains(value)) {
                    int[] arrs = new int[]{nums[i], nums[j], value};
                    if (!help.contains(arrs)) {
                        res.add(Arrays.asList(nums[i], nums[j], value));
                        help.add(arrs);
                    }
                }
            }
        }

        for (int i = tag; i < nums.length - 1; i++) {
            for (int j = tag + 1; j < nums.length; j++) {
                int value = -(nums[i] + nums[j]);
                if (set.contains(value)) {
                    int[] arrs = new int[]{value, nums[i], nums[j]};
                    if (!help.contains(arrs)) {
                        res.add(Arrays.asList(value, nums[i], nums[j]));
                        help.add(arrs);
                    }
                }
            }
        }

        return res;

    }


}
