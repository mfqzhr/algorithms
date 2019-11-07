package com.mfq.leetcode.code101;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

/**
 * @author mufanqiang
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        return help(root, root);
    }

    private boolean help(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        return (root1.val == root2.val) && help(root1.left, root2.right) && help(root1.right, root2.left);
    }
}
