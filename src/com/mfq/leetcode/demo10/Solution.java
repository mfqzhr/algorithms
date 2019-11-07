package com.mfq.leetcode.demo10;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 在查找元素的时候,如果寻找一个数组中相同的元素可以利用哈希表来解决,
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }


    public static void main(String[] args) {
        int[] nums = {2, 11, 3, 6, 7};
        System.out.println(Arrays.toString(new Solution().twoSum(nums, 9)));
    }
}
