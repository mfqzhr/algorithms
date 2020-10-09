package com.mfq.leetcode.面试题.a0403;

import com.mfq.dfs.TreeNode;
import com.mfq.leetcode.ListNode;
import com.sun.deploy.security.BadCertificateDialog;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description:
 * @Author: mufanqiang
 * @Date: 2020/10/09 12:57
 */
public class Solution {
    public ListNode[] listOfDepth(TreeNode tree) {
        if (null == tree) {
            return null;
        }
        List<ListNode> listNodes = new ArrayList<>();
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(tree);
        listNodes.add(new ListNode(tree.val));
        while (!queue.isEmpty()) {
            int size = queue.size();
            ListNode listNode = new ListNode(-1);
            ListNode temp = listNode;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.pollFirst();
                TreeNode left = node.left;
                TreeNode right = node.right;
                if (null != left) {
                    queue.offer(left);
                    listNode.next = new ListNode(left.val);
                    listNode = listNode.next;
                }
                if (null != right) {
                    queue.offer(right);
                    listNode.next = new ListNode(right.val);
                    listNode = listNode.next;
                }
            }
            if (null != temp.next)
                listNodes.add(temp.next);
        }
        return listNodes.toArray(new ListNode[listNodes.size()]);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (null == root) return res;
        Deque<TreeNode> treeNodeDeque = new LinkedList<>();
        treeNodeDeque.offer(root);
        while (!treeNodeDeque.isEmpty()) {
            int size = treeNodeDeque.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = treeNodeDeque.pollFirst();
                list.add(treeNode.val);
                TreeNode left = treeNode.left;
                TreeNode right = treeNode.right;
                if (null != left) {
                    treeNodeDeque.offer(left);
                }
                if (null != right) {
                    treeNodeDeque.offer(right);
                }
            }
            res.add(list);

        }
        return res;
    }
}

