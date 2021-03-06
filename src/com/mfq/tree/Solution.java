package com.mfq.tree;

import java.rmi.server.SkeletonNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
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
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int height = 0, level = 1;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            level--;
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
            if (level == 0) {
                level = queue.size();
                height++;
            }
        }
        return height;
    }


}