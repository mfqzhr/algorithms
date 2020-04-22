package com.mfq.leetcode.code199;

import com.sun.org.apache.xml.internal.resolver.readers.TR9401CatalogReader;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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
 * @author ：穆繁强
 * @date ：Created in 2020/4/22 19:22
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int size = 1;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            size--;
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
            if (size == 0) {
                list.add(node.val);
                size = queue.size();
            }
        }
        return list;
    }
}
