package com.mfq.leetcode.code046;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/5/6 23:04
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution3 {
    List<List<Integer>> res;

    public List<List<Integer>> permute(int[] nums) {
        res = new LinkedList<>();
        dfs(nums, new LinkedList<Integer>());
        return res;
    }

    private void dfs(int[] nums, LinkedList<Integer> list) {
        if (list.size() == nums.length) {
            res.add(new LinkedList<Integer>(list));
            System.out.println(Arrays.toString(list.toArray()));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i]))
                continue;
            list.add(nums[i]);
            dfs(nums, list);
            list.removeLast();
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        new Solution3().permute(arr);
    }
}
