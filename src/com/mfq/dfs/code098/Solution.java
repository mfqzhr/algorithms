package com.mfq.dfs.code098;


import com.mfq.dfs.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/22 21:48
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {

    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        double min = -Double.MAX_VALUE;
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (root.val <= min) {
                return false;
            }
            min = root.val;
            root = root.right;
        }
        return true;
    }


}
