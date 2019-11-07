package com.mfq.niuke;


import java.util.Stack;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}

/**
 * @author 穆繁强
 * @date 2019/10/25
 */
public class Checker {

    public boolean checkBST(TreeNode root) {
        if (root == null) {
            return true;
        }

        Stack<TreeNode> stack = new Stack<>();
        double small = -Double.MAX_VALUE;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (root.val <= small) {
                return false;
            }
            small = root.val;
            root = root.right;
        }

        return true;
    }


}
