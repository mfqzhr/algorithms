package com.mfq.tree.levelorder;


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
 * @date 2019-9-8 11:39:36
 */
public class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        DFS(root, 0);
        return res;
    }

    private void DFS(TreeNode root, int level) {
        //递归终止条件
        if (root == null) {
            return;
        }
        if (level >= res.size()) {
            //如果是新的一层,就创建
            res.add(new ArrayList<>());
        }
        //添加当前的元素
        res.get(level).add(root.val);
        //遍历左节点
        DFS(root.left, level + 1);
        //遍历又节点
        DFS(root.right, level + 1);

    }




}