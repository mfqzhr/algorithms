package com.mfq.leetcode.code046;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/5/16 13:08
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution4 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();

        if (nums == null) {
            return res;
        }
        if (nums.length == 0) {
            return res;
        }
        dfs(res, new LinkedList<Integer>(), 0, nums);
        return res;
    }

    private void dfs(List<List<Integer>> res, LinkedList<Integer> list, int i, int[] nums) {
        if (i == nums.length) {
            res.add(new LinkedList<Integer>(list));
            return;
        }
        for (int j = 0; j < nums.length; j++) {
            if (!list.contains(nums[j])) {
                list.add(nums[j]);
                dfs(res, list, i + 1, nums);
                list.removeLast();
            }

        }

    }


    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        List<List<Integer>> permute = new Solution4().permute(arr);
        System.out.println(permute);
    }
}
