package com.mfq.leetcode.code654;

import com.mfq.dfs.TreeNode;

import java.util.Arrays;

/**
 * @Description:
 * @Author: mufanqiang
 * @Date: 2020/10/09 17:55
 */

public class Solution2 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {

        return process(nums,0, nums.length - 1);
    }

    private TreeNode process(int[] nums, int i, int j) {
        if (i > j) {
            return null;
        }
        int index = getMax(nums, i, j);
        System.out.println("i: " + i + " j: " + j);
        TreeNode root = new TreeNode(nums[index]);
        root.left = process(nums, i, index - 1);
        root.right = process(nums, index + 1, j);
        return root;
    }

    public static int getMax(int[] nums,int lo, int hi) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = lo; i <= hi ; i++) {
            if (max < nums[i]) {
                max = nums[i];
                index = i;
            }
        }
        return index;
    }
}
