package com.mfq.tree;

import netscape.security.UserTarget;
import sun.awt.AWTAccessor;

import java.util.*;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/8/21 11:27
 * @description：
 * @modified By：
 * @version: $
 */
class Node {
    public Node left;
    public Node right;
    public int val;

    public Node(int v) {
        this.val = v;
    }
}

public class PreOrder {
    public static void preOrder(Node head) {
        System.out.println("pre-order: ");
        if (head != null) {
            Stack<Node> stack = new Stack<>();
            stack.add(head);
            while (!stack.isEmpty()) {
                head = stack.pop();
                System.out.println(head.val + " ");
                if (head.right != null) {
                    stack.push(head.right);
                }
                if (head.left != null) {
                    stack.push(head.left);
                }
            }
        }
        System.out.println();
    }

    public static void post(Node head) {
        System.out.println("post-order");
        if (head != null) {
            Stack<Node> s1 = new Stack<>();
            Stack<Node> s2 = new Stack<>();
            s1.push(head);
            while (!s1.isEmpty()) {
                head = s1.pop();
                s2.push(head);
                if (head.left != null) {
                    s1.push(head.left);
                }
                if (head.right != null) {
                    s1.push(head.right);
                }
            }
            while (!s2.isEmpty()) {
                System.out.println(s2.pop().val + " ");
            }
        }
    }

    public static void in(Node head) {
        System.out.println("in-order");
        if (head != null) {
            Stack<Node> stack = new Stack<>();
            while (!stack.isEmpty() || head != null) {
                if (head != null) {
                    stack.push(head);
                    head = head.left;
                } else {
                    head = stack.pop();
                    System.out.println(head.val + " ");
                    head = head.right;
                }
            }
        }
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> li = new ArrayList<>(stack);
        li.addAll(stack);
        System.out.println();
    }

    public static List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root != null) {
            stack.push(root);
            while (!stack.isEmpty()) {
                root = stack.pop();
                if (root.right != null) {
                    stack.push(root.right);
                }
                if (root.left != null) {
                    stack.push(root.left);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode root1 = new TreeNode(4);
        TreeNode root2 = new TreeNode(8);
        root.left = root1;
        root.right = root2;
        TreeNode roo3 = new TreeNode(11);
        TreeNode roo4 = new TreeNode(13);
        TreeNode roo5 = new TreeNode(4);
        root1.left = roo3;
        root2.left = roo4;
        root2.right = roo5;
        TreeNode root6 = new TreeNode(7);
        TreeNode root7 = new TreeNode(2);
        TreeNode root8 = new TreeNode(5);
        TreeNode root9 = new TreeNode(1);
        roo3.left = root6;
        roo3.right = root7;
        roo5.left = root8;
        roo5.right = root9;
        List<List<Integer>> lists = pathSum(root, 22);
        for (List<Integer> list : lists) {
            System.out.println(list.toString());
        }
    }
}
