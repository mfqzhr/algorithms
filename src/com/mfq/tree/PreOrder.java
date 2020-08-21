package com.mfq.tree;

import netscape.security.UserTarget;
import sun.awt.AWTAccessor;

import java.util.Stack;

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
        System.out.println();
    }
}
