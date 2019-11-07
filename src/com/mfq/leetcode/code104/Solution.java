package com.mfq.leetcode.code104;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

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
    Queue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {

        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    });

    public int maxDepth(TreeNode root) {
        help(root, 1);
        return queue.size() == 0 ? 0 : queue.poll();
    }

    private void help(TreeNode root, int maxDepth) {
        if (root == null) {
            return;
        }
        queue.add(maxDepth);
        help(root.left, maxDepth + 1);
        help(root.right, maxDepth + 1);
    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(9);
        TreeNode treeNode3 = new TreeNode(20);
        TreeNode treeNode4 = new TreeNode(15);
        TreeNode treeNode5 = new TreeNode(7);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;
        System.out.println(new Solution().maxDepth(treeNode1));

    }
}
