package com.mfq.tree;

import java.util.ArrayList;
import java.util.List;

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
 * @date 2019-9-8 11:12:59
 * @description
 */
public class Solution {
    List<Integer> list;

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(3);
        treeNode.right = treeNode1;
        treeNode1.left = treeNode2;
        //前序
        System.out.println(new Solution().preorderTraversal(treeNode));
        //中序
        System.out.println(new Solution().inorderTraversal(treeNode));
        //后序
        System.out.println(new Solution().postorderTraversal(treeNode));

    }

    /**
     * 前序递归实现
     *
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        if (list == null) {
            list = new ArrayList<>();
        }
        if (root == null) {
            return list;
        }

        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);


        return list;
    }

    /**
     * 中序递归实现
     *
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        if (list == null) {
            list = new ArrayList<>();
        }

        if (root == null) {
            return list;
        }
        preorderTraversal(root.left);
        list.add(root.val);
        preorderTraversal(root.right);

        return list;
    }


    /**
     * 后序递归实现
     *
     * @param root
     * @return
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        if (list == null) {
            list = new ArrayList<>();
        }

        if (root == null) {
            return list;
        }
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        list.add(root.val);


        return list;
    }


}