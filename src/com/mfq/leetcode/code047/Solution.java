package com.mfq.leetcode.code047;

import com.sun.xml.internal.txw2.output.DumpSerializer;

import java.util.*;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/5/16 14:17
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {
    HashSet<String> set;

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        if (nums == null) {
            return res;
        }
        if (nums.length == 0) {
            return res;
        }
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        dfs(0, nums, new LinkedList<Integer>(), res, used);
        return res;
    }

    private void dfs(int i, int[] nums, LinkedList<Integer> linkedList,
                     List<List<Integer>> res, boolean[] used) {
        if (i == nums.length) {
            res.add(new ArrayList<Integer>(linkedList));
            return;
        }
        for (int j = 0; j < nums.length; j++) {
            if (!used[j]) {
                if (j > 0 && nums[j] == nums[j - 1] && !used[j - 1]) {
                    continue;
                }
                used[j] = true;
                linkedList.add(nums[j]);
                dfs(i + 1, nums, linkedList, res, used);
                used[j] = false;
                linkedList.removeLast();
            }

        }
    }

    public static void main(String[] args) {
        int[] ints = {3, 2, 1};
        List<List<Integer>> lists = new Solution().permuteUnique(ints);
        System.out.println(lists);
    }
}
