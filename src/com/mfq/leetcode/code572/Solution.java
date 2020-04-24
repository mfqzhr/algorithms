package com.mfq.leetcode.code572;

import com.mfq.dfs.TreeNode;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/24 21:35
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        String s_str = help(s);
        String t_str = help(t);
        return s_str.contains(t_str);
    }

    private String help(TreeNode s) {
        if (s == null) {
            return "#!";
        }
        return help(s.left) + help(s.right) + s.val + "!";
    }
}
