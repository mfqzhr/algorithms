package com.mfq.leetcode.code046;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/5/23 16:13
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution5 {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> res = new LinkedList<>();

        if (nums == null) {
            return res;
        }

        if (nums.length == 0) {
            return res;
        }

        dfs(nums, res, new LinkedList<Integer>(), 0);

        return res;
    }

    private void dfs(int[] nums, List<List<Integer>> res, LinkedList<Integer> linkedList, int n) {
        if (nums.length == n) {
            res.add(new LinkedList<Integer>(linkedList));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (linkedList.contains(nums[i]))
                continue;
            linkedList.add(nums[i]);
            dfs(nums, res, linkedList, n + 1);
            linkedList.removeLast();
        }
    }
}
