package com.mfq.leetcode.code046;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/25 10:55
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {
    List<List<Integer>> lists = new ArrayList<>();
    List<Integer> list = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        int[] visited = new int[nums.length];
        dfs(nums, visited);
        return lists;
    }

    private void dfs(int[] nums, int[] visited) {
        if (list.size() == nums.length) {
            lists.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            if (visited[i] != 1) {
                list.add(cur);
                visited[i] = 1;
                dfs(nums, visited);
                list.remove(list.size() - 1);
                visited[i] = 0;
            }
        }
    }
}
