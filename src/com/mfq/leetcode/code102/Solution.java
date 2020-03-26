package com.mfq.leetcode.code102;

import com.mfq.array.Array;

import java.util.*;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/3/26 10:34
 * @description：二叉树的层序遍历
 * @modified By：
 * @version: v1$
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList();
        List<List<Integer>> lists = new ArrayList<>();
        if (root == null) {
            return lists;
        }
        List<Integer> list = new ArrayList<>();
        queue.offer(root);
        int size = 1;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            list.add(node.val);
            size--;
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
            if (size == 0 && list.size() != 0) {
                size = queue.size();
                lists.add(list);
                list = new ArrayList<>();
            }

        }

        return lists;
    }

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> levelOrder2(TreeNode root) {
        if (root == null) {
            return res;
        }
        dfs(root, 0);
        return res;
    }

    private void dfs(TreeNode root, int level) {
        if (level == res.size()) {
            res.add(new ArrayList<Integer>());
        }
        res.get(level).add(root.val);
        if (root.left != null) {
            dfs(root.left, level + 1);
        }
        if (root.right != null) {
            dfs(root.right, level + 1);
        }
    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        System.out.println(new Solution().levelOrder(treeNode1));
    }
}
