package com.mfq.leetcode.code589;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/3/26 9:34
 * @description：N叉树的前序遍历
 * @modified By：
 * @version: v1$
 */

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

public class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        help(root, list);
        return list;
    }

    void help(Node root, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        for (int i = 0; i < root.children.size(); i++) {
            help(root.children.get(i), list);
        }
    }
}
