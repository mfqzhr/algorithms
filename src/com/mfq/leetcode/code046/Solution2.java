package com.mfq.leetcode.code046;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/27 16:42
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution2 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        if (nums.length == 0) {
            return res;
        }
        perm(nums, res, 0, new LinkedList<Integer>());
        return res;
    }

    private void perm(int[] nums, List<List<Integer>> res, int n, LinkedList<Integer> linkedList) {
        if (nums.length == n) {
            res.add(new LinkedList<>(linkedList));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!linkedList.contains(nums[i])) {
                linkedList.add(nums[i]);
                perm(nums, res, n + 1, linkedList);
                linkedList.removeLast();
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        new Solution2().permute(arr);
    }
}
