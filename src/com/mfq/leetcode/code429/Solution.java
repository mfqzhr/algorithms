package com.mfq.leetcode.code429;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
    public List<List<Integer>> levelOrder(Node root) {
        LinkedList<Node> queue = new LinkedList<>();
        List<List<Integer>> lists = new ArrayList<>();
        queue.offer(root);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(root.val);
        lists.add(list);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            list = new ArrayList<>();
            for (int i = 0; i < node.children.size(); i++) {
                Node n = node.children.get(i);
                if (n != null) {
                    list.add(n.val);
                    queue.offer(n);
                }
            }
            if (list.size() != 0) {
                lists.add(list);

            }
        }
        return lists;

    }

}
