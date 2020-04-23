package com.mfq.leetcode.code654;

import com.mfq.dfs.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/23 14:49
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return findRoot(nums, 0, nums.length);
    }

    private TreeNode findRoot(int[] nums, int l, int r) {
        if (l == r) {
            return null;
        }
        int maxIndex = l;
        for (int i = l + 1; i < r; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }
        TreeNode root = new TreeNode(nums[maxIndex]);
        root.left = findRoot(nums, l, maxIndex);
        root.right = findRoot(nums, maxIndex + 1, r);
        return root;
    }

}
