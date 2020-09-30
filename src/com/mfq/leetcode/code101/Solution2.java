package com.mfq.leetcode.code101;


import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;

/**
 * @Description:
 * @Author: mufanqiang
 * @Date: 2020/09/30 16:18
 */
public class Solution2 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return help(root.left, root.right);
    }

    private boolean help(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val == right.val) {
            return help(left.left, right.right) && help(left.right, right.left);
        }

        return false;
    }
}
