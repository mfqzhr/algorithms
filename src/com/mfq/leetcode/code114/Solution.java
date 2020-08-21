package com.mfq.leetcode.code114;

import com.mfq.dfs.TreeNode;

import java.util.Stack;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/5/29 16:49
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }

        flatten(root.left);
        flatten(root.right);
    }
}
