package com.mfq.leetcode.code347;


import java.util.*;

public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> list = new ArrayList();
        int maxFrequent = 1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
                if (map.get(nums[i]) > maxFrequent) {
                    maxFrequent = map.get(nums[i]);
                }

            } else {
                map.put(nums[i], 1);

            }
        }
        List<Integer>[] buckets = new ArrayList[maxFrequent + 1];
        for (int value : map.keySet()) {
            int frequent = map.get(value);
            if (buckets[frequent] == null) {
                buckets[frequent] = new ArrayList();
            }
            buckets[frequent].add(value);
        }
        for (int i = maxFrequent; i >= 0 ; i--) {
            if (buckets[i] != null) {
                for (int value: buckets[i]) {
                    list.add(value);
                }
            }

        }
        return list.subList(0,k);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,1};

        System.out.println(new Solution().topKFrequent(nums, 1));
    }

}
