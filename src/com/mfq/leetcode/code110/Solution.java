package com.mfq.leetcode.code110;

import com.mfq.dfs.TreeNode;

/**
 * @Description:
 * @Author: mufanqiang
 * @Date: 2020/09/30 18:34
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (Math.abs(height(root.left) - height(root.right)) > 1) {
            return false;
        }
        return isBalanced(root.left) &&
        isBalanced(root.right);
    }

    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(height(root.left) , height(root.right)) + 1;
    }

}
